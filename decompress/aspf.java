import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspf extends AtomicInteger implements asjz
{
    private static final long serialVersionUID = -8360547806504310570L;
    final asjz a;
    final AtomicBoolean b;
    final aslm c;
    
    public aspf(final asjz a, final AtomicBoolean b, final aslm c, final int n) {
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
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        this.c.c(asln);
    }
    
    @Override
    public final void tw() {
        if (this.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.tw();
        }
    }
}
