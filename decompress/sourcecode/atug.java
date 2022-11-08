import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class atug implements ListenableFuture
{
    public final SettableFuture a;
    public boolean b;
    private final atrb c;
    
    public atug(final atrb c) {
        this.c = c;
        this.a = SettableFuture.create();
    }
    
    private static final void a(final Object o) {
        if (!(o instanceof atuf)) {
            return;
        }
        throw new CancellationException().initCause(((atuf)o).a);
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        this.a.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        if (this.a.cancel(b)) {
            aqql.r(this.c);
            return true;
        }
        return false;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        a(value);
        return value;
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        timeUnit.getClass();
        final Object value = this.a.get(n, timeUnit);
        a(value);
        return value;
    }
    
    public final boolean isCancelled() {
        if (this.a.isCancelled() || (!this.isDone() || this.b)) {
            goto Label_0061;
        }
        try {
            if (afva.a((Future)this.a) instanceof atuf) {
                goto Label_0061;
            }
            goto Label_0057;
        }
        catch (final ExecutionException ex) {
            this.b = true;
        }
        catch (final CancellationException ex2) {
            goto Label_0061;
        }
    }
    
    public final boolean isDone() {
        return this.a.isDone();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.isDone()) {
            try {
                final Object a = afva.a((Future)this.a);
                if (a instanceof atuf) {
                    final CancellationException a2 = ((atuf)a).a;
                    final StringBuilder sb2 = new StringBuilder("CANCELLED, cause=[");
                    sb2.append(a2);
                    sb2.append("]");
                    sb.append(sb2.toString());
                }
                else {
                    final StringBuilder sb3 = new StringBuilder("SUCCESS, result=[");
                    sb3.append(a);
                    sb3.append("]");
                    sb.append(sb3.toString());
                }
            }
            catch (final ExecutionException ex) {
                final Throwable cause = ex.getCause();
                final StringBuilder sb4 = new StringBuilder("FAILURE, cause=[");
                sb4.append(cause);
                sb4.append("]");
                sb.append(sb4.toString());
            }
            catch (final CancellationException ex2) {
                sb.append("CANCELLED");
            }
            finally {
                final StringBuilder sb5 = new StringBuilder("UNKNOWN, cause=[");
                final Throwable t;
                sb5.append(t.getClass());
                sb5.append(" thrown from get()]");
                sb.append(sb5.toString());
            }
        }
        else {
            final SettableFuture a3 = this.a;
            final StringBuilder sb6 = new StringBuilder("PENDING, delegate=[");
            sb6.append(a3);
            sb6.append("]");
            sb.append(sb6.toString());
        }
        sb.append(']');
        return sb.toString();
    }
}
