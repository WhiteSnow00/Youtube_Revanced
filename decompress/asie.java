import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class asie extends asid
{
    private final AtomicIntegerFieldUpdater a;
    
    public asie(final AtomicIntegerFieldUpdater a) {
        this.a = a;
    }
    
    public final boolean a(final asig asig) {
        return this.a.compareAndSet(asig, 0, -1);
    }
    
    public final void b(final asig asig) {
        this.a.set(asig, 0);
    }
}
