// 
// Decompiled by Procyon v0.6.0
// 

public final class acw extends act
{
    public float a;
    public int ar;
    private boolean as;
    public int b;
    public int c;
    public acs d;
    
    public acw() {
        this.a = -1.0f;
        this.b = -1;
        this.c = -1;
        this.d = this.K;
        int i = 0;
        this.ar = 0;
        this.S.clear();
        this.S.add(this.d);
        final int length = this.R.length;
        while (i < 6) {
            this.R[i] = this.d;
            ++i;
        }
    }
    
    public final acs K(int n) {
        Label_0037: {
            if (--n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        break Label_0037;
                    }
                    if (n != 4) {
                        return null;
                    }
                }
                if (this.ar == 0) {
                    return this.d;
                }
                return null;
            }
        }
        if (this.ar == 1) {
            return this.d;
        }
        return null;
    }
    
    public final void R(final boolean b) {
        if (super.U == null) {
            return;
        }
        final int o = acl.o(this.d);
        if (this.ar == 1) {
            super.Z = o;
            super.aa = 0;
            this.x(super.U.h());
            this.C(0);
            return;
        }
        super.Z = 0;
        super.aa = o;
        this.C(super.U.j());
        this.x(0);
    }
    
    public final void a(final int n) {
        this.d.e(n);
        this.as = true;
    }
    
    public final void b(final acl acl, final boolean b) {
        final act u = super.U;
        if (u == null) {
            return;
        }
        acs acs = u.K(2);
        acs acs2 = u.K(4);
        final act u2 = this.U;
        final int n = 1;
        int n2;
        if (u2 != null && u2.aq[0] == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.ar == 0) {
            acs = u.K(3);
            acs2 = u.K(5);
            if (u2 != null && u2.aq[1] == 2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.as) {
            final acs d = this.d;
            if (d.c) {
                final aco b2 = acl.b(d);
                acl.f(b2, this.d.a());
                if (this.b != -1) {
                    if (n2 != 0) {
                        acl.g(acl.b(acs2), b2, 0, 5);
                    }
                }
                else if (this.c != -1 && n2 != 0) {
                    final aco b3 = acl.b(acs2);
                    acl.g(b2, acl.b(acs), 0, 5);
                    acl.g(b3, b2, 0, 5);
                }
                this.as = false;
                return;
            }
        }
        if (this.b != -1) {
            final aco b4 = acl.b(this.d);
            acl.m(b4, acl.b(acs), this.b, 8);
            if (n2 != 0) {
                acl.g(acl.b(acs2), b4, 0, 5);
            }
        }
        else if (this.c != -1) {
            final aco b5 = acl.b(this.d);
            final aco b6 = acl.b(acs2);
            acl.m(b5, b6, -this.c, 8);
            if (n2 != 0) {
                acl.g(b5, acl.b(acs), 0, 5);
                acl.g(b6, b5, 0, 5);
            }
        }
        else if (this.a != -1.0f) {
            final aco b7 = acl.b(this.d);
            final aco b8 = acl.b(acs2);
            final float a = this.a;
            final ack a2 = acl.a();
            a2.e.g(b7, -1.0f);
            a2.e.g(b8, a);
            acl.e(a2);
        }
    }
    
    public final void c(int i) {
        if (this.ar == i) {
            return;
        }
        this.ar = i;
        this.S.clear();
        if (this.ar == 1) {
            this.d = this.J;
        }
        else {
            this.d = this.K;
        }
        this.S.add(this.d);
        for (i = this.R.length, i = 0; i < 6; ++i) {
            this.R[i] = this.d;
        }
    }
    
    public final boolean d() {
        return true;
    }
    
    public final boolean e() {
        return this.as;
    }
    
    public final boolean f() {
        return this.as;
    }
}
