import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asrf extends AtomicLong implements aujq
{
    private static final long serialVersionUID = 2845000326761540265L;
    final aujp a;
    final asrg b;
    long c;
    
    public asrf(final aujp a, final asrg b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.get() == Long.MIN_VALUE;
    }
    
    public final void e(final long n) {
        atnp.j(this, n);
        this.b.d();
    }
    
    public final void tq() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.g(this);
            this.b.d();
        }
    }
}
