import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmq implements ListenableFuture
{
    public final ctn a;
    private final atut b;
    
    public cmq(final atut b, final ctn a) {
        this.b = b;
        this.a = a;
        b.tL((atqd)new atno(this, 1));
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.a.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        return this.a.cancel(b);
    }
    
    public final Object get() {
        return this.a.get();
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.a.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }
    
    public final boolean isDone() {
        return this.a.isDone();
    }
}
