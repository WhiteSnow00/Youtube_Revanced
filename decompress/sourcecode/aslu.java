import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslu extends AtomicInteger implements asgo
{
    private static final long serialVersionUID = -8360547806504310570L;
    final asgo a;
    final AtomicBoolean b;
    final asib c;
    
    public aslu(final asgo a, final AtomicBoolean b, final asib c, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.lazySet(n);
    }
    
    public final void b(final Throwable t) {
        this.c.dispose();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        this.c.c(asic);
    }
    
    public final void tu() {
        if (this.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.tu();
        }
    }
}
