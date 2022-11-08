import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eub implements euk, eui, shv
{
    public final atjj a;
    public final atjj b;
    public final Map c;
    private final atjj d;
    private final atjj e;
    private final atjj f;
    private final atjj g;
    private final Executor h;
    private final Map i;
    private eul j;
    
    public eub(final cca cca, final atjj d, final atjj a, final atjj b, final atjj e, final atjj g, final atjj f, final Executor h, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.g = g;
        this.f = f;
        this.h = h;
        this.c = new HashMap();
        this.i = new HashMap();
        cca.p((euk)this);
    }
    
    private static int C(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n != 1) {
            return 3;
        }
        return 0;
    }
    
    @Override
    public final void D() {
        for (final eua eua : this.c.values()) {
            final euc e = eua.e;
            if (e != null) {
                e.a.c((rnx)e);
                if (e.b == 2) {
                    e.b = 3;
                    e.c.l(2, new znn[0]);
                }
            }
            if (eua.f && eua.c != null) {
                ((rne)this.b.a()).e(sdm.a, eua.a, eua.c, 4);
            }
            if (eua.c != null) {
                ((rne)this.b.a()).h(sdm.a, eua.a, eua.c);
            }
            if (eua.f) {
                ((rne)this.b.a()).l(sdm.a, eua.a);
            }
            ((rne)this.b.a()).q(sdm.a, eua.a);
        }
        for (final dmw dmw : this.i.values()) {
            if (dmw.a) {
                ((rne)this.b.a()).e(sdm.a, (sfh)dmw.b, (sdr)dmw.c, 4);
                ((rne)this.b.a()).l(sdm.a, (sfh)dmw.b);
            }
            ((rne)this.b.a()).h(sdm.a, (sfh)dmw.b, (sdr)dmw.c);
            ((rne)this.b.a()).q(sdm.a, (sfh)dmw.b);
        }
        this.c.clear();
        this.i.clear();
    }
    
    public final void a(final eua eua) {
        if (eua.e == null && eua.d != null && eua.c != null) {
            if (eua.b.b.isDone()) {
                euc e = null;
                try {
                    final hyc hyc = (hyc)this.f.a();
                    final akve akve = (akve)afva.u((Future)eua.b.b);
                    final sfh a = eua.a;
                    final sdr c = eua.c;
                    final String d = eua.d;
                    e = new(euc.class)();
                    final rny rny = (rny)((atjj)hyc.a).a();
                    final rnu rnu = (rnu)((atjj)hyc.b).a();
                    final Object c2 = hyc.c;
                    new euc(rny, rnu, ((rxr)((atjj)hyc.d).a()).l(a, c), akve, a, c, d, (byte[])null);
                    eua.e = e;
                    e = eua.e;
                    if (e.b != 0) {
                        return;
                    }
                    e.b = 1;
                    e.a.a((rnx)e);
                    return;
                }
                catch (final ExecutionException e) {}
                catch (final rvz rvz) {}
                qcv.w(eua.a, ((Throwable)e).getMessage());
            }
        }
    }
    
    @Override
    public final void f(final sey sey, final String s) {
        final eua eua = this.c.get(sey.a);
        if (eua == null) {
            return;
        }
        final saq a = ((rov)this.g.a()).a;
        if (a != null) {
            a.d = s;
        }
        eua.d = s;
        this.a(eua);
    }
    
    @Override
    public final void j(final List list) {
        for (final sez sez : list) {
            final Object b = ((zhb)this.d.a()).b;
            final ahnh a = ahnh.a;
            final sfh b2 = sfh.b(((eg)b).ai(), ahnh.c, 3, sbg.b(new sbs[] { (sbs)new scy(sez) }));
            ((rne)this.b.a()).o(sdm.a, b2);
            ((rne)this.b.a()).p(sdm.a, b2);
            final sdr b3 = sdr.b(((eg)((qbo)this.a.a()).c).ag(ahne.c, b2.a), ahne.c, 3, sbg.b(new sbs[0]));
            ((rne)this.b.a()).g(sdm.a, b2, b3);
            ((rne)this.b.a()).f(sdm.a, b2, b3);
            this.i.put(sez.a.e, new dmw(b2, b3));
        }
    }
    
    public final void m(final shh shh) {
        if (shh != shh.c) {
            return;
        }
        final eul j = this.j;
        if (j == null) {
            qcv.w((sfh)null, "Received onMuteAdEvent with no registered reelMuteRequestApi");
            return;
        }
        j.a();
    }
    
    @Override
    public final void n(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        int i;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            i = 0;
            if (!hasNext) {
                break;
            }
            final sey sey = (sey)iterator.next();
            final Object b = ((zhb)this.d.a()).b;
            final ahnh a = ahnh.a;
            final sfh b2 = sfh.b(((eg)b).ai(), ahnh.c, 3, sbg.b(new sbs[] { (sbs)new scx(sey) }));
            ((rne)this.b.a()).o(sdm.a, b2);
            final eua eua = new eua(b2, sey);
            list2.add(eua);
            this.c.put(sey.a, eua);
        }
        while (i < list2.size()) {
            final eua eua2 = (eua)list2.get(i);
            ((rne)this.b.a()).p(sdm.a, eua2.a);
            eua2.b.b.addListener((Runnable)new etz(this, eua2), this.h);
            ++i;
        }
    }
    
    @Override
    public final void o(final sey sey) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint a = sey.a;
        if (!this.c.containsKey(a)) {
            qcv.w((sfh)null, "Got onPageEnter for unregistered reel");
            return;
        }
        final eua eua = this.c.get(a);
        eua.f = true;
        ((rne)this.b.a()).j(sdm.a, eua.a);
        if (eua.c == null) {
            return;
        }
        ((rne)this.b.a()).b(sdm.a, eua.a, eua.c);
    }
    
    @Override
    public final void p(final sez sez) {
        final anqm a = sez.a;
        if (!this.i.containsKey(a.e)) {
            qcv.v("Unrecognized page entry for reels NVC");
            return;
        }
        final dmw dmw = this.i.get(a.e);
        dmw.a = true;
        ((rne)this.b.a()).j(sdm.a, (sfh)dmw.b);
        ((rne)this.b.a()).b(sdm.a, (sfh)dmw.b, (sdr)dmw.c);
    }
    
    @Override
    public final void q(final int n, sey sey) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint a = sey.a;
        if (!this.c.containsKey(a)) {
            qcv.w((sfh)null, "Got onPageExit for unregistered reel");
            return;
        }
        sey = (sey)this.c.get(a);
        try {
            if (((eua)sey).c != null) {
                if (((eua)sey).f) {
                    ((rne)this.b.a()).e(sdm.a, ((eua)sey).a, ((eua)sey).c, C(n));
                }
                final euc e = ((eua)sey).e;
                if (e != null) {
                    if (e.b == 2) {
                        if (n == 0) {
                            e.c.k(17, new znn[0]);
                        }
                    }
                }
            }
            else {
                qcv.w(((eua)sey).a, "Got onPageExit with playerResponse not yet bound");
            }
            ((rne)this.b.a()).l(sdm.a, ((eua)sey).a);
        }
        finally {
            ((eua)sey).f = false;
        }
    }
    
    @Override
    public final void r(final int n, final sez sez) {
        final anqm a = sez.a;
        if (!this.i.containsKey(a.e)) {
            qcv.v("Unrecognized page exit for reels NVC");
            return;
        }
        final dmw dmw = this.i.get(a.e);
        dmw.a = false;
        ((rne)this.b.a()).e(sdm.a, (sfh)dmw.b, (sdr)dmw.c, C(n));
        ((rne)this.b.a()).l(sdm.a, (sfh)dmw.b);
    }
    
    @Override
    public final void s(final euj euj) {
        euj.a(this);
    }
    
    @Override
    public final void t(final eul j) {
        try {
            ((shw)this.e.a()).c((shv)this);
        }
        catch (final rnm rnm) {
            qcv.w((sfh)null, rnm.getMessage());
        }
        this.j = j;
    }
    
    @Override
    public final void x() {
        ((shw)this.e.a()).k((shv)this);
        this.j = null;
    }
}
