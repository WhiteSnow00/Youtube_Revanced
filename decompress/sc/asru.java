import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asru extends AtomicLong implements aukg
{
    private static final long serialVersionUID = 2845000326761540265L;
    final aukf a;
    final asrv b;
    long c;
    
    public asru(final aukf a, final asrv b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.get() == Long.MIN_VALUE;
    }
    
    public final void e(final long n) {
        asfn.x(this, n);
        this.b.d();
    }
    
    public final void tt() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.g(this);
            this.b.d();
        }
    }
}
