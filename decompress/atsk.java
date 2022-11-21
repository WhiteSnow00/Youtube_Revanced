import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsk
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater b;
    public volatile int a;
    private final aupp c;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(atsk.class, "a");
    }
    
    public atsk(final aupp c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = 0;
    }
    
    public final boolean a(final int n, final int n2) {
        boolean compareAndSet;
        final boolean b = compareAndSet = atsk.b.compareAndSet(this, n, n2);
        if (b) {
            compareAndSet = b;
            if (this.c != atsn.a) {
                compareAndSet = true;
            }
        }
        return compareAndSet;
    }
    
    public final void b() {
        atsk.b.incrementAndGet(this);
    }
    
    public final void c() {
        atsk.b.decrementAndGet(this);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
