import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgl extends asid implements athg
{
    static final atgk b;
    static final athc c;
    static final int d;
    static final atha g;
    final ThreadFactory e;
    final AtomicReference f;
    
    static {
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int intValue = Integer.getInteger("rx2.computation-threads", 0);
        int d2 = availableProcessors;
        if (intValue > 0 && intValue <= (d2 = availableProcessors)) {
            d2 = intValue;
        }
        d = d2;
        (g = new atha((ThreadFactory)new athc("RxComputationShutdown"))).dispose();
        (b = new atgk(0, (ThreadFactory)(c = new athc("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5))), true)))).a();
    }
    
    public atgl() {
        final athc c = atgl.c;
        this.e = (ThreadFactory)c;
        final atgk b = atgl.b;
        final AtomicReference f = new AtomicReference(b);
        this.f = f;
        final atgk atgk = new atgk(atgl.d, (ThreadFactory)c);
        while (!f.compareAndSet((Object)b, (Object)atgk)) {
            if (f.get() != b) {
                atgk.a();
            }
        }
    }
    
    @Override
    public final asic a() {
        return (asic)new atgj(this.f.get().c());
    }
    
    public final void b(final int n, final ateg ateg) {
        askk.c(n, "number > 0 required");
        this.f.get().b(n, ateg);
    }
    
    @Override
    public final asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.f.get().c().f(runnable, n, timeUnit);
    }
    
    @Override
    public final asir d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.f.get().c().g(runnable, n, n2, timeUnit);
    }
}
