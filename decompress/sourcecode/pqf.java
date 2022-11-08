import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class pqf extends afsx implements aftq
{
    private final long a;
    private final /* synthetic */ int c;
    
    public pqf(final ListenableFuture listenableFuture, final long a, final int c) {
        this.c = c;
        super(listenableFuture);
        this.a = a;
    }
    
    public pqf(final ListenableFuture listenableFuture, final long a, final int c, final byte[] array) {
        this.c = c;
        super(listenableFuture);
        this.a = a;
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        if (this.c != 0) {
            return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
        }
        return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
