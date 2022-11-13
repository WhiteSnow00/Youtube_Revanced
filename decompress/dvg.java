import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvg implements ThreadFactory
{
    private static final AtomicInteger b;
    public final int a;
    private final AtomicInteger c;
    private final int d;
    
    static {
        b = new AtomicInteger(1);
    }
    
    public dvg(final int a) {
        this.c = new AtomicInteger(1);
        this.a = a;
        this.d = dvg.b.getAndIncrement();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final coh coh = new coh(this, runnable, 15);
        final int d = this.d;
        final int andIncrement = this.c.getAndIncrement();
        final StringBuilder sb = new StringBuilder("ComponentLayoutThread");
        sb.append(d);
        sb.append("-");
        sb.append(andIncrement);
        final Thread thread = new Thread((Runnable)coh, sb.toString());
        thread.setPriority(10);
        return thread;
    }
}
