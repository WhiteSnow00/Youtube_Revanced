import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odi extends afrm
{
    final /* synthetic */ Executor a;
    final /* synthetic */ afts b;
    
    public odi(final Executor a, final afts b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.b.awaitTermination(n, timeUnit);
    }
    
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
    
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }
    
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }
    
    public final void shutdown() {
        this.b.shutdown();
    }
    
    public final List shutdownNow() {
        return this.b.shutdownNow();
    }
    
    public final String toString() {
        return this.a.toString();
    }
}
