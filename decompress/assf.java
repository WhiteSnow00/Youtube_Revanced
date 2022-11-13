import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class assf extends AtomicLong implements aukg, asir
{
    private static final long serialVersionUID = -4453897557930727610L;
    final assj a;
    final aukf b;
    Object c;
    final AtomicLong d;
    boolean e;
    boolean f;
    
    public assf(final assj a, final aukf b) {
        this.a = a;
        this.b = b;
        this.d = new AtomicLong();
    }
    
    public final void dispose() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.a.g(this);
            this.a.d();
            this.c = null;
        }
    }
    
    public final void e(final long n) {
        if (athz.h(n) && asfn.x(this, n) != Long.MIN_VALUE) {
            asfn.w(this.d, n);
            this.a.d();
            this.a.i.b(this);
        }
    }
    
    public final boolean tA() {
        return this.get() == Long.MIN_VALUE;
    }
    
    public final void tt() {
        this.dispose();
    }
}
