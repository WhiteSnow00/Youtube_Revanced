import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class odl extends afrl implements Runnable, aftq
{
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d;
    Runnable e;
    final /* synthetic */ odn f;
    
    public odl(final odn f, final Runnable e, final long a, final long b, final boolean c) {
        this.f = f;
        this.d = new AtomicLong(0L);
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final long c() {
        return Math.max(0L, this.d.get() * this.b + this.a - this.f.a.d());
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return timeUnit.convert(this.c(), TimeUnit.MILLISECONDS);
    }
    
    public final void run() {
        if (this.isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                this.f.b.postDelayed((Runnable)this, this.c());
                return;
            }
            this.f.b.postDelayed((Runnable)this, this.b);
        }
        finally {
            this.e = null;
            final Throwable exception;
            this.setException(exception);
        }
    }
}
