import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class asfi extends asfh
{
    private final AtomicIntegerFieldUpdater a;
    
    public asfi(final AtomicIntegerFieldUpdater a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final asfk asfk) {
        return this.a.compareAndSet(asfk, 0, -1);
    }
    
    @Override
    public final void b(final asfk asfk) {
        this.a.set(asfk, 0);
    }
}
