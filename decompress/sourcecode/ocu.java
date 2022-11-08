import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocu extends afsx implements aftq
{
    public volatile aftq a;
    
    public ocu(final ListenableFuture listenableFuture, final aftq a) {
        super(listenableFuture);
        this.a = a;
        listenableFuture.addListener((Runnable)new nlk(this, 13), (Executor)afsl.a);
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
