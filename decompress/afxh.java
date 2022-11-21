import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.FutureTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxh extends FutureTask implements ListenableFuture
{
    private final afwf a;
    
    public afxh(final Runnable runnable) {
        super(runnable, null);
        this.a = new afwf();
    }
    
    public afxh(final Callable callable) {
        super(callable);
        this.a = new afwf();
    }
    
    public static afxh a(final Callable callable) {
        return new afxh(callable);
    }
    
    public static afxh b(final Runnable runnable) {
        return new afxh(runnable);
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        final afwf a = this.a;
        runnable.getClass();
        executor.getClass();
        synchronized (a) {
            if (!a.a) {
                a.b = new agop(runnable, executor, a.b, null);
                return;
            }
            monitorexit(a);
            afwf.a(runnable, executor);
        }
    }
    
    @Override
    protected final void done() {
        Object o = this.a;
        monitorenter(o);
        try {
            if (((afwf)o).a) {
                monitorexit(o);
                return;
            }
            ((afwf)o).a = true;
            Object b = ((afwf)o).b;
            Object c = null;
            ((afwf)o).b = null;
            monitorexit(o);
            while (true) {
                o = c;
                if (b == null) {
                    break;
                }
                final agop agop = (agop)b;
                o = agop.c;
                agop.c = c;
                c = b;
                b = o;
            }
            while (o != null) {
                final agop agop2 = (agop)o;
                afwf.a((Runnable)agop2.b, (Executor)agop2.a);
                o = agop2.c;
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        final long nanos = timeUnit.toNanos(n);
        if (nanos <= 2147483647999999999L) {
            return super.get(n, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
