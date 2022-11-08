import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class odm extends afrl implements Runnable, aftq
{
    final /* synthetic */ odn a;
    private Callable b;
    private final long c;
    
    public odm(final odn a, final Callable b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.d(), timeUnit));
    }
    
    public final void run() {
        if (this.isDone()) {
            return;
        }
        try {
            final Callable b = this.b;
            this.b = null;
            this.set(b.call());
        }
        finally {
            final Throwable exception;
            this.setException(exception);
            throw new RuntimeException(exception);
        }
    }
}
