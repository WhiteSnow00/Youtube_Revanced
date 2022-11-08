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

public final class euq implements euh, rnx
{
    public final rny a;
    private final List b;
    private final List c;
    private aexq d;
    private eug e;
    
    public euq(final rny a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = a;
        this.d = aewp.a;
    }
    
    private final void s(final boolean b, final sdr sdr) {
        if (b) {
            if (this.b.contains(sdr)) {
                return;
            }
            this.b.isEmpty();
            this.b.add(sdr);
        }
        else {
            if (!this.b.contains(sdr)) {
                return;
            }
            this.b.remove(sdr);
        }
        final eug e = this.e;
        if (e != null) {
            final aexq i = sdr.i;
            u(sdr);
            if (!b) {
                final aewp a = aewp.a;
                final eup eup = (eup)e;
                eup.g = a;
                eup.c.a();
            }
            final eup eup2 = (eup)e;
            eup2.c();
            eup2.d();
        }
    }
    
    private final void t(final boolean b, final sdr sdr) {
        if (b) {
            if (this.c.contains(sdr)) {
                return;
            }
            this.c.isEmpty();
            this.c.add(sdr);
        }
        else {
            if (!this.c.contains(sdr)) {
                return;
            }
            this.c.remove(sdr);
        }
        final eug e = this.e;
        if (e != null) {
            final aexq i = sdr.i;
            final eup eup = (eup)e;
            if (eup.f.d(b)) {
                eup.d();
            }
            if (b) {
                final eus c = eup.c;
                final Object b2 = c.i.b;
                final ahnh a = ahnh.a;
                c.a = aexq.k((Object)sfh.b(((eg)b2).ai(), ahnh.s, 4, sbg.b(new sbs[0])));
                if (!c.a.h()) {
                    final qcv h = c.h;
                    qcv.A((sfh)null, "[LastMileDeliveryExternallyManagedSlotAdapter] failed to createLastMileDeliveryOverlaySlot onPlayerAvailable.");
                }
                c.c = i;
                if (c.a.h()) {
                    c.m((sfh)c.a.c(), sdm.a);
                    c.n((sfh)c.a.c(), sdm.a);
                }
            }
            else if (!eup.f.b()) {
                eup.g = aewp.a;
                eup.c.a();
            }
        }
    }
    
    private static final aexq u(final sdr sdr) {
        aexq aexq;
        if (sdr.l.d((Class)scl.class)) {
            aexq = aexq.j((Object)sdr.f((Class)scl.class));
        }
        else {
            aexq = aewp.a;
        }
        return aexq;
    }
    
    public final void f(final abid abid, final abid abid2, final int n, final int n2, final boolean b, final boolean b2) {
        this.d = aexq.k((Object)abid);
        final eug e = this.e;
        if (e != null) {
            final eup eup = (eup)e;
            final boolean bo = tmy.bo((Context)eup.a);
            if (eup.f.f(abid) || eup.f.e(bo)) {
                if (eup.e.h()) {
                    ((ScheduledFuture)eup.e.c()).cancel(false);
                }
                if (abid == abid.c) {
                    final ScheduledExecutorService d = eup.d;
                    final esi esi = new esi(eup, 7);
                    final boolean h = eup.g.h();
                    long d2 = 6000L;
                    if (h) {
                        d2 = d2;
                        if ((((ahtg)eup.g.c()).b & 0x100) != 0x0) {
                            d2 = ((ahtg)eup.g.c()).d;
                        }
                    }
                    eup.e = aexq.k((Object)d.schedule((Runnable)esi, d2, TimeUnit.MILLISECONDS));
                }
                eup.d();
            }
        }
    }
    
    @Override
    public final aexq l() {
        if (this.b.isEmpty()) {
            return aewp.a;
        }
        return u((sdr)adwd.aK((Iterable)this.b));
    }
    
    @Override
    public final aexq m() {
        return this.d;
    }
    
    @Override
    public final void n(final eug e) {
        this.e = e;
    }
    
    @Override
    public final boolean o() {
        return !this.c.isEmpty();
    }
    
    @Override
    public final boolean p() {
        return !this.b.isEmpty();
    }
    
    public final void q(final sfh sfh, final sdr sdr) {
        final ahnh a = ahnh.a;
        final int ordinal = sfh.c().ordinal();
        if (ordinal != 1) {
            if (ordinal != 11) {
                if (ordinal != 13) {
                    return;
                }
            }
            else {
                if (this.b.contains(sdr)) {
                    return;
                }
                this.s(true, sdr);
                return;
            }
        }
        if (sdr.b == ahne.b && !this.c.contains(sdr)) {
            this.t(true, sdr);
        }
    }
    
    public final void r(final sfh sfh, final sdr sdr, int ordinal) {
        final ahnh a = ahnh.a;
        ordinal = sfh.c().ordinal();
        if (ordinal != 1) {
            if (ordinal != 11) {
                if (ordinal != 13) {
                    return;
                }
            }
            else {
                if (!this.b.contains(sdr)) {
                    return;
                }
                this.s(false, sdr);
                return;
            }
        }
        if (sdr.b == ahne.b && this.c.contains(sdr)) {
            this.t(false, sdr);
        }
    }
}
