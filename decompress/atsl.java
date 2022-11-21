import java.util.concurrent.atomic.AtomicLongFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsl
{
    @Deprecated
    public static final AtomicLongFieldUpdater a;
    public volatile long b;
    public final aupp c;
    
    static {
        a = AtomicLongFieldUpdater.newUpdater(atsl.class, "b");
    }
    
    public atsl(final long b, final aupp c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
    }
    
    public final long a(final long n) {
        return atsl.a.addAndGet(this, n);
    }
    
    public final boolean b(final long n, final long n2) {
        boolean compareAndSet;
        final boolean b = compareAndSet = atsl.a.compareAndSet(this, n, n2);
        if (b) {
            compareAndSet = b;
            if (this.c != atsn.a) {
                compareAndSet = true;
            }
        }
        return compareAndSet;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.b);
    }
}
