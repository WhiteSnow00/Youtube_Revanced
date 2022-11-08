import android.graphics.Bitmap;
import java.io.File;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import j$.util.Optional;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfz implements ucs
{
    static final hfy a;
    private final adia b;
    private final Executor c;
    private String d;
    
    static {
        a = new hfy();
    }
    
    public hfz(final adia b, final Executor c) {
        this.b = b;
        this.c = c;
    }
    
    private final void w(final String s, final ListenableFuture listenableFuture) {
        tcp.j(listenableFuture, this.c, (tcn)new fcb(s, 19));
    }
    
    private static final aexq x(ListenableFuture ex) {
        try {
            ex = (TimeoutException)((ListenableFuture)ex).get(1000L, TimeUnit.MILLISECONDS);
            return (aexq)ex;
        }
        catch (final TimeoutException ex) {}
        catch (final CancellationException ex) {}
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        final Object a = aewp.a;
        zjp.c(zjo.b, zjn.f, "[ShortsCreation][Android][Upload]Failure while retrieving upload.", (Throwable)ex);
        ex = (TimeoutException)a;
        return (aexq)ex;
    }
    
    public final String a() {
        return this.d;
    }
    
    public final void b() {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while abandoning upload.", b.d(d, apfq.l));
        this.b.F((adif)hfz.a);
    }
    
    public final void c() {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while clearing CreateCommentParams.", b.g(d));
    }
    
    public final void d() {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while clearing files to delete after upload.", b.h(d));
    }
    
    public final void e() {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while clearing VideoShortsCreation.", b.j(d));
    }
    
    public final void f(final boolean b) {
        final adia b2 = this.b;
        final String d = this.d;
        d.getClass();
        apfq apfq;
        if (b) {
            apfq = apfq.n;
        }
        else {
            apfq = apfq.o;
        }
        this.w("Failure while canceling upload.", b2.f(d, apfq));
        this.b.F((adif)hfz.a);
    }
    
    public final void g() {
        final String d = this.d;
        if (d == null) {
            return;
        }
        this.b.C(d, apfp.ax);
    }
    
    public final void h() {
        final String d = this.d;
        if (d == null) {
            return;
        }
        this.b.C(d, apfp.ay);
    }
    
    public final void i(final boolean b) {
        final String d = this.d;
        if (d == null) {
            return;
        }
        final adia b2 = this.b;
        apfp apfp;
        if (b) {
            apfp = apfp.aA;
        }
        else {
            apfp = apfp.az;
        }
        b2.C(d, apfp);
    }
    
    public final void j(final apfp apfp) {
        final String d = this.d;
        if (d == null) {
            return;
        }
        this.b.C(d, apfp);
    }
    
    public final void k(final boolean b) {
        final String d = this.d;
        if (d == null) {
            return;
        }
        final adia b2 = this.b;
        apfp apfp;
        if (b) {
            apfp = apfp.aC;
        }
        else {
            apfp = apfp.aB;
        }
        b2.C(d, apfp);
    }
    
    public final void l(final apfk apfk) {
        final String d = this.d;
        if (d == null) {
            return;
        }
        this.b.D(d, apfk);
    }
    
    public final void m(final Bundle bundle, final aioe aioe) {
        if (bundle != null) {
            this.n(Optional.ofNullable((Object)bundle.getString("frontend_id_key")), aioe);
            return;
        }
        this.n(Optional.empty(), aioe);
    }
    
    public final void n(final Optional optional, final aioe aioe) {
        if (optional.isPresent()) {
            final String d = (String)optional.get();
            if (x(this.b.l(d)).h()) {
                this.d = d;
                return;
            }
        }
        String h;
        final String s = h = null;
        if (aioe != null) {
            h = s;
            if ((((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((agzd)aioe).rr((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).b & 0x10) != 0x0) {
                h = ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((agzd)aioe).rr((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).h;
            }
        }
        String d2;
        if (h != null) {
            d2 = this.b.w(apfl.d, h, (adif)hfz.a);
        }
        else {
            d2 = this.b.v(apfl.d, (adif)hfz.a);
        }
        this.d = d2;
    }
    
    public final void o(final Bundle bundle) {
        bundle.putString("frontend_id_key", this.d);
    }
    
    public final void p(final String s) {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting CreateCommentParams.", b.n(d, s));
    }
    
    public final void q(final Uri uri) {
        final String path = uri.getPath();
        File file;
        if (path != null) {
            file = new File(path);
        }
        else {
            file = null;
        }
        if (file == null) {
            return;
        }
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting files to delete after upload.", b.o(d, afcr.r((Object)file.getPath())));
    }
    
    public final void r(final Uri uri) {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting source URI.", b.p(d, uri));
    }
    
    public final void s(final boolean b) {
        final adia b2 = this.b;
        final String d = this.d;
        d.getClass();
        int n;
        if (!b) {
            n = 2;
        }
        else {
            n = 7;
        }
        this.w("Failure while setting upload flow flavor.", b2.R(d, n));
    }
    
    public final void t(final Uri uri) {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting upload URI.", b.q(d, uri));
    }
    
    public final void u(final Bitmap bitmap) {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting thumbnail.", b.s(d, bitmap));
    }
    
    public final void v(final apmo apmo) {
        final adia b = this.b;
        final String d = this.d;
        d.getClass();
        this.w("Failure while setting VideoShortsCreation.", b.t(d, apmo));
    }
}
