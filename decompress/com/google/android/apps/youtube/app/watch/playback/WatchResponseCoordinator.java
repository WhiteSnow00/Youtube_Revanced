// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.playback;

import java.util.Iterator;
import java.util.function.Consumer;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Set;

public final class WatchResponseCoordinator implements tff
{
    public final aave a;
    public final lgs b;
    public final asho c;
    public final Set d;
    public final boolean e;
    private final asho f;
    private final abns g;
    private final Set h;
    private final asib i;
    private final boolean j;
    private final boolean k;
    private final qv l;
    private final aeby m;
    
    public WatchResponseCoordinator(final uyi uyi, final uyi uyi2, final uyi uyi3, final aave a, final lgs b, final asho f, final asho c, final abns g, final qv l, final Set h, final Set d, final aeby m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.g = g;
        this.l = l;
        this.h = h;
        this.d = d;
        this.m = m;
        this.i = new asib();
        this.j = uyi.bs();
        this.e = uyi2.f(45359310L);
        this.k = uyi3.bv();
    }
    
    public final void j(final WatchNextResponseModel watchNextResponseModel, final wyh wyh) {
        final afie k = ((afhg)this.h).k();
        while (((Iterator)k).hasNext()) {
            ((lgv)((Iterator)k).next()).g(watchNextResponseModel).ifPresent((Consumer)new kvq(wyh, 13));
        }
    }
    
    public final void mM(final aum aum) {
        this.i.b();
    }
    
    public final void mq(final aum aum) {
        if (!this.j) {
            return;
        }
        if (!this.k) {
            final asgt c = this.g.Q().R().P(this.f).L((asjc)new let(this, 6)).V().ap().c(0, (asix)new lga(this.i, 19));
            this.i.f(new asic[] { c.L((asjc)lfp.s).B((asjd)lep.j).L((asjc)lfp.t).p().al((asix)new lga(this, 14)), ((asgt)this.l.c).Y((asjc)new let(c, 7)).j((asgx)new huf(this, 3)).al((asix)new lga(this, 15)) });
            return;
        }
        final aeby m = this.m;
        final abns g = this.g;
        final asho c2 = this.c;
        final asib i = this.i;
        final aave aave = (aave)((atjj)m.a).a();
        aave.getClass();
        g.getClass();
        c2.getClass();
        final adbl adbl = new adbl(aave, g, c2, i);
        this.i.f(new asic[] { (asic)new asib(new asic[] { ((asgt)adbl.c).Y((asjc)zon.p).am((asix)new aamk(12), (asix)aamk.m), ((abns)adbl.d).N().am((asix)new aavd(adbl, 4, (byte[])null, (byte[])null), (asix)aamk.m) }), ((asgt)adbl.a).R().P(this.c).am((asix)new lga(this, 16), (asix)lei.i), ((asgt)adbl.b).R().P(this.c).am((asix)new lga(this, 17), (asix)lei.i), this.g.Q().R().P(this.c).am((asix)new lga(this, 18), (asix)lei.i) });
    }
}
