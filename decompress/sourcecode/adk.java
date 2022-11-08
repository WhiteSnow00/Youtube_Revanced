// 
// Decompiled by Procyon v0.6.0
// 

public final class adk extends adm
{
    public final add a;
    ade b;
    
    public adk(final acr acr) {
        super(acr);
        final add a = new add(this);
        this.a = a;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        a.l = 8;
        this.g = 1;
    }
    
    public final void b() {
        final acr d = this.d;
        if (d.e) {
            this.f.c(d.h());
        }
        if (!this.f.i) {
            super.k = this.d.N();
            if (this.d.F) {
                this.b = new ade(this);
            }
            if (super.k != 3) {
                if (this.k == 4) {
                    final acr u = this.d.U;
                    if (u != null) {
                        if (u.N() == 1) {
                            final int h = u.h();
                            final int b = this.d.K.b();
                            final int b2 = this.d.M.b();
                            j(this.i, u.i.i, this.d.K.b());
                            j(this.j, u.i.j, -this.d.M.b());
                            this.f.c(h - b - b2);
                            return;
                        }
                    }
                }
                if (this.k == 1) {
                    this.f.c(this.d.h());
                }
            }
        }
        else if (this.k == 4) {
            final acr u2 = this.d.U;
            if (u2 != null && u2.N() == 1) {
                j(this.i, u2.i.i, this.d.K.b());
                j(this.j, u2.i.j, -this.d.M.b());
                return;
            }
        }
        final ade f = this.f;
        Label_1098: {
            if (f.i) {
                final acr d2 = this.d;
                if (d2.e) {
                    final acq[] r = d2.R;
                    final acq acq = r[2];
                    final acq e = acq.e;
                    if (e != null && r[3].e != null) {
                        if (d2.I()) {
                            this.i.e = this.d.R[2].b();
                            this.j.e = -this.d.R[3].b();
                        }
                        else {
                            final add k = k(this.d.R[2]);
                            if (k != null) {
                                j(this.i, k, this.d.R[2].b());
                            }
                            final add i = k(this.d.R[3]);
                            if (i != null) {
                                j(this.j, i, -this.d.R[3].b());
                            }
                            this.i.b = true;
                            this.j.b = true;
                        }
                        final acr d3 = this.d;
                        if (d3.F) {
                            j(this.a, this.i, d3.ab);
                        }
                        return;
                    }
                    else if (e != null) {
                        final add j = k(acq);
                        if (j == null) {
                            return;
                        }
                        j(this.i, j, this.d.R[2].b());
                        j(this.j, this.i, this.f.f);
                        final acr d4 = this.d;
                        if (d4.F) {
                            j(this.a, this.i, d4.ab);
                        }
                        return;
                    }
                    else {
                        final acq acq2 = r[3];
                        if (acq2.e != null) {
                            final add l = k(acq2);
                            if (l != null) {
                                j(this.j, l, -this.d.R[3].b());
                                j(this.i, this.j, -this.f.f);
                            }
                            final acr d5 = this.d;
                            if (d5.F) {
                                j(this.a, this.i, d5.ab);
                            }
                            return;
                        }
                        else {
                            final acq acq3 = r[4];
                            if (acq3.e != null) {
                                final add m = k(acq3);
                                if (m != null) {
                                    j(this.a, m, 0);
                                    j(this.i, this.a, -this.d.ab);
                                    j(this.j, this.i, this.f.f);
                                }
                                return;
                            }
                            else {
                                if (d2 instanceof acv || d2.U == null || d2.K(7).e != null) {
                                    return;
                                }
                                final acr d6 = this.d;
                                j(this.i, d6.U.i.i, d6.l());
                                j(this.j, this.i, this.f.f);
                                final acr d7 = this.d;
                                if (d7.F) {
                                    j(this.a, this.i, d7.ab);
                                }
                                return;
                            }
                        }
                    }
                }
            }
            else if (this.k == 3) {
                final acr d8 = this.d;
                final int t = d8.t;
                if (t != 2) {
                    if (t != 3) {
                        break Label_1098;
                    }
                    if (d8.I()) {
                        break Label_1098;
                    }
                    final acr d9 = this.d;
                    if (d9.s != 3) {
                        final ade f2 = d9.h.f;
                        this.f.k.add(f2);
                        f2.j.add(this.f);
                        final ade f3 = this.f;
                        f3.b = true;
                        f3.j.add(this.i);
                        this.f.j.add(this.j);
                    }
                    break Label_1098;
                }
                else {
                    final acr u3 = d8.U;
                    if (u3 != null) {
                        final ade f4 = u3.i.f;
                        f.k.add(f4);
                        f4.j.add(this.f);
                        final ade f5 = this.f;
                        f5.b = true;
                        f5.j.add(this.i);
                        this.f.j.add(this.j);
                    }
                    break Label_1098;
                }
            }
            f.a((adb)this);
        }
        final acr d10 = this.d;
        final acq[] r2 = d10.R;
        final acq acq4 = r2[2];
        final acq e2 = acq4.e;
        if (e2 != null && r2[3].e != null) {
            if (d10.I()) {
                this.i.e = this.d.R[2].b();
                this.j.e = -this.d.R[3].b();
            }
            else {
                final add k2 = k(this.d.R[2]);
                final add k3 = k(this.d.R[3]);
                if (k2 != null) {
                    k2.a((adb)this);
                }
                if (k3 != null) {
                    k3.a((adb)this);
                }
                this.l = 4;
            }
            if (this.d.F) {
                this.i(this.a, this.i, 1, this.b);
            }
        }
        else if (e2 != null) {
            final add k4 = k(acq4);
            if (k4 != null) {
                j(this.i, k4, this.d.R[2].b());
                this.i(this.j, this.i, 1, this.f);
                if (this.d.F) {
                    this.i(this.a, this.i, 1, this.b);
                }
                if (this.k == 3) {
                    final acr d11 = this.d;
                    if (d11.X > 0.0f) {
                        final adi h2 = d11.h;
                        if (h2.k == 3) {
                            h2.f.j.add(this.f);
                            this.f.k.add(this.d.h.f);
                            this.f.a = (adb)this;
                        }
                    }
                }
            }
        }
        else {
            final acq acq5 = r2[3];
            if (acq5.e != null) {
                final add k5 = k(acq5);
                if (k5 != null) {
                    j(this.j, k5, -this.d.R[3].b());
                    this.i(this.i, this.j, -1, this.f);
                    if (this.d.F) {
                        this.i(this.a, this.i, 1, this.b);
                    }
                }
            }
            else {
                final acq acq6 = r2[4];
                if (acq6.e != null) {
                    final add k6 = k(acq6);
                    if (k6 != null) {
                        j(this.a, k6, 0);
                        this.i(this.i, this.a, -1, this.b);
                        this.i(this.j, this.i, 1, this.f);
                    }
                }
                else if (!(d10 instanceof acv)) {
                    final acr u4 = d10.U;
                    if (u4 != null) {
                        j(this.i, u4.i.i, d10.l());
                        this.i(this.j, this.i, 1, this.f);
                        if (this.d.F) {
                            this.i(this.a, this.i, 1, this.b);
                        }
                        if (this.k == 3) {
                            final acr d12 = this.d;
                            if (d12.X > 0.0f) {
                                final adi h3 = d12.h;
                                if (h3.k == 3) {
                                    h3.f.j.add(this.f);
                                    this.f.k.add(this.d.h.f);
                                    this.f.a = (adb)this;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f.k.size() == 0) {
            this.f.c = true;
        }
    }
    
    public final void c() {
        final add i = this.i;
        if (i.i) {
            this.d.aa = i.f;
        }
    }
    
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }
    
    public final boolean e() {
        return super.k != 3 || super.d.t == 0;
    }
    
    public final void f() {
        final int l = this.l;
        if (l == 0) {
            throw null;
        }
        if (l - 1 != 3) {
            final ade f = this.f;
            if (f.c && !f.i && this.k == 3) {
                final acr d = this.d;
                final int t = d.t;
                if (t != 2) {
                    if (t == 3) {
                        final ade f2 = d.h.f;
                        if (f2.i) {
                            final int y = d.Y;
                            float n = 0.0f;
                            Label_0151: {
                                float n2;
                                float n3;
                                if (y != -1) {
                                    if (y == 0) {
                                        n = f2.f * d.X;
                                        break Label_0151;
                                    }
                                    n2 = (float)f2.f;
                                    n3 = d.X;
                                }
                                else {
                                    n2 = (float)f2.f;
                                    n3 = d.X;
                                }
                                n = n2 / n3;
                            }
                            f.c((int)(n + 0.5f));
                        }
                    }
                }
                else {
                    final acr u = d.U;
                    if (u != null) {
                        final ade f3 = u.i.f;
                        if (f3.i) {
                            f.c((int)(f3.f * d.A + 0.5f));
                        }
                    }
                }
            }
            final add i = this.i;
            if (i.c) {
                final add j = this.j;
                if (j.c) {
                    if (i.i && j.i && this.f.i) {
                        return;
                    }
                    if (!this.f.i && this.k == 3) {
                        final acr d2 = this.d;
                        if (d2.s == 0) {
                            if (!d2.I()) {
                                final add add = this.i.k.get(0);
                                final add add2 = this.j.k.get(0);
                                final int f4 = add.f;
                                final add k = this.i;
                                final int n4 = f4 + k.e;
                                final int n5 = add2.f + this.j.e;
                                k.c(n4);
                                this.j.c(n5);
                                this.f.c(n5 - n4);
                                return;
                            }
                        }
                    }
                    if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                        final int n6 = this.j.k.get(0).f + this.j.e - (this.i.k.get(0).f + this.i.e);
                        final ade f5 = this.f;
                        final int m = f5.m;
                        if (n6 < m) {
                            f5.c(n6);
                        }
                        else {
                            f5.c(m);
                        }
                    }
                    if (!this.f.i) {
                        return;
                    }
                    if (this.i.k.size() > 0 && this.j.k.size() > 0) {
                        final add add3 = this.i.k.get(0);
                        final add add4 = this.j.k.get(0);
                        int f6 = add3.f;
                        final add i2 = this.i;
                        final int e = i2.e;
                        final int f7 = add4.f;
                        final int e2 = this.j.e;
                        float af = this.d.af;
                        if (add3 == add4) {
                            af = 0.5f;
                        }
                        int n7 = f7;
                        if (add3 != add4) {
                            n7 = e2 + f7;
                        }
                        if (add3 != add4) {
                            f6 += e;
                        }
                        i2.c((int)(f6 + 0.5f + (n7 - f6 - this.f.f) * af));
                        this.j.c(this.i.f + this.f.f);
                    }
                }
            }
            return;
        }
        final acr d3 = this.d;
        this.m(d3.K, d3.M, 1);
    }
    
    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }
    
    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.ai));
    }
}
