// 
// Decompiled by Procyon v0.6.0
// 

public final class ijd implements iix
{
    private final vdr a;
    private final zmf b;
    private final tmx c;
    private final iiu d;
    private final vai e;
    private final hzn f;
    private final bhv g;
    private final hzn h;
    private final bhv i;
    private final fzw j;
    private final fzw k;
    
    public ijd(final vdr a, final hzn h, final zmf b, final fzw j, final hzn f, final fzw k, final tmx c, final iiu d, final bhv i, final bhv g, final vai e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.j = j;
        this.f = f;
        this.k = k;
        this.c = c;
        this.d = d;
        this.i = i;
        this.g = g;
        this.e = e;
    }
    
    private final vfp i() {
        return (vfp)this.a.a(this.b.c());
    }
    
    public final int a() {
        return 261;
    }
    
    public final int b() {
        return 141;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.i);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.J(ad.c));
    }
    
    public final afft d(final String s) {
        final appk ad = glb.ad(s, this.i);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        final String j = glb.J(c);
        final affr i = afft.i();
        i.h((Object)this.h.J(j));
        i.h((Object)this.h.J(glb.M(c)));
        i.h((Object)this.h.J(glb.P(c)));
        i.h((Object)this.h.J(glb.W(c)));
        i.h((Object)this.h.J(glb.Y(c)));
        i.h((Object)this.j.al());
        i.h((Object)this.h.J(glb.E(c)));
        i.h((Object)this.f.I());
        i.h((Object)fex.i(this.c, (asjr)ign.o));
        i.h((Object)this.h.J(glb.O(c)));
        if (this.e.ax() && this.g.E() && iiu.p((amwb)this.i().f(glb.M(c)).j((Class)amwb.class).af())) {
            i.h((Object)this.k.an());
        }
        return i.g();
    }
    
    public final Class e() {
        return amar.class;
    }
    
    public final Class f() {
        return ajgq.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, String c, final iiw iiw) {
        final amar amar = (amar)vfn;
        final ajgo d = ajgp.d(c);
        final ijr ijr = (ijr)iiw;
        float a = 0.0f;
        boolean b = false;
        final ijr ijr2 = new ijr(0.0f, false, 1);
        final amwb amwb = null;
        amam c2;
        if (amar != null) {
            c2 = amar.c();
        }
        else {
            c2 = null;
        }
        ijr ijr3;
        if (amar != null && c2 != null) {
            final apme f = iiu.f(this.d.b(amar));
            final ancy f2 = c2.f();
            amwb f3;
            if (f2 != null) {
                f3 = f2.f();
            }
            else {
                f3 = null;
            }
            if (ijr != null) {
                a = ijr.a;
            }
            final float max = Math.max(a, iiu.q(f2));
            final iiu d2 = this.d;
            final amam c3 = amar.c();
            ancy f4;
            if (c3 != null) {
                f4 = c3.f();
            }
            else {
                f4 = null;
            }
            amwb f5;
            if (f4 != null) {
                f5 = f4.f();
            }
            else {
                f5 = null;
            }
            d.g(Boolean.valueOf(d2.l(f4, f5)));
            d.d(f);
            final iiu d3 = this.d;
            final vfo vfo = (vfo)this.i().j(amar.e()).ac();
            int ad = 0;
            Label_0247: {
                if (vfo != null) {
                    c = vfo.c("transfer_network_constraint_key");
                    if (c != null) {
                        ad = aqsx.aD(tvb.b(c, 0));
                        break Label_0247;
                    }
                }
                ad = 1;
            }
            final amam c4 = amar.c();
            ancy f6;
            if (c4 != null) {
                f6 = c4.f();
            }
            else {
                f6 = null;
            }
            amwb f7 = amwb;
            if (f6 != null) {
                f7 = f6.f();
            }
            d.e(d3.o(d3.b(amar), f6, f7, ad));
            d.c(Float.valueOf(max));
            d.i(Float.valueOf(a));
            if (this.e.ax()) {
                d.f(Boolean.valueOf(iiu.p(f3)));
                final aezp d4 = this.d.d(f3, f2);
                if (d4.h()) {
                    d.h((amub)d4.c());
                }
            }
            else {
                d.f(Boolean.valueOf(false));
            }
            if (f == apme.e || f == apme.f) {
                b = true;
            }
            ijr3 = new ijr(max, b, 1);
        }
        else {
            d.d(apme.b);
            ijr3 = ijr2;
        }
        return fzw.aD((vfn)d.b(this.i()), (iiw)ijr3);
    }
}
