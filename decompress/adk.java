// 
// Decompiled by Procyon v0.6.0
// 

public final class adk extends ado
{
    private static final int[] a;
    
    static {
        a = new int[2];
    }
    
    public adk(final act act) {
        super(act);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }
    
    private static final void n(final int[] array, int n, int n2, int n3, final int n4, final float n5, final int n6) {
        n3 = n4 - n3;
        n = n2 - n;
        if (n6 != -1) {
            if (n6 != 0) {
                final float n7 = (float)n;
                array[0] = n;
                array[1] = (int)(n7 * n5 + 0.5f);
                return;
            }
            array[0] = (int)(n3 * n5 + 0.5f);
            array[1] = n3;
        }
        else {
            final float n8 = (float)n3;
            final float n9 = n / n5;
            n2 = (int)(n8 * n5 + 0.5f);
            if (n2 <= n) {
                array[0] = n2;
                array[1] = n3;
                return;
            }
            n2 = (int)(n9 + 0.5f);
            if (n2 <= n3) {
                array[0] = n;
                array[1] = n2;
            }
        }
    }
    
    public final void b() {
        final act d = this.d;
        if (d.e) {
            this.f.c(d.j());
        }
        if (!this.f.i) {
            if ((super.k = this.d.M()) != 3) {
                if (this.k == 4) {
                    final act u = this.d.U;
                    if (u != null) {
                        if (u.M() == 1 || u.M() == 4) {
                            final int j = u.j();
                            final int b = this.d.J.b();
                            final int b2 = this.d.L.b();
                            j(this.i, u.h.i, this.d.J.b());
                            j(this.j, u.h.j, -this.d.L.b());
                            this.f.c(j - b - b2);
                            return;
                        }
                    }
                }
                if (this.k == 1) {
                    this.f.c(this.d.j());
                }
            }
        }
        else if (this.k == 4) {
            final act u2 = this.d.U;
            if (u2 != null && (u2.M() == 1 || u2.M() == 4)) {
                j(this.i, u2.h.i, this.d.J.b());
                j(this.j, u2.h.j, -this.d.L.b());
                return;
            }
        }
        final adg f = this.f;
        if (f.i) {
            final act d2 = this.d;
            if (d2.e) {
                final acs[] r = d2.R;
                final acs acs = r[0];
                final acs e = acs.e;
                if (e != null && r[1].e != null) {
                    if (d2.H()) {
                        this.i.e = this.d.R[0].b();
                        this.j.e = -this.d.R[1].b();
                        return;
                    }
                    final adf k = k(this.d.R[0]);
                    if (k != null) {
                        j(this.i, k, this.d.R[0].b());
                    }
                    final adf i = k(this.d.R[1]);
                    if (i != null) {
                        j(this.j, i, -this.d.R[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                else if (e != null) {
                    final adf l = k(acs);
                    if (l != null) {
                        j(this.i, l, this.d.R[0].b());
                        j(this.j, this.i, this.f.f);
                    }
                    return;
                }
                else {
                    final acs acs2 = r[1];
                    if (acs2.e != null) {
                        final adf m = k(acs2);
                        if (m != null) {
                            j(this.j, m, -this.d.R[1].b());
                            j(this.i, this.j, -this.f.f);
                        }
                        return;
                    }
                    else {
                        if (!(d2 instanceof acx) && d2.U != null && d2.K(7).e == null) {
                            final act d3 = this.d;
                            j(this.i, d3.U.h.i, d3.k());
                            j(this.j, this.i, this.f.f);
                        }
                        return;
                    }
                }
            }
        }
        if (this.k == 3) {
            final act d4 = this.d;
            final int s = d4.s;
            if (s != 2) {
                if (s == 3) {
                    if (d4.t == 3) {
                        this.i.a = (add)this;
                        this.j.a = (add)this;
                        final adm i2 = d4.i;
                        i2.i.a = (add)this;
                        i2.j.a = (add)this;
                        f.a = (add)this;
                        if (d4.I()) {
                            this.f.k.add(this.d.i.f);
                            this.d.i.f.j.add(this.f);
                            final adm i3 = this.d.i;
                            i3.f.a = (add)this;
                            this.f.k.add(i3.i);
                            this.f.k.add(this.d.i.j);
                            this.d.i.i.j.add(this.f);
                            this.d.i.j.j.add(this.f);
                        }
                        else if (this.d.H()) {
                            this.d.i.f.k.add(this.f);
                            this.f.j.add(this.d.i.f);
                        }
                        else {
                            this.d.i.f.k.add(this.f);
                        }
                    }
                    else {
                        final adg f2 = d4.i.f;
                        f.k.add(f2);
                        f2.j.add(this.f);
                        this.d.i.i.j.add(this.f);
                        this.d.i.j.j.add(this.f);
                        final adg f3 = this.f;
                        f3.b = true;
                        f3.j.add(this.i);
                        this.f.j.add(this.j);
                        this.i.k.add(this.f);
                        this.j.k.add(this.f);
                    }
                }
            }
            else {
                final act u3 = d4.U;
                if (u3 != null) {
                    final adg f4 = u3.i.f;
                    f.k.add(f4);
                    f4.j.add(this.f);
                    final adg f5 = this.f;
                    f5.b = true;
                    f5.j.add(this.i);
                    this.f.j.add(this.j);
                }
            }
        }
        final act d5 = this.d;
        final acs[] r2 = d5.R;
        final acs acs3 = r2[0];
        final acs e2 = acs3.e;
        if (e2 != null && r2[1].e != null) {
            if (d5.H()) {
                this.i.e = this.d.R[0].b();
                this.j.e = -this.d.R[1].b();
                return;
            }
            final adf k2 = k(this.d.R[0]);
            final adf k3 = k(this.d.R[1]);
            if (k2 != null) {
                k2.a((add)this);
            }
            if (k3 != null) {
                k3.a((add)this);
            }
            this.l = 4;
        }
        else if (e2 != null) {
            final adf k4 = k(acs3);
            if (k4 != null) {
                j(this.i, k4, this.d.R[0].b());
                this.i(this.j, this.i, 1, this.f);
            }
        }
        else {
            final acs acs4 = r2[1];
            if (acs4.e != null) {
                final adf k5 = k(acs4);
                if (k5 != null) {
                    j(this.j, k5, -this.d.R[1].b());
                    this.i(this.i, this.j, -1, this.f);
                }
            }
            else if (!(d5 instanceof acx)) {
                final act u4 = d5.U;
                if (u4 != null) {
                    j(this.i, u4.h.i, d5.k());
                    this.i(this.j, this.i, 1, this.f);
                }
            }
        }
    }
    
    public final void c() {
        final adf i = this.i;
        if (i.i) {
            this.d.Z = i.f;
        }
    }
    
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }
    
    public final boolean e() {
        return super.k != 3 || super.d.s == 0;
    }
    
    public final void f() {
        final int l = this.l;
        if (l == 0) {
            throw null;
        }
        if (l - 1 != 3) {
            final adg f = this.f;
            if (!f.i && this.k == 3) {
                final act d = this.d;
                final int s = d.s;
                if (s != 2) {
                    if (s == 3) {
                        final int t = d.t;
                        if (t != 0 && t != 3) {
                            final int y = d.Y;
                            float n = 0.0f;
                            Label_0163: {
                                float n2;
                                float n3;
                                if (y != -1) {
                                    if (y == 0) {
                                        n = d.i.f.f / d.X;
                                        break Label_0163;
                                    }
                                    n2 = (float)d.i.f.f;
                                    n3 = d.X;
                                }
                                else {
                                    n2 = (float)d.i.f.f;
                                    n3 = d.X;
                                }
                                n = n2 * n3;
                            }
                            f.c((int)(n + 0.5f));
                        }
                        else {
                            final adm i = d.i;
                            final adf j = i.i;
                            final adf k = i.j;
                            final boolean b = d.J.e != null;
                            final boolean b2 = d.K.e != null;
                            final boolean b3 = d.L.e != null;
                            final boolean b4 = d.M.e != null;
                            final int y2 = d.Y;
                            if (b && b2 && b3 && b4) {
                                final float x = d.X;
                                if (j.i && k.i) {
                                    final adf m = this.i;
                                    if (m.c) {
                                        if (this.j.c) {
                                            final int f2 = m.k.get(0).f;
                                            final int e = this.i.e;
                                            final int f3 = this.j.k.get(0).f;
                                            final int e2 = this.j.e;
                                            final int f4 = j.f;
                                            final int e3 = j.e;
                                            final int f5 = k.f;
                                            final int e4 = k.e;
                                            final int[] a = adk.a;
                                            n(a, f2 + e, f3 - e2, f4 + e3, f5 - e4, x, y2);
                                            this.f.c(a[0]);
                                            this.d.i.f.c(a[1]);
                                        }
                                    }
                                    return;
                                }
                                final adf i2 = this.i;
                                if (i2.i) {
                                    final adf j2 = this.j;
                                    if (j2.i) {
                                        if (!j.c || !k.c) {
                                            return;
                                        }
                                        final int f6 = i2.f;
                                        final int e5 = i2.e;
                                        final int f7 = j2.f;
                                        final int e6 = j2.e;
                                        final int f8 = j.k.get(0).f;
                                        final int e7 = j.e;
                                        final int f9 = k.k.get(0).f;
                                        final int e8 = k.e;
                                        final int[] a2 = adk.a;
                                        n(a2, f6 + e5, f7 - e6, f8 + e7, f9 - e8, x, y2);
                                        this.f.c(a2[0]);
                                        this.d.i.f.c(a2[1]);
                                    }
                                }
                                final adf i3 = this.i;
                                if (!i3.c || !this.j.c || !j.c || !k.c) {
                                    return;
                                }
                                final int f10 = i3.k.get(0).f;
                                final int e9 = this.i.e;
                                final int f11 = this.j.k.get(0).f;
                                final int e10 = this.j.e;
                                final int f12 = j.k.get(0).f;
                                final int e11 = j.e;
                                final int f13 = k.k.get(0).f;
                                final int e12 = k.e;
                                final int[] a3 = adk.a;
                                n(a3, f10 + e9, f11 - e10, f12 + e11, f13 - e12, x, y2);
                                this.f.c(a3[0]);
                                this.d.i.f.c(a3[1]);
                            }
                            else if (b && b3) {
                                final adf i4 = this.i;
                                if (!i4.c || !this.j.c) {
                                    return;
                                }
                                final float x2 = d.X;
                                final int n4 = i4.k.get(0).f + this.i.e;
                                final int n5 = this.j.k.get(0).f - this.j.e;
                                if (y2 != -1 && y2 != 0) {
                                    int h = this.h(n5 - n4, 0);
                                    final int n6 = (int)(h / x2 + 0.5f);
                                    final int h2 = this.h(n6, 1);
                                    if (n6 != h2) {
                                        h = (int)(h2 * x2 + 0.5f);
                                    }
                                    this.f.c(h);
                                    this.d.i.f.c(h2);
                                }
                                else {
                                    int h3 = this.h(n5 - n4, 0);
                                    final int n7 = (int)(h3 * x2 + 0.5f);
                                    final int h4 = this.h(n7, 1);
                                    if (n7 != h4) {
                                        h3 = (int)(h4 / x2 + 0.5f);
                                    }
                                    this.f.c(h3);
                                    this.d.i.f.c(h4);
                                }
                            }
                            else if (b2 && b4) {
                                if (!j.c || !k.c) {
                                    return;
                                }
                                final float x3 = d.X;
                                final int n8 = j.k.get(0).f + j.e;
                                final int n9 = k.k.get(0).f - k.e;
                                if (y2 != 0) {
                                    int h5 = this.h(n9 - n8, 1);
                                    final int n10 = (int)(h5 / x3 + 0.5f);
                                    final int h6 = this.h(n10, 0);
                                    if (n10 != h6) {
                                        h5 = (int)(h6 * x3 + 0.5f);
                                    }
                                    this.f.c(h6);
                                    this.d.i.f.c(h5);
                                }
                                else {
                                    int h7 = this.h(n9 - n8, 1);
                                    final int n11 = (int)(h7 * x3 + 0.5f);
                                    final int h8 = this.h(n11, 0);
                                    if (n11 != h8) {
                                        h7 = (int)(h8 / x3 + 0.5f);
                                    }
                                    this.f.c(h8);
                                    this.d.i.f.c(h7);
                                }
                            }
                        }
                    }
                }
                else {
                    final act u = d.U;
                    if (u != null) {
                        final adg f14 = u.h.f;
                        if (f14.i) {
                            f.c((int)(f14.f * d.x + 0.5f));
                        }
                    }
                }
            }
            final adf i5 = this.i;
            if (i5.c) {
                final adf j3 = this.j;
                if (j3.c) {
                    if (i5.i && j3.i && this.f.i) {
                        return;
                    }
                    if (!this.f.i && this.k == 3) {
                        final act d2 = this.d;
                        if (d2.s == 0) {
                            if (!d2.H()) {
                                final adf adf = this.i.k.get(0);
                                final adf adf2 = this.j.k.get(0);
                                final int f15 = adf.f;
                                final adf i6 = this.i;
                                final int n12 = f15 + i6.e;
                                final int n13 = adf2.f + this.j.e;
                                i6.c(n12);
                                this.j.c(n13);
                                this.f.c(n13 - n12);
                                return;
                            }
                        }
                    }
                    if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                        final int min = Math.min(this.j.k.get(0).f + this.j.e - (this.i.k.get(0).f + this.i.e), this.f.m);
                        final act d3 = this.d;
                        final int w = d3.w;
                        int n14 = Math.max(d3.v, min);
                        if (w > 0) {
                            n14 = Math.min(w, n14);
                        }
                        this.f.c(n14);
                    }
                    if (!this.f.i) {
                        return;
                    }
                    final adf adf3 = this.i.k.get(0);
                    final adf adf4 = this.j.k.get(0);
                    int f16 = adf3.f;
                    final adf i7 = this.i;
                    final int e13 = i7.e;
                    final int f17 = adf4.f;
                    final int e14 = this.j.e;
                    float ae = this.d.ae;
                    if (adf3 == adf4) {
                        ae = 0.5f;
                    }
                    int n15 = f17;
                    if (adf3 != adf4) {
                        n15 = e14 + f17;
                    }
                    if (adf3 != adf4) {
                        f16 += e13;
                    }
                    i7.c((int)(f16 + 0.5f + (n15 - f16 - this.f.f) * ae));
                    this.j.c(this.i.f + this.f.f);
                }
            }
            return;
        }
        final act d4 = this.d;
        this.m(d4.J, d4.L, 0);
    }
    
    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.f.i = false;
    }
    
    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.ai));
    }
}
