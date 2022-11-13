import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class bj extends rf
{
    final AtomicReference a;
    
    public bj(final AtomicReference a) {
        this.a = a;
    }
    
    public final void a() {
        throw null;
    }
    
    public final void b(final Object o) {
        final rf rf = this.a.get();
        if (rf != null) {
            rf.b(o);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
