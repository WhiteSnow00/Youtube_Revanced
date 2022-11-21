import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwg implements Runnable
{
    public final afyc a;
    public final SettableFuture b;
    public final ListenableFuture c;
    public final ListenableFuture d;
    public final afwj e;
    
    public afwg(final afyc a, final SettableFuture b, final ListenableFuture c, final ListenableFuture d, final afwj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final afyc a = this.a;
        final SettableFuture b = this.b;
        final ListenableFuture c = this.c;
        final ListenableFuture d = this.d;
        final afwj e = this.e;
        if (((afvd)a).isDone()) {
            ((afvd)b).setFuture(c);
            return;
        }
        if (d.isCancelled() && e.compareAndSet(afwi.a, afwi.b)) {
            ((afvd)a).cancel(false);
        }
    }
}
