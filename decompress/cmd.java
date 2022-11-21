import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class cmd implements ThreadFactory
{
    final boolean a;
    private final AtomicInteger b;
    
    public cmd(final boolean a) {
        this.a = a;
        this.b = new AtomicInteger(0);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        String s;
        if (!this.a) {
            s = "androidx.work-";
        }
        else {
            s = "WM.task-";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(this.b.incrementAndGet());
        return new Thread(runnable, sb.toString());
    }
}
