import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewn implements Runnable
{
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ afts d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ oas g;
    
    public aewn(final SettableFuture a, final Runnable b, final AtomicReference c, final afts d, final long e, final long f, final oas g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        try {
            if (this.a.isDone()) {
                return;
            }
            this.b.run();
            final SettableFuture create = SettableFuture.create();
            this.c.set(create);
            if (this.a.isDone()) {
                return;
            }
            final afts d = this.d;
            final long e = this.e;
            final long f = this.f;
            final long d2 = this.g.d();
            long n;
            if (d2 < e) {
                n = e + f - d2;
            }
            else {
                n = f - (d2 - e) % f;
            }
            create.setFuture((ListenableFuture)d.e((Runnable)this, n, TimeUnit.MILLISECONDS));
        }
        finally {
            final Throwable exception;
            this.a.setException(exception);
        }
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
