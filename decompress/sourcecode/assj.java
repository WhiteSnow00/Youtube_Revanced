import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class assj implements asgw, asic
{
    final ashq a;
    final Object b;
    aujq c;
    boolean d;
    Object e;
    
    public assj(final ashq a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.d) {
            aulo.r(t);
            return;
        }
        this.d = true;
        this.c = (aujq)athh.a;
        this.a.b(t);
    }
    
    public final void dispose() {
        this.c.tq();
        this.c = (aujq)athh.a;
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
            c.e(Long.MAX_VALUE);
        }
    }
    
    public final void tr(final Object e) {
        if (this.d) {
            return;
        }
        if (this.e != null) {
            this.d = true;
            this.c.tq();
            this.c = (aujq)athh.a;
            this.a.b((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.e = e;
    }
    
    public final void tu() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = (aujq)athh.a;
        final Object e = this.e;
        this.e = null;
        Object b;
        if ((b = e) == null) {
            b = this.b;
        }
        if (b != null) {
            this.a.tp(b);
            return;
        }
        this.a.b((Throwable)new NoSuchElementException());
    }
    
    public final boolean tx() {
        return this.c == athh.a;
    }
}
