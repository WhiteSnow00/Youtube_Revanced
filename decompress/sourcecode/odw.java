import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odw implements ThreadFactory
{
    private final ody a;
    private final oea b;
    private final AtomicInteger c;
    
    public odw(final oea b, final ThreadFactory threadFactory) {
        this.b = b;
        this.a = new ody(threadFactory);
        this.c = new AtomicInteger(1000);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.a.newThread(runnable);
        if (odz.c()) {
            Object a = this.a;
            synchronized (a) {
                final int size = ((ody)a).a.size();
                monitorexit(a);
                if (size >= 1000) {
                    while (true) {
                        final int value = this.c.get();
                        if (size < value) {
                            break;
                        }
                        if (!this.c.compareAndSet(value, value + value)) {
                            continue;
                        }
                        a = new StringBuilder("Number of blocking threads ");
                        ((StringBuilder)a).append(size);
                        ((StringBuilder)a).append(" exceeds starvation threshold of 1000");
                        a = new oed(((StringBuilder)a).toString());
                        odz.b(this.b, this.a.a(), (RuntimeException)a);
                    }
                }
            }
        }
        return thread;
    }
}
