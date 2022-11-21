import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxe implements ListenableFuture
{
    public static final ListenableFuture a;
    private static final Logger c;
    public final Object b;
    
    static {
        a = (ListenableFuture)new afxe(null);
        c = Logger.getLogger(afxe.class.getName());
    }
    
    public afxe(final Object b) {
        this.b = b;
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger c = afxe.c;
            final Level severe = Level.SEVERE;
            final String string = runnable.toString();
            final String string2 = executor.toString();
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(string);
            sb.append(" with executor ");
            sb.append(string2);
            c.logp(severe, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), ex);
        }
    }
    
    public final boolean cancel(final boolean b) {
        return false;
    }
    
    public final Object get() {
        return this.b;
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b;
    }
    
    public final boolean isCancelled() {
        return false;
    }
    
    public final boolean isDone() {
        return true;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(value);
        sb.append("]]");
        return sb.toString();
    }
}
