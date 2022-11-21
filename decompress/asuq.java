import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asuq extends AtomicLong implements aunb
{
    private static final long serialVersionUID = 2845000326761540265L;
    final auna a;
    final asur b;
    long c;
    
    public asuq(final auna a, final asur b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.get() == Long.MIN_VALUE;
    }
    
    @Override
    public final void e(final long n) {
        auop.B((AtomicLong)this, n);
        this.b.d();
    }
    
    @Override
    public final void ts() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.g(this);
            this.b.d();
        }
    }
}
