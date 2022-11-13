// 
// Decompiled by Procyon v0.6.0
// 

public final class ijs implements iix
{
    private final vdr a;
    private final tmx b;
    private final iiu c;
    private final hzn d;
    private final bhv e;
    private final hzn f;
    private final bhv g;
    private final fzw h;
    private final fzw i;
    
    public ijs(final vdr a, final hzn f, final fzw h, final hzn d, final fzw i, final tmx b, final iiu c, final bhv e, final bhv g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.f = f;
        this.h = h;
        this.d = d;
        this.i = i;
        this.b = b;
        this.c = c;
        this.e = e;
        this.g = g;
    }
    
    public final int a() {
        return 155;
    }
    
    public final int b() {
        return 141;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.g);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.x(ad.c));
    }
    
    public final afft d(final String s) {
        final appk ad = glb.ad(s, this.g);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        final String x = glb.x(c);
        final affr i = afft.i();
        i.h((Object)this.f.J(x));
        i.h((Object)this.f.J(glb.M(c)));
        i.h((Object)this.f.J(glb.P(c)));
        i.h((Object)this.f.J(glb.W(c)));
        i.h((Object)this.h.al());
        i.h((Object)this.f.J(glb.E(c)));
        i.h((Object)this.d.I());
        i.h((Object)fex.i(this.b, (asjr)ijp.e));
        i.h((Object)this.f.J(glb.O(c)));
        if (this.e.E() && iiu.p((amwb)this.a.b().f(glb.M(c)).j((Class)amwb.class).af())) {
            i.h((Object)this.i.an());
        }
        return i.g();
    }
    
    public final Class e() {
        return apys.class;
    }
    
    public final Class f() {
        return ajgq.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final apys apys = (apys)vfn;
        final ajgo d = ajgp.d(s);
        final ijr ijr = (ijr)iiw;
        float a = 0.0f;
        ijr ijr2 = new ijr(0.0f, false, 0);
        if (apys != null) {
            final apme f = iiu.f(this.c.c(apys));
            if (ijr != null) {
                a = ijr.a;
            }
            final float max = Math.max(a, iiu.q(apys.f()));
            d.g(Boolean.valueOf(this.c.k(apys)));
            d.d(f);
            final iiu c = this.c;
            final ijk c2 = c.c(apys);
            final ancy f2 = apys.f();
            final amwb c3 = apys.c();
            final boolean b = true;
            d.e(c.o(c2, f2, c3, 1));
            d.c(Float.valueOf(max));
            d.i(Float.valueOf(a));
            d.f(Boolean.valueOf(iiu.p(apys.c())));
            final aezp d2 = this.c.d(apys.c(), apys.f());
            if (d2.h()) {
                d.h((amub)d2.c());
            }
            boolean b2 = b;
            if (f != apme.e) {
                b2 = (f == apme.f && b);
            }
            ijr2 = new ijr(max, b2, 0);
        }
        else {
            d.d(apme.b);
        }
        return fzw.aD((vfn)d.b((vfp)this.a.b()), (iiw)ijr2);
    }
}
