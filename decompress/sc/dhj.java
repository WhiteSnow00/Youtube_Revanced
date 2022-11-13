import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhj implements ThreadFactory
{
    public final boolean a;
    private final ThreadFactory b;
    private final String c;
    private final AtomicInteger d;
    
    public dhj(final ThreadFactory b, final String c, final boolean a) {
        this.d = new AtomicInteger();
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.b.newThread(new coh(this, runnable, 10));
        final String c = this.c;
        final int andIncrement = this.d.getAndIncrement();
        final StringBuilder sb = new StringBuilder("glide-");
        sb.append(c);
        sb.append("-thread-");
        sb.append(andIncrement);
        thread.setName(sb.toString());
        return thread;
    }
}
