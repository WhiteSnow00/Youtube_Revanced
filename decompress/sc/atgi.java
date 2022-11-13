import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

class atgi extends AtomicReference implements asir
{
    protected static final FutureTask a;
    protected static final FutureTask b;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;
    
    static {
        a = new FutureTask(askj.b, null);
        b = new FutureTask(askj.b, null);
    }
    
    public atgi(final Runnable c) {
        this.c = c;
    }
    
    public final void a(final Future future) {
        Future future2;
        do {
            future2 = this.get();
            if (future2 == atgi.a) {
                break;
            }
            if (future2 == atgi.b) {
                future.cancel(this.d != Thread.currentThread());
            }
        } while (!this.compareAndSet(future2, future));
    }
    
    @Override
    public final void dispose() {
        final Future future = this.get();
        if (future != atgi.a) {
            final FutureTask b = atgi.b;
            if (future != b && this.compareAndSet((FutureTask)future, b) && future != null) {
                future.cancel(this.d != Thread.currentThread());
            }
        }
    }
    
    @Override
    public final boolean tA() {
        final Future future = this.get();
        return future == atgi.a || future == atgi.b;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.c);
    }
}
