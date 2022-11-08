import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdi
{
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final aeyn g;
    
    public asdi(final Runnable c, final Executor b, final ScheduledExecutorService a, final aeyn g) {
        this.c = c;
        this.b = b;
        this.a = a;
        (this.g = g).f();
    }
    
    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
