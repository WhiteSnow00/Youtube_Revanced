// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.transientoverlay;

import j$.util.Optional;

public final class DefaultTransientOverlayController implements kzc, jcm
{
    public final ixh a;
    public final asho b;
    public final asho c;
    public final atie d;
    public final atie e;
    public final atie f;
    private final abns g;
    private final itx h;
    private final atie i;
    private final asgt j;
    private final asgt k;
    private final asgt l;
    private final itw m;
    private final asib n;
    private boolean o;
    
    public DefaultTransientOverlayController(final abns g, final itx h, final ixh a, final asho b, final asho c) {
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = (itw)new jci(this);
        this.n = new asib();
        final atie ak = ((atie)atid.aE((Object)Optional.empty())).aK();
        this.d = ak;
        final atie ak2 = ((atie)atig.aD()).aK();
        this.i = ak2;
        final Boolean value = false;
        final atie ak3 = ((atie)atid.aE((Object)value)).aK();
        this.e = ak3;
        final atie ak4 = ((atie)atid.aE((Object)value)).aK();
        this.f = ak4;
        final asgt p5 = asgt.e((aujo)g.q().c, (aujo)g.w().L((asjc)iqc.u), (asit)iun.m).p();
        final asgt e = asgt.e((aujo)ak4, (aujo)ak3, (asit)iun.j);
        final asgt p6 = asgt.N((aujo)ak2, (aujo)asgt.e((aujo)e, (aujo)p5, (asit)iun.k)).p();
        this.j = asgt.e((aujo)asgt.O((aujo)ak, (aujo)p5.Y((asjc)new jax(e, 5)), (aujo)g.R().L((asjc)jch.c).af((aujo)p6, (asit)iun.n).B((asjd)iuc.k).L((asjc)jch.d)), (aujo)p6, (asit)iun.l).B((asjd)iuc.i).Y((asjc)new jax(this, 6));
        final asgt y = ((asgt)ak).B((asjd)iuc.h).Y((asjc)iqc.t);
        this.k = y;
        this.l = y.L((asjc)jch.b).V();
        this.o = false;
    }
    
    public final asgt j() {
        return this.l;
    }
    
    public final void k() {
        this.i.tr((Object)jcl.c);
    }
    
    public final void l(final long n, final long n2, final long n3, final jbh jbh) {
        this.d.tr((Object)Optional.of((Object)new jcj(n, n2, n3, jbh)));
    }
    
    @Override
    public final void m(final int n) {
        final boolean o = n != 0;
        if (this.o == o) {
            return;
        }
        if (o) {
            this.h.a(this.m);
            this.n.f(new asic[] { this.k.al((asix)new jbf(this, 17)), this.j.ak() });
        }
        else {
            this.h.b(this.m);
            this.n.b();
            this.d.tr((Object)Optional.empty());
        }
        this.o = o;
    }
    
    public final void mM(final aum aum) {
        this.h.b(this.m);
        this.n.b();
        this.o = false;
    }
}
