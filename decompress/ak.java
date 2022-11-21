import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class ak
{
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public int a;
    public float aa;
    ak ab;
    ak ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    final aj i;
    final aj j;
    final aj k;
    final aj l;
    final aj m;
    final aj n;
    final aj o;
    final aj p;
    public final ArrayList q;
    public ak r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    public ak() {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        final aj i = new aj(this, 2);
        this.i = i;
        final aj j = new aj(this, 3);
        this.j = j;
        final aj k = new aj(this, 4);
        this.k = k;
        final aj l = new aj(this, 5);
        this.l = l;
        final aj m = new aj(this, 6);
        this.m = m;
        final aj n = new aj(this, 8);
        this.n = n;
        final aj o = new aj(this, 9);
        this.o = o;
        this.p = new aj(this, 7);
        final ArrayList q = new ArrayList();
        this.q = q;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        q.add(i);
        q.add(j);
        q.add(k);
        q.add(l);
        q.add(n);
        q.add(o);
        q.add(m);
    }
    
    private final void A(final ah ah, final boolean b, final boolean b2, final aj aj, final aj aj2, int n, int n2, int n3, final int n4, final float n5, final boolean b3, final boolean b4, final int n6, final int n7, final int n8) {
        final ai e = ah.e((Object)aj);
        final ai e2 = ah.e((Object)aj2);
        final ai e3 = ah.e((Object)aj.b);
        final ai e4 = ah.e((Object)aj2.b);
        final int a = aj.a();
        final int a2 = aj2.a();
        final int k = this.K;
        final boolean b5 = k != 8;
        if (k == 8) {
            n3 = 0;
        }
        final boolean b6 = (b5 ^ true) | b2;
        if (e3 == null && e4 == null) {
            final af a3 = ah.a();
            a3.g(e, n);
            ah.g(a3);
            if (!b3) {
                if (b) {
                    ah.g(ah.c(ah, e2, e, n4, true));
                    return;
                }
                if (b6) {
                    ah.g(ah.c(ah, e2, e, n3, false));
                    return;
                }
                final af a4 = ah.a();
                a4.g(e2, n2);
                ah.g(a4);
            }
        }
        else if (e3 != null && e4 == null) {
            final af a5 = ah.a();
            a5.h(e, e3, a);
            ah.g(a5);
            if (b) {
                ah.g(ah.c(ah, e2, e, n4, true));
                return;
            }
            if (!b3) {
                if (b6) {
                    final af a6 = ah.a();
                    a6.h(e2, e, n3);
                    ah.g(a6);
                    return;
                }
                final af a7 = ah.a();
                a7.g(e2, n2);
                ah.g(a7);
            }
        }
        else if (e3 == null) {
            final af a8 = ah.a();
            a8.h(e2, e4, -a2);
            ah.g(a8);
            if (b) {
                ah.g(ah.c(ah, e2, e, n4, true));
                return;
            }
            if (!b3) {
                if (b6) {
                    final af a9 = ah.a();
                    a9.h(e2, e, n3);
                    ah.g(a9);
                    return;
                }
                final af a10 = ah.a();
                a10.g(e, n);
                ah.g(a10);
            }
        }
        else if (b6) {
            if (b) {
                ah.g(ah.c(ah, e2, e, n4, true));
            }
            else {
                final af a11 = ah.a();
                a11.h(e2, e, n3);
                ah.g(a11);
            }
            n = aj.h;
            if (n != aj2.h) {
                if (n == 2) {
                    final af a12 = ah.a();
                    a12.h(e, e3, a);
                    ah.g(a12);
                    final ai f = ah.f();
                    final af a13 = ah.a();
                    a13.j(e2, e4, f, -a2);
                    ah.g(a13);
                    return;
                }
                final ai f2 = ah.f();
                final af a14 = ah.a();
                a14.i(e, e3, f2, a);
                ah.g(a14);
                final af a15 = ah.a();
                a15.h(e2, e4, -a2);
                ah.g(a15);
            }
            else {
                if (e3 == e4) {
                    ah.g(ah.b(ah, e, e3, 0, 0.5f, e4, e2, 0, true));
                    return;
                }
                if (!b4) {
                    n = aj.i;
                    final ai f3 = ah.f();
                    final af a16 = ah.a();
                    a16.i(e, e3, f3, a);
                    if (n != 2) {
                        ah.k(a16, (int)(-a16.d.a(f3)));
                    }
                    ah.g(a16);
                    n = aj2.i;
                    n2 = -a2;
                    final ai f4 = ah.f();
                    final af a17 = ah.a();
                    a17.j(e2, e4, f4, n2);
                    if (n != 2) {
                        ah.k(a17, (int)(-a17.d.a(f4)));
                    }
                    ah.g(a17);
                    ah.g(ah.b(ah, e, e3, a, n5, e4, e2, a2, false));
                }
            }
        }
        else {
            if (b3) {
                ah.i(e, e3, a, 3);
                ah.j(e2, e4, -a2, 3);
                ah.g(ah.b(ah, e, e3, a, n5, e4, e2, a2, true));
                return;
            }
            if (!b4) {
                if (n6 == 1) {
                    if ((n = n7) <= n3) {
                        n = n3;
                    }
                    n2 = n;
                    if (n8 > 0) {
                        if (n8 < n) {
                            n2 = n8;
                        }
                        else {
                            ah.j(e2, e, n8, 3);
                            n2 = n;
                        }
                    }
                    ah.n(e2, e, n2, 3);
                    ah.i(e, e3, a, 2);
                    ah.j(e2, e4, -a2, 2);
                    ah.m(e, e3, a, n5, e4, e2, a2);
                    return;
                }
                if (n7 == 0 && n8 == 0) {
                    final af a18 = ah.a();
                    a18.h(e, e3, a);
                    ah.g(a18);
                    final af a19 = ah.a();
                    a19.h(e2, e4, -a2);
                    ah.g(a19);
                    return;
                }
                if (n8 > 0) {
                    ah.j(e2, e, n8, 3);
                }
                ah.i(e, e3, a, 2);
                ah.j(e2, e4, -a2, 2);
                ah.m(e, e3, a, n5, e4, e2, a2);
            }
        }
    }
    
    public final int a() {
        return this.x + this.t;
    }
    
    public final int b() {
        return this.af + this.A;
    }
    
    public final int c() {
        return this.ag + this.B;
    }
    
    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }
    
    public final int e() {
        int t = this.t;
        if (this.ae == 3) {
            int t2;
            if (this.d == 1) {
                t2 = Math.max(this.g, t);
            }
            else {
                t2 = this.g;
                if (t2 > 0) {
                    this.t = t2;
                }
                else {
                    t2 = 0;
                }
            }
            final int h = this.h;
            t = t2;
            if (h > 0 && h < (t = t2)) {
                return h;
            }
        }
        return t;
    }
    
    public final int f() {
        int s = this.s;
        if (this.ad == 3) {
            int s2;
            if (this.c == 1) {
                s2 = Math.max(this.e, s);
            }
            else {
                s2 = this.e;
                if (s2 > 0) {
                    this.s = s2;
                }
                else {
                    s2 = 0;
                }
            }
            final int f = this.f;
            s = s2;
            if (f > 0 && f < (s = s2)) {
                return f;
            }
        }
        return s;
    }
    
    public final int g() {
        return this.w + this.s;
    }
    
    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }
    
    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }
    
    public final void j(final int t) {
        this.t = t;
        final int e = this.E;
        if (t < e) {
            this.t = e;
        }
    }
    
    public final void k(int d, int s) {
        this.w = d;
        s -= d;
        this.s = s;
        d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
    
    public final void l(final int e) {
        if (e < 0) {
            this.E = 0;
            return;
        }
        this.E = e;
    }
    
    public final void m(final int d) {
        if (d < 0) {
            this.D = 0;
            return;
        }
        this.D = d;
    }
    
    public void n(final int a, final int b) {
        this.A = a;
        this.B = b;
    }
    
    public final void o(int n, int e) {
        this.x = n;
        n = e - n;
        this.t = n;
        e = this.E;
        if (n < e) {
            this.t = e;
        }
    }
    
    public final void p(final int s) {
        this.s = s;
        final int d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
    
    public void q() {
        final int w = this.w;
        final int x = this.x;
        final int s = this.s;
        final int t = this.t;
        this.af = w;
        this.ag = x;
        this.y = s + w - w;
        this.z = t + x - x;
    }
    
    public final boolean r() {
        return this.C > 0;
    }
    
    public final boolean s() {
        return this.r == null;
    }
    
    public aj t(final int n) {
        switch (n - 1) {
            default: {
                return this.p;
            }
            case 8: {
                return this.o;
            }
            case 7: {
                return this.n;
            }
            case 5: {
                return this.m;
            }
            case 4: {
                return this.l;
            }
            case 3: {
                return this.k;
            }
            case 2: {
                return this.j;
            }
            case 1: {
                return this.i;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(") - (");
        sb.append(this.s);
        sb.append(" x ");
        sb.append(this.t);
        sb.append(") wrap: (");
        sb.append(this.F);
        sb.append(" x ");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }
    
    public final void u(final int n, final ak ak, final int n2, final int n3, final int n4) {
        this.t(n).d(ak.t(n2), n3, n4, 2, 0, true);
    }
    
    public final void v(final int ad) {
        this.ad = ad;
        if (ad == 2) {
            this.p(this.F);
        }
    }
    
    public final void w(final int ae) {
        this.ae = ae;
        if (ae == 2) {
            this.j(this.G);
        }
    }
    
    public void x(final ah ah) {
        final ai e = ah.e((Object)this.i);
        final ai e2 = ah.e((Object)this.k);
        final ai e3 = ah.e((Object)this.j);
        final ai e4 = ah.e((Object)this.l);
        final ai e5 = ah.e((Object)this.m);
        final ak r = this.r;
        int n3;
        int n4;
        if (r != null) {
            final aj i = this.i;
            final aj b = i.b;
            int n = 0;
            Label_0136: {
                if (b == null || b.b != i) {
                    final aj k = this.k;
                    final aj b2 = k.b;
                    if (b2 == null || b2.b != k) {
                        n = 0;
                        break Label_0136;
                    }
                }
                ((al)r).A(this, 0);
                n = 1;
            }
            final aj j = this.j;
            final aj b3 = j.b;
            int n2 = 0;
            Label_0213: {
                if (b3 == null || b3.b != j) {
                    final aj l = this.l;
                    final aj b4 = l.b;
                    if (b4 == null || b4.b != l) {
                        n2 = 0;
                        break Label_0213;
                    }
                }
                ((al)this.r).A(this, 1);
                n2 = 1;
            }
            final ak r2 = this.r;
            Label_0417: {
                if (r2.ad == 2 && n == 0) {
                    final aj m = this.i;
                    final aj b5 = m.b;
                    Label_0321: {
                        if (b5 != null) {
                            final ak a = b5.a;
                            if (a == r2) {
                                if (a == r2) {
                                    m.i = 2;
                                }
                                break Label_0321;
                            }
                        }
                        final ai e6 = ah.e((Object)r2.i);
                        final af a2 = ah.a();
                        a2.i(e, e6, ah.f(), 0);
                        ah.g(a2);
                    }
                    final aj k2 = this.k;
                    final aj b6 = k2.b;
                    if (b6 != null) {
                        final ak a3 = b6.a;
                        final ak r3 = this.r;
                        if (a3 == r3) {
                            if (a3 == r3) {
                                k2.i = 2;
                            }
                            break Label_0417;
                        }
                    }
                    final ai e7 = ah.e((Object)this.r.k);
                    final af a4 = ah.a();
                    a4.i(e7, e2, ah.f(), 0);
                    ah.g(a4);
                }
            }
            final ak r4 = this.r;
            Label_0621: {
                if (r4.ae == 2 && n2 == 0) {
                    final aj j2 = this.j;
                    final aj b7 = j2.b;
                    Label_0525: {
                        if (b7 != null) {
                            final ak a5 = b7.a;
                            if (a5 == r4) {
                                if (a5 == r4) {
                                    j2.i = 2;
                                }
                                break Label_0525;
                            }
                        }
                        final ai e8 = ah.e((Object)r4.j);
                        final af a6 = ah.a();
                        a6.i(e3, e8, ah.f(), 0);
                        ah.g(a6);
                    }
                    final aj l2 = this.l;
                    final aj b8 = l2.b;
                    if (b8 != null) {
                        final ak a7 = b8.a;
                        final ak r5 = this.r;
                        if (a7 == r5) {
                            if (a7 == r5) {
                                l2.i = 2;
                            }
                            break Label_0621;
                        }
                    }
                    final ai e9 = ah.e((Object)this.r.l);
                    final af a8 = ah.a();
                    a8.i(e9, e4, ah.f(), 0);
                    ah.g(a8);
                }
            }
            n3 = n;
            n4 = n2;
        }
        else {
            n3 = 0;
            n4 = 0;
        }
        final int s = this.s;
        final int d = this.D;
        int n5;
        if (s < d) {
            n5 = d;
        }
        else {
            n5 = s;
        }
        final int t = this.t;
        int e10;
        if (t >= (e10 = this.E)) {
            e10 = t;
        }
        final int ad = this.ad;
        final boolean b9 = ad != 3;
        final int ae = this.ae;
        final boolean b10 = ae != 3;
        boolean b11 = b9;
        Label_0799: {
            if (!b9) {
                final aj i2 = this.i;
                b11 = b9;
                if (i2 != null) {
                    final aj k3 = this.k;
                    b11 = b9;
                    if (k3 != null) {
                        if (i2.b != null) {
                            b11 = b9;
                            if (k3.b != null) {
                                break Label_0799;
                            }
                        }
                        b11 = true;
                    }
                }
            }
        }
        boolean b12 = false;
        Label_0904: {
            if (!(b12 = b10)) {
                final aj j3 = this.j;
                b12 = b10;
                if (j3 != null) {
                    final aj l3 = this.l;
                    b12 = b10;
                    if (l3 != null) {
                        final aj b13 = j3.b;
                        if (b13 != null) {
                            b12 = b10;
                            if (l3.b != null) {
                                break Label_0904;
                            }
                        }
                        if (this.C != 0) {
                            final aj m2 = this.m;
                            b12 = b10;
                            if (m2 == null) {
                                break Label_0904;
                            }
                            if (b13 != null) {
                                b12 = b10;
                                if (m2.b != null) {
                                    break Label_0904;
                                }
                            }
                        }
                        b12 = true;
                    }
                }
            }
        }
        int v = this.v;
        float u = this.u;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        Label_1120: {
            int n13 = 0;
            Label_1101: {
                Label_1097: {
                    if (u > 0.0f && this.K != 8) {
                        if (ad == 3) {
                            if (ae == 3) {
                                if (b11 && !b12) {
                                    v = 0;
                                }
                                else if (!b11 && b12) {
                                    if (v == -1) {
                                        u = 1.0f / u;
                                        final int n6 = 1;
                                        n7 = 1;
                                        n8 = ad;
                                        n9 = n5;
                                        n10 = n6;
                                        break Label_1120;
                                    }
                                    v = 1;
                                }
                                final int n11 = 1;
                                n8 = ad;
                                n9 = n5;
                                n10 = v;
                                n7 = n11;
                                break Label_1120;
                            }
                        }
                        else if (ad != 3) {
                            if (ae == 3) {
                                float n12 = u;
                                if (v == -1) {
                                    n12 = 1.0f / u;
                                }
                                e10 = (int)(s * n12);
                                n13 = 1;
                                b12 = true;
                                u = n12;
                                break Label_1101;
                            }
                            break Label_1097;
                        }
                        n9 = (int)(t * u);
                        b11 = true;
                        n8 = 3;
                        n10 = 0;
                        n7 = 0;
                        break Label_1120;
                    }
                }
                n13 = v;
            }
            final int n14 = n5;
            n7 = 0;
            n10 = n13;
            n9 = n14;
            n8 = ad;
        }
        final boolean b14 = n7 != 0 && (n10 == 0 || n10 == -1);
        final boolean b15 = n8 == 2 && this instanceof al;
        Label_1390: {
            if (this.a != 2) {
                if (b14) {
                    final aj i3 = this.i;
                    if (i3.b != null && this.k.b != null) {
                        final ai e11 = ah.e((Object)i3);
                        final ai e12 = ah.e((Object)this.k);
                        final ai e13 = ah.e((Object)this.i.b);
                        final ai e14 = ah.e((Object)this.k.b);
                        ah.i(e11, e13, this.i.a(), 3);
                        ah.j(e12, e14, -this.k.a(), 3);
                        if (n3 == 0) {
                            ah.m(e11, e13, this.i.a(), this.H, e14, e12, this.k.a());
                        }
                        break Label_1390;
                    }
                }
                final aj i4 = this.i;
                final aj k4 = this.k;
                final int w = this.w;
                this.A(ah, b15, b11, i4, k4, w, w + n9, n9, d, this.H, b14, (boolean)(n3 != 0), this.c, this.e, this.f);
            }
        }
        final ai ai = e4;
        if (this.b == 2) {
            return;
        }
        final boolean b16 = this.ae == 2 && this instanceof al;
        final boolean b17 = n7 != 0 && (n10 == 1 || n10 == -1);
        final int c = this.C;
        Label_1873: {
            if (c > 0) {
                aj l4 = this.l;
                ah.n(e5, e3, c, 5);
                final aj m3 = this.m;
                int c2;
                if (m3.b != null) {
                    c2 = this.C;
                    l4 = m3;
                }
                else {
                    c2 = e10;
                }
                if (b17) {
                    final aj j4 = this.j;
                    if (j4.b != null && this.l.b != null) {
                        final ai e15 = ah.e((Object)j4);
                        final ai e16 = ah.e((Object)this.l);
                        final ai e17 = ah.e((Object)this.j.b);
                        final ai e18 = ah.e((Object)this.l.b);
                        ah.i(e15, e17, this.j.a(), 3);
                        ah.j(e16, e18, -this.l.a(), 3);
                        if (n4 == 0) {
                            ah.m(e15, e17, this.j.a(), this.I, e18, e16, this.l.a());
                        }
                        break Label_1873;
                    }
                }
                final aj j5 = this.j;
                final int x = this.x;
                this.A(ah, b16, b12, j5, l4, x, x + c2, c2, this.E, this.I, b17, (boolean)(n4 != 0), this.d, this.g, this.h);
                ah.n(ai, e3, e10, 5);
            }
            else {
                if (b17) {
                    final aj j6 = this.j;
                    if (j6.b != null && this.l.b != null) {
                        final ai e19 = ah.e((Object)j6);
                        final ai e20 = ah.e((Object)this.l);
                        final ai e21 = ah.e((Object)this.j.b);
                        final ai e22 = ah.e((Object)this.l.b);
                        ah.i(e19, e21, this.j.a(), 3);
                        ah.j(e20, e22, -this.l.a(), 3);
                        if (n4 == 0) {
                            ah.m(e19, e21, this.j.a(), this.I, e22, e20, this.l.a());
                        }
                        break Label_1873;
                    }
                }
                final aj j7 = this.j;
                final aj l5 = this.l;
                final int x2 = this.x;
                this.A(ah, b16, b12, j7, l5, x2, x2 + e10, e10, this.E, this.I, b17, (boolean)(n4 != 0), this.d, this.g, this.h);
            }
        }
        if (n7 == 0) {
            return;
        }
        final af a9 = ah.a();
        if (n10 == 0) {
            a9.e(e2, e, e4, e3, u);
            ah.g(a9);
            return;
        }
        if (n10 == 1) {
            a9.e(e4, e3, e2, e, u);
            ah.g(a9);
            return;
        }
        final int e23 = this.e;
        if (e23 > 0) {
            ah.i(e2, e, e23, 3);
        }
        final int g = this.g;
        if (g > 0) {
            ah.i(e4, e3, g, 3);
        }
        a9.e(e2, e, e4, e3, u);
        final ai d2 = ah.d();
        final ai d3 = ah.d();
        d2.c = 4;
        d3.c = 4;
        a9.c(d2, d3);
        ah.g(a9);
    }
    
    public void y() {
        final int p = ah.p((Object)this.i);
        final int p2 = ah.p((Object)this.j);
        final int p3 = ah.p((Object)this.k);
        final int p4 = ah.p((Object)this.l);
        final int n = p3 - p;
        final int n2 = p4 - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        int s = n;
        if (this.ad == 1) {
            s = this.s;
            if (n >= s) {
                s = n;
            }
        }
        int t = n2;
        if (this.ae == 1) {
            t = this.t;
            if (n2 >= t) {
                t = n2;
            }
        }
        this.s = s;
        this.t = t;
        final int e = this.E;
        if (t < e) {
            this.t = e;
        }
        final int d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
    
    public void z(final cdr cdr) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
