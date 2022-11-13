import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iiq implements aacc
{
    private static final aacb a;
    private final aaec b;
    private final tgd c;
    private final iin d;
    private final aabo e;
    private final aanx f;
    private final aanx g;
    
    static {
        a = (aacb)new iio(2);
    }
    
    public iiq(final aanx g, final aaec b, final aabo e, final aanx f, final tgd c, final iin d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final aacb a(final amul amul) {
        final int cu = aqsx.cU(amul.c);
        if (cu != 0) {
            if (cu == 4) {
                return iiq.a;
            }
        }
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final String i = vgl.i(amul.d);
        if (i.isEmpty()) {
            final aaby b = aabz.c.b();
            b.b = 27;
            return afwm.m((Object)b.a());
        }
        amuj amuj;
        if ((amuj = amul.e) == null) {
            amuj = amuj.b;
        }
        final apzh apzh = (apzh)((ahbc)amuj).rx((ahaq)apzh.b);
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            final aaeh a = this.e.a();
            aabz aabz;
            if (!zme.d().equals(a.q())) {
                final aaby b2 = aabz.b.b();
                b2.b = 35;
                aabz = b2.a();
            }
            else {
                final zvo b3 = a.B();
                if (b3 == null) {
                    final aaby b4 = aabz.b.b();
                    b4.b = 15;
                    aabz = b4.a();
                }
                else {
                    this.f.b(true);
                    amwz amwz;
                    if ((amwz = amwz.b(apzh.e)) == null) {
                        amwz = amwz.a;
                    }
                    final String h = apzh.h;
                    byte[] j;
                    if ((apzh.c & 0x1) != 0x0) {
                        j = apzh.d.I();
                    }
                    else {
                        j = null;
                    }
                    final aabf t = b3.t(i);
                    if (t != null && !t.q()) {
                        if (t.s() && (!t.b() || t.w() || t.r() || t.p())) {
                            a.k().c(i);
                            b3.ac(i, aaaq.c);
                            b3.C(i);
                            a.l().v(i, true);
                            aabz = aabz.a;
                        }
                        else if (!t.e) {
                            b3.K(i);
                            a.l().v(i, false);
                            aabz = aabz.a;
                        }
                        else {
                            aabz = aabz.a;
                        }
                    }
                    else if (b3.e(i) != null) {
                        b3.Z(i, aaaq.c, amwz, h, 0, j);
                        b3.K(i);
                        b3.ac(i, aaaq.c);
                        a.l().v(i, true);
                        aabz = aabz.a;
                    }
                    else {
                        final int c2 = apzh.c;
                        Label_1820: {
                            if ((c2 & 0x4) != 0x0 && (c2 & 0x8) != 0x0) {
                                apzn apzn;
                                if ((apzn = apzh.f) == null) {
                                    apzn = apzn.a;
                                }
                                apyk apyk;
                                if ((apyk = apzh.g) == null) {
                                    apyk = apyk.a;
                                }
                                final ahaz builder = ((ahbh)amvs.a).createBuilder();
                                final String e = apzn.e;
                                builder.copyOnWrite();
                                final amvs amvs = (amvs)builder.instance;
                                e.getClass();
                                amvs.b |= 0x1;
                                amvs.c = e;
                                final String g = apzn.g;
                                builder.copyOnWrite();
                                final amvs amvs2 = (amvs)builder.instance;
                                g.getClass();
                                amvs2.b |= 0x8;
                                amvs2.f = g;
                                final long seconds = TimeUnit.MILLISECONDS.toSeconds(apzn.h);
                                builder.copyOnWrite();
                                final amvs amvs3 = (amvs)builder.instance;
                                amvs3.b |= 0x20;
                                amvs3.h = seconds;
                                final long o = apzn.i;
                                builder.copyOnWrite();
                                final amvs amvs4 = (amvs)builder.instance;
                                amvs4.b |= 0x2000;
                                amvs4.o = o;
                                final String ae = tpe.ae((long)apzn.i);
                                builder.copyOnWrite();
                                final amvs amvs5 = (amvs)builder.instance;
                                amvs5.b |= 0x10;
                                amvs5.g = ae;
                                final long m = apzn.m;
                                builder.copyOnWrite();
                                final amvs amvs6 = (amvs)builder.instance;
                                amvs6.b |= 0x40;
                                amvs6.i = m;
                                apzj apzj;
                                if ((apzj = apzn.q) == null) {
                                    apzj = apzj.a;
                                }
                                final String c3 = apzj.c;
                                builder.copyOnWrite();
                                final amvs amvs7 = (amvs)builder.instance;
                                c3.getClass();
                                amvs7.b |= 0x400;
                                amvs7.l = c3;
                                apzj apzj2;
                                if ((apzj2 = apzn.q) == null) {
                                    apzj2 = apzj.a;
                                }
                                final String d = apzj2.d;
                                builder.copyOnWrite();
                                final amvs amvs8 = (amvs)builder.instance;
                                d.getClass();
                                amvs8.b |= 0x800;
                                amvs8.m = d;
                                apzj apzj3;
                                if ((apzj3 = apzn.q) == null) {
                                    apzj3 = apzj.a;
                                }
                                final String e2 = apzj3.e;
                                builder.copyOnWrite();
                                final amvs amvs9 = (amvs)builder.instance;
                                e2.getClass();
                                amvs9.b |= 0x1000;
                                amvs9.n = e2;
                                aotp d2;
                                if ((d2 = apzn.j) == null) {
                                    d2 = aotp.a;
                                }
                                builder.copyOnWrite();
                                final amvs amvs10 = (amvs)builder.instance;
                                d2.getClass();
                                amvs10.d = d2;
                                amvs10.b |= 0x2;
                                final ahaz builder2 = ((ahbh)amti.a).createBuilder();
                                final ahaz builder3 = ((ahbh)amth.a).createBuilder();
                                final String e3 = apyk.e;
                                builder3.copyOnWrite();
                                final amth amth = (amth)builder3.instance;
                                e3.getClass();
                                amth.b |= 0x1;
                                amth.c = e3;
                                final String f = apyk.f;
                                builder3.copyOnWrite();
                                final amth amth2 = (amth)builder3.instance;
                                f.getClass();
                                amth2.b |= 0x4;
                                amth2.e = f;
                                aotp d3;
                                if ((d3 = apyk.g) == null) {
                                    d3 = aotp.a;
                                }
                                builder3.copyOnWrite();
                                final amth amth3 = (amth)builder3.instance;
                                d3.getClass();
                                amth3.d = d3;
                                amth3.b |= 0x2;
                                builder2.copyOnWrite();
                                final amti amti = (amti)builder2.instance;
                                final amth c4 = (amth)builder3.build();
                                c4.getClass();
                                amti.c = c4;
                                amti.b |= 0x1;
                                final amti e4 = (amti)builder2.build();
                                builder.copyOnWrite();
                                final amvs amvs11 = (amvs)builder.instance;
                                e4.getClass();
                                amvs11.e = e4;
                                amvs11.b |= 0x4;
                                if ((apzn.c & 0x200) != 0x0) {
                                    ajut k;
                                    if ((k = apzn.l) == null) {
                                        k = ajut.a;
                                    }
                                    builder.copyOnWrite();
                                    final amvs amvs12 = (amvs)builder.instance;
                                    k.getClass();
                                    amvs12.k = k;
                                    amvs12.b |= 0x200;
                                }
                                else {
                                    final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
                                    final ahbb ahbb2 = (ahbb)((ahbh)ajuv.a).createBuilder();
                                    aqdy aqdy;
                                    if ((aqdy = apzn.k) == null) {
                                        aqdy = aqdy.a;
                                    }
                                    final String c5 = aqdy.c;
                                    ((ahaz)ahbb2).copyOnWrite();
                                    final ajuv ajuv = (ajuv)ahbb2.instance;
                                    c5.getClass();
                                    ajuv.b |= 0x1;
                                    ajuv.c = c5;
                                    ahbb.i((ajuv)((ahaz)ahbb2).build());
                                    builder.copyOnWrite();
                                    final amvs amvs13 = (amvs)builder.instance;
                                    final ajut l = (ajut)((ahaz)ahbb).build();
                                    l.getClass();
                                    amvs13.k = l;
                                    amvs13.b |= 0x200;
                                }
                                final aaba aaba = aaba.c((amvs)builder.build());
                                break Label_1820;
                            }
                            try {
                                final aaba aaba = this.g.C(i);
                                if (b3.aj(aaba, amwz, h, this.b.U(amwz), aaaz.a, 0, j, aaaq.c)) {
                                    final agq e5 = aaba.e;
                                    if (e5 != null) {
                                        if (b3.l.Z((String)e5.e) == null) {
                                            b3.l.aa(e5);
                                        }
                                        else {
                                            b3.l.ab(e5);
                                        }
                                    }
                                    a.l().v(i, true);
                                    aabz = aabz.a;
                                }
                                else {
                                    final aaby b5 = aabz.c.b();
                                    b5.b = 40;
                                    aabz = b5.a();
                                }
                            }
                            catch (final ExecutionException ex) {
                                final aaby b6 = aabz.c.b();
                                b6.b = 3;
                                aabz = b6.a();
                            }
                        }
                    }
                }
            }
            return afwm.m((Object)aabz);
        }
        if (cu == 2) {
            final aaeh a2 = this.e.a();
            aabz aabz2;
            if (!zme.d().equals(a2.q())) {
                final aaby b7 = aabz.b.b();
                b7.b = 35;
                aabz2 = b7.a();
            }
            else {
                final zvo b8 = a2.B();
                if (b8 == null) {
                    final aaby b9 = aabz.b.b();
                    b9.b = 15;
                    aabz2 = b9.a();
                }
                else if (b8.J(i, 2)) {
                    b8.A(i);
                    this.c.f((Object)new zyh(i));
                    aabz2 = aabz.a;
                }
                else {
                    final aaby b10 = aabz.b.b();
                    b10.b = 39;
                    aabz2 = b10.a();
                }
            }
            return afwm.m((Object)aabz2);
        }
        if (cu != 3) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 151 });
            final aaby b11 = aabz.c.b();
            b11.b = 23;
            return afwm.m((Object)b11.a());
        }
        return this.d.k(zme, amul);
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        final int n = 0;
        int cu;
        if ((cu = aqsx.cU(((amul)afeq.get(0)).c)) == 0) {
            cu = 1;
        }
        if (--cu != 3) {
            ttr.e("Could not handle actions: %s for type %s", new Object[] { cu, 151 });
            final int c = ((afih)afeq).c;
            final afel d = afeq.d();
            for (int i = n; i < c; ++i) {
                final aaby b = aabz.c.b();
                b.b = 23;
                d.h(b.a());
            }
            return afwm.m((Object)d.g());
        }
        return this.d.i(zme, afeq);
    }
}
