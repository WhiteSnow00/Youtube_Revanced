import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eut implements euk, rqb
{
    public final rqc a;
    private final List b;
    private final List c;
    private aezp d;
    private euj e;
    
    public eut(final rqc a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = a;
        this.d = (aezp)aeyo.a;
    }
    
    private final void s(final boolean b, final sfw sfw) {
        if (b) {
            if (this.b.contains(sfw)) {
                return;
            }
            this.b.isEmpty();
            this.b.add(sfw);
        }
        else {
            if (!this.b.contains(sfw)) {
                return;
            }
            this.b.remove(sfw);
        }
        final euj e = this.e;
        if (e != null) {
            final aezp i = sfw.i;
            u(sfw);
            if (!b) {
                final aeyo a = aeyo.a;
                final eus eus = (eus)e;
                eus.g = (aezp)a;
                eus.c.a();
            }
            final eus eus2 = (eus)e;
            eus2.c();
            eus2.d();
        }
    }
    
    private final void t(final boolean b, final sfw sfw) {
        if (b) {
            if (this.c.contains(sfw)) {
                return;
            }
            this.c.isEmpty();
            this.c.add(sfw);
        }
        else {
            if (!this.c.contains(sfw)) {
                return;
            }
            this.c.remove(sfw);
        }
        final euj e = this.e;
        if (e != null) {
            final aezp i = sfw.i;
            final eus eus = (eus)e;
            if (eus.f.d(b)) {
                eus.d();
            }
            if (b) {
                final euv c = eus.c;
                final Object b2 = c.i.b;
                final ahpf a = ahpf.a;
                c.a = aezp.k((Object)shm.b(((eg)b2).T(), ahpf.s, 4, sdl.b(new sdx[0])));
                if (!c.a.h()) {
                    final qdw h = c.h;
                    qdw.w((shm)null, "[LastMileDeliveryExternallyManagedSlotAdapter] failed to createLastMileDeliveryOverlaySlot onPlayerAvailable.");
                }
                c.c = i;
                if (c.a.h()) {
                    ((rpn)c).m((shm)c.a.c(), sfr.a);
                    ((rpn)c).n((shm)c.a.c(), sfr.a);
                }
            }
            else if (!eus.f.b()) {
                eus.g = (aezp)aeyo.a;
                eus.c.a();
            }
        }
    }
    
    private static final aezp u(final sfw sfw) {
        Object o;
        if (sfw.l.d((Class)seq.class)) {
            o = aezp.j((Object)sfw.f((Class)seq.class));
        }
        else {
            o = aeyo.a;
        }
        return (aezp)o;
    }
    
    public final void E(final zbq zbq) {
    }
    
    public final void F(final aaoa aaoa) {
    }
    
    public final void G(final String s) {
    }
    
    public final void H(final aanf aanf) {
    }
    
    public final void L(final String s, final int n) {
    }
    
    public final void M(final aalw aalw) {
    }
    
    public final void f(final abjv abjv, final abjv abjv2, final int n, final int n2, final boolean b, final boolean b2) {
        this.d = aezp.k((Object)abjv);
        final euj e = this.e;
        if (e != null) {
            final eus eus = (eus)e;
            final boolean bo = tpe.bo((Context)eus.a);
            if (eus.f.f(abjv) || eus.f.e(bo)) {
                if (eus.e.h()) {
                    ((ScheduledFuture)eus.e.c()).cancel(false);
                }
                if (abjv == abjv.c) {
                    final ScheduledExecutorService d = eus.d;
                    final esl esl = new esl(eus, 6);
                    final boolean h = eus.g.h();
                    long d2 = 6000L;
                    if (h) {
                        d2 = d2;
                        if ((((ahve)eus.g.c()).b & 0x100) != 0x0) {
                            d2 = ((ahve)eus.g.c()).d;
                        }
                    }
                    eus.e = aezp.k((Object)d.schedule(esl, d2, TimeUnit.MILLISECONDS));
                }
                eus.d();
            }
        }
    }
    
    public final void h(final abke abke, final PlayerResponseModel playerResponseModel, final abvx abvx, final String s, final String s2) {
    }
    
    public final void i(final String s, final long n, final long n2, final long n3, final boolean b) {
    }
    
    public final void j(final WatchNextResponseModel watchNextResponseModel, final String s, final PlayerResponseModel playerResponseModel) {
    }
    
    public final void k(final int n, final String s) {
    }
    
    public final aezp l() {
        if (this.b.isEmpty()) {
            return (aezp)aeyo.a;
        }
        return u((sfw)agpc.V(this.b));
    }
    
    public final aezp m() {
        return this.d;
    }
    
    public final void n(final euj e) {
        this.e = e;
    }
    
    public final boolean o() {
        return !this.c.isEmpty();
    }
    
    public final boolean p() {
        return !this.b.isEmpty();
    }
    
    public final void q(final shm shm, final sfw sfw) {
        final ahpf a = ahpf.a;
        final int ordinal = shm.c().ordinal();
        if (ordinal != 1) {
            if (ordinal != 11) {
                if (ordinal != 13) {
                    return;
                }
            }
            else {
                if (this.b.contains(sfw)) {
                    return;
                }
                this.s(true, sfw);
                return;
            }
        }
        if (sfw.b == ahpc.b && !this.c.contains(sfw)) {
            this.t(true, sfw);
        }
    }
    
    public final void r(final shm shm, final sfw sfw, int ordinal) {
        final ahpf a = ahpf.a;
        ordinal = shm.c().ordinal();
        if (ordinal != 1) {
            if (ordinal != 11) {
                if (ordinal != 13) {
                    return;
                }
            }
            else {
                if (!this.b.contains(sfw)) {
                    return;
                }
                this.s(false, sfw);
                return;
            }
        }
        if (sfw.b == ahpc.b && this.c.contains(sfw)) {
            this.t(false, sfw);
        }
    }
}
