import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class assh extends athd implements asgw
{
    private static final long serialVersionUID = -5526049321428043809L;
    final Object a;
    final boolean b;
    aujq c;
    boolean d;
    
    public assh(final aujp aujp, final Object a) {
        super(aujp);
        this.a = a;
        this.b = true;
    }
    
    public final void b(final Throwable t) {
        if (this.d) {
            aulo.r(t);
            return;
        }
        this.d = true;
        this.f.b(t);
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            this.c = c;
            this.f.f((aujq)this);
            c.e(Long.MAX_VALUE);
        }
    }
    
    public final void tq() {
        super.tq();
        this.c.tq();
    }
    
    public final void tr(final Object g) {
        if (this.d) {
            return;
        }
        if (this.g != null) {
            this.d = true;
            this.c.tq();
            this.f.b((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.g = g;
    }
    
    public final void tu() {
        if (this.d) {
            return;
        }
        this.d = true;
        final Object g = this.g;
        this.g = null;
        Object a;
        if ((a = g) == null) {
            a = this.a;
        }
        if (a != null) {
            this.g(a);
            return;
        }
        if (this.b) {
            this.f.b((Throwable)new NoSuchElementException());
            return;
        }
        this.f.tu();
    }
}
