import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afuj extends afst implements RunnableFuture
{
    private volatile afto a;
    
    public afuj(final afrx afrx) {
        this.a = (afto)new afuh(this, afrx);
    }
    
    public afuj(final Callable callable) {
        this.a = (afto)new afui(this, callable);
    }
    
    public static afuj c(final afrx afrx) {
        return new afuj(afrx);
    }
    
    public static afuj d(final Callable callable) {
        return new afuj(callable);
    }
    
    public static afuj e(final Runnable runnable, final Object o) {
        return new afuj(Executors.callable(runnable, o));
    }
    
    protected final void b() {
        if (((afrl)this).l()) {
            final afto a = this.a;
            if (a != null) {
                a.h();
            }
        }
        this.a = null;
    }
    
    protected final String ns() {
        final afto a = this.a;
        if (a != null) {
            final String string = a.toString();
            final StringBuilder sb = new StringBuilder("task=[");
            sb.append(string);
            sb.append("]");
            return sb.toString();
        }
        return super.ns();
    }
    
    public final void run() {
        final afto a = this.a;
        if (a != null) {
            a.run();
        }
        this.a = null;
    }
}
