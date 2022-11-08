import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public class aftv extends afrm
{
    private final ExecutorService a;
    
    public aftv(final ExecutorService a) {
        a.getClass();
        this.a = a;
    }
    
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.a.awaitTermination(n, timeUnit);
    }
    
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
    
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }
    
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }
    
    public final void shutdown() {
        this.a.shutdown();
    }
    
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }
    
    public final String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
