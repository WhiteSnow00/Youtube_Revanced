import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asoy extends athv implements ashl
{
    private static final long serialVersionUID = 4066607327284737757L;
    final Object a;
    final boolean b;
    aukg c;
    long d;
    boolean e;
    
    public asoy(final aukf aukf, final Object a, final boolean b) {
        super(aukf);
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.e) {
            atqx.j(t);
            return;
        }
        this.e = true;
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
    
    public final void tu(final Object o) {
        if (this.e) {
            return;
        }
        final long d = this.d;
        if (d == 0L) {
            this.e = true;
            this.c.tt();
            this.g(o);
            return;
        }
        this.d = d + 1L;
    }
    
    public final void tx() {
        if (!this.e) {
            this.e = true;
            final Object a = this.a;
            if (a == null) {
                if (this.b) {
                    this.f.b((Throwable)new NoSuchElementException());
                    return;
                }
                this.f.tx();
            }
            else {
                this.g(a);
            }
        }
    }
}
