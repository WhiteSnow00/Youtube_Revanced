import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asrq extends AtomicLong implements aujq, asic
{
    private static final long serialVersionUID = -4453897557930727610L;
    final asru a;
    final aujp b;
    Object c;
    final AtomicLong d;
    boolean e;
    boolean f;
    
    public asrq(final asru a, final aujp b) {
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
        if (athh.h(n) && atnp.j(this, n) != Long.MIN_VALUE) {
            atnp.i(this.d, n);
            this.a.d();
            this.a.i.b(this);
        }
    }
    
    public final void tq() {
        this.dispose();
    }
    
    public final boolean tx() {
        return this.get() == Long.MIN_VALUE;
    }
}
