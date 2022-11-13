import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aah extends aag implements ScheduledFuture
{
    public aah(final Throwable t) {
        super(t);
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final Delayed delayed = (Delayed)o;
        return -1;
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return 0L;
    }
}
