// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.navigation;

import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;

public class WatchHistoryPreviousNextController extends fnh implements fns, tff
{
    public final vax a;
    public final kwy b;
    public final PlaybackLoopShuffleMonitor c;
    public final atjj d;
    public WeakReference e;
    public boolean f;
    private final abbf g;
    private final absm h;
    private final abns i;
    private final asho j;
    private asib k;
    private final elw l;
    
    public WatchHistoryPreviousNextController(final qv qv, final vax a, final kwy b, final abbf g, final PlaybackLoopShuffleMonitor c, final absm h, final abns i, final atjj d, final asho j, final elw l, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        this.i = i;
        this.d = d;
        this.l = l;
        this.j = j;
    }
    
    private final kxa n(final ahvm ahvm) {
        if (ahvm.b == 114177671) {
            return new kxa(this, (ahvq)ahvm.c);
        }
        return null;
    }
    
    public final void j(final int n, final boolean b) {
        this.m();
    }
    
    public final void k() {
        this.g.d(null);
        this.g.c(null);
        this.h.c(null);
        this.h.b(null);
    }
    
    public final void lV() {
        this.f = false;
    }
    
    public final void m() {
        final WeakReference e = this.e;
        Object n = null;
        vep a;
        if (e != null && e.get() != null) {
            final ves ves = (ves)this.e.get();
            final PlaybackLoopShuffleMonitor c = this.c;
            final int b = c.b;
            boolean b2 = true;
            final boolean b3 = b == 1;
            if (b != 2) {
                b2 = false;
            }
            a = ves.a(b3, b2, c.c, false);
        }
        else {
            a = null;
        }
        Object n2;
        if (a != null) {
            ahvm ahvm;
            if ((ahvm = a.a.i) == null) {
                ahvm = ahvm.a;
            }
            n = this.n(ahvm);
            ahvm ahvm2;
            if ((ahvm2 = a.a.g) == null) {
                ahvm2 = ahvm.a;
            }
            n2 = this.n(ahvm2);
        }
        else {
            n2 = null;
        }
        this.g.d((absp)n);
        this.g.c((abso)n2);
        this.h.c((absp)n);
        this.h.b((abso)n2);
    }
    
    public final void mM(final aum aum) {
        final asib k = this.k;
        if (k != null) {
            k.dispose();
            this.k = null;
        }
        this.k();
    }
    
    public final void mq(final aum aum) {
        final asib k = new asib();
        this.k = k;
        asic asic;
        if (((uyi)this.i.cd().h).bx()) {
            asic = this.i.R().am((asix)new kwb(this, 19), (asix)kul.i);
        }
        else {
            asic = this.i.Q().R().P(ashw.a()).am((asix)new kwb(this, 19), (asix)kul.i);
        }
        k.c(asic);
        this.k.c(((ashe)this.l.j()).aa(this.j).aB((asix)new kwb(this, 20)));
    }
    
    public final void qB() {
        this.f = true;
    }
}
