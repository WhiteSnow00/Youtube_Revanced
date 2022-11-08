import com.facebook.litho.ComponentTree;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eaz
{
    public static final ebb a;
    public static final nt b;
    
    static {
        a = (ebb)new eaq(1, Integer.MIN_VALUE, eap.a, eap.d, (byte[])null);
        b = (nt)new lx((byte[])null);
    }
    
    static void a(final ebj ebj) {
        ebj.af();
    }
    
    protected static void b(final dsw dsw, final eac eac) {
        final int p2 = eaw.P;
        final dss e = dsw.e;
        if (e != null) {
            final eaw eaw = (eaw)e;
        }
        synchronized (eac) {
            final boolean a = eac.a;
            final dzs f = eac.f;
            monitorexit(eac);
            if (f == null) {
                return;
            }
            eac.f(f);
        }
    }
    
    static void c(final elw elw, final eax a) {
        elw.a = a;
    }
    
    static void d(final dsw dsw, final elw elw, final elw elw2, final elw elw3, final elw elw4, final elw elw5, final elw elw6, final elw elw7, @dyi final dzs dzs, @dyi final ebb ebb, @dyi athj a, @dyi final boolean s, @dyi final boolean h) {
        final eat c = ebb.c();
        final ecr d = ebb.d(dsw);
        elw7.a = d;
        final edw edw = new edw();
        edw.b = d;
        edw.a = c.a;
        final eco b = c.b;
        final boolean d2 = c.d;
        final boolean l = c.l;
        final List m = c.m;
        edw.g = null;
        edw.r = c.u;
        final boolean k = c.k;
        final boolean c2 = c.c;
        edw.d = c.i;
        edw.q = c.t;
        edw.h = h;
        final boolean o = c.o;
        final boolean f = c.f;
        edw.j = c.e;
        edw.l = c.p;
        final int g = c.g;
        edw.m = c.q;
        final blz v = c.v;
        final ecw h2 = c.h;
        final int s2 = c.s;
        final ebc a2 = new ebc(edw.a(dsw), c.j);
        final dzt dzt = new dzt(dsw);
        elw4.a = a2;
        elw.a = ebb.e();
        final cdn cdn = new cdn(dzt, (eab)a2);
        cdn.c = dzs.f;
        final dvj n = c.n;
        final boolean r = c.r;
        final eac a3 = new eac(cdn, null, null, null);
        elw2.a = a3;
        if (a == null) {
            a = new athj((byte[])null, (byte[])null, (byte[])null);
        }
        int b2;
        if ((b2 = ebb.b()) == Integer.MIN_VALUE) {
            b2 = Integer.MAX_VALUE;
        }
        a.a = b2;
        elw6.a = a;
        final maw maw = new maw(dsw, a, (byte[])null, (byte[])null, (byte[])null);
        elw3.a = maw;
        a3.i = maw;
        a2.a.F.a((efo)new edl(a3, 1));
        a2.a.s = s;
        elw5.a = eax.a;
    }
    
    static dss e(final dsw dsw, @dyi final dzs dzs, @dyi final dss dss, @dyi final dss dss2, @dyi final dss dss3, @dyi final List c, @dyi final boolean d, @dyi final boolean b, @dyi boolean a, @dyi final nt nt, @dyi final int d2, @dyi(a = dyj.h) final int z, @dyi(a = dyj.h) final int j, @dyi(a = dyj.h) final int l, @dyi(a = dyj.h) final int b2, @dyi final elw q, @dyi final oa b3, @dyi final boolean b4, @dyi final ebb ebb, final athj p25, final ecr ecr, final eax eax, final ebj a2, final eac eac, final nz n) {
        final int p26 = eaw.P;
        if (dsw.e != null) {
            final ardu ardu = new ardu(Integer.MIN_VALUE, new Object[] { true });
            final ComponentTree h = dsw.h;
            if (h != null) {
                final String h2 = dsw.h();
                synchronized (h) {
                    if (h.s != null) {
                        h.v.n(h2, ardu, true);
                    }
                }
            }
        }
        synchronized (eac) {
            final boolean a3 = eac.a;
            final dzs f = eac.f;
            if (f != null && f.h == dzs.h) {
                monitorexit(eac);
            }
            else {
                final dzs g = eac.g;
                if (g != null && g.h == dzs.h) {
                    monitorexit(eac);
                }
                else {
                    eac.g = eac.b(dzs, false);
                    monitorexit(eac);
                    eac.j(0, null, null);
                }
            }
            final boolean b5 = eax == eax.d && dss3 == null;
            if ((eax == eax.c && dss2 == null) || b5) {
                return null;
            }
            final boolean e = ebb.a() != 0 && !b4;
            final edc edc = new edc();
            edc.c(edc, dsw, new ede());
            final ede a4 = edc.a;
            a4.d = d;
            a4.z = z;
            a4.J = j;
            a4.L = l;
            a4.b = b2;
            edc.d(b);
            final ede a5 = edc.a;
            a5.A = a;
            a5.K = 0;
            a5.F = -1;
            a5.D = d2;
            a5.P = p25;
            dum m;
            if (!e) {
                m = null;
            }
            else {
                m = eaw.M((Class)eaw.class, "RecyclerCollectionComponent", dsw, -1873243140, new Object[] { dsw, eac });
            }
            final ede a6 = edc.a;
            a6.G = m;
            a6.E = e;
            a6.O = null;
            a6.g = false;
            a6.M = false;
            a6.f = edc.c.E(0.0f);
            final eay eay = new eay(ecr);
            if (edc.a.C == Collections.EMPTY_LIST) {
                edc.a.C = new ArrayList();
            }
            edc.a.C.add(eay);
            if (c != null) {
                if (edc.a.C.isEmpty()) {
                    edc.a.C = c;
                }
                else {
                    edc.a.C.addAll(c);
                }
            }
            final ede a7 = edc.a;
            a7.H = null;
            a7.I = -12425294;
            a7.N = n;
            a7.Q = q;
            a7.B = b3;
            a7.a = a2;
            edc.d.set(0);
            final nt b6 = eaz.b;
            Object y = nt;
            if (b6 == nt) {
                y = new lx((byte[])null);
            }
            edc.a.y = (nt)y;
            ((dsq)edc).G(0.0f);
            ((dsq)edc).P((dum)null);
            if (!a2.i()) {
                final boolean d3 = ebb.c().d;
                ((dsq)edc).N(3);
                ((dsq)edc).M(9, 0);
            }
            final dsl b7 = dsm.b(dsw);
            ((dsq)b7).G(0.0f);
            b7.c(egu.b);
            b7.l((dsq)edc);
            if (eax == eax.a && dss != null) {
                final dxr b8 = dxs.b(dsw);
                b8.e(dss);
                b8.G(0.0f);
                b8.N(3);
                b8.M(9, 0);
                b7.l((dsq)b8);
            }
            else if (eax == eax.c) {
                final dxr b9 = dxs.b(dsw);
                b9.e(dss2);
                b9.G(0.0f);
                b9.N(3);
                b9.M(9, 0);
                b7.l((dsq)b9);
            }
            else if (eax == eax.d) {
                final dxr b10 = dxs.b(dsw);
                b10.e(dss3);
                b10.G(0.0f);
                b10.N(3);
                b10.M(9, 0);
                b7.l((dsq)b10);
            }
            return (dss)b7.a;
        }
    }
}
