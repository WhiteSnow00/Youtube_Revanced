import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxj
{
    public static volatile asjc a;
    public static volatile asjc b;
    
    private arxj() {
    }
    
    public static asic a() {
        return c(asju.b);
    }
    
    public static asic b(final asir asir) {
        asjv.b((Object)asir, "run is null");
        return (asic)new asia(asir);
    }
    
    public static asic c(final Runnable runnable) {
        asjv.b((Object)runnable, "run is null");
        return (asic)new asie(runnable);
    }
    
    public static final atpu d(final Executor executor) {
        executor.getClass();
        if (executor instanceof atqk) {
            final atqk atqk = (atqk)executor;
        }
        return (atpu)new atqt(executor);
    }
    
    public static final atqs e(final ExecutorService executorService) {
        return new atqt(executorService);
    }
    
    public static final CancellationException f(final String s, final Throwable t) {
        final CancellationException ex = new CancellationException(s);
        ex.initCause(t);
        return ex;
    }
    
    public static final Object g(final Throwable t) {
        return new atjq(t);
    }
    
    public static final void h(final Object o) {
        if (!(o instanceof atjq)) {
            return;
        }
        throw ((atjq)o).a;
    }
}
