import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

final class bne implements bod, bkq
{
    final bnf a;
    private final Object b;
    private boc c;
    private tun d;
    
    public bne(final bnf a, final Object b) {
        this.a = a;
        this.c = ((bmv)a).C(null);
        this.d = ((bmv)a).F(null);
        this.b = b;
    }
    
    private final bnw n(final bnw bnw) {
        final bnf a = this.a;
        final Object b = this.b;
        final long f = bnw.f;
        a.l(b);
        final bnf a2 = this.a;
        final Object b2 = this.b;
        final long g = bnw.g;
        a2.l(b2);
        if (f == bnw.f && g == bnw.g) {
            return bnw;
        }
        return new bnw(bnw.a, bnw.b, bnw.c, bnw.d, bnw.e, f, g);
    }
    
    private final boolean o(int d, ayz k) {
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
        final boc c = this.c;
        if (c.a != d || !baz.aa(c.d, k)) {
            this.c = ((bmv)this.a).q.p(d, k, 0L);
        }
        final tun d2 = this.d;
        if (d2.a != d || !baz.aa(d2.c, k)) {
            this.d = ((bmv)this.a).r.C(d, k);
        }
        return true;
    }
    
    @Override
    public final void kK(final int n, final ayz ayz, final bnw bnw) {
        if (this.o(n, ayz)) {
            this.c.c(this.n(bnw));
        }
    }
    
    @Override
    public final void kL(final int n, final ayz ayz, final bnr bnr, final bnw bnw) {
        if (this.o(n, ayz)) {
            this.c.e(bnr, this.n(bnw));
        }
    }
    
    @Override
    public final void kM(final int n, final ayz ayz, final bnr bnr, final bnw bnw) {
        if (this.o(n, ayz)) {
            this.c.h(bnr, this.n(bnw));
        }
    }
    
    @Override
    public final void kN(final int n, final ayz ayz, final bnr bnr, final bnw bnw, final IOException ex, final boolean b) {
        if (this.o(n, ayz)) {
            this.c.k(bnr, this.n(bnw), ex, b);
        }
    }
    
    @Override
    public final void kO(final int n, final ayz ayz, final bnr bnr, final bnw bnw) {
        if (this.o(n, ayz)) {
            this.c.m(bnr, this.n(bnw));
        }
    }
    
    @Override
    public final void kP(final int n, final ayz ayz, final bnw bnw) {
        if (this.o(n, ayz)) {
            this.c.o(this.n(bnw));
        }
    }
    
    public final void kQ(final int n, final ayz ayz) {
        if (this.o(n, ayz)) {
            this.d.p();
        }
    }
    
    public final void kR(final int n, final ayz ayz) {
        if (this.o(n, ayz)) {
            this.d.q();
        }
    }
    
    public final void kS(final int n, final ayz ayz) {
        if (this.o(n, ayz)) {
            this.d.r();
        }
    }
    
    public final void kT(final int n, final ayz ayz, final int n2) {
        if (this.o(n, ayz)) {
            this.d.s(n2);
        }
    }
    
    public final void kU(final int n, final ayz ayz, final Exception ex) {
        if (this.o(n, ayz)) {
            this.d.t(ex);
        }
    }
    
    public final void kV(final int n, final ayz ayz) {
        if (this.o(n, ayz)) {
            this.d.u();
        }
    }
    
    public final void kW() {
    }
}
