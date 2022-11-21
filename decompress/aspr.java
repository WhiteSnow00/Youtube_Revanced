import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspr implements asjz
{
    private final aslm a;
    private final AtomicBoolean b;
    private final asjz c;
    
    public aspr(final aslm a, final AtomicBoolean b, final asjz c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        this.a.c(asln);
    }
    
    @Override
    public final void tw() {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.tw();
        }
    }
}
