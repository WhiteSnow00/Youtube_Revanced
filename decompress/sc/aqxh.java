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

public final class aqxh implements aqxa
{
    public final aqxg a;
    public final aqxj b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final aqwo f;
    private final CronetEngine g;
    private final ExecutorService h;
    
    public aqxh(final String d, final String e, final aqwo f, final CronetEngine g, final ExecutorService h, final aqxg a, final aqxj b) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
    }
    
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
        final aqxj b = this.b;
        long c;
        if (b != null) {
            c = b.c;
        }
        else {
            c = 0L;
        }
        urlRequestBuilder.addHeader("Content-Length", String.valueOf(c));
        final aqxj b2 = this.b;
        if (b2 != null) {
            urlRequestBuilder.setUploadDataProvider((UploadDataProvider)b2, (Executor)this.h);
        }
        if (urlRequestBuilder instanceof ExperimentalUrlRequest$Builder) {
            final ExperimentalUrlRequest$Builder experimentalUrlRequest$Builder = (ExperimentalUrlRequest$Builder)urlRequestBuilder;
            experimentalUrlRequest$Builder.setTrafficStatsTag(-1);
            experimentalUrlRequest$Builder.setTrafficStatsUid(-1);
        }
        this.c = urlRequestBuilder.build();
        this.h.execute(new arcu(this, 1));
        return (ListenableFuture)this.a.a;
    }
    
    public final ListenableFuture b() {
        return aqsy.h();
    }
    
    public final aqwl c() {
        return this.b.b;
    }
    
    public final String d() {
        return this.d;
    }
    
    public final void e() {
        if (this.c != null) {
            this.h.execute((Runnable)new aeue(this, 20));
        }
    }
    
    public final boolean h() {
        return false;
    }
    
    public final void j(final aqsy aqsy, final int n, final int n2) {
        this.h.execute(new agtl(this, aqsy, n, n2, 3, null, null));
    }
}
