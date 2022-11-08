import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ator
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater a;
    private volatile int b;
    private final auet c;
    
    static {
        a = AtomicIntegerFieldUpdater.newUpdater(ator.class, "b");
    }
    
    public ator(final boolean b, final auet c, final byte[] array) {
        this.c = c;
        this.b = (b ? 1 : 0);
    }
    
    public final boolean a() {
        return this.b != 0;
    }
    
    public final boolean b() {
        final boolean compareAndSet = ator.a.compareAndSet(this, 0, 1);
        return (compareAndSet && this.c != atov.a) || compareAndSet;
    }
    
    public final void c() {
        this.b = 1;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a());
    }
}
