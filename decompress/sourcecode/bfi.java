import java.io.IOException;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfi implements bnz, bkm
{
    final /* synthetic */ bfl a;
    private final bfj b;
    private bny c;
    private trg d;
    
    public bfi(final bfl a, final bfj b) {
        this.a = a;
        this.c = a.e;
        this.d = a.k;
        this.b = b;
    }
    
    private final boolean n(int n, final ayx ayx) {
        ayx b = null;
        final ayx ayx2 = null;
        if (ayx != null) {
            final bfj b2 = this.b;
            int n2 = 0;
            while (true) {
                b = ayx2;
                if (n2 >= b2.c.size()) {
                    break;
                }
                if (((ayx)b2.c.get(n2)).d == ayx.d) {
                    b = ayx.b((Object)Pair.create(b2.b, ayx.a));
                    break;
                }
                ++n2;
            }
            if (b == null) {
                return false;
            }
        }
        n += this.b.d;
        final bny c = this.c;
        if (c.a != n || !baw.aa(c.d, b)) {
            this.c = this.a.e.p(n, b, 0L);
        }
        final trg d = this.d;
        if (d.a != n || !baw.aa(d.c, b)) {
            this.d = this.a.k.C(n, b);
        }
        return true;
    }
    
    public final void kK(final int n, final ayx ayx, final bns bns) {
        if (this.n(n, ayx)) {
            this.c.c(bns);
        }
    }
    
    public final void kL(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.n(n, ayx)) {
            this.c.e(bnn, bns);
        }
    }
    
    public final void kM(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.n(n, ayx)) {
            this.c.h(bnn, bns);
        }
    }
    
    public final void kN(final int n, final ayx ayx, final bnn bnn, final bns bns, final IOException ex, final boolean b) {
        if (this.n(n, ayx)) {
            this.c.k(bnn, bns, ex, b);
        }
    }
    
    public final void kO(final int n, final ayx ayx, final bnn bnn, final bns bns) {
        if (this.n(n, ayx)) {
            this.c.m(bnn, bns);
        }
    }
    
    public final void kP(final int n, final ayx ayx, final bns bns) {
        if (this.n(n, ayx)) {
            this.c.o(bns);
        }
    }
    
    public final void kQ(final int n, final ayx ayx) {
        if (this.n(n, ayx)) {
            this.d.p();
        }
    }
    
    public final void kR(final int n, final ayx ayx) {
        if (this.n(n, ayx)) {
            this.d.q();
        }
    }
    
    public final void kS(final int n, final ayx ayx) {
        if (this.n(n, ayx)) {
            this.d.r();
        }
    }
    
    public final void kT(final int n, final ayx ayx, final int n2) {
        if (this.n(n, ayx)) {
            this.d.s(n2);
        }
    }
    
    public final void kU(final int n, final ayx ayx, final Exception ex) {
        if (this.n(n, ayx)) {
            this.d.t(ex);
        }
    }
    
    public final void kV(final int n, final ayx ayx) {
        if (this.n(n, ayx)) {
            this.d.u();
        }
    }
}
