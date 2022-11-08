// 
// Decompiled by Procyon v0.6.0
// 

public final class am extends ak
{
    public float af;
    public int ag;
    public int ah;
    public int ai;
    private aj aj;
    
    public am() {
        this.af = -1.0f;
        this.ag = -1;
        this.ah = -1;
        this.aj = this.j;
        this.ai = 0;
        this.q.clear();
        this.q.add(this.aj);
    }
    
    public final void A(final int ai) {
        if (this.ai == ai) {
            return;
        }
        this.ai = ai;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        }
        else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }
    
    public final aj t(int n) {
        Label_0038: {
            if (--n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        break Label_0038;
                    }
                    if (n != 4) {
                        return null;
                    }
                }
                if (this.ai == 0) {
                    return this.aj;
                }
                return null;
            }
        }
        if (this.ai == 1) {
            return this.aj;
        }
        return null;
    }
    
    public final void x(final ah ah) {
        final ak r = super.r;
        if (r == null) {
            return;
        }
        aj aj = r.t(2);
        aj aj2 = r.t(4);
        if (this.ai == 0) {
            aj = r.t(3);
            aj2 = r.t(5);
        }
        if (this.ag != -1) {
            ah.g(ah.c(ah, ah.e(this.aj), ah.e(aj), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            ah.g(ah.c(ah, ah.e(this.aj), ah.e(aj2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            final ai e = ah.e(this.aj);
            final ai e2 = ah.e(aj);
            final ai e3 = ah.e(aj2);
            final float af = this.af;
            final af a = ah.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - af);
            a.d.f(e3, af);
            ah.g(a);
        }
    }
    
    public final void y() {
        if (super.r == null) {
            return;
        }
        final int p = ah.p(this.aj);
        if (this.ai == 1) {
            super.w = p;
            super.x = 0;
            this.j(super.r.d());
            this.p(0);
            return;
        }
        super.w = 0;
        super.x = p;
        this.p(super.r.h());
        this.j(0);
    }
}
