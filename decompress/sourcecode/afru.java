import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class afru extends afrt
{
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;
    
    public afru(final AtomicReferenceFieldUpdater a, final AtomicIntegerFieldUpdater b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final afrw afrw) {
        return this.b.decrementAndGet(afrw);
    }
    
    public final void b(final afrw afrw, final Set set) {
        final AtomicReferenceFieldUpdater a = this.a;
        while (!a.compareAndSet(afrw, null, set)) {
            if (a.get(afrw) != null) {
                return;
            }
        }
    }
}
