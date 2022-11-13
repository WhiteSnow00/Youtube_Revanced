import com.facebook.yoga.YogaNodeJNIBase;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dty implements Cloneable, dva
{
    private dxe A;
    private ArrayList B;
    private Map C;
    private ArrayList D;
    private String E;
    private Set F;
    private List G;
    private boolean H;
    private int I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private long P;
    private psb Q;
    public dsx a;
    public List b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public dtw i;
    public dtz j;
    private ehb k;
    private List l;
    private final int[] m;
    private final float[] n;
    private dun o;
    private dun p;
    private dun q;
    private dun r;
    private dun s;
    private dun t;
    private dun u;
    private Drawable v;
    private boolean[] w;
    private dui x;
    private String y;
    private String z;
    
    public dty(final dsx a) {
        final dwg a2 = dwh.a;
        final ehc k = new ehc(dwh.c);
        this.b = new ArrayList(1);
        this.m = new int[4];
        this.n = new float[4];
        this.I = -1;
        this.d = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.e = -1;
        this.f = -1;
        this.g = -1.0f;
        this.h = -1.0f;
        this.a = a;
        ((YogaNodeJNIBase)k).b = this;
        this.k = (ehb)k;
        this.F = new HashSet();
        final boolean a3 = dyp.a;
        this.l = null;
    }
    
    private final dui ce() {
        final psb ca = this.ca();
        if (ca.b == null) {
            ca.b = new dui();
        }
        return (dui)ca.b;
    }
    
    private static dun cf(final dun dun, final dun dun2) {
        if (dun == null) {
            return dun2;
        }
        if (dun2 == null) {
            return dun;
        }
        return (dun)new dua(dun, dun2);
    }
    
    private final void cg(final dva dva) {
        if (dyp.a && dva != null) {
            dtp.l(this.a, dva);
            for (int r = dva.R(), i = 0; i < r; ++i) {
                this.cg(dva.al(i));
            }
            if (dva.aT()) {
                this.cg(dva.am());
            }
        }
    }
    
    private final boolean ch() {
        if (this.x != null) {
            final dtz j = this.j;
            if (j != null && j.v()) {
                return true;
            }
        }
        return false;
    }
    
    private final float ci(final dui dui, final int n) {
        final egx f = this.k.f();
        final egx c = egx.c;
        final int n2 = n - 1;
        int n3 = 6;
        Label_0074: {
            if (n2 != 0) {
                if (n2 != 2) {
                    throw new IllegalArgumentException("Not an horizontal padding edge: ".concat(egy.a(n)));
                }
                if (f != c) {
                    break Label_0074;
                }
            }
            else if (f == c) {
                break Label_0074;
            }
            n3 = 5;
        }
        final float d = dui.d(n3);
        if (epf.N(d)) {
            return dui.c(n);
        }
        return d;
    }
    
    private final void cj(final int n, final boolean b) {
        if (this.w == null && b) {
            this.w = new boolean[9];
        }
        final boolean[] w = this.w;
        if (w != null) {
            w[n - 1] = b;
        }
    }
    
    private static dva ck(final pa pa, final dsx dsx, final dty dty, final dst dst, final String s, final Set set) {
        final dsx p6 = dst.p;
        final List b = dty.b;
        final List l = dty.l;
        final dst aa = ((dva)dty).aa();
        if (p6 != null && aa != null) {
            if (!((dva)dty).bc()) {
                for (int size = b.size(), i = 0; i < size; ++i) {
                    final dst dst2 = b.get(i);
                    if (l != null) {
                        final String s2 = l.get(i);
                    }
                    if (set.contains(coy.l(dst2))) {
                        return dvc.c(dsx, dst, false, true, s);
                    }
                }
                ((dva)dty).bT();
                final String j = coy.l(aa);
                final Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    if (((String)iterator.next()).startsWith(j)) {
                        return cl(pa, dty, dst, s, set, 1);
                    }
                }
                final boolean a = dyp.a;
                return cl(pa, dty, dst, s, set, 0);
            }
        }
        return dvc.c(dsx, dst, false, true, s);
    }
    
    private static dva cl(final pa pa, final dty dty, final dst dst, final String s, final Set set, final int n) {
        final ehb k = dty.k;
        final ehb h = k.h();
        final dty ad = dty.ad();
        ad.b = new ArrayList();
        if (ad.l != null) {
            ad.l = new ArrayList();
        }
        ad.i = null;
        ad.F = null;
        ad.J = Float.NaN;
        ad.K = Float.NaN;
        ad.L = Float.NaN;
        ad.M = Float.NaN;
        ad.N = Float.NaN;
        ad.O = Float.NaN;
        int i = dty.b.size();
        final ArrayList list = new ArrayList(i);
        List list2;
        if (dty.l == null) {
            list2 = null;
        }
        else {
            list2 = new ArrayList(i);
        }
        list.add((Object)dst);
        if (list2 != null) {
            list2.add(s);
        }
        dsx dsx = dst.p;
        for (i -= 2; i >= 0; --i) {
            final dst dst2 = dty.b.get(i);
            final List l = dty.l;
            if (l != null) {
                final String s2 = l.get(i);
            }
            final String j = coy.l(dst2);
            final dst g = dty.b.get(i).G(dsx);
            list.add((Object)g);
            if (dty.l != null) {
                list2.add(j);
            }
            dsx = g.p;
        }
        Collections.reverse(list);
        if (list2 != null) {
            Collections.reverse(list2);
        }
        final akq akq = new akq((Object)list, (Object)list2);
        final dsx p6 = dst.p;
        final List b = (List)akq.a;
        final List m = (List)akq.b;
        ad.a = p6;
        (ad.k = h).t((Object)ad);
        ad.b = b;
        ad.l = m;
        ad.i = null;
        ad.C = null;
        for (int size = b.size(), n2 = 0; n2 < size; ++n2) {
            final dst dst3 = b.get(n2);
            if (m != null) {
                final String s3 = m.get(n2);
            }
            coy.l(dst3);
        }
        final ArrayList d = ad.D;
        ad.D = null;
        if (d != null && !d.isEmpty()) {
            ad.D = new ArrayList(d.size());
            for (int size2 = d.size(), n3 = 0; n3 < size2; ++n3) {
                final hyx hyx = (hyx)d.get(n3);
                final Object a = hyx.a;
                final dst g2 = ((dst)hyx.c).G(p6);
                final ArrayList d2 = ad.D;
                final Object d3 = hyx.d;
                d2.add(new hyx((ovz)hyx.b, g2, (String)a));
            }
        }
        final dst ab = ad.ab();
        ad.at();
        final dsx p7 = ab.p;
        if (ad.am() != null) {
            ad.ca().e = null;
        }
        for (int e = k.e(), n4 = 0; n4 < e; ++n4) {
            final dty dty2 = (dty)k.i(n4).m();
            final List b2 = dty2.b;
            final List l2 = dty2.l;
            final int max = Math.max(0, b2.size() - 1);
            final dst dst4 = b2.get(max);
            String s4;
            if (l2 == null) {
                s4 = null;
            }
            else {
                s4 = l2.get(max);
            }
            final dst g3 = dst4.G(p7);
            dva dva;
            if (n == 0) {
                dva = cl(pa, dty2, g3, s4, set, 0);
            }
            else {
                dva = ck(pa, p7, dty2, g3, s4, set);
            }
            ad.bq(dva);
        }
        return (dva)ad;
    }
    
    public final void A(final int n, final int n2) {
        this.P |= 0x400L;
        final psb q = this.Q;
        if (q != null && q.a) {
            this.ce().e(n, (float)n2);
            this.cj(n, false);
            return;
        }
        this.k.W(n, (float)n2);
    }
    
    public final void B(final int n, final float n2) {
        this.P |= 0x800L;
        this.k.Z(n, n2);
    }
    
    public final void C(final int n, final int n2) {
        this.P |= 0x800L;
        this.k.Y(n, (float)n2);
    }
    
    public final int D() {
        return bku.r(this.k.S(4));
    }
    
    public final int E() {
        return bku.r(this.k.S(1));
    }
    
    public final int F() {
        return bku.r(this.k.S(3));
    }
    
    public final int G() {
        return bku.r(this.k.S(2));
    }
    
    public final int H() {
        if (epf.N(this.N)) {
            this.N = this.k.b();
        }
        return (int)this.N;
    }
    
    public final int I() {
        if (epf.N(this.L)) {
            this.L = this.k.c();
        }
        return (int)this.L;
    }
    
    public final int J() {
        if (epf.N(this.M)) {
            this.M = this.k.d();
        }
        return (int)this.M;
    }
    
    public final Drawable K() {
        return this.v;
    }
    
    public final egx L() {
        return this.k.f();
    }
    
    public final boolean M() {
        return (this.P & 0x400L) != 0x0L;
    }
    
    public final float N() {
        return this.h;
    }
    
    public final float O() {
        return this.g;
    }
    
    public final float P() {
        return this.k.k().a;
    }
    
    public final float Q() {
        return this.k.l().a;
    }
    
    public final int R() {
        return this.k.e();
    }
    
    public final int S() {
        return this.d;
    }
    
    public final int T() {
        return this.f;
    }
    
    public final int U() {
        return this.e;
    }
    
    public final int V() {
        return this.I;
    }
    
    public final int W() {
        if (!this.ch()) {
            return 0;
        }
        return bku.r(this.x.c(4));
    }
    
    public final int X() {
        if (!this.ch()) {
            return 0;
        }
        if (epf.N(this.J)) {
            this.J = this.ci(this.x, 1);
        }
        return bku.r(this.J);
    }
    
    public final int Y() {
        if (!this.ch()) {
            return 0;
        }
        if (epf.N(this.K)) {
            this.K = this.ci(this.x, 3);
        }
        return bku.r(this.K);
    }
    
    public final int Z() {
        if (!this.ch()) {
            return 0;
        }
        return bku.r(this.x.c(2));
    }
    
    public final int a() {
        if (epf.N(this.O)) {
            this.O = this.k.a();
        }
        return (int)this.O;
    }
    
    public final List aA() {
        return this.l;
    }
    
    public final List aB() {
        return this.b;
    }
    
    public final List aC() {
        return this.G;
    }
    
    public final void aD(final dxg dxg) {
        if (this.B == null) {
            this.B = new ArrayList(1);
        }
        this.B.add(dxg);
    }
    
    public final void aE(final List list) {
        if (this.D == null) {
            this.D = new ArrayList(list.size());
        }
        this.D.addAll(list);
    }
    
    public final void aF(final dst dst, final String s) {
        this.b.add(dst);
        final List l = this.l;
        if (l != null) {
            l.add(s);
        }
    }
    
    public final void aG(final dst dst) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(dst);
    }
    
    public final void aH() {
        final long p = this.P;
        List i = null;
        if ((p & 0x2L) != 0x0L) {
            i = com.i((List)null, (Object)"alignSelf");
        }
        List j = i;
        if ((this.P & 0x4L) != 0x0L) {
            j = com.i(i, (Object)"positionType");
        }
        List k = j;
        if ((this.P & 0x8L) != 0x0L) {
            k = com.i(j, (Object)"flex");
        }
        List l = k;
        if ((this.P & 0x10L) != 0x0L) {
            l = com.i(k, (Object)"flexGrow");
        }
        List m = l;
        if ((this.P & 0x200L) != 0x0L) {
            m = com.i(l, (Object)"margin");
        }
        if (m != null) {
            final String value = String.valueOf(TextUtils.join((CharSequence)", ", (Iterable)m));
            final String simpleName = this.ab().getClass().getSimpleName();
            final StringBuilder sb = new StringBuilder("You should not set ");
            sb.append(value);
            sb.append(" to a root layout in ");
            sb.append(simpleName);
            coz.d(1, "DefaultInternalNode:ContextSpecificStyleSet", sb.toString());
        }
    }
    
    public final void aI(final dui dui, final int[] array, final float[] array2) {
        this.P |= 0x10000000L;
        this.k.T(1, dui.d(1));
        this.k.T(2, dui.d(2));
        this.k.T(3, dui.d(3));
        this.k.T(4, dui.d(4));
        this.k.T(8, dui.d(8));
        this.k.T(7, dui.d(7));
        this.k.T(5, dui.d(5));
        this.k.T(6, dui.d(6));
        this.k.T(9, dui.d(9));
        System.arraycopy(array, 0, this.m, 0, 4);
        System.arraycopy(array2, 0, this.n, 0, 4);
    }
    
    public final void aJ(final float n, final float n2) {
        this.cg((dva)this);
        this.k.o(n, n2);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((dtd)iterator.next()).at();
        }
    }
    
    public final void aK(final dtp dtp) {
        if (this.F == null) {
            this.F = new HashSet();
        }
        this.F.add(dtp);
    }
    
    public final void aL(final int f) {
        this.f = f;
    }
    
    public final void aM(final float h) {
        this.h = h;
    }
    
    public final void aN(final float g) {
        this.g = g;
    }
    
    public final void aO(final int e) {
        this.e = e;
    }
    
    public final void aP(final dva e) {
        if (e != dsx.a) {
            e.ca().d = this;
        }
        this.ca().e = e;
    }
    
    public final void aQ(final int n) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            this.k.B((float)View$MeasureSpec.getSize(n));
            return;
        }
        if (mode == 0) {
            this.k.z(Float.NaN);
            return;
        }
        if (mode != 1073741824) {
            return;
        }
        this.k.z((float)View$MeasureSpec.getSize(n));
    }
    
    public final void aR(final int n) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            this.k.D((float)View$MeasureSpec.getSize(n));
            return;
        }
        if (mode == 0) {
            this.k.J(Float.NaN);
            return;
        }
        if (mode != 1073741824) {
            return;
        }
        this.k.J((float)View$MeasureSpec.getSize(n));
    }
    
    public final boolean aS() {
        return this.c;
    }
    
    public final boolean aT() {
        final psb q = this.Q;
        return q != null && q.e != null;
    }
    
    public final boolean aU() {
        return (this.P & 0x40000000L) != 0x0L;
    }
    
    public final boolean aV() {
        return (this.P & 0x2000000L) != 0x0L;
    }
    
    public final boolean aW() {
        return !TextUtils.isEmpty((CharSequence)this.y);
    }
    
    public final boolean aX() {
        return this.o != null || this.p != null || this.q != null || this.r != null || this.s != null || this.t != null || this.u != null;
    }
    
    public final boolean aY() {
        return this.H;
    }
    
    public final boolean aZ() {
        return (this.P & 0x80L) == 0x0L || this.d == 0;
    }
    
    public final dst aa() {
        if (this.b.isEmpty()) {
            return null;
        }
        final List b = this.b;
        return (dst)b.get(b.size() - 1);
    }
    
    public final dst ab() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(0);
    }
    
    public final dsx ac() {
        return this.a;
    }
    
    protected final dty ad() {
        try {
            return (dty)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final dun ae() {
        return this.q;
    }
    
    public final dun af() {
        return this.s;
    }
    
    public final dun ag() {
        return this.t;
    }
    
    public final dun ah() {
        return this.p;
    }
    
    public final dun ai() {
        return this.r;
    }
    
    public final dun aj() {
        return this.u;
    }
    
    public final dun ak() {
        return this.o;
    }
    
    public final dva al(final int n) {
        return (dva)this.k.i(n).m();
    }
    
    public final dva am() {
        final psb q = this.Q;
        if (q != null) {
            return (dva)q.e;
        }
        return null;
    }
    
    public final dva an() {
        final psb q = this.Q;
        if (q != null) {
            return (dva)q.d;
        }
        return null;
    }
    
    public final dva ao() {
        final ehb k = this.k;
        if (k != null && k.j() != null) {
            return (dva)k.j().m();
        }
        return null;
    }
    
    public final dxe ap() {
        return this.A;
    }
    
    public final egx aq() {
        return this.k.g();
    }
    
    public final egx ar() {
        ehb ehb;
        for (ehb = this.k; ehb != null && ehb.f() == egx.a; ehb = ehb.j()) {}
        egx egx;
        if (ehb == null) {
            egx = egx.a;
        }
        else {
            egx = ehb.f();
        }
        return egx;
    }
    
    public final ehb as() {
        return this.k;
    }
    
    public final String at() {
        final List l = this.l;
        if (l != null && !l.isEmpty()) {
            return this.l.get(0);
        }
        return null;
    }
    
    public final String au() {
        return this.E;
    }
    
    public final String av() {
        final dst ab = this.ab();
        if (ab != null) {
            this.at();
            return coy.l(ab);
        }
        return null;
    }
    
    public final String aw() {
        return this.y;
    }
    
    public final String ax() {
        return this.z;
    }
    
    public final ArrayList ay() {
        return this.B;
    }
    
    public final ArrayList az() {
        return this.D;
    }
    
    public final void b(final egv egv) {
        this.P |= 0x2L;
        this.k.r(egv);
    }
    
    public final void bA(final int n) {
        if (n != -1) {
            this.I = 0;
        }
    }
    
    public final void bB(final dun dun) {
        this.P |= Long.MIN_VALUE;
        this.p = cf(this.p, dun);
    }
    
    public final void bC() {
        this.c = true;
    }
    
    public final void bD() {
        this.P |= 0x20000000L;
        this.bM();
    }
    
    public final void bE() {
        this.P |= 0x40000000L;
        this.bM();
    }
    
    public final void bF(final String e) {
        this.E = e;
    }
    
    public final void bG(final String y, final String z) {
        if (!TextUtils.isEmpty((CharSequence)y)) {
            this.P |= 0x8000000L;
            this.y = y;
            this.z = z;
        }
    }
    
    public final void bH(final dxe a) {
        this.P |= 0x100000000L;
        this.A = a;
    }
    
    public final void bI(final dun dun) {
        this.P |= 0x1000000L;
        this.r = cf(this.r, dun);
    }
    
    public final void bJ(final dun dun) {
        this.P |= 0x80000000L;
        this.u = cf(this.u, dun);
    }
    
    public final void bK(final dun dun) {
        this.P |= 0x100000L;
        this.o = cf(this.o, dun);
    }
    
    public final void bL(final int n) {
        this.k.N(n);
    }
    
    public final void bM() {
        this.H = true;
    }
    
    public final void bN() {
        this.P |= 0x100L;
    }
    
    public final void bO(final int n) {
        this.k.O(n);
    }
    
    public final void bP() {
        this.P |= 0x80000L;
    }
    
    public final void bQ() {
    }
    
    public final void bR() {
    }
    
    public final void bS() {
    }
    
    public final void bT() {
        final List l = this.l;
        if (l != null) {
            if (!l.isEmpty()) {
                final List i = this.l;
                final String s = i.get(i.size() - 1);
            }
        }
    }
    
    public final void bU() {
    }
    
    public final void bV() {
    }
    
    public final void bW() {
    }
    
    public final void bX() {
    }
    
    public final int bY(final int n) {
        return bku.r(this.k.Q(n));
    }
    
    public final void bZ(final int n, final int n2) {
        if (this.x == null) {
            this.x = new dui();
        }
        this.P |= 0x2000000L;
        this.x.e(n, (float)n2);
    }
    
    public final boolean ba() {
        return this.k != null && this.a != null;
    }
    
    public final boolean bb() {
        return (this.P & 0x1L) == 0x0L || this.L() == egx.a;
    }
    
    public final boolean bc() {
        final psb q = this.Q;
        return q != null && q.a;
    }
    
    public final boolean bd() {
        final int[] m = this.m;
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= 4) {
                break;
            }
            if (m[n] != 0) {
                if (this.k.Q(1) != 0.0f || this.k.Q(2) != 0.0f || this.k.Q(3) != 0.0f) {
                    b2 = true;
                    break;
                }
                if (this.k.Q(4) == 0.0f) {
                    b2 = b;
                    break;
                }
                return true;
            }
            else {
                ++n;
            }
        }
        return b2;
    }
    
    public final float[] be() {
        return this.n;
    }
    
    public final int[] bf() {
        return this.m;
    }
    
    public final dtw bg() {
        return this.i;
    }
    
    public final dtz bh() {
        return this.j;
    }
    
    public final dtz bi() {
        if (this.j == null) {
            this.j = new dtz();
        }
        return this.j;
    }
    
    public final void bj(final dtw i) {
        this.i = i;
    }
    
    public final void bk(final dtz j) {
        this.j = j;
    }
    
    public final void bl(final egv egv) {
        this.k.p(egv);
    }
    
    public final void bm(final egv egv) {
        this.k.q(egv);
    }
    
    public final void bn(final Drawable v) {
        this.P |= 0x40000L;
        this.v = v;
        if (v != null) {
            final Rect rect = new Rect();
            v.getPadding(rect);
            if (rect.bottom != 0 || rect.top != 0 || rect.left != 0 || rect.right != 0) {
                this.A(1, rect.left);
                this.A(2, rect.top);
                this.A(3, rect.right);
                this.A(4, rect.bottom);
            }
        }
    }
    
    public final void bo(final dsk dsk) {
        this.P |= 0x10000000L;
        final int[] b = dsk.b;
        int n = 0;
        while (true) {
            int n2 = 4;
            if (n >= 4) {
                break;
            }
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        n2 = 3;
                    }
                }
                else {
                    n2 = 2;
                }
            }
            else {
                n2 = 1;
            }
            final int n3 = dsk.b[n];
            final psb q = this.Q;
            if (q != null && q.a) {
                final psb ca = this.ca();
                if (ca.f == null) {
                    ca.f = new dui();
                }
                ((dui)ca.f).e(n2, (float)n3);
            }
            else {
                this.k.T(n2, (float)n3);
            }
            ++n;
        }
        System.arraycopy(dsk.c, 0, this.m, 0, 4);
        System.arraycopy(dsk.a, 0, this.n, 0, 4);
        final PathEffect d = dsk.d;
    }
    
    public final void bp(final dst dst) {
        if (dst != null) {
            this.bq(dvc.a(this.a, dst));
        }
    }
    
    public final void bq(final dva dva) {
        if (dva != null && dva != dsx.a) {
            this.k.n(dva.as(), this.k.e());
        }
    }
    
    public final void br() {
        this.P |= 0x200000000L;
    }
    
    public final void bs(final dun dun) {
        this.P |= 0x200000L;
        this.q = cf(this.q, dun);
    }
    
    public final void bt(final dun dun) {
        this.P |= 0x400000L;
        this.s = cf(this.s, dun);
    }
    
    public final void bu() {
    }
    
    public final void bv() {
    }
    
    public final void bw(final int d) {
        this.P |= 0x80L;
        this.d = d;
    }
    
    public final void bx(final dun dun) {
        this.P |= 0x800000L;
        this.t = cf(this.t, dun);
    }
    
    public final void by() {
    }
    
    public final void bz(final int n) {
        this.k.L(n);
    }
    
    public final void c(final float n) {
        this.P |= 0x4000000L;
        this.k.s(n);
    }
    
    public final psb ca() {
        if (this.Q == null) {
            this.Q = new psb();
        }
        return this.Q;
    }
    
    public final dva cb(final pa pa, final dsx dsx, final dst dst, final String s) {
        final dws c = dsx.c;
        Set<Object> set;
        if (c == null) {
            set = Collections.emptySet();
        }
        else {
            set = c.g();
        }
        return ck(pa, dsx, this, dst, s, set);
    }
    
    public final void cc(final bkv bkv) {
        this.k.aa(bkv);
    }
    
    public final cya cd() {
        final psb q = this.Q;
        if (q != null) {
            return (cya)q.c;
        }
        return null;
    }
    
    @Override
    protected final /* bridge */ Object clone() {
        return this.ad();
    }
    
    public final /* bridge */ void d(final Object o) {
        if (o != dsx.a) {
            final dtz j = this.j;
            if (j != null) {
                if (((dva)o).bh() == null) {
                    ((dva)o).bk(j);
                }
                else {
                    j.D(((dva)o).bi());
                }
            }
            if (((dva)o).bb()) {
                ((dva)o).k(this.L());
            }
            if (((dva)o).aZ()) {
                ((dva)o).bw(this.d);
            }
            if ((this.P & 0x100L) != 0x0L) {
                ((dva)o).bN();
            }
            if ((this.P & 0x200000000L) != 0x0L) {
                ((dva)o).br();
            }
            if ((this.P & 0x40000L) != 0x0L) {
                ((dva)o).bn(this.v);
            }
            if ((this.P & 0x80000L) != 0x0L) {
                ((dva)o).bP();
            }
            if (this.H) {
                ((dva)o).bM();
            }
            if ((this.P & 0x100000L) != 0x0L) {
                ((dva)o).bK(this.o);
            }
            if ((this.P & Long.MIN_VALUE) != 0x0L) {
                ((dva)o).bB(this.p);
            }
            if ((this.P & 0x200000L) != 0x0L) {
                ((dva)o).bs(this.q);
            }
            if ((this.P & 0x400000L) != 0x0L) {
                ((dva)o).bt(this.s);
            }
            if ((this.P & 0x800000L) != 0x0L) {
                ((dva)o).bx(this.t);
            }
            if ((this.P & 0x1000000L) != 0x0L) {
                ((dva)o).bI(this.r);
            }
            if ((this.P & 0x80000000L) != 0x0L) {
                ((dva)o).bJ(this.u);
            }
            final String e = this.E;
            if (e != null) {
                ((dva)o).bF(e);
            }
            if ((this.P & 0x400L) != 0x0L) {
                final psb q = this.Q;
                if (q == null || q.b == null) {
                    throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance");
                }
                for (int i = 0; i < dui.a; ++i) {
                    final float b = ((dui)this.Q.b).b(i);
                    if (!epf.N(b)) {
                        final int b2 = egy.b(i);
                        final boolean[] w = this.w;
                        if (w != null && w[b2 - 1]) {
                            ((dva)o).z(b2, b);
                        }
                        else {
                            ((dva)o).A(b2, (int)b);
                        }
                    }
                }
            }
            Label_0569: {
                if ((this.P & 0x10000000L) != 0x0L) {
                    final psb q2 = this.Q;
                    if (q2 != null) {
                        final Object f = q2.f;
                        if (f != null) {
                            ((dva)o).aI((dui)f, this.m, this.n);
                            break Label_0569;
                        }
                    }
                    throw new IllegalStateException("copyInto() must be used when resolving a nestedTree.If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance");
                }
            }
            if ((this.P & 0x8000000L) != 0x0L) {
                ((dva)o).bG(this.y, this.z);
            }
            if ((this.P & 0x100000000L) != 0x0L) {
                ((dva)o).bH(this.A);
            }
            if ((this.P & 0x20000000L) != 0x0L) {
                ((dva)o).bD();
            }
            if ((this.P & 0x40000000L) != 0x0L) {
                ((dva)o).bE();
            }
            if (this.I != -1) {
                ((dva)o).bA(0);
            }
        }
    }
    
    public final void e(final float n) {
        this.P |= 0x40L;
        this.k.w(n);
    }
    
    public final void f(final int n) {
        this.P |= 0x40L;
        this.k.v((float)n);
    }
    
    public final void g(final float n) {
        this.P |= 0x10L;
        this.k.x(n);
    }
    
    public final void h(final float n) {
        this.P |= 0x20L;
        this.k.y(n);
    }
    
    public final void i(final float n) {
        this.P |= 0x8000L;
        this.k.A(n);
    }
    
    public final void j(final int n) {
        this.P |= 0x8000L;
        this.k.z((float)n);
    }
    
    public final void k(final egx egx) {
        this.P |= 0x1L;
        this.k.u(egx);
    }
    
    public final void l(final float n) {
        this.P |= 0x20000L;
        this.k.C(n);
    }
    
    public final void m(final int n) {
        this.P |= 0x20000L;
        this.k.B((float)n);
    }
    
    public final void n(final float n) {
        this.P |= 0x4000L;
        this.k.E(n);
    }
    
    public final void o(final int n) {
        this.P |= 0x4000L;
        this.k.D((float)n);
    }
    
    public final void p(final float n) {
        this.P |= 0x10000L;
        this.k.G(n);
    }
    
    public final void q(final int n) {
        this.P |= 0x10000L;
        this.k.F((float)n);
    }
    
    public final void r(final float n) {
        this.P |= 0x2000L;
        this.k.I(n);
    }
    
    public final void s(final int n) {
        this.P |= 0x2000L;
        this.k.H((float)n);
    }
    
    public final void t(final float n) {
        this.P |= 0x1000L;
        this.k.K(n);
    }
    
    public final void u(final int n) {
        this.P |= 0x1000L;
        this.k.J((float)n);
    }
    
    public final void v(final int n) {
        this.P |= 0x4L;
        this.k.M(n);
    }
    
    public final void w() {
        this.P |= 0x8L;
        this.k.P();
    }
    
    public final void x(final int n, final float n2) {
        this.P |= 0x200L;
        this.k.V(n, n2);
    }
    
    public final void y(final int n, final int n2) {
        this.P |= 0x200L;
        this.k.U(n, (float)n2);
    }
    
    public final void z(final int n, final float n2) {
        this.P |= 0x400L;
        final psb q = this.Q;
        if (q != null && q.a) {
            this.ce().e(n, n2);
            this.cj(n, true);
            return;
        }
        this.k.X(n, n2);
    }
}
