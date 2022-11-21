// 
// Decompiled by Procyon v0.6.0
// 

public final class adm extends ado
{
    public final adf a;
    adg b;
    
    public adm(final act act) {
        super(act);
        final adf a = new adf((ado)this);
        this.a = a;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        a.l = 8;
        this.g = 1;
    }
    
    public final void b() {
        final act d = this.d;
        if (d.e) {
            this.f.c(d.h());
        }
        if (!this.f.i) {
            super.k = this.d.N();
            if (this.d.F) {
                this.b = new adg(this);
            }
            if (super.k != 3) {
                if (this.k == 4) {
                    final act u = this.d.U;
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
            final act u2 = this.d.U;
            if (u2 != null && u2.N() == 1) {
                j(this.i, u2.i.i, this.d.K.b());
                j(this.j, u2.i.j, -this.d.M.b());
                return;
            }
        }
        final adg f = this.f;
        Label_1168: {
            if (f.i) {
                final act d2 = this.d;
                if (d2.e) {
                    final acs[] r = d2.R;
                    final acs acs = r[2];
                    final acs e = acs.e;
                    if (e != null && r[3].e != null) {
                        if (d2.I()) {
                            this.i.e = this.d.R[2].b();
                            this.j.e = -this.d.R[3].b();
                        }
                        else {
                            final adf k = k(this.d.R[2]);
                            if (k != null) {
                                j(this.i, k, this.d.R[2].b());
                            }
                            final adf i = k(this.d.R[3]);
                            if (i != null) {
                                j(this.j, i, -this.d.R[3].b());
                            }
                            this.i.b = true;
                            this.j.b = true;
                        }
                        final act d3 = this.d;
                        if (d3.F) {
                            j(this.a, this.i, d3.ab);
                        }
                        return;
                    }
                    else if (e != null) {
                        final adf j = k(acs);
                        if (j == null) {
                            return;
                        }
                        j(this.i, j, this.d.R[2].b());
                        j(this.j, this.i, this.f.f);
                        final act d4 = this.d;
                        if (d4.F) {
                            j(this.a, this.i, d4.ab);
                        }
                        return;
                    }
                    else {
                        final acs acs2 = r[3];
                        if (acs2.e != null) {
                            final adf l = k(acs2);
                            if (l != null) {
                                j(this.j, l, -this.d.R[3].b());
                                j(this.i, this.j, -this.f.f);
                            }
                            final act d5 = this.d;
                            if (d5.F) {
                                j(this.a, this.i, d5.ab);
                            }
                            return;
                        }
                        else {
                            final acs acs3 = r[4];
                            if (acs3.e != null) {
                                final adf m = k(acs3);
                                if (m != null) {
                                    j(this.a, m, 0);
                                    j(this.i, this.a, -this.d.ab);
                                    j(this.j, this.i, this.f.f);
                                }
                                return;
                            }
                            else {
                                if (d2 instanceof acx || d2.U == null || d2.K(7).e != null) {
                                    return;
                                }
                                final act d6 = this.d;
                                j(this.i, d6.U.i.i, d6.l());
                                j(this.j, this.i, this.f.f);
                                final act d7 = this.d;
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
                final act d8 = this.d;
                final int t = d8.t;
                if (t != 2) {
                    if (t != 3) {
                        break Label_1168;
                    }
                    if (d8.I()) {
                        break Label_1168;
                    }
                    final act d9 = this.d;
                    if (d9.s != 3) {
                        final adg f2 = d9.h.f;
                        this.f.k.add(f2);
                        f2.j.add(this.f);
                        final adg f3 = this.f;
                        f3.b = true;
                        f3.j.add(this.i);
                        this.f.j.add(this.j);
                    }
                    break Label_1168;
                }
                else {
                    final act u3 = d8.U;
                    if (u3 != null) {
                        final adg f4 = u3.i.f;
                        f.k.add(f4);
                        f4.j.add(this.f);
                        final adg f5 = this.f;
                        f5.b = true;
                        f5.j.add(this.i);
                        this.f.j.add(this.j);
                    }
                    break Label_1168;
                }
            }
            f.a((add)this);
        }
        final act d10 = this.d;
        final acs[] r2 = d10.R;
        final acs acs4 = r2[2];
        final acs e2 = acs4.e;
        if (e2 != null && r2[3].e != null) {
            if (d10.I()) {
                this.i.e = this.d.R[2].b();
                this.j.e = -this.d.R[3].b();
            }
            else {
                final adf k2 = k(this.d.R[2]);
                final adf k3 = k(this.d.R[3]);
                if (k2 != null) {
                    k2.a((add)this);
                }
                if (k3 != null) {
                    k3.a((add)this);
                }
                this.l = 4;
            }
            if (this.d.F) {
                this.i(this.a, this.i, 1, this.b);
            }
        }
        else if (e2 != null) {
            final adf k4 = k(acs4);
            if (k4 != null) {
                j(this.i, k4, this.d.R[2].b());
                this.i(this.j, this.i, 1, this.f);
                if (this.d.F) {
                    this.i(this.a, this.i, 1, this.b);
                }
                if (this.k == 3) {
                    final act d11 = this.d;
                    if (d11.X > 0.0f) {
                        final adk h2 = d11.h;
                        if (h2.k == 3) {
                            h2.f.j.add(this.f);
                            this.f.k.add(this.d.h.f);
                            this.f.a = (add)this;
                        }
                    }
                }
            }
        }
        else {
            final acs acs5 = r2[3];
            if (acs5.e != null) {
                final adf k5 = k(acs5);
                if (k5 != null) {
                    j(this.j, k5, -this.d.R[3].b());
                    this.i(this.i, this.j, -1, this.f);
                    if (this.d.F) {
                        this.i(this.a, this.i, 1, this.b);
                    }
                }
            }
            else {
                final acs acs6 = r2[4];
                if (acs6.e != null) {
                    final adf k6 = k(acs6);
                    if (k6 != null) {
                        j(this.a, k6, 0);
                        this.i(this.i, this.a, -1, this.b);
                        this.i(this.j, this.i, 1, this.f);
                    }
                }
                else if (!(d10 instanceof acx)) {
                    final act u4 = d10.U;
                    if (u4 != null) {
                        j(this.i, u4.i.i, d10.l());
                        this.i(this.j, this.i, 1, this.f);
                        if (this.d.F) {
                            this.i(this.a, this.i, 1, this.b);
                        }
                        if (this.k == 3) {
                            final act d12 = this.d;
                            if (d12.X > 0.0f) {
                                final adk h3 = d12.h;
                                if (h3.k == 3) {
                                    h3.f.j.add(this.f);
                                    this.f.k.add(this.d.h.f);
                                    this.f.a = (add)this;
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
        final adf i = this.i;
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
            final adg f = this.f;
            if (f.c && !f.i && this.k == 3) {
                final act d = this.d;
                final int t = d.t;
                if (t != 2) {
                    if (t == 3) {
                        final adg f2 = d.h.f;
                        if (f2.i) {
                            final int y = d.Y;
                            float n = 0.0f;
                            Label_0153: {
                                float n2;
                                float n3;
                                if (y != -1) {
                                    if (y == 0) {
                                        n = f2.f * d.X;
                                        break Label_0153;
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
                    final act u = d.U;
                    if (u != null) {
                        final adg f3 = u.i.f;
                        if (f3.i) {
                            f.c((int)(f3.f * d.A + 0.5f));
                        }
                    }
                }
            }
            final adf i = this.i;
            if (i.c) {
                final adf j = this.j;
                if (j.c) {
                    if (i.i && j.i && this.f.i) {
                        return;
                    }
                    if (!this.f.i && this.k == 3) {
                        final act d2 = this.d;
                        if (d2.s == 0) {
                            if (!d2.I()) {
                                final adf adf = this.i.k.get(0);
                                final adf adf2 = this.j.k.get(0);
                                final int f4 = adf.f;
                                final adf k = this.i;
                                final int n4 = f4 + k.e;
                                final int n5 = adf2.f + this.j.e;
                                k.c(n4);
                                this.j.c(n5);
                                this.f.c(n5 - n4);
                                return;
                            }
                        }
                    }
                    if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                        final adf adf3 = this.i.k.get(0);
                        final adf adf4 = this.j.k.get(0);
                        final int f5 = adf3.f;
                        final int e = this.i.e;
                        final int f6 = adf4.f;
                        final int e2 = this.j.e;
                        final adg f7 = this.f;
                        final int m = f7.m;
                        final int n6 = f6 + e2 - (f5 + e);
                        if (n6 < m) {
                            f7.c(n6);
                        }
                        else {
                            f7.c(m);
                        }
                    }
                    if (!this.f.i) {
                        return;
                    }
                    if (this.i.k.size() > 0 && this.j.k.size() > 0) {
                        final adf adf5 = this.i.k.get(0);
                        final adf adf6 = this.j.k.get(0);
                        int f8 = adf5.f;
                        final adf i2 = this.i;
                        final int e3 = i2.e;
                        final int f9 = adf6.f;
                        final int e4 = this.j.e;
                        float af = this.d.af;
                        if (adf5 == adf6) {
                            af = 0.5f;
                        }
                        int n7 = f9;
                        if (adf5 != adf6) {
                            n7 = e4 + f9;
                        }
                        if (adf5 != adf6) {
                            f8 += e3;
                        }
                        i2.c((int)(f8 + 0.5f + (n7 - f8 - this.f.f) * af));
                        this.j.c(this.i.f + this.f.f);
                    }
                }
            }
            return;
        }
        final act d3 = this.d;
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
