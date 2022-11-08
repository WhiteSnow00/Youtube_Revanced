import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqe extends afsx implements aftq
{
    public volatile aftq a;
    
    public pqe(final ListenableFuture listenableFuture, final aftq a) {
        super(listenableFuture);
        this.a = a;
        listenableFuture.addListener((Runnable)new ovk(this, 16), (Executor)afsl.a);
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
