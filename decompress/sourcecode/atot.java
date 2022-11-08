import java.util.concurrent.atomic.AtomicLongFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atot
{
    @Deprecated
    public static final AtomicLongFieldUpdater a;
    public volatile long b;
    public final auet c;
    
    static {
        a = AtomicLongFieldUpdater.newUpdater(atot.class, "b");
    }
    
    public atot(final long b, final auet c, final byte[] array) {
        this.c = c;
        this.b = b;
    }
    
    public final long a(final long n) {
        return atot.a.addAndGet(this, n);
    }
    
    public final boolean b(final long n, final long n2) {
        boolean compareAndSet;
        final boolean b = compareAndSet = atot.a.compareAndSet(this, n, n2);
        if (b) {
            compareAndSet = b;
            if (this.c != atov.a) {
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
