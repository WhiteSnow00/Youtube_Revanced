import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afwo extends affg implements Future, ListenableFuture
{
    protected afwo() {
    }
    
    @Override
    protected /* bridge */ Object a() {
        throw null;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.rA().addListener(runnable, executor);
    }
    
    @Override
    public boolean cancel(final boolean b) {
        return this.rB().cancel(b);
    }
    
    @Override
    public Object get() {
        return this.rB().get();
    }
    
    @Override
    public Object get(final long n, final TimeUnit timeUnit) {
        return this.rB().get(n, timeUnit);
    }
    
    @Override
    public final boolean isCancelled() {
        return this.rB().isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.rB().isDone();
    }
    
    protected abstract ListenableFuture rA();
    
    protected /* bridge */ Future rB() {
        throw null;
    }
}
