import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class assw extends athv implements ashl
{
    private static final long serialVersionUID = -5526049321428043809L;
    final Object a;
    final boolean b;
    aukg c;
    boolean d;
    
    public assw(final aukf aukf, final Object a) {
        super(aukf);
        this.a = a;
        this.b = true;
    }
    
    public final void b(final Throwable t) {
        if (this.d) {
            atqx.j(t);
            return;
        }
        this.d = true;
        this.f.b(t);
    }
    
    public final void f(final aukg c) {
        if (athz.i(this.c, c)) {
            this.c = c;
            this.f.f((aukg)this);
            c.e(Long.MAX_VALUE);
        }
    }
    
    public final void tt() {
        super.tt();
        this.c.tt();
    }
    
    public final void tu(final Object g) {
        if (this.d) {
            return;
        }
        if (this.g != null) {
            this.d = true;
            this.c.tt();
            this.f.b((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.g = g;
    }
    
    public final void tx() {
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
        this.f.tx();
    }
}
