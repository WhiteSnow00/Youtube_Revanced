import java.util.Iterator;
import java.util.HashSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acr
{
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final acq J;
    public final acq K;
    public final acq L;
    public final acq M;
    public final acq N;
    final acq O;
    final acq P;
    public final acq Q;
    public final acq[] R;
    protected final ArrayList S;
    public final boolean[] T;
    public acr U;
    int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    private boolean a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public float ae;
    public float af;
    public Object ag;
    public int ah;
    public String ai;
    public int aj;
    public int ak;
    public final float[] al;
    public final acr[] am;
    public final acr[] an;
    public int ao;
    public int ap;
    public final int[] aq;
    private boolean b;
    public boolean e;
    public ada f;
    public ada g;
    public adi h;
    public adk i;
    public final boolean[] j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    
    public acr() {
        this.e = false;
        this.h = null;
        this.i = null;
        this.j = new boolean[] { true, true };
        this.a = true;
        this.k = -1;
        this.l = -1;
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        final acq j = new acq(this, 2);
        this.J = j;
        final acq k = new acq(this, 3);
        this.K = k;
        final acq l = new acq(this, 4);
        this.L = l;
        final acq m = new acq(this, 5);
        this.M = m;
        final acq n = new acq(this, 6);
        this.N = n;
        final acq o = new acq(this, 8);
        this.O = o;
        final acq p = new acq(this, 9);
        this.P = p;
        final acq q = new acq(this, 7);
        this.Q = q;
        this.R = new acq[] { j, l, k, m, n, q };
        final ArrayList s = new ArrayList();
        this.S = s;
        this.T = new boolean[2];
        this.aq = new int[] { 1, 1 };
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        this.ah = 0;
        this.ai = null;
        this.aj = 0;
        this.ak = 0;
        this.al = new float[] { -1.0f, -1.0f };
        this.am = new acr[] { null, null };
        this.an = new acr[] { null, null };
        this.ao = -1;
        this.ap = -1;
        s.add(j);
        s.add(k);
        s.add(l);
        s.add(m);
        s.add(o);
        s.add(p);
        s.add(q);
        s.add(n);
    }
    
    private final boolean a(int n) {
        n += n;
        final acq[] r = this.R;
        final acq acq = r[n];
        final acq e = acq.e;
        if (e != null && e.e != acq) {
            final acq acq2 = r[n + 1];
            final acq e2 = acq2.e;
            if (e2 != null && e2.e == acq2) {
                return true;
            }
        }
        return false;
    }
    
    private final void c(final acj acj, final boolean b, boolean b2, final boolean b3, boolean b4, acm acm, final acm acm2, int n, final boolean b5, final acq acq, final acq acq2, int n2, int n3, final int n4, int n5, final float n6, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10, int n7, int n8, int n9, int n10, final float n11, final boolean b11) {
        final acm b12 = acj.b((Object)acq);
        final acm b13 = acj.b((Object)acq2);
        final acm b14 = acj.b((Object)acq.e);
        final acm b15 = acj.b((Object)acq2.e);
        final int h = acq.h() ? 1 : 0;
        final boolean h2 = acq2.h();
        final boolean h3 = this.Q.h();
        int n12;
        if (h2) {
            n12 = h + 1;
        }
        else {
            n12 = h;
        }
        int n13 = n12;
        if (h3) {
            n13 = n12 + 1;
        }
        if (b6) {
            n7 = 3;
        }
        final int n14 = n - 1;
        if (n == 0) {
            throw null;
        }
        boolean b16 = false;
        Label_0152: {
            if (n14 != 0 && n14 != 1) {
                if (n14 == 2) {
                    if (n7 != 4) {
                        b16 = true;
                        break Label_0152;
                    }
                }
            }
            b16 = false;
        }
        n = n7;
        final int k = this.k;
        int n15 = b16 ? 1 : 0;
        n7 = n3;
        if (k != -1) {
            n15 = (b16 ? 1 : 0);
            n7 = n3;
            if (b) {
                this.k = -1;
                n7 = k;
                n15 = 0;
            }
        }
        n3 = this.l;
        if (n3 != -1 && !b) {
            this.l = -1;
            n15 = 0;
        }
        else {
            n3 = n7;
        }
        final int ah = this.ah;
        if (ah == 8) {
            n7 = 0;
        }
        else {
            n7 = 1;
        }
        int n16 = n7 & n15;
        if (ah == 8) {
            n3 = 0;
        }
        if (b11) {
            if (h == 0 && !h2 && !h3) {
                acj.f(b12, n2);
            }
            else if (h != 0 && !h2) {
                acj.m(b12, b14, acq.b(), 8);
            }
        }
        Label_0846: {
            Label_0407: {
                if (n16 == 0) {
                    if (b5) {
                        acj.m(b13, b12, 0, 3);
                        if (n4 > 0) {
                            acj.g(b13, b12, n4, 8);
                        }
                        if (n5 < Integer.MAX_VALUE) {
                            acj.h(b13, b12, n5, 8);
                        }
                    }
                    else {
                        acj.m(b13, b12, n3, 8);
                    }
                    n2 = n;
                }
                else {
                    Label_0492: {
                        if (n13 != 2 && !b6) {
                            if ((n2 = n) != 1) {
                                if (n != 0) {
                                    break Label_0492;
                                }
                                n2 = 0;
                            }
                            n3 = (n = Math.max(n9, n3));
                            if (n10 > 0) {
                                n = Math.min(n10, n3);
                            }
                            acj.m(b13, b12, n, 8);
                            n16 = 0;
                            break Label_0407;
                        }
                    }
                    if ((n5 = n9) == -2) {
                        n5 = n3;
                    }
                    if ((n7 = n10) == -2) {
                        n7 = n3;
                    }
                    if ((n2 = n3) > 0) {
                        n2 = n3;
                        if (n != 1) {
                            n2 = 0;
                        }
                    }
                    n3 = n2;
                    if (n5 > 0) {
                        acj.g(b13, b12, n5, 8);
                        n3 = Math.max(n2, n5);
                    }
                    if (n7 > 0) {
                        if (b2 && n == 1) {
                            n2 = 1;
                        }
                        else {
                            acj.h(b13, b12, n7, 8);
                            n2 = n;
                        }
                        n3 = Math.min(n3, n7);
                    }
                    else {
                        n2 = n;
                    }
                    if (n == 1) {
                        if (b2) {
                            acj.m(b13, b12, n3, 8);
                        }
                        else if (b8) {
                            acj.m(b13, b12, n3, 5);
                            acj.h(b13, b12, n3, 8);
                        }
                        else {
                            acj.m(b13, b12, n3, 5);
                            acj.h(b13, b12, n3, 8);
                        }
                        n = n5;
                        break Label_0846;
                    }
                    if (n == 2) {
                        n = acq.i;
                        acm acm3;
                        acm acm4;
                        if (n != 3 && n != 5) {
                            acm3 = acj.b((Object)this.U.K(2));
                            acm4 = acj.b((Object)this.U.K(4));
                        }
                        else {
                            acm3 = acj.b((Object)this.U.K(3));
                            acm4 = acj.b((Object)this.U.K(5));
                        }
                        final aci a = acj.a();
                        a.g(b13, b12, acm4, acm3, n11);
                        acj.e(a);
                        n16 = ((b2 ^ true) ? 1 : 0);
                        n = n5;
                        break Label_0846;
                    }
                    b4 = true;
                    n = n5;
                    break Label_0846;
                }
            }
            n = n9;
            n7 = n10;
        }
        if (b11 && !b8) {
            boolean b17 = false;
            Label_2358: {
                if (h == 0 && !h2 && !h3) {
                    b17 = b2;
                    acm = b13;
                }
                else {
                    if (h != 0 && !h2) {
                        final acr d = acq.e.d;
                        if (b2 && d instanceof aco) {
                            n = 8;
                        }
                        else {
                            n = 5;
                        }
                        b17 = b2;
                        acm = b13;
                        break Label_2358;
                    }
                    if (h == 0 && h2) {
                        acj.m(b13, b15, -acq2.b(), 8);
                        if (b2) {
                            acj.g(b12, acm, 0, 5);
                        }
                        b17 = b2;
                        acm = b13;
                    }
                    else if (h != 0 && h2) {
                        final acr d2 = acq.e.d;
                        final acr d3 = acq2.e.d;
                        final acr u = this.U;
                        final int n17 = 6;
                        Label_1692: {
                            Label_1661: {
                                Label_1655: {
                                    Label_1652: {
                                        if (n16 != 0) {
                                            if (n2 == 0) {
                                                if (n7 == 0 && n == 0) {
                                                    if (b14.g && b15.g) {
                                                        acj.m(b12, b14, acq.b(), 8);
                                                        acj.m(b13, b15, -acq2.b(), 8);
                                                        return;
                                                    }
                                                    n5 = 8;
                                                    n8 = 8;
                                                    n = 0;
                                                    n3 = 1;
                                                    n10 = 0;
                                                    n7 = 0;
                                                }
                                                else {
                                                    n5 = 5;
                                                    n8 = 5;
                                                    n9 = 1;
                                                    n3 = 0;
                                                    n10 = 1;
                                                    n7 = n;
                                                    n = n9;
                                                }
                                                if (!(d2 instanceof aco) && !(d3 instanceof aco)) {
                                                    final int n18 = 6;
                                                    final int n19 = n5;
                                                    final int n20 = n3;
                                                    n9 = n;
                                                    n3 = n18;
                                                    n5 = n2;
                                                    n = n19;
                                                    n2 = n8;
                                                    n8 = n20;
                                                    break Label_1692;
                                                }
                                                final int n21 = 6;
                                                n9 = n5;
                                                n8 = n3;
                                                final int n22 = n;
                                                final int n23 = 4;
                                                n3 = n21;
                                                n5 = n2;
                                                n = n9;
                                                n2 = n23;
                                                n9 = n22;
                                                break Label_1692;
                                            }
                                            else if (n2 == 2) {
                                                if (!(d2 instanceof aco)) {
                                                    if (!(d3 instanceof aco)) {
                                                        n3 = 5;
                                                        n5 = 5;
                                                        break Label_1655;
                                                    }
                                                }
                                            }
                                            else {
                                                if (n2 == 1) {
                                                    n3 = 8;
                                                    break Label_1652;
                                                }
                                                if (n2 == 3) {
                                                    Label_1340: {
                                                        if (this.B == -1) {
                                                            if (b9) {
                                                                if (b2) {
                                                                    n2 = 5;
                                                                }
                                                                else {
                                                                    n2 = 4;
                                                                }
                                                            }
                                                            else {
                                                                n2 = 8;
                                                            }
                                                            n7 = 8;
                                                            n3 = n2;
                                                        }
                                                        else {
                                                            if (b6) {
                                                                if (n8 != 2 && n8 != 1) {
                                                                    n2 = 8;
                                                                    n3 = 5;
                                                                }
                                                                else {
                                                                    n2 = 5;
                                                                    n3 = 4;
                                                                }
                                                                n7 = n;
                                                                n8 = n3;
                                                                n5 = 3;
                                                                n9 = 1;
                                                                n10 = 1;
                                                                final int n24 = 1;
                                                                n = n2;
                                                                n3 = 6;
                                                                n2 = n8;
                                                                n8 = n24;
                                                                break Label_1692;
                                                            }
                                                            if (n7 > 0) {
                                                                n3 = 6;
                                                                n7 = 5;
                                                            }
                                                            else {
                                                                if (n7 == 0 && n == 0) {
                                                                    if (!b9) {
                                                                        n = 5;
                                                                        n2 = 8;
                                                                    }
                                                                    else {
                                                                        if (d2 != u && d3 != u) {
                                                                            n = 4;
                                                                        }
                                                                        else {
                                                                            n = 5;
                                                                        }
                                                                        n2 = 4;
                                                                    }
                                                                    n5 = 3;
                                                                    n3 = 6;
                                                                    n9 = 1;
                                                                    n10 = 1;
                                                                    n8 = 1;
                                                                    n7 = 0;
                                                                    break Label_1692;
                                                                }
                                                                n3 = 6;
                                                                n7 = 5;
                                                                n2 = 4;
                                                                break Label_1340;
                                                            }
                                                        }
                                                        n2 = 5;
                                                    }
                                                    final int n25 = n;
                                                    n5 = 3;
                                                    n9 = 1;
                                                    n10 = 1;
                                                    n8 = 1;
                                                    n = n7;
                                                    n7 = n25;
                                                    break Label_1692;
                                                }
                                                n3 = 5;
                                                n5 = 4;
                                                n9 = 0;
                                                n10 = 0;
                                                break Label_1661;
                                            }
                                        }
                                        else if (b14.g && b15.g) {
                                            acj.d(b12, b14, acq.b(), n6, b15, b13, acq2.b(), 8);
                                            if (b2 && b4) {
                                                if (acq2.e != null) {
                                                    n = acq2.b();
                                                }
                                                else {
                                                    n = 0;
                                                }
                                                if (b15 != acm2) {
                                                    acj.g(acm2, b13, n, 5);
                                                }
                                            }
                                            return;
                                        }
                                        n3 = 5;
                                    }
                                    n5 = 4;
                                }
                                n9 = 1;
                                n10 = 1;
                            }
                            final int n26 = n2;
                            final int n27 = 6;
                            n8 = 0;
                            n7 = n;
                            n2 = n5;
                            n = n3;
                            n5 = n26;
                            n3 = n27;
                        }
                        int n28;
                        if (n10 != 0 && b14 == b15 && d2 != u) {
                            n10 = 0;
                            n28 = 0;
                        }
                        else {
                            final int n29 = 1;
                            n28 = n10;
                            n10 = n29;
                        }
                        if (n9 != 0) {
                            boolean b18;
                            if (n16 == 0 && !b7 && !b9 && b14 == acm && b15 == acm2) {
                                b18 = false;
                                n3 = 8;
                                n10 = 8;
                                n = 0;
                            }
                            else {
                                n9 = n;
                                n = n10;
                                b18 = b2;
                                n10 = n3;
                                n3 = n9;
                            }
                            acj.d(b12, b14, acq.b(), n6, b15, b13, acq2.b(), n10);
                            n10 = n;
                            b2 = b18;
                            n = n3;
                        }
                        final acm acm5 = b15;
                        final acm acm6 = b12;
                        if (this.ah == 8 && !acq2.g()) {
                            return;
                        }
                        if (n28 != 0) {
                            n3 = n;
                            Label_1924: {
                                if (b2) {
                                    n3 = n;
                                    if (b14 != acm5) {
                                        n3 = n;
                                        if (n16 == 0) {
                                            if (!(d2 instanceof aco)) {
                                                n3 = n;
                                                if (!(d3 instanceof aco)) {
                                                    break Label_1924;
                                                }
                                            }
                                            n3 = 6;
                                        }
                                    }
                                }
                            }
                            acj.g(acm6, b14, acq.b(), n3);
                            acj.h(b13, acm5, -acq2.b(), n3);
                        }
                        else {
                            n3 = n;
                        }
                        if (b2 && b10 && !(d2 instanceof aco) && !(d3 instanceof aco) && d3 != u) {
                            n3 = 6;
                            n = 6;
                            n10 = 1;
                        }
                        else {
                            n = n2;
                        }
                        if (n10 != 0) {
                            Label_2138: {
                                if (n8 != 0) {
                                    if (b9) {
                                        n2 = n;
                                        if (!b3) {
                                            break Label_2138;
                                        }
                                    }
                                    n2 = n17;
                                    if (d2 != u) {
                                        if (d3 == u) {
                                            n2 = n17;
                                        }
                                        else {
                                            n2 = n;
                                        }
                                    }
                                    if (d2 instanceof acu || d3 instanceof acu) {
                                        n2 = 5;
                                    }
                                    if (d2 instanceof aco || d3 instanceof aco) {
                                        n2 = 5;
                                    }
                                    if (b9) {
                                        n2 = 5;
                                    }
                                    n2 = Math.max(n2, n);
                                }
                                else {
                                    n2 = n;
                                }
                            }
                            n = n2;
                            if (b2) {
                                n = Math.min(n3, n2);
                                if (b6 && !b9 && (d2 == u || d3 == u)) {
                                    n = 4;
                                }
                            }
                            acj.m(acm6, b14, acq.b(), n);
                            acj.m(b13, acm5, -acq2.b(), n);
                        }
                        if (b2) {
                            if (acm == b14) {
                                n = acq.b();
                            }
                            else {
                                n = 0;
                            }
                            if (b14 != acm) {
                                acj.g(acm6, acm, n, 5);
                            }
                        }
                        b17 = b2;
                        acm = b13;
                        if (b2) {
                            b17 = b2;
                            acm = b13;
                            if (n16 != 0) {
                                b17 = b2;
                                acm = b13;
                                if (n4 == 0) {
                                    b17 = b2;
                                    acm = b13;
                                    if (n7 == 0) {
                                        if (n5 == 3) {
                                            acj.g(b13, acm6, 0, 8);
                                            b17 = b2;
                                            acm = b13;
                                        }
                                        else {
                                            acj.g(b13, acm6, 0, 5);
                                            b17 = b2;
                                            acm = b13;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        acm = b13;
                        b17 = b2;
                    }
                }
                n = 5;
            }
            if (b17 && b4) {
                if (acq2.e != null) {
                    n2 = acq2.b();
                }
                else {
                    n2 = 0;
                }
                if (b15 != acm2) {
                    acj.g(acm2, acm, n2, n);
                }
            }
            return;
        }
        if (n13 < 2 && b2 && b4) {
            acj.g(b12, acm, 0, 8);
            if (!b && this.N.e != null) {
                n = 0;
            }
            else {
                n = 1;
            }
            Label_2529: {
                if (!b) {
                    final acq e = this.N.e;
                    if (e != null) {
                        final acr d4 = e.d;
                        if (d4.X == 0.0f) {
                            return;
                        }
                        final int[] aq = d4.aq;
                        if (aq[0] == 3 && aq[1] == 3) {
                            break Label_2529;
                        }
                        return;
                    }
                }
                if (n == 0) {
                    return;
                }
            }
            acj.g(acm2, b13, 0, 8);
        }
    }
    
    public final void A(final int ad) {
        if (ad < 0) {
            this.ad = 0;
            return;
        }
        this.ad = ad;
    }
    
    public final void B(final int ac) {
        if (ac < 0) {
            this.ac = 0;
            return;
        }
        this.ac = ac;
    }
    
    public final void C(final int v) {
        this.V = v;
        final int ac = this.ac;
        if (v < ac) {
            this.V = ac;
        }
    }
    
    public void D(final boolean b, final boolean b2) {
        final adi h = this.h;
        final boolean b3 = b & h.h;
        final adk i = this.i;
        final boolean b4 = b2 & i.h;
        int f = h.i.f;
        int f2 = i.i.f;
        int f3 = h.j.f;
        final int f4 = i.j.f;
        int n;
        if (f3 - f < 0 || f4 - f2 < 0 || f == Integer.MIN_VALUE || f == Integer.MAX_VALUE || f2 == Integer.MIN_VALUE || f2 == Integer.MAX_VALUE || f3 == Integer.MIN_VALUE || f3 == Integer.MAX_VALUE || f4 == Integer.MIN_VALUE || (n = f4) == Integer.MAX_VALUE) {
            f3 = 0;
            n = 0;
            f = 0;
            f2 = 0;
        }
        final int n2 = f3 - f;
        final int n3 = n - f2;
        if (b3) {
            this.Z = f;
        }
        if (b4) {
            this.aa = f2;
        }
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (b3) {
            int v = n2;
            if (this.aq[0] == 1) {
                v = this.V;
                if (n2 >= v) {
                    v = n2;
                }
            }
            this.V = v;
            final int ac = this.ac;
            if (v < ac) {
                this.V = ac;
            }
        }
        if (b4) {
            int w = n3;
            if (this.aq[1] == 1) {
                w = this.W;
                if (n3 >= w) {
                    w = n3;
                }
            }
            this.W = w;
            final int ad = this.ad;
            if (w < ad) {
                this.W = ad;
            }
        }
    }
    
    final boolean E() {
        return this instanceof acx || this instanceof acu;
    }
    
    public final boolean F(int n) {
        if (n == 0) {
            if (this.J.e != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (this.L.e != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            return n + n2 < 2;
        }
        if (this.K.e != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        if (this.M.e != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.N.e != null) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        return n + n3 + n4 < 2;
    }
    
    public final boolean G(final int n, final int n2) {
        if (n == 0) {
            final acq e = this.J.e;
            if (e != null && e.c) {
                final acq l = this.L;
                final acq e2 = l.e;
                if (e2 != null && e2.c) {
                    return e2.a() - l.b() - (this.J.e.a() + this.J.b()) >= n2;
                }
            }
        }
        else {
            final acq e3 = this.K.e;
            if (e3 != null && e3.c) {
                final acq m = this.M;
                final acq e4 = m.e;
                if (e4 != null && e4.c && e4.a() - m.b() - (this.K.e.a() + this.K.b()) >= n2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean H() {
        final acq j = this.J;
        final acq e = j.e;
        if (e == null || e.e != j) {
            final acq l = this.L;
            final acq e2 = l.e;
            if (e2 == null || e2.e != l) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean I() {
        final acq k = this.K;
        final acq e = k.e;
        if (e == null || e.e != k) {
            final acq m = this.M;
            final acq e2 = m.e;
            if (e2 == null || e2.e != m) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean J() {
        return this.a && this.ah != 8;
    }
    
    public acq K(int n) {
        if (--n == 1) {
            return this.J;
        }
        if (n == 2) {
            return this.K;
        }
        if (n == 3) {
            return this.L;
        }
        if (n == 4) {
            return this.M;
        }
        if (n != 5) {
            return this.Q;
        }
        return this.N;
    }
    
    public final int L(final int n) {
        if (n == 0) {
            return this.M();
        }
        return this.N();
    }
    
    public final int M() {
        return this.aq[0];
    }
    
    public final int N() {
        return this.aq[1];
    }
    
    public final void O(final int n, final acr acr, final int n2, final int n3, final int n4) {
        this.K(n).j(acr.K(n2), n3, n4);
    }
    
    public final void P(final int n) {
        this.aq[0] = n;
    }
    
    public final void Q(final int n) {
        this.aq[1] = n;
    }
    
    public void R(final boolean b) {
        final int o = acj.o((Object)this.J);
        final int o2 = acj.o((Object)this.K);
        final int o3 = acj.o((Object)this.L);
        final int o4 = acj.o((Object)this.M);
        int f = o;
        int f2 = o3;
        if (b) {
            final adi h = this.h;
            f = o;
            f2 = o3;
            if (h != null) {
                final add i = h.i;
                f = o;
                f2 = o3;
                if (i.i) {
                    final add j = h.j;
                    f = o;
                    f2 = o3;
                    if (j.i) {
                        f = i.f;
                        f2 = j.f;
                    }
                }
            }
        }
        int f3 = o2;
        int f4 = o4;
        if (b) {
            final adk k = this.i;
            f3 = o2;
            f4 = o4;
            if (k != null) {
                final add l = k.i;
                f3 = o2;
                f4 = o4;
                if (l.i) {
                    final add m = k.j;
                    f3 = o2;
                    f4 = o4;
                    if (m.i) {
                        f3 = l.f;
                        f4 = m.f;
                    }
                }
            }
        }
        int z = 0;
        int n = 0;
        int n2 = 0;
        Label_0299: {
            if (f2 - f >= 0 && f4 - f3 >= 0 && f != Integer.MIN_VALUE && f != Integer.MAX_VALUE && f3 != Integer.MIN_VALUE && f3 != Integer.MAX_VALUE && f2 != Integer.MIN_VALUE && f2 != Integer.MAX_VALUE && f4 != Integer.MIN_VALUE) {
                z = f;
                n = f2;
                if ((n2 = f4) != Integer.MAX_VALUE) {
                    break Label_0299;
                }
            }
            z = 0;
            f3 = 0;
            n = 0;
            n2 = 0;
        }
        final int n3 = n - z;
        final int n4 = n2 - f3;
        this.Z = z;
        this.aa = f3;
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        final int[] aq = this.aq;
        int n5 = aq[0];
        int v = n3;
        if (n5 == 1) {
            final int v2 = this.V;
            if ((v = n3) < v2) {
                v = v2;
            }
            n5 = 1;
        }
        int w = n4;
        if (aq[1] == 1) {
            w = this.W;
            if (n4 >= w) {
                w = n4;
            }
        }
        this.V = v;
        this.W = w;
        final int ad = this.ad;
        if (w < ad) {
            this.W = ad;
        }
        int ac = this.ac;
        if (v < ac) {
            this.V = ac;
        }
        else {
            ac = v;
        }
        final int w2 = this.w;
        if (w2 > 0 && n5 == 3) {
            this.V = Math.min(ac, w2);
        }
        final int z2 = this.z;
        if (z2 > 0 && this.aq[1] == 3) {
            this.W = Math.min(this.W, z2);
        }
        final int v3 = this.V;
        if (v != v3) {
            this.k = v3;
        }
        final int w3 = this.W;
        if (w != w3) {
            this.l = w3;
        }
    }
    
    public void S(final cdn cdn) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }
    
    public void b(final acj acj, final boolean b) {
        final acm b2 = acj.b((Object)this.J);
        final acm b3 = acj.b((Object)this.L);
        final acm b4 = acj.b((Object)this.K);
        final acm b5 = acj.b((Object)this.M);
        final acm b6 = acj.b((Object)this.N);
        final acr u = this.U;
        boolean b9 = false;
        boolean b10 = false;
        Label_0163: {
            Label_0160: {
                if (u != null) {
                    final int[] aq = u.aq;
                    final boolean b7 = aq[0] == 2;
                    final boolean b8 = aq[1] == 2;
                    final int r = this.r;
                    if (r == 1) {
                        b9 = b7;
                        b10 = false;
                        break Label_0163;
                    }
                    if (r == 2) {
                        b10 = b8;
                        break Label_0160;
                    }
                    if (r != 3) {
                        final boolean b11 = b8;
                        b9 = b7;
                        b10 = b11;
                        break Label_0163;
                    }
                }
                b10 = false;
            }
            b9 = false;
        }
        Label_0239: {
            if (this.ah == 8) {
                for (int size = this.S.size(), i = 0; i < size; ++i) {
                    if (((acq)this.S.get(i)).g()) {
                        break Label_0239;
                    }
                }
                final boolean[] t = this.T;
                if (!t[0] && !t[1]) {
                    return;
                }
            }
        }
        Label_0659: {
            if (!this.b) {
                if (!this.m) {
                    break Label_0659;
                }
            }
            else {
                acj.f(b2, this.Z);
                acj.f(b3, this.Z + this.V);
                if (b9) {
                    final acr u2 = this.U;
                    if (u2 != null) {
                        final acq j = this.J;
                        final acs acs = (acs)u2;
                        final WeakReference ab = acs.aB;
                        if (ab == null || ab.get() == null || j.a() > ((acq)acs.aB.get()).a()) {
                            acs.aB = new WeakReference((T)j);
                        }
                        final acq l = this.L;
                        final WeakReference ad = acs.aD;
                        if (ad == null || ad.get() == null || l.a() > ((acq)acs.aD.get()).a()) {
                            acs.aD = new WeakReference(l);
                        }
                    }
                }
            }
            if (this.m) {
                acj.f(b4, this.aa);
                acj.f(b5, this.aa + this.W);
                if (this.N.g()) {
                    acj.f(b6, this.aa + this.ab);
                }
                if (b10) {
                    final acr u3 = this.U;
                    if (u3 != null) {
                        final acq k = this.K;
                        final acs acs2 = (acs)u3;
                        final WeakReference aa = acs2.aA;
                        if (aa == null || aa.get() == null || k.a() > ((acq)acs2.aA.get()).a()) {
                            acs2.aA = new WeakReference((T)k);
                        }
                        final acq m = this.M;
                        final WeakReference ac = acs2.aC;
                        if (ac == null || ac.get() == null || m.a() > ((acq)acs2.aC.get()).a()) {
                            acs2.aC = new WeakReference(m);
                        }
                    }
                }
            }
            if (this.b) {
                if (this.m) {
                    this.b = false;
                    this.m = false;
                    return;
                }
            }
        }
        if (b) {
            final adi h = this.h;
            if (h != null) {
                final adk i2 = this.i;
                if (i2 != null) {
                    final add i3 = h.i;
                    if (i3.i && h.j.i && i2.i.i && i2.j.i) {
                        acj.f(b2, i3.f);
                        acj.f(b3, this.h.j.f);
                        acj.f(b4, this.i.i.f);
                        acj.f(b5, this.i.j.f);
                        acj.f(b6, this.i.a.f);
                        if (this.U != null) {
                            if (b9 && this.j[0] && !this.H()) {
                                acj.g(acj.b((Object)this.U.L), b3, 0, 8);
                            }
                            if (b10 && this.j[1] && !this.I()) {
                                acj.g(acj.b((Object)this.U.M), b5, 0, 8);
                            }
                        }
                        this.b = false;
                        this.m = false;
                        return;
                    }
                }
            }
        }
        boolean h2;
        boolean i4;
        if (this.U != null) {
            if (this.a(0)) {
                ((acs)this.U).a(this, 0);
                h2 = true;
            }
            else {
                h2 = this.H();
            }
            if (this.a(1)) {
                ((acs)this.U).a(this, 1);
                i4 = true;
            }
            else {
                i4 = this.I();
            }
            if (!h2 && b9 && this.ah != 8 && this.J.e == null && this.L.e == null) {
                acj.g(acj.b((Object)this.U.L), b3, 0, 1);
            }
            if (!i4 && b10 && this.ah != 8 && this.K.e == null && this.M.e == null && this.N == null) {
                acj.g(acj.b((Object)this.U.M), b5, 0, 1);
            }
        }
        else {
            i4 = false;
            h2 = false;
        }
        final int v = this.V;
        int ac2;
        if (v >= (ac2 = this.ac)) {
            ac2 = v;
        }
        final int w = this.W;
        int ad2;
        if (w >= (ad2 = this.ad)) {
            ad2 = w;
        }
        final int[] aq2 = this.aq;
        final int n = aq2[0];
        final boolean b12 = n != 3;
        final int n2 = aq2[1];
        final boolean b13 = n2 != 3;
        final int y = this.Y;
        this.B = y;
        final float x = this.X;
        this.C = x;
        final int s = this.s;
        final int t2 = this.t;
        int n6 = 0;
        int b14 = 0;
        int n8 = 0;
        int n11 = 0;
        int n14 = 0;
        int n15 = 0;
        Label_1914: {
            if (x > 0.0f) {
                final int ah = this.ah;
                int n3 = ad2;
                if (ah != 8) {
                    int n4 = n;
                    int n5 = s;
                    if (n == 3) {
                        if (s == 0) {
                            n4 = 3;
                            n5 = 3;
                        }
                        else {
                            n4 = 3;
                            n5 = s;
                        }
                    }
                    n6 = t2;
                    int n7;
                    if ((n7 = n2) == 3) {
                        if ((n6 = t2) == 0) {
                            n6 = 3;
                        }
                        n7 = 3;
                    }
                    Label_1861: {
                        Label_1840: {
                            int n9;
                            if (n4 == 3 && n7 == 3 && n5 == 3) {
                                if (n6 == 3) {
                                    Label_1476: {
                                        Label_1443: {
                                            if (y == -1) {
                                                if (b12 && !b13) {
                                                    this.B = 0;
                                                }
                                                else {
                                                    if (!b12 && b13) {
                                                        this.B = 1;
                                                        this.C = 1.0f / x;
                                                    }
                                                    break Label_1443;
                                                }
                                            }
                                            else if (y != 0) {
                                                break Label_1443;
                                            }
                                            if (!this.K.h() || !this.M.h()) {
                                                this.B = 1;
                                                break Label_1476;
                                            }
                                        }
                                        if (this.B == 1 && (!this.J.h() || !this.L.h())) {
                                            this.B = 0;
                                        }
                                    }
                                    if (this.B == -1 && (!this.K.h() || !this.M.h() || !this.J.h() || !this.L.h())) {
                                        if (this.K.h() && this.M.h()) {
                                            this.B = 0;
                                        }
                                        else if (this.J.h() && this.L.h()) {
                                            this.C = 1.0f / this.C;
                                            this.B = 1;
                                        }
                                    }
                                    b14 = this.B;
                                    if (b14 == -1) {
                                        final int v2 = this.v;
                                        if (v2 > 0 && this.y == 0) {
                                            this.B = 0;
                                            b14 = 0;
                                            n8 = 0;
                                            break Label_1861;
                                        }
                                        if (v2 == 0 && this.y > 0) {
                                            this.C = 1.0f / this.C;
                                            this.B = 1;
                                            break Label_1840;
                                        }
                                    }
                                    n8 = b14;
                                    break Label_1861;
                                }
                                n9 = 3;
                            }
                            else {
                                n9 = n5;
                            }
                            if (n4 == 3 && n9 == 3) {
                                this.B = 0;
                                ac2 = (int)(x * w);
                                int n10;
                                if (n7 != 3) {
                                    n10 = 0;
                                    n11 = 4;
                                }
                                else {
                                    final int n12 = 1;
                                    n11 = n5;
                                    n10 = n12;
                                }
                                final int n13 = ad2;
                                n8 = 0;
                                b14 = 0;
                                n14 = n10;
                                n15 = n13;
                                break Label_1914;
                            }
                            if (n7 != 3 || n6 != 3) {
                                final int n16 = y;
                                n8 = y;
                                b14 = n16;
                                break Label_1861;
                            }
                            this.B = 1;
                            float c = x;
                            if (y == -1) {
                                c = 1.0f / x;
                                this.C = c;
                            }
                            final int n17 = (int)(c * v);
                            if (n4 != 3) {
                                final int n18 = n17;
                                n11 = n5;
                                b14 = 1;
                                n8 = 1;
                                n14 = 0;
                                final int n19 = 4;
                                n15 = n18;
                                n6 = n19;
                                break Label_1914;
                            }
                            n3 = n17;
                        }
                        b14 = 1;
                        n8 = 1;
                    }
                    final int n20 = n5;
                    n14 = 1;
                    n15 = n3;
                    n11 = n20;
                    break Label_1914;
                }
            }
            final int n21 = t2;
            final int n22 = y;
            final int n23 = 0;
            n11 = s;
            n6 = n21;
            n15 = ad2;
            n14 = n23;
            n8 = y;
            b14 = n22;
        }
        final int[] u4 = this.u;
        u4[0] = n11;
        u4[1] = n6;
        final boolean b15 = n14 != 0 && (n8 == 0 || n8 == -1);
        final boolean b16 = n14 != 0 && (b14 == 1 || b14 == -1);
        final boolean b17 = this.aq[0] == 2 && this instanceof acs;
        if (b17) {
            ac2 = 0;
        }
        final boolean b18 = this.Q.h() ^ true;
        final boolean[] t3 = this.T;
        final boolean b19 = t3[0];
        final boolean b20 = t3[1];
        final int p2 = this.p;
        final acm acm = null;
        Label_2392: {
            if (p2 != 2 && !this.b) {
                if (b) {
                    final adi h3 = this.h;
                    if (h3 != null) {
                        final add i5 = h3.i;
                        if (i5.i) {
                            if (h3.j.i) {
                                acj.f(b2, i5.f);
                                acj.f(b3, this.h.j.f);
                                if (this.U != null && b9 && this.j[0] && !this.H()) {
                                    acj.g(acj.b((Object)this.U.L), b3, 0, 8);
                                }
                                break Label_2392;
                            }
                        }
                    }
                }
                final acr u5 = this.U;
                acm b21;
                if (u5 != null) {
                    b21 = acj.b((Object)u5.L);
                }
                else {
                    b21 = null;
                }
                final acr u6 = this.U;
                acm b22;
                if (u6 != null) {
                    b22 = acj.b((Object)u6.J);
                }
                else {
                    b22 = null;
                }
                final boolean b23 = this.j[0];
                final int[] aq3 = this.aq;
                this.c(acj, true, b9, b10, b23, b22, b21, aq3[0], b17, this.J, this.L, this.Z, ac2, this.ac, this.D[0], this.ae, b15, aq3[1] == 3, h2, i4, b19, n11, n6, this.v, this.w, this.x, b18);
            }
        }
        final acm acm2 = b5;
        final acm acm3 = b4;
        final acm acm4 = b3;
        boolean b24 = false;
        Label_2582: {
            if (b) {
                final adk i6 = this.i;
                if (i6 != null) {
                    final add i7 = i6.i;
                    if (i7.i && i6.j.i) {
                        acj.f(acm3, i7.f);
                        final int f = this.i.j.f;
                        final acm acm5 = acm2;
                        acj.f(acm5, f);
                        acj.f(b6, this.i.a.f);
                        final acr u7 = this.U;
                        if (u7 != null && !i4 && b10) {
                            if (this.j[1]) {
                                acj.g(acj.b((Object)u7.M), acm5, 0, 8);
                            }
                        }
                        b24 = false;
                        break Label_2582;
                    }
                }
            }
            b24 = true;
        }
        final acm acm6 = b6;
        if (this.q != 2 && b24 && !this.m) {
            final boolean b25 = this.aq[1] == 2 && this instanceof acs;
            if (b25) {
                n15 = 0;
            }
            final acr u8 = this.U;
            acm b26;
            if (u8 != null) {
                b26 = acj.b((Object)u8.M);
            }
            else {
                b26 = null;
            }
            final acr u9 = this.U;
            acm b27 = acm;
            if (u9 != null) {
                b27 = acj.b((Object)u9.K);
            }
            final int ab2 = this.ab;
            boolean b28 = false;
            Label_2868: {
                if (ab2 > 0 || this.ah == 8) {
                    final acq n24 = this.N;
                    if (n24.e != null) {
                        acj.m(acm6, acm3, ab2, 8);
                        acj.m(acm6, acj.b((Object)this.N.e), this.N.b(), 8);
                        if (b10) {
                            acj.g(b26, acj.b((Object)this.M), 0, 5);
                        }
                        b28 = false;
                        break Label_2868;
                    }
                    if (this.ah == 8) {
                        acj.m(acm6, acm3, n24.b(), 8);
                    }
                    else {
                        acj.m(acm6, acm3, ab2, 8);
                    }
                }
                b28 = b18;
            }
            final boolean b29 = this.j[1];
            final int[] aq4 = this.aq;
            this.c(acj, false, b10, b9, b29, b27, b26, aq4[1], b25, this.K, this.M, this.aa, n15, this.ad, this.D[1], this.af, b16, aq4[0] == 3, i4, h2, b20, n6, n11, this.y, this.z, this.A, b28);
        }
        if (n14 != 0) {
            if (this.B == 1) {
                acj.n(acm2, acm3, acm4, b2, this.C);
            }
            else {
                acj.n(acm4, b2, acm2, acm3, this.C);
            }
        }
        if (this.Q.h()) {
            final acr d = this.Q.e.d;
            final double radians = Math.toRadians(this.E + 90.0f);
            final int b30 = this.Q.b();
            final acm b31 = acj.b((Object)this.K(2));
            final acm b32 = acj.b((Object)this.K(3));
            final acm b33 = acj.b((Object)this.K(4));
            final acm b34 = acj.b((Object)this.K(5));
            final acm b35 = acj.b((Object)d.K(2));
            final acm b36 = acj.b((Object)d.K(3));
            final acm b37 = acj.b((Object)d.K(4));
            final acm b38 = acj.b((Object)d.K(5));
            final aci a = acj.a();
            final double n25 = (float)radians;
            final double n26 = b30;
            final double sin = Math.sin(n25);
            Double.isNaN(n26);
            a.j(b32, b34, b36, b38, (float)(sin * n26));
            acj.e(a);
            final aci a2 = acj.a();
            final double cos = Math.cos(n25);
            Double.isNaN(n26);
            a2.j(b31, b33, b35, b37, (float)(cos * n26));
            acj.e(a2);
        }
        this.b = false;
        this.m = false;
    }
    
    public boolean d() {
        return this.ah != 8;
    }
    
    public boolean e() {
        final boolean b = this.b;
        boolean b2 = true;
        if (!b) {
            if (this.J.c) {
                if (!this.L.c) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    public boolean f() {
        final boolean m = this.m;
        boolean b = true;
        if (!m) {
            if (this.K.c) {
                if (!this.M.c) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final int g() {
        return this.l() + this.W;
    }
    
    public final int h() {
        if (this.ah == 8) {
            return 0;
        }
        return this.W;
    }
    
    public final int i() {
        return this.k() + this.V;
    }
    
    public final int j() {
        if (this.ah == 8) {
            return 0;
        }
        return this.V;
    }
    
    public final int k() {
        final acr u = this.U;
        if (u != null) {
            return ((acs)u).ar + this.Z;
        }
        return this.Z;
    }
    
    public final int l() {
        final acr u = this.U;
        if (u != null) {
            return ((acs)u).as + this.aa;
        }
        return this.aa;
    }
    
    public final acr m(final int n) {
        if (n == 0) {
            final acq l = this.L;
            final acq e = l.e;
            if (e != null && e.e == l) {
                return e.d;
            }
        }
        else if (n == 1) {
            final acq m = this.M;
            final acq e2 = m.e;
            if (e2 != null && e2.e == m) {
                return e2.d;
            }
        }
        return null;
    }
    
    public final acr n(final int n) {
        if (n == 0) {
            final acq j = this.J;
            final acq e = j.e;
            if (e != null && e.e == j) {
                return e.d;
            }
        }
        else if (n == 1) {
            final acq k = this.K;
            final acq e2 = k.e;
            if (e2 != null && e2.e == k) {
                return e2.d;
            }
        }
        return null;
    }
    
    public final adm o(final int n) {
        if (n == 0) {
            return this.h;
        }
        if (n == 1) {
            return this.i;
        }
        return null;
    }
    
    public final void p(final acs acs, final acj acj, final HashSet set, final int n, final boolean b) {
        if (b) {
            if (!set.contains(this)) {
                return;
            }
            acw.a(acs, acj, this);
            set.remove(this);
            this.b(acj, acs.W(64));
        }
        Iterator iterator5;
        if (n == 0) {
            final HashSet a = this.J.a;
            if (a != null) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    ((acq)iterator.next()).d.p(acs, acj, set, 0, true);
                }
            }
            final HashSet a2 = this.L.a;
            if (a2 != null) {
                final Iterator iterator2 = a2.iterator();
                while (iterator2.hasNext()) {
                    ((acq)iterator2.next()).d.p(acs, acj, set, 0, true);
                }
            }
            return;
        }
        else {
            final HashSet a3 = this.K.a;
            if (a3 != null) {
                final Iterator iterator3 = a3.iterator();
                while (iterator3.hasNext()) {
                    ((acq)iterator3.next()).d.p(acs, acj, set, 1, true);
                }
            }
            final HashSet a4 = this.M.a;
            if (a4 != null) {
                final Iterator iterator4 = a4.iterator();
                while (iterator4.hasNext()) {
                    ((acq)iterator4.next()).d.p(acs, acj, set, 1, true);
                }
            }
            final HashSet a5 = this.N.a;
            if (a5 == null) {
                return;
            }
            iterator5 = a5.iterator();
        }
        while (true) {
            if (!iterator5.hasNext()) {
                return;
            }
            final acr d = ((acq)iterator5.next()).d;
            try {
                d.p(acs, acj, set, 1, true);
                continue;
            }
            finally {
                while (true) {}
            }
            break;
        }
    }
    
    public final void q(final acj acj) {
        acj.b((Object)this.J);
        acj.b((Object)this.K);
        acj.b((Object)this.L);
        acj.b((Object)this.M);
        if (this.ab > 0) {
            acj.b((Object)this.N);
        }
    }
    
    public final void r() {
        if (this.h == null) {
            this.h = new adi(this);
        }
        if (this.i == null) {
            this.i = new adk(this);
        }
    }
    
    public void s() {
        this.J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.U = null;
        this.E = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        final int[] aq = this.aq;
        aq[aq[0] = 1] = 1;
        this.ag = null;
        this.ah = 0;
        this.aj = 0;
        this.ak = 0;
        final float[] al = this.al;
        al[1] = (al[0] = -1.0f);
        this.p = -1;
        this.q = -1;
        final int[] d = this.D;
        d[1] = (d[0] = Integer.MAX_VALUE);
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        final boolean[] j = this.j;
        j[1] = (j[0] = true);
        this.G = false;
        final boolean[] t = this.T;
        t[1] = (t[0] = false);
        this.a = true;
        final int[] u = this.u;
        u[1] = (u[0] = 0);
        this.k = -1;
        this.l = -1;
    }
    
    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        for (int size = this.S.size(), i = 0; i < size; ++i) {
            final acq acq = this.S.get(i);
            acq.c = false;
            acq.b = 0;
        }
    }
    
    @Override
    public String toString() {
        final String ai = this.ai;
        String string;
        if (ai != null) {
            final StringBuilder sb = new StringBuilder("id: ");
            sb.append(ai);
            sb.append(" ");
            string = sb.toString();
        }
        else {
            string = "";
        }
        final int z = this.Z;
        final int aa = this.aa;
        final int v = this.V;
        final int w = this.W;
        final StringBuilder sb2 = new StringBuilder("");
        sb2.append(string);
        sb2.append("(");
        sb2.append(z);
        sb2.append(", ");
        sb2.append(aa);
        sb2.append(") - (");
        sb2.append(v);
        sb2.append(" x ");
        sb2.append(w);
        sb2.append(")");
        return sb2.toString();
    }
    
    public final void u(final int ab) {
        this.ab = ab;
        this.F = (ab > 0);
    }
    
    public final void v(final int z, final int n) {
        if (this.b) {
            return;
        }
        this.J.e(z);
        this.L.e(n);
        this.Z = z;
        this.V = n - z;
        this.b = true;
    }
    
    public final void w(final int aa, final int n) {
        if (this.m) {
            return;
        }
        this.K.e(aa);
        this.M.e(n);
        this.aa = aa;
        this.W = n - aa;
        if (this.F) {
            this.N.e(aa + this.ab);
        }
        this.m = true;
    }
    
    public final void x(final int w) {
        this.W = w;
        final int ad = this.ad;
        if (w < ad) {
            this.W = ad;
        }
    }
    
    protected final void y(final int n, final boolean b) {
        this.T[n] = b;
    }
    
    public final void z(final int h, final int i) {
        this.H = h;
        this.I = i;
        this.a = false;
    }
}
