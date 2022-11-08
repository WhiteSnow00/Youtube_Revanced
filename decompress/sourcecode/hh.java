import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class hh implements hj
{
    final AtomicBoolean a;
    final /* synthetic */ hj b;
    final bkh c;
    private final Executor d;
    private final Runnable e;
    
    public hh(final hj b) {
        this.b = b;
        this.c = new bkh((byte[])null, (byte[])null, (byte[])null);
        this.d = AsyncTask.THREAD_POOL_EXECUTOR;
        this.a = new AtomicBoolean(false);
        this.e = (Runnable)new hg(this);
    }
    
    private final void c() {
        if (this.a.compareAndSet(false, true)) {
            this.d.execute(this.e);
        }
    }
    
    public final void a(final hi hi) {
        this.c.l(hi);
        this.c();
    }
    
    public final void b(final hi b) {
        final bkh c = this.c;
        synchronized (c.a) {
            b.a = (hi)c.b;
            c.b = b;
            monitorexit(c.a);
            this.c();
        }
    }
    
    public final void d(final rk rk) {
        this.a(hi.b(4, 0, (Object)rk));
    }
}
