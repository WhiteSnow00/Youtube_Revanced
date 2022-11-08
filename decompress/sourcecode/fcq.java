import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.List;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcq implements vau
{
    public final tny a;
    public final arud b;
    private final bu c;
    private final tdz d;
    private final zkw e;
    private final zki f;
    private final vax g;
    private final vbq h;
    private final Executor i;
    private final vup j;
    
    public fcq(final bu c, final tdz d, final vup j, final tny a, final zkw e, final zki f, final vax g, final arud b, final vbq h, final Executor i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.j = j;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        b.getClass();
        this.b = b;
        this.h = h;
        this.i = i;
    }
    
    private final ListenableFuture f(final aioe aioe) {
        final vpm b = this.j.b(this.f.c());
        final vpk a = b.a();
        a.w(aioe);
        return b.f(a, this.i);
    }
    
    private final ListenableFuture g(final aioe aioe) {
        final vpm b = this.j.b(this.f.c());
        final vpl b2 = b.b();
        b2.w(aioe);
        return b.h(b2, this.i);
    }
    
    private final ListenableFuture h(final aioe aioe) {
        final vpm b = this.j.b(this.f.c());
        final vpo d = b.d();
        d.w(aioe);
        return b.j(d, this.i);
    }
    
    public final tco b(final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, final aioe aioe, final Object o, final boolean b) {
        final almd a = almd.a;
        almd almd;
        if ((almd = almd.b(likeEndpointOuterClass$LikeEndpoint.e)) == null) {
            almd = almd.a;
        }
        final int ordinal = almd.ordinal();
        if (ordinal == 0) {
            return (tco)new fcp(this, aioe, o, b, 0);
        }
        if (ordinal != 1) {
            return (tco)new fcp(this, aioe, o, b, 1);
        }
        return (tco)new fcp(this, aioe, o, b, 2);
    }
    
    public final asgy c(final aioe aioe, final Object o, final boolean b, final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, final String s, final vdm vdm) {
        final vbp a = this.h.a(this.f.c());
        final vdv c = ((vdo)a).c();
        final allz d = alma.d(s);
        almd almd;
        if ((almd = almd.b(likeEndpointOuterClass$LikeEndpoint.e)) == null) {
            almd = almd.a;
        }
        d.b(almd);
        c.j((vdj)d);
        final asgn b2 = c.b();
        almd almd2;
        if ((almd2 = almd.b(likeEndpointOuterClass$LikeEndpoint.e)) == null) {
            almd2 = almd.a;
        }
        final int ordinal = almd2.ordinal();
        asgy asgy;
        if (ordinal != 0) {
            if (ordinal != 1) {
                asgy = tmy.cj(this.h(aioe)).s((asix)new fco(this, likeEndpointOuterClass$LikeEndpoint, aioe, o, b, 2));
            }
            else {
                asgy = tmy.cj(this.f(aioe)).s((asix)new fco(this, likeEndpointOuterClass$LikeEndpoint, aioe, o, b, 0));
            }
        }
        else {
            asgy = tmy.cj(this.g(aioe)).s((asix)new fco(this, likeEndpointOuterClass$LikeEndpoint, aioe, o, b, 1));
        }
        return b2.N((ashb)asgy.G((asjd)new fcm(this, vdm, (vdo)a, s)));
    }
    
    public final void d(final aioe aioe, final Object o, final boolean b) {
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint)((agzd)aioe).rr((agyr)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        if (likeEndpointOuterClass$LikeEndpoint.g.size() != 0) {
            this.g.e((List)likeEndpointOuterClass$LikeEndpoint.g, o);
        }
        if (gkt.ar(this.b)) {
            alme alme;
            if ((alme = likeEndpointOuterClass$LikeEndpoint.f) == null) {
                alme = alme.a;
            }
            if ((alme.b & 0x1) != 0x0) {
                alme alme2;
                if ((alme2 = likeEndpointOuterClass$LikeEndpoint.f) == null) {
                    alme2 = alme.a;
                }
                final String h = vek.h(62, alme2.c);
                this.h.a(this.f.c()).f(h).E(ashw.a()).x((asjc)new fcn(this, aioe, o, b, likeEndpointOuterClass$LikeEndpoint, h, 1), (asjc)new fcn(this, aioe, o, b, likeEndpointOuterClass$LikeEndpoint, h, 0), (Callable)new iat(this, aioe, o, b, likeEndpointOuterClass$LikeEndpoint, h, 1)).ab();
                return;
            }
        }
        final fcb fcb = new fcb(this, 2);
        final Runnable a = afua.a;
        final almd a2 = almd.a;
        almd almd;
        if ((almd = almd.b(likeEndpointOuterClass$LikeEndpoint.e)) == null) {
            almd = almd.a;
        }
        final int ordinal = almd.ordinal();
        if (ordinal == 0) {
            tcp.l(this.g(aioe), (Executor)afsl.a, (tcn)fcb, this.b(likeEndpointOuterClass$LikeEndpoint, aioe, o, b), a);
            return;
        }
        if (ordinal == 1) {
            tcp.l(this.f(aioe), (Executor)afsl.a, (tcn)fcb, this.b(likeEndpointOuterClass$LikeEndpoint, aioe, o, b), a);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        tcp.l(this.h(aioe), (Executor)afsl.a, (tcn)fcb, this.b(likeEndpointOuterClass$LikeEndpoint, aioe, o, b), a);
    }
    
    public final void e(final aioe aioe, final Object o, final List list, final aioe aioe2, final almd almd, final boolean b) {
        if (list != null) {
            this.g.e(list, o);
        }
        if (aioe2 != null) {
            this.g.c(aioe2, (Map)null);
        }
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint)((agzd)aioe).rr((agyr)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        alme alme;
        if ((alme = likeEndpointOuterClass$LikeEndpoint.f) == null) {
            alme = alme.a;
        }
        if (!alme.c.isEmpty()) {
            final tdz d = this.d;
            alme alme2;
            if ((alme2 = likeEndpointOuterClass$LikeEndpoint.f) == null) {
                alme2 = alme.a;
            }
            d.f((Object)new gfn(alme2.c, almd, b));
            return;
        }
        alme alme3;
        if ((alme3 = likeEndpointOuterClass$LikeEndpoint.f) == null) {
            alme3 = alme.a;
        }
        if (!alme3.d.isEmpty()) {
            final tdz d2 = this.d;
            alme alme4;
            if ((alme4 = likeEndpointOuterClass$LikeEndpoint.f) == null) {
                alme4 = alme.a;
            }
            d2.f((Object)new gfm(alme4.d, almd));
        }
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.f.t()) {
            this.d(aioe, m, false);
            return;
        }
        this.e.b((Activity)this.c, (byte[])null, (zku)new fdh(this, aioe, m, 1));
    }
}
