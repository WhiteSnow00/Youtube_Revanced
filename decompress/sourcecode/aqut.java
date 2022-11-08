import java.util.Iterator;
import org.chromium.net.UrlRequest$Builder;
import org.chromium.net.ExperimentalUrlRequest$Builder;
import org.chromium.net.UploadDataProvider;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest$Callback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqut implements aqum
{
    public final aqus a;
    public final aquv b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final aqub f;
    private final CronetEngine g;
    private final ExecutorService h;
    
    public aqut(final String d, final String e, final aqub f, final CronetEngine g, final ExecutorService h, final aqus a, final aquv b) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ListenableFuture a() {
        final UrlRequest$Builder urlRequestBuilder = this.g.newUrlRequestBuilder(this.d, (UrlRequest$Callback)this.a, (Executor)this.h);
        urlRequestBuilder.setHttpMethod(this.e);
        for (final String s : this.f.c()) {
            final Iterator iterator2 = this.f.b(s).iterator();
            while (iterator2.hasNext()) {
                urlRequestBuilder.addHeader(s, (String)iterator2.next());
            }
        }
        urlRequestBuilder.addHeader("Content-Type", "application/x-www-form-urlencoded");
        final aquv b = this.b;
        long c;
        if (b != null) {
            c = b.c;
        }
        else {
            c = 0L;
        }
        urlRequestBuilder.addHeader("Content-Length", String.valueOf(c));
        final aquv b2 = this.b;
        if (b2 != null) {
            urlRequestBuilder.setUploadDataProvider((UploadDataProvider)b2, (Executor)this.h);
        }
        if (urlRequestBuilder instanceof ExperimentalUrlRequest$Builder) {
            final ExperimentalUrlRequest$Builder experimentalUrlRequest$Builder = (ExperimentalUrlRequest$Builder)urlRequestBuilder;
            experimentalUrlRequest$Builder.setTrafficStatsTag(-1);
            experimentalUrlRequest$Builder.setTrafficStatsUid(-1);
        }
        this.c = urlRequestBuilder.build();
        this.h.execute((Runnable)new aesf(this, 20));
        return (ListenableFuture)this.a.a;
    }
    
    @Override
    public final aqty c() {
        return this.b.b;
    }
    
    @Override
    public final String d() {
        return this.d;
    }
    
    @Override
    public final void e() {
        if (this.c != null) {
            this.h.execute((Runnable)new aesf(this, 19));
        }
    }
    
    @Override
    public final void j(final aqqm aqqm, final int n, final int n2) {
        this.h.execute((Runnable)new agrm(this, aqqm, n, n2, 3, (byte[])null, (byte[])null));
    }
}
