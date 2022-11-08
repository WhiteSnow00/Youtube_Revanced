import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxl implements abnq, tec
{
    final /* synthetic */ aaxm a;
    
    public aaxl(final aaxm a) {
        this.a = a;
    }
    
    public final void a(final aakn aakn) {
        this.a.i = aakn.c();
        if (this.a.l()) {
            return;
        }
        final aaxm a = this.a;
        if (a.p != a.m()) {
            if (this.a.m()) {
                final aaxm a2 = this.a;
                a2.p(false, a2.n.e);
            }
            else {
                this.a.o();
            }
        }
        this.a.k();
    }
    
    public final void b(final aaly aaly) {
        aaly.c().h();
        final abid a = abid.a;
        final int ordinal = aaly.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 4) {
                if (ordinal == 7) {
                    this.a.h(aaxm.g(aaly.b()), aaly.e());
                    return;
                }
                if (ordinal == 8) {
                    final aaxm a2 = this.a;
                    if (!a2.h) {
                        a2.h(aaxm.g(aaly.b()), aaly.e());
                    }
                }
            }
            else if (aaly.a() != null) {
                this.a.h(aaxm.g(aaly.a()), aaly.k());
            }
            return;
        }
        this.a.j();
        this.a.i();
    }
    
    public final void c(final aalz aalz) {
        final int r = (int)aalz.e();
        final aaxm a = this.a;
        if (r == a.r) {
            return;
        }
        a.r = r;
        if (a.k != null) {
            a.k();
            if (a.k.d.size() != 0) {
                final int n = 0;
                final aorm aorm = null;
                int m = -1;
                ahsh n2 = null;
                int n4;
                ahsh ahsh2;
                for (int i = 0; i < a.o.size(); ++i, m = n4, n2 = ahsh2) {
                    final ahsh ahsh = a.o.get(i);
                    final long c = ahsh.c;
                    final long n3 = r;
                    n4 = m;
                    ahsh2 = n2;
                    if (c <= n3) {
                        n4 = m;
                        ahsh2 = n2;
                        if (ahsh.d > n3) {
                            if (n2 != null) {
                                n4 = m;
                                ahsh2 = n2;
                                if (c <= n2.c) {
                                    continue;
                                }
                            }
                            n4 = i;
                            ahsh2 = ahsh;
                        }
                    }
                }
                if (m != a.m) {
                    a.m = m;
                    a.n = n2;
                    final ahsh n5 = a.n;
                    if (n5 != null) {
                        aorm aorm2 = aorm;
                        if ((n5.b & 0x80) != 0x0 && (aorm2 = n5.f) == null) {
                            aorm2 = aorm.a;
                        }
                        a.j = a.f(aaxm.n(aorm2), (aaxj)new aaxh());
                        a.v.D((List)a.n.h);
                    }
                }
                if (a.n == null) {
                    a.o();
                    return;
                }
                if (a.l()) {
                    a.o();
                    return;
                }
                if (a.m() && !a.p) {
                    int e;
                    if (a.l[a.m]) {
                        e = n;
                    }
                    else {
                        e = a.n.e;
                    }
                    a.p(true, e);
                }
            }
        }
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 2048L)).j(aajj.r(1)).am((asix)new aavd(this, 8), (asix)aamk.o);
        final asic am2 = ((asgt)abns.q().e).j(aajj.t(abns.bN(), 2048L)).j(aajj.r(1)).am((asix)new aavd(this, 9), (asix)aamk.o);
        asic asic;
        if (((uyi)abns.cd().h).bw()) {
            asic = ((asgt)abns.f().f).am((asix)new aavd(this, 10), (asix)aamk.o);
        }
        else {
            asic = abns.f().b().j(aajj.t(abns.bN(), 2048L)).j(aajj.r(0)).am((asix)new aavd(this, 10), (asix)aamk.o);
        }
        return new asic[] { am, am2, asic };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c((aalz)o);
                }
                else {
                    this.b((aaly)o);
                }
            }
            else {
                this.a((aakn)o);
            }
        }
        else {
            array = new Class[] { aakn.class, aaly.class, aalz.class };
        }
        return array;
    }
}
