import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class oxj implements Future
{
    final /* synthetic */ oxk a;
    
    public oxj(final oxk a) {
        this.a = a;
    }
    
    public final Integer a() {
        synchronized (this) {
            if (this.a.b == null) {
                this.wait();
            }
            return this.a.b;
        }
    }
    
    public final Integer b(final long n, final TimeUnit timeUnit) {
        synchronized (this) {
            if (this.a.b == null) {
                this.wait(timeUnit.toMillis(n));
            }
            return this.a.b;
        }
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return false;
    }
    
    @Override
    public final boolean isCancelled() {
        return false;
    }
    
    @Override
    public final boolean isDone() {
        synchronized (this) {
            final Integer b = this.a.b;
            monitorexit(this);
            return b != null;
        }
    }
}
