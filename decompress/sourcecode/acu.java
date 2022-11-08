// 
// Decompiled by Procyon v0.6.0
// 

public final class acu extends acr
{
    public float a;
    public int ar;
    private boolean as;
    public int b;
    public int c;
    public acq d;
    
    public acu() {
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
    
    @Override
    public final acq K(int n) {
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
    
    @Override
    public final void R(final boolean b) {
        if (super.U == null) {
            return;
        }
        final int o = acj.o((Object)this.d);
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
    
    @Override
    public final void b(final acj acj, final boolean b) {
        final acr u = super.U;
        if (u == null) {
            return;
        }
        acq acq = u.K(2);
        acq acq2 = u.K(4);
        final acr u2 = this.U;
        final int n = 1;
        int n2;
        if (u2 != null && u2.aq[0] == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.ar == 0) {
            acq = u.K(3);
            acq2 = u.K(5);
            if (u2 != null && u2.aq[1] == 2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.as) {
            final acq d = this.d;
            if (d.c) {
                final acm b2 = acj.b((Object)d);
                acj.f(b2, this.d.a());
                if (this.b != -1) {
                    if (n2 != 0) {
                        acj.g(acj.b((Object)acq2), b2, 0, 5);
                    }
                }
                else if (this.c != -1 && n2 != 0) {
                    final acm b3 = acj.b((Object)acq2);
                    acj.g(b2, acj.b((Object)acq), 0, 5);
                    acj.g(b3, b2, 0, 5);
                }
                this.as = false;
                return;
            }
        }
        if (this.b != -1) {
            final acm b4 = acj.b((Object)this.d);
            acj.m(b4, acj.b((Object)acq), this.b, 8);
            if (n2 != 0) {
                acj.g(acj.b((Object)acq2), b4, 0, 5);
            }
        }
        else if (this.c != -1) {
            final acm b5 = acj.b((Object)this.d);
            final acm b6 = acj.b((Object)acq2);
            acj.m(b5, b6, -this.c, 8);
            if (n2 != 0) {
                acj.g(b5, acj.b((Object)acq), 0, 5);
                acj.g(b6, b5, 0, 5);
            }
        }
        else if (this.a != -1.0f) {
            final acm b7 = acj.b((Object)this.d);
            final acm b8 = acj.b((Object)acq2);
            final float a = this.a;
            final aci a2 = acj.a();
            a2.e.g(b7, -1.0f);
            a2.e.g(b8, a);
            acj.e(a2);
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
    
    @Override
    public final boolean d() {
        return true;
    }
    
    @Override
    public final boolean e() {
        return this.as;
    }
    
    @Override
    public final boolean f() {
        return this.as;
    }
}
