import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atos
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater b;
    public volatile int a;
    private final auet c;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(atos.class, "a");
    }
    
    public atos(final auet c, final byte[] array) {
        this.c = c;
        this.a = 0;
    }
    
    public final boolean a(final int n, final int n2) {
        boolean compareAndSet;
        final boolean b = compareAndSet = atos.b.compareAndSet(this, n, n2);
        if (b) {
            compareAndSet = b;
            if (this.c != atov.a) {
                compareAndSet = true;
            }
        }
        return compareAndSet;
    }
    
    public final void b() {
        atos.b.incrementAndGet(this);
    }
    
    public final void c() {
        atos.b.decrementAndGet(this);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
