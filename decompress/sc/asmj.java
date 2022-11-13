import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmj extends AtomicInteger implements ashd
{
    private static final long serialVersionUID = -8360547806504310570L;
    final ashd a;
    final AtomicBoolean b;
    final asiq c;
    
    public asmj(final ashd a, final AtomicBoolean b, final asiq c, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.lazySet(n);
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.dispose();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        this.c.c(asir);
    }
    
    @Override
    public final void tx() {
        if (this.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.tx();
        }
    }
}
