import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsj
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater a;
    private volatile int b;
    private final aupp c;
    
    static {
        a = AtomicIntegerFieldUpdater.newUpdater(atsj.class, "b");
    }
    
    public atsj(final boolean b, final aupp c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = (b ? 1 : 0);
    }
    
    public final boolean a() {
        return this.b != 0;
    }
    
    public final boolean b() {
        final boolean compareAndSet = atsj.a.compareAndSet(this, 0, 1);
        return (compareAndSet && this.c != atsn.a) || compareAndSet;
    }
    
    public final void c() {
        this.b = 1;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a());
    }
}
