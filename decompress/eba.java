import com.facebook.litho.ComponentTree;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eba
{
    public static final ebc a;
    public static final nt b;
    
    static {
        a = (ebc)new ear(1, Integer.MIN_VALUE, eaq.a, eaq.d, (byte[])null);
        b = (nt)new lx((byte[])null);
    }
    
    static void a(final ebk ebk) {
        ebk.af();
    }
    
    protected static void b(final dsx dsx, final ead ead) {
        final int p2 = eax.P;
        final dst e = dsx.e;
        if (e != null) {
            final eax eax = (eax)e;
        }
        synchronized (ead) {
            final boolean a = ead.a;
            final dzt f = ead.f;
            monitorexit(ead);
            if (f == null) {
                return;
            }
            ead.f(f);
        }
    }
    
    static void c(final elx elx, final eay a) {
        elx.a = a;
    }
    
    static void d(final dsx dsx, final elx elx, final elx elx2, final elx elx3, final elx elx4, final elx elx5, final elx elx6, final elx elx7, @dyj final dzt dzt, @dyj final ebc ebc, @dyj final atib atib, @dyj final boolean s, @dyj final boolean h) {
        final eau c = ebc.c();
        final ecs d = ebc.d(dsx);
        elx7.a = d;
        final edx edx = new edx();
        edx.b = d;
        edx.a = c.a;
        final ecp b = c.b;
        final boolean d2 = c.d;
        final boolean l = c.l;
        final List m = c.m;
        edx.g = null;
        edx.r = c.u;
        final boolean k = c.k;
        final boolean c2 = c.c;
        edx.d = c.i;
        edx.q = c.t;
        edx.h = h;
        final boolean o = c.o;
        final boolean f = c.f;
        edx.j = c.e;
        edx.l = c.p;
        final int g = c.g;
        edx.m = c.q;
        final bma v = c.v;
        final ecx h2 = c.h;
        final int s2 = c.s;
        final ebd a = new ebd(edx.a(dsx), c.j);
        final dzu dzu = new dzu(dsx);
        elx4.a = a;
        elx.a = ebc.e();
        final cdo cdo = new cdo(dzu, (eac)a);
        cdo.c = dzt.f;
        final dvk n = c.n;
        final boolean r = c.r;
        final ead a2 = new ead(cdo, null, null, null);
        elx2.a = a2;
        atib a3;
        if (atib == null) {
            a3 = new atib((byte[])null, (byte[])null, (byte[])null);
        }
        else {
            a3 = atib;
        }
        int b2;
        if ((b2 = ebc.b()) == Integer.MIN_VALUE) {
            b2 = Integer.MAX_VALUE;
        }
        a3.a = b2;
        elx6.a = a3;
        final mcb mcb = new mcb(dsx, a3, (byte[])null, (byte[])null, (byte[])null);
        elx3.a = mcb;
        a2.i = mcb;
        a.a.F.a((efp)new edm(a2, 1));
        a.a.s = s;
        elx5.a = eay.a;
    }
    
    static dst e(final dsx dsx, @dyj final dzt dzt, @dyj final dst dst, @dyj final dst dst2, @dyj final dst dst3, @dyj final List c, @dyj final boolean d, @dyj final boolean b, @dyj boolean a, @dyj final nt nt, @dyj final int d2, @dyj(a = dyk.h) final int z, @dyj(a = dyk.h) final int j, @dyj(a = dyk.h) final int l, @dyj(a = dyk.h) final int b2, @dyj final elx q, @dyj final oa b3, @dyj final boolean b4, @dyj final ebc ebc, final atib p25, final ecs ecs, final eay eay, final ebk a2, final ead ead, final nz n) {
        final int p26 = eax.P;
        if (dsx.e != null) {
            final argj argj = new argj(Integer.MIN_VALUE, new Object[] { true });
            final ComponentTree h = dsx.h;
            if (h != null) {
                final String h2 = dsx.h();
                synchronized (h) {
                    if (h.s != null) {
                        h.v.n(h2, argj, true);
                    }
                }
            }
        }
        synchronized (ead) {
            final boolean a3 = ead.a;
            final dzt f = ead.f;
            if (f != null && f.h == dzt.h) {
                monitorexit(ead);
            }
            else {
                final dzt g = ead.g;
                if (g != null && g.h == dzt.h) {
                    monitorexit(ead);
                }
                else {
                    ead.g = ead.b(dzt, false);
                    monitorexit(ead);
                    ead.j(0, null, null);
                }
            }
            final boolean b5 = eay == eay.d && dst3 == null;
            if ((eay == eay.c && dst2 == null) || b5) {
                return null;
            }
            final boolean e = ebc.a() != 0 && !b4;
            final edd edd = new edd();
            edd.c(edd, dsx, new edf());
            final edf a4 = edd.a;
            a4.d = d;
            a4.z = z;
            a4.J = j;
            a4.L = l;
            a4.b = b2;
            edd.d(b);
            final edf a5 = edd.a;
            a5.A = a;
            a5.K = 0;
            a5.F = -1;
            a5.D = d2;
            a5.P = p25;
            dun m;
            if (!e) {
                m = null;
            }
            else {
                m = eax.M((Class)eax.class, "RecyclerCollectionComponent", dsx, -1873243140, new Object[] { dsx, ead });
            }
            final edf a6 = edd.a;
            a6.G = m;
            a6.E = e;
            a6.O = null;
            a6.g = false;
            a6.M = false;
            a6.f = edd.c.E(0.0f);
            final eaz eaz = new eaz(ecs);
            if (edd.a.C == Collections.EMPTY_LIST) {
                edd.a.C = new ArrayList();
            }
            edd.a.C.add(eaz);
            if (c != null) {
                if (edd.a.C.isEmpty()) {
                    edd.a.C = c;
                }
                else {
                    edd.a.C.addAll(c);
                }
            }
            final edf a7 = edd.a;
            a7.H = null;
            a7.I = -12425294;
            a7.N = n;
            a7.Q = q;
            a7.B = b3;
            a7.a = a2;
            edd.d.set(0);
            final nt b6 = eba.b;
            Object y = nt;
            if (b6 == nt) {
                y = new lx((byte[])null);
            }
            edd.a.y = (nt)y;
            edd.G(0.0f);
            edd.P(null);
            if (!a2.i()) {
                final boolean d3 = ebc.c().d;
                edd.N(3);
                edd.M(9, 0);
            }
            final dsm b7 = dsn.b(dsx);
            ((dsr)b7).G(0.0f);
            b7.c(egv.b);
            b7.l((dsr)edd);
            if (eay == eay.a && dst != null) {
                final dxs b8 = dxt.b(dsx);
                b8.e(dst);
                ((dsr)b8).G(0.0f);
                ((dsr)b8).N(3);
                ((dsr)b8).M(9, 0);
                b7.l((dsr)b8);
            }
            else if (eay == eay.c) {
                final dxs b9 = dxt.b(dsx);
                b9.e(dst2);
                ((dsr)b9).G(0.0f);
                ((dsr)b9).N(3);
                ((dsr)b9).M(9, 0);
                b7.l((dsr)b9);
            }
            else if (eay == eay.d) {
                final dxs b10 = dxt.b(dsx);
                b10.e(dst3);
                ((dsr)b10).G(0.0f);
                ((dsr)b10).N(3);
                ((dsr)b10).M(9, 0);
                b7.l((dsr)b10);
            }
            return b7.a;
        }
    }
}
