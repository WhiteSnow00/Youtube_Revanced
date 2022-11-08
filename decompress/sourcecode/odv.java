import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odv extends AbstractExecutorService
{
    public final ody a;
    public final oea b;
    public final oee c;
    public final boolean d;
    public final afts e;
    private final AtomicInteger f;
    private final ExecutorService g;
    private final odx h;
    
    public odv(final oea b, final oee c, final boolean d, final afts e, final ody a, final ExecutorService g, final odx h) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new AtomicInteger(1000);
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.g.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.c.c();
        if (odz.c()) {
            this.g.execute(new odu(this, runnable));
        }
        else {
            this.g.execute(runnable);
        }
        this.c.a();
        if (odz.c()) {
            final int a = this.h.a();
            this.c.b();
            if (a >= 1000) {
                while (true) {
                    final int value = this.f.get();
                    if (a < value) {
                        break;
                    }
                    if (!this.f.compareAndSet(value, value + value)) {
                        continue;
                    }
                    this.c.b();
                    final StringBuilder sb = new StringBuilder("Queue size of ");
                    sb.append(a);
                    sb.append(" exceeds starvation threshold of 1000");
                    odz.b(this.b, this.a.a(), new oeb(sb.toString()));
                }
            }
        }
    }
    
    @Override
    public final boolean isShutdown() {
        return this.g.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.g.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        this.g.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.g.shutdownNow();
    }
    
    @Override
    public final String toString() {
        final String string = this.g.toString();
        final StringBuilder sb = new StringBuilder("Monitoring[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
