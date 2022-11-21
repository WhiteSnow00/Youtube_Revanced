import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvm extends afvl
{
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;
    
    public afvm(final AtomicReferenceFieldUpdater a, final AtomicIntegerFieldUpdater b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final afvo afvo) {
        return this.b.decrementAndGet(afvo);
    }
    
    @Override
    public final void b(final afvo afvo, final Set set) {
        final AtomicReferenceFieldUpdater a = this.a;
        while (!a.compareAndSet(afvo, null, set)) {
            if (a.get(afvo) != null) {
                return;
            }
        }
    }
}
