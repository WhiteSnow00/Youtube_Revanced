// 
// Decompiled by Procyon v0.6.0
// 

public final class heg implements hfb
{
    public final /* synthetic */ br a;
    private final /* synthetic */ int b;
    
    public heg(final hef a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public heg(final hek a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public heg(final hfl a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            final hek hek = (hek)this.a;
            hgd.l(hek.al, hek.b, hek.aN(), hek.d);
            final hem ak = ((hek)this.a).ak;
            if (ak != null) {
                ak.b();
            }
            return;
        }
        boolean b2 = true;
        if (b != 1) {
            return;
        }
        final hef hef = (hef)this.a;
        final maw ag = hef.aG;
        if (ag == null || !ag.r()) {
            b2 = false;
        }
        hgd.l(hef.ap, (rbi)hef.an, b2, hef.ag);
    }
    
    public final void b() {
        final int b = this.b;
        if (b == 0) {
            final hek hek = (hek)this.a;
            hgd.i(hek.al, hek.b);
            final hem ak = ((hek)this.a).ak;
            if (ak != null) {
                ak.c();
            }
            return;
        }
        if (b != 1) {
            return;
        }
        final hef hef = (hef)this.a;
        hgd.i(hef.ap, (rbi)hef.an);
    }
    
    public final void c() {
        final int b = this.b;
        if (b == 0) {
            final hem ak = ((hek)this.a).ak;
            if (ak != null) {
                ak.j(apmt.f);
            }
            return;
        }
        if (b != 1) {
            final her ab = ((hfl)this.a).aB;
            if (!ab.a.f()) {
                ab.a.D();
            }
            return;
        }
        ((hef)this.a).s(apmt.f);
    }
    
    public final void d(final boolean b) {
        final int b2 = this.b;
        if (b2 == 0) {
            final hem ak = ((hek)this.a).ak;
            if (ak != null) {
                apmt apmt;
                if (b) {
                    apmt = apmt.c;
                }
                else {
                    apmt = apmt.d;
                }
                ak.j(apmt);
            }
            ((hek)this.a).aq.execute(aesm.h((Runnable)new hcp(this, 3)));
            return;
        }
        if (b2 != 1) {
            if (b) {
                final hfl hfl = (hfl)this.a;
                final aqyx e = hfl.e;
                if (e != null) {
                    hfl.aC.execute(aesm.h((Runnable)new hhv(this, e, 1, (byte[])null)));
                    return;
                }
            }
            ((hfl)this.a).aC.execute(aesm.h((Runnable)new hcp(this, 5, (byte[])null)));
            return;
        }
        final br a = this.a;
        apmt apmt2;
        if (b) {
            apmt2 = apmt.c;
        }
        else {
            apmt2 = apmt.d;
        }
        ((hef)a).r(apmt2);
    }
    
    public final void e() {
        final int b = this.b;
        if (b == 0) {
            final hek hek = (hek)this.a;
            if (hek.aj) {
                final agza builder = ((agzi)alfz.a).createBuilder();
                builder.copyOnWrite();
                final alfz alfz = (alfz)builder.instance;
                alfz.b |= 0x1;
                alfz.c = true;
                final alfz j = (alfz)builder.build();
                final agza builder2 = ((agzi)alff.a).createBuilder();
                final agza builder3 = ((agzi)algf.a).createBuilder();
                builder3.copyOnWrite();
                final algf algf = (algf)builder3.instance;
                j.getClass();
                algf.j = j;
                algf.b |= 0x100;
                final algf d = (algf)builder3.build();
                builder2.copyOnWrite();
                final alff alff = (alff)builder2.instance;
                d.getClass();
                alff.D = d;
                alff.c |= 0x40000;
                hek.an.w((wxz)new wws(wya.c(121260)), (alff)builder2.build());
            }
            ((hek)this.a).aL();
            return;
        }
        if (b != 1) {
            ((hfl)this.a).aO();
            return;
        }
        ((hef)this.a).aK();
    }
}
