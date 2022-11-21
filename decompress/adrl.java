import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrl
{
    public final adgg a;
    private boolean b;
    private ListenableFuture c;
    private ScheduledFuture d;
    
    public adrl(final adgg a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = false;
        (this.a = a).P((Runnable)new adps(this, 5), (Executor)afwd.a);
    }
    
    public final void a() {
        synchronized (this) {
            this.b = true;
            final ListenableFuture c = this.c;
            if (c != null) {
                c.cancel(true);
            }
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(true);
            }
        }
    }
    
    public final void b(final ListenableFuture c) {
        synchronized (this) {
            this.c = c;
            if (this.b) {
                c.cancel(true);
            }
        }
    }
    
    public final void c(final ScheduledFuture d) {
        synchronized (this) {
            this.d = d;
            if (this.b) {
                d.cancel(true);
            }
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.b;
        }
    }
}
