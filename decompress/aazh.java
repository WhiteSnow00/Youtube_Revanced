import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazh implements abps, tgg
{
    final aazi a;
    
    public aazh(final aazi a) {
        this.a = a;
    }
    
    public final void a(final aamh aamh) {
        this.a.i = aamh.c();
        if (this.a.l()) {
            return;
        }
        final aazi a = this.a;
        if (a.p != a.m()) {
            if (this.a.m()) {
                final aazi a2 = this.a;
                a2.p(false, a2.n.e);
            }
            else {
                this.a.o();
            }
        }
        this.a.k();
    }
    
    public final void b(final aans aans) {
        aans.c().h();
        final abjv a = abjv.a;
        final int ordinal = aans.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 4) {
                if (ordinal == 7) {
                    this.a.h(aazi.g(aans.b()), aans.e());
                    return;
                }
                if (ordinal == 8) {
                    final aazi a2 = this.a;
                    if (!a2.h) {
                        a2.h(aazi.g(aans.b()), aans.e());
                    }
                }
            }
            else if (aans.a() != null) {
                this.a.h(aazi.g(aans.a()), aans.k());
            }
            return;
        }
        this.a.j();
        this.a.i();
    }
    
    public final void c(final aant aant) {
        final int r = (int)aant.e();
        final aazi a = this.a;
        if (r == a.r) {
            return;
        }
        a.r = r;
        if (a.k != null) {
            a.k();
            if (a.k.d.size() != 0) {
                final aotp aotp = null;
                final int n = 0;
                int m = -1;
                ahuf n2 = null;
                int n4;
                ahuf ahuf2;
                for (int i = 0; i < a.o.size(); ++i, m = n4, n2 = ahuf2) {
                    final ahuf ahuf = a.o.get(i);
                    final long c = ahuf.c;
                    final long n3 = r;
                    n4 = m;
                    ahuf2 = n2;
                    if (c <= n3) {
                        n4 = m;
                        ahuf2 = n2;
                        if (ahuf.d > n3) {
                            if (n2 != null) {
                                n4 = m;
                                ahuf2 = n2;
                                if (c <= n2.c) {
                                    continue;
                                }
                            }
                            n4 = i;
                            ahuf2 = ahuf;
                        }
                    }
                }
                if (m != a.m) {
                    a.m = m;
                    a.n = n2;
                    final ahuf n5 = a.n;
                    if (n5 != null) {
                        aotp aotp2 = aotp;
                        if ((n5.b & 0x80) != 0x0 && (aotp2 = n5.f) == null) {
                            aotp2 = aotp.a;
                        }
                        a.j = a.f(aazi.n(aotp2), (aazf)new aazd());
                        a.v.B((List)a.n.h);
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
    
    @Override
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 2048L)).j(aale.q(1)).an((asjm)new aauu(this, 13), (asjm)aaof.o);
        final asir an2 = ((ashi)abpu.p().e).j(aale.s(abpu.bM(), 2048L)).j(aale.q(1)).an((asjm)new aauu(this, 14), (asjm)aaof.o);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new aauu(this, 15), (asjm)aaof.o);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 2048L)).j(aale.q(0)).an((asjm)new aauu(this, 15), (asjm)aaof.o);
        }
        return new asir[] { an, an2, asir };
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
                    this.c((aant)o);
                }
                else {
                    this.b((aans)o);
                }
            }
            else {
                this.a((aamh)o);
            }
        }
        else {
            array = new Class[] { aamh.class, aans.class, aant.class };
        }
        return array;
    }
}
