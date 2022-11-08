import java.util.Iterator;
import java.util.EnumMap;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oyd
{
    protected static final Map a;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    protected final Set b;
    public oyq c;
    
    static {
        final HashSet set = new HashSet();
        final Integer value = 2;
        set.add(value);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("atos", nrw.S(oxo.D));
        linkedHashMap.put("avt", nrw.T(oxo.D, (Set)set));
        linkedHashMap.put("davs", nrw.O(oxo.ah));
        linkedHashMap.put("dafvs", nrw.O(oxo.ai));
        linkedHashMap.put("dav", nrw.O(oxo.F));
        linkedHashMap.put("ss", nrw.R(oxo.s, oxm.b));
        linkedHashMap.put("ssb", nrw.U(oxo.x, (Set)null, true));
        linkedHashMap.put("t", nrw.O(oxo.al));
        a = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("c", nrw.R(oxo.l, oxm.b));
        linkedHashMap2.put("ss", nrw.R(oxo.s, oxm.b));
        linkedHashMap2.put("a", nrw.R(oxo.e, oxm.c));
        linkedHashMap2.put("dur", nrw.O(oxo.O));
        linkedHashMap2.put("p", nrw.S(oxo.Q));
        linkedHashMap2.put("gmm", nrw.O(oxo.d));
        linkedHashMap2.put("gdr", nrw.O(oxo.ak));
        linkedHashMap2.put("t", nrw.O(oxo.al));
        final HashSet set2 = new HashSet();
        final Integer value2 = 0;
        set2.add(value2);
        set2.add(value);
        final Integer value3 = 4;
        set2.add(value3);
        linkedHashMap2.put("at", nrw.O(oxo.G));
        linkedHashMap2.put("atos", nrw.T(oxo.D, (Set)set2));
        linkedHashMap2.put("tos", nrw.Q(oxo.y, (Set)set2));
        linkedHashMap2.put("mtos", nrw.T(oxo.z, (Set)set2));
        linkedHashMap2.put("vsv", nrw.P("a5"));
        d = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap2);
        final HashSet set3 = new HashSet();
        set3.add(value2);
        set3.add(value);
        set3.add(value3);
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("a", nrw.R(oxo.e, oxm.c));
        linkedHashMap3.put("tos", nrw.Q(oxo.y, (Set)set3));
        linkedHashMap3.put("at", nrw.O(oxo.G));
        linkedHashMap3.put("c", nrw.R(oxo.l, oxm.b));
        linkedHashMap3.put("mtos", nrw.T(oxo.z, (Set)set3));
        linkedHashMap3.put("dur", nrw.O(oxo.O));
        linkedHashMap3.put("fs", nrw.O(oxo.L));
        linkedHashMap3.put("p", nrw.S(oxo.Q));
        linkedHashMap3.put("vpt", nrw.O(oxo.J));
        linkedHashMap3.put("vsv", nrw.P("ias_a2"));
        linkedHashMap3.put("gmm", nrw.O(oxo.d));
        linkedHashMap3.put("gdr", nrw.O(oxo.ak));
        linkedHashMap3.put("t", nrw.O(oxo.al));
        e = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap3);
        final HashSet set4 = new HashSet();
        set4.add(value2);
        set4.add(value);
        set4.add(value3);
        final LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("tos", nrw.Q(oxo.y, (Set)set4));
        linkedHashMap4.put("at", nrw.O(oxo.G));
        linkedHashMap4.put("c", nrw.R(oxo.l, oxm.b));
        linkedHashMap4.put("mtos", nrw.T(oxo.z, (Set)set4));
        linkedHashMap4.put("p", nrw.S(oxo.Q));
        linkedHashMap4.put("vpt", nrw.O(oxo.J));
        linkedHashMap4.put("vsv", nrw.P("dv_a4"));
        linkedHashMap4.put("gmm", nrw.O(oxo.d));
        linkedHashMap4.put("gdr", nrw.O(oxo.ak));
        linkedHashMap4.put("t", nrw.O(oxo.al));
        linkedHashMap4.put("mv", nrw.R(oxo.g, oxm.b));
        linkedHashMap4.put("qmpt", nrw.T(oxo.ax, (Set)set4));
        linkedHashMap4.put("qvs", new oyh(oxo.ay, new int[] { 100, 50, 0 }, 4));
        linkedHashMap4.put("qmv", nrw.R(oxo.az, oxm.b));
        linkedHashMap4.put("qa", nrw.O(oxo.aB));
        linkedHashMap4.put("a", nrw.R(oxo.e, oxm.c));
        f = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap4);
    }
    
    public oyd(final oyq c) {
        this.c = c;
        this.b = EnumSet.noneOf(oyr.class);
    }
    
    protected Map a(final oyr oyr) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sv", nrw.P("96"));
        linkedHashMap.put("cb", nrw.P("a"));
        linkedHashMap.put("sdk", nrw.O(oxo.c));
        linkedHashMap.put("gmm", nrw.O(oxo.d));
        linkedHashMap.put("a", nrw.R(oxo.e, oxm.c));
        linkedHashMap.put("nv", nrw.R(oxo.f, oxm.c));
        linkedHashMap.put("mv", nrw.R(oxo.g, oxm.c));
        linkedHashMap.put("c", nrw.R(oxo.l, oxm.b));
        linkedHashMap.put("nc", nrw.R(oxo.m, oxm.b));
        linkedHashMap.put("mc", nrw.R(oxo.n, oxm.b));
        linkedHashMap.put("tos", nrw.S(oxo.y));
        linkedHashMap.put("mtos", nrw.S(oxo.z));
        linkedHashMap.put("amtos", nrw.S(oxo.E));
        linkedHashMap.put("p", nrw.S(oxo.Q));
        linkedHashMap.put("cp", nrw.S(oxo.V));
        linkedHashMap.put("bs", nrw.S(oxo.ab));
        linkedHashMap.put("ps", nrw.S(oxo.aa));
        linkedHashMap.put("scs", nrw.S(oxo.ac));
        linkedHashMap.put("at", nrw.O(oxo.G));
        linkedHashMap.put("as", nrw.O(oxo.I));
        linkedHashMap.put("dur", nrw.O(oxo.O));
        linkedHashMap.put("vmtime", nrw.O(oxo.P));
        linkedHashMap.put("dvs", nrw.O(oxo.af));
        linkedHashMap.put("dfvs", nrw.O(oxo.ag));
        linkedHashMap.put("dtos", nrw.O(oxo.ad));
        linkedHashMap.put("dtoss", nrw.O(oxo.ae));
        linkedHashMap.put("std", nrw.O(oxo.aj));
        linkedHashMap.put("tcm", nrw.O(oxo.am));
        linkedHashMap.put("bt", nrw.O(oxo.an));
        linkedHashMap.put("pst", nrw.O(oxo.ao));
        linkedHashMap.put("nmt", nrw.O(oxo.ap));
        linkedHashMap.put("ft", nrw.O(oxo.M));
        linkedHashMap.put("dat", nrw.O(oxo.H));
        linkedHashMap.put("dft", nrw.O(oxo.N));
        linkedHashMap.put("is", nrw.O(oxo.aq));
        linkedHashMap.put("i0", nrw.O(oxo.ar));
        linkedHashMap.put("i1", nrw.O(oxo.as));
        linkedHashMap.put("i2", nrw.O(oxo.at));
        linkedHashMap.put("i3", nrw.O(oxo.au));
        linkedHashMap.put("ic", nrw.O(oxo.av));
        linkedHashMap.put("cs", nrw.O(oxo.aw));
        linkedHashMap.put("vpt", nrw.O(oxo.J));
        linkedHashMap.put("dvpt", nrw.O(oxo.K));
        linkedHashMap.put("lte", nrw.P("1"));
        linkedHashMap.put("avms", nrw.P("nl"));
        if (oyr != null && (oyr.e() || oyr.g())) {
            linkedHashMap.put("qmt", nrw.S(oxo.ax));
            linkedHashMap.put("qnc", nrw.R(oxo.ay, oxm.b));
            linkedHashMap.put("qmv", nrw.R(oxo.az, oxm.c));
            linkedHashMap.put("qnv", nrw.R(oxo.aA, oxm.c));
        }
        if (oyr != null && oyr.g()) {
            linkedHashMap.put("c0", nrw.V(oxo.o, oxm.b));
            linkedHashMap.put("c1", nrw.V(oxo.p, oxm.b));
            linkedHashMap.put("c2", nrw.V(oxo.q, oxm.b));
            linkedHashMap.put("c3", nrw.V(oxo.r, oxm.b));
            linkedHashMap.put("a0", nrw.V(oxo.h, oxm.c));
            linkedHashMap.put("a1", nrw.V(oxo.i, oxm.c));
            linkedHashMap.put("a2", nrw.V(oxo.j, oxm.c));
            linkedHashMap.put("a3", nrw.V(oxo.k, oxm.c));
            linkedHashMap.put("ss0", nrw.V(oxo.t, oxm.b));
            linkedHashMap.put("ss1", nrw.V(oxo.u, oxm.b));
            linkedHashMap.put("ss2", nrw.V(oxo.v, oxm.b));
            linkedHashMap.put("ss3", nrw.V(oxo.w, oxm.b));
            linkedHashMap.put("p0", nrw.S(oxo.R));
            linkedHashMap.put("p1", nrw.S(oxo.S));
            linkedHashMap.put("p2", nrw.S(oxo.T));
            linkedHashMap.put("p3", nrw.S(oxo.U));
            linkedHashMap.put("cp0", nrw.S(oxo.W));
            linkedHashMap.put("cp1", nrw.S(oxo.X));
            linkedHashMap.put("cp2", nrw.S(oxo.Y));
            linkedHashMap.put("cp3", nrw.S(oxo.Z));
            final afdu u = afdu.u((Object)0, (Object)2, (Object)4);
            linkedHashMap.put("mtos1", nrw.U(oxo.A, (Set)u, false));
            linkedHashMap.put("mtos2", nrw.U(oxo.B, (Set)u, false));
            linkedHashMap.put("mtos3", nrw.U(oxo.C, (Set)u, false));
        }
        linkedHashMap.put("psm", nrw.O(oxo.aC));
        linkedHashMap.put("psv", nrw.O(oxo.aD));
        linkedHashMap.put("psfv", nrw.O(oxo.aE));
        linkedHashMap.put("psa", nrw.O(oxo.aF));
        return linkedHashMap;
    }
    
    public abstract void b(final oxw p0, final oyp p1);
    
    public abstract void c(final oyp p0);
    
    public final oxn d(final oyr oyr, final oyp oyp) {
        final boolean b = oyr != null && oyr.d() && !this.b.contains(oyr) && this.c.b(oyr).contains("VIEWABILITY");
        final Map c = ((oxr)oyp).c();
        c.put(oxo.d, 4);
        c.put(oxo.e, oyp.p);
        c.put(oxo.O, oyp.q);
        c.put(oxo.P, oyp.r);
        c.put(oxo.am, oyp.u - 1);
        c.put(oxo.an, oyp.i);
        c.put(oxo.L, oyp.n);
        c.put(oxo.ao, oyp.k);
        c.put(oxo.ap, oyp.j);
        c.put(oxo.f, ((oyt)oyp.f).g);
        c.put(oxo.g, ((oyt)oyp.f).h);
        c.put(oxo.D, ((oyt)oyp.f).t.l(1, true));
        c.put(oxo.E, ((oyt)oyp.f).t.l(2, false));
        c.put(oxo.G, ((oyt)oyp.f).k.b(1));
        c.put(oxo.I, ((oyt)oyp.f).h());
        c.put(oxo.aB, ((oyt)oyp.f).h());
        c.put(oxo.J, ((oyt)oyp.f).f());
        c.put(oxo.M, ((oyt)oyp.f).i);
        c.put(oxo.ak, ((oyt)oyp.f).i());
        c.put(oxo.aq, ((oyt)oyp.f).u.k());
        if (oyp.o.size() > 0) {
            final oyo oyo = oyp.o.get(0);
            c.put(oxo.ar, oyo.d);
            c.put(oxo.o, new Double[] { oyo.a });
            c.put(oxo.h, new Double[] { oyo.b });
            c.put(oxo.t, new Double[] { oyo.c });
            c.put(oxo.R, oyo.f());
            final Integer[] e = oyo.e();
            if (e != null && !Arrays.equals(e, oyo.f())) {
                c.put(oxo.W, e);
            }
        }
        if (oyp.o.size() >= 2) {
            final oyo oyo2 = oyp.o.get(1);
            c.put(oxo.as, oyo2.d);
            c.put(oxo.p, oyo2.b());
            c.put(oxo.i, oyo2.d());
            c.put(oxo.u, oyo2.c());
            c.put(oxo.S, oyo2.f());
            c.put(oxo.A, oyo2.e);
            final Integer[] e2 = oyo2.e();
            if (e2 != null && !Arrays.equals(e2, oyo2.f())) {
                c.put(oxo.X, e2);
            }
        }
        if (oyp.o.size() >= 3) {
            final oyo oyo3 = oyp.o.get(2);
            c.put(oxo.at, oyo3.d);
            c.put(oxo.q, oyo3.b());
            c.put(oxo.j, oyo3.d());
            c.put(oxo.v, oyo3.c());
            c.put(oxo.T, oyo3.f());
            c.put(oxo.B, oyo3.e);
            final Integer[] e3 = oyo3.e();
            if (e3 != null && !Arrays.equals(e3, oyo3.f())) {
                c.put(oxo.Y, e3);
            }
        }
        if (oyp.o.size() >= 4) {
            final oyo oyo4 = oyp.o.get(3);
            c.put(oxo.au, oyo4.d);
            c.put(oxo.r, oyo4.b());
            c.put(oxo.k, oyo4.d());
            c.put(oxo.w, oyo4.c());
            c.put(oxo.U, oyo4.f());
            c.put(oxo.C, oyo4.e);
            final Integer[] e4 = oyo4.e();
            if (e4 != null && !Arrays.equals(e4, oyo4.f())) {
                c.put(oxo.Z, e4);
            }
        }
        final oxo aw = oxo.aw;
        final Iterator iterator = ((EnumMap)((oyt)oyp.f).u.a).keySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n |= ((oxx)iterator.next()).r;
        }
        c.put(aw, n);
        if (b) {
            if (((oyb)oyp.f).c()) {
                c.put(oxo.ad, (int)((oyt)oyp.f).l.a());
                c.put(oxo.ae, ((oyt)oyp.f).o++);
                c.put(oxo.F, (int)((oyt)oyp.f).n.a());
            }
            c.put(oxo.af, (int)((oyt)oyp.f).e.g(oya.c.f));
            c.put(oxo.ag, (int)((oyt)oyp.f).e.g(oya.a.f));
            c.put(oxo.ah, (int)((oyt)oyp.f).t.g(oya.c.f));
            c.put(oxo.ai, (int)((oyt)oyp.f).t.g(oya.a.f));
            final oxo av = oxo.av;
            final Iterator iterator2 = ((EnumMap)((oyt)oyp.f).u.a).entrySet().iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final Map.Entry<K, Boolean> entry = (Map.Entry<K, Boolean>)iterator2.next();
                if (!entry.getValue()) {
                    n2 |= ((oxx)entry.getKey()).q;
                    entry.setValue(true);
                }
            }
            c.put(av, n2);
            ((oyt)oyp.f).t.k();
            ((oyt)oyp.f).e.k();
            c.put(oxo.H, (int)((oyt)oyp.f).k.a());
            c.put(oxo.K, (int)((oyt)oyp.f).j.a());
            final oxo n3 = oxo.N;
            final oyt oyt = (oyt)oyp.f;
            final int m = oyt.m;
            oyt.m = 0;
            c.put(n3, m);
        }
        c.put(oxo.ax, ((oyb)oyp.j()).d());
        c.put(oxo.ay, ((oyb)oyp.j()).a);
        c.put(oxo.az, oyp.j().h);
        c.put(oxo.aB, oyp.j().h());
        c.put(oxo.aA, oyp.j().g);
        c.put(oxo.aC, ((oyt)oyp.f).q.b);
        c.put(oxo.aD, ((oyt)oyp.f).q.a);
        c.put(oxo.aE, ((oyt)oyp.f).r.a);
        c.put(oxo.aF, ((oyt)oyp.f).s.a);
        final oxo ai = oxo.aI;
        final int w = oyp.w;
        if (w == 0) {
            throw null;
        }
        c.put(ai, w - 1);
        final oxo ah = oxo.aH;
        final int v = oyp.v;
        if (v != 0) {
            c.put(ah, v - 1);
            if (oyr == oyr.p) {
                c.put(oxo.aj, "csm");
            }
            return nrw.ab(nrw.aa(c, this.a(oyr), (String)null, (String)null), nrw.aa(c, oyd.d, "h", "kArwaWEsTs"), nrw.aa(c, oyd.a, (String)null, (String)null), nrw.aa(c, oyd.e, "h", "b96YPMzfnx"), nrw.aa(c, oyd.f, "h", "yb8Wev6QDg"));
        }
        throw null;
    }
}
