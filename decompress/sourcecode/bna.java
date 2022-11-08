import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

final class bna implements bnz, bkm
{
    final /* synthetic */ bnb a;
    private final Object b;
    private bny c;
    private trg d;
    
    public bna(final bnb a, final Object b) {
        this.a = a;
        this.c = ((bmr)a).C(null);
        this.d = ((bmr)a).F(null);
        this.b = b;
    }
    
    private final bns n(final bns bns) {
        final bnb a = this.a;
        final Object b = this.b;
        final long f = bns.f;
        a.l(b);
        final bnb a2 = this.a;
        final Object b2 = this.b;
        final long g = bns.g;
        a2.l(b2);
        if (f == bns.f && g == bns.g) {
            return bns;
        }
        return new bns(bns.a, bns.b, bns.c, bns.d, bns.e, f, g);
    }
    
    private final boolean o(int d, ayx k) {
        if (k != null) {
            k = this.a.k(this.b, k);
            if (k == null) {
                return false;
            }
        }
        else {
            k = null;
        }
        d = this.a.d(this.b, d);
        final bny c = this.c;
        if (c.a != d || !baw.aa(c.d, k)) {
            this.c = ((bmr)this.a).q.p(d, k, 0L);
        }
        final trg d2 = this.d;
        if (d2.a != d || !baw.aa(d2.c, k)) {
            this.d = ((bmr)this.a).r.C(d, k);
        }
        return true;
    }
    
    public final void kK(final int n, final ayx ayx, final bns bns) {
        if (this.o(n, ayx)) {
            this.c.c(this.n(bns));
        }
    }
    
    public final void kL(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.o(n, ayx)) {
            this.c.e(bnn, this.n(bns));
        }
    }
    
    public final void kM(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.o(n, ayx)) {
            this.c.h(bnn, this.n(bns));
        }
    }
    
    public final void kN(final int n, final ayx ayx, final bnn bnn, final bns bns, final IOException ex, final boolean b) {
        if (this.o(n, ayx)) {
            this.c.k(bnn, this.n(bns), ex, b);
        }
    }
    
    public final void kO(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.o(n, ayx)) {
            this.c.m(bnn, this.n(bns));
        }
    }
    
    public final void kP(final int n, final ayx ayx, final bns bns) {
        if (this.o(n, ayx)) {
            this.c.o(this.n(bns));
        }
    }
    
    public final void kQ(final int n, final ayx ayx) {
        if (this.o(n, ayx)) {
            this.d.p();
        }
    }
    
    public final void kR(final int n, final ayx ayx) {
        if (this.o(n, ayx)) {
            this.d.q();
        }
    }
    
    public final void kS(final int n, final ayx ayx) {
        if (this.o(n, ayx)) {
            this.d.r();
        }
    }
    
    public final void kT(final int n, final ayx ayx, final int n2) {
        if (this.o(n, ayx)) {
            this.d.s(n2);
        }
    }
    
    public final void kU(final int n, final ayx ayx, final Exception ex) {
        if (this.o(n, ayx)) {
            this.d.t(ex);
        }
    }
    
    public final void kV(final int n, final ayx ayx) {
        if (this.o(n, ayx)) {
            this.d.u();
        }
    }
}
