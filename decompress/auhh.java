import org.chromium.net.UrlRequest;
import org.chromium.net.ExperimentalUrlRequest;
import android.util.Log;
import org.chromium.net.UrlRequest$Builder;
import android.util.Pair;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.UploadDataProvider;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.ExperimentalUrlRequest$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhh extends ExperimentalUrlRequest$Builder
{
    private static final String a = "auhh";
    private final aufu b;
    private final String c;
    private final UrlRequest$Callback d;
    private final Executor e;
    private String f;
    private final ArrayList g;
    private boolean h;
    private boolean i;
    private int j;
    private Collection k;
    private UploadDataProvider l;
    private Executor m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;
    private RequestFinishedInfo$Listener s;
    private long t;
    private int u;
    
    public auhh(final String c, final UrlRequest$Callback d, final Executor e, final aufu b) {
        this.g = new ArrayList();
        this.j = 3;
        this.t = -1L;
        this.u = 0;
        if (c == null) {
            throw new NullPointerException("URL is required.");
        }
        if (d == null) {
            throw new NullPointerException("Callback is required.");
        }
        if (e != null) {
            this.c = c;
            this.d = d;
            this.e = e;
            this.b = b;
            return;
        }
        throw new NullPointerException("Executor is required.");
    }
    
    public final auhg a() {
        final auhg b = this.b.b(this.c, this.d, this.e, this.j, this.k, this.h, this.i, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t);
        final String f = this.f;
        if (f != null) {
            b.g(f);
        }
        final ArrayList g = this.g;
        for (int size = g.size(), i = 0; i < size; ++i) {
            final Pair pair = (Pair)g.get(i);
            b.a((String)pair.first, (String)pair.second);
        }
        final UploadDataProvider l = this.l;
        if (l != null) {
            b.h(l, this.m);
        }
        return b;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder addHeader(final String s, final String s2) {
        this.b(s, s2);
        return this;
    }
    
    public final /* bridge */ UrlRequest$Builder addHeader(final String s, final String s2) {
        this.b(s, s2);
        return (UrlRequest$Builder)this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder addRequestAnnotation(final Object o) {
        if (o != null) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(o);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder allowDirectExecutor() {
        this.c();
        return this;
    }
    
    public final /* bridge */ UrlRequest$Builder allowDirectExecutor() {
        this.c();
        return (UrlRequest$Builder)this;
    }
    
    public final void b(final String s, final String s2) {
        if (s == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (s2 == null) {
            throw new NullPointerException("Invalid header value.");
        }
        if ("Accept-Encoding".equalsIgnoreCase(s)) {
            Log.w(auhh.a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", (Throwable)new Exception());
            return;
        }
        this.g.add(Pair.create((Object)s, (Object)s2));
    }
    
    public final ExperimentalUrlRequest$Builder bindToNetwork(final long t) {
        this.t = t;
        return this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest build() {
        return this.a();
    }
    
    public final /* bridge */ UrlRequest build() {
        return (UrlRequest)this.a();
    }
    
    public final void c() {
        this.n = true;
    }
    
    public final void d() {
        this.h = true;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder disableCache() {
        this.d();
        return this;
    }
    
    public final /* bridge */ UrlRequest$Builder disableCache() {
        this.d();
        return (UrlRequest$Builder)this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder disableConnectionMigration() {
        this.i = true;
        return this;
    }
    
    public final void e(final UploadDataProvider l, final Executor m) {
        if (l == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (m != null) {
            if (this.f == null) {
                this.f = "POST";
            }
            this.l = l;
            this.m = m;
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider Executor.");
    }
    
    public final ExperimentalUrlRequest$Builder setHttpMethod(final String f) {
        if (f != null) {
            this.f = f;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }
    
    public final /* bridge */ UrlRequest$Builder setHttpMethod(final String httpMethod) {
        this.setHttpMethod(httpMethod);
        return (UrlRequest$Builder)this;
    }
    
    public final ExperimentalUrlRequest$Builder setIdempotency(final int u) {
        this.u = u;
        return this;
    }
    
    public final ExperimentalUrlRequest$Builder setPriority(final int j) {
        this.j = j;
        return this;
    }
    
    public final UrlRequest$Builder setPriority(final int j) {
        this.j = j;
        return (UrlRequest$Builder)this;
    }
    
    public final ExperimentalUrlRequest$Builder setRequestFinishedListener(final RequestFinishedInfo$Listener s) {
        this.s = s;
        return this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder setTrafficStatsTag(final int p) {
        this.o = true;
        this.p = p;
        return this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder setTrafficStatsUid(final int r) {
        this.q = true;
        this.r = r;
        return this;
    }
    
    public final /* bridge */ ExperimentalUrlRequest$Builder setUploadDataProvider(final UploadDataProvider uploadDataProvider, final Executor executor) {
        this.e(uploadDataProvider, executor);
        return this;
    }
    
    public final /* bridge */ UrlRequest$Builder setUploadDataProvider(final UploadDataProvider uploadDataProvider, final Executor executor) {
        this.e(uploadDataProvider, executor);
        return (UrlRequest$Builder)this;
    }
}
