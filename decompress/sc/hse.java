import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hse implements zpf
{
    public final zpf a;
    private final AtomicBoolean b;
    
    public hse(final zpf a) {
        this.b = new AtomicBoolean(false);
        this.a = a;
    }
    
    private final void d(final Runnable runnable) {
        if (this.b.get()) {
            return;
        }
        if (this.b.compareAndSet(false, true)) {
            runnable.run();
        }
    }
    
    public final void a(final dbj dbj) {
        this.d((Runnable)new hir(this, dbj, 10));
    }
    
    public final void mX(final Object o) {
        this.d((Runnable)new hir(this, o, 11));
    }
    
    public final void mY() {
    }
}
