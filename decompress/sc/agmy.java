import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import java.util.Map;
import com.google.firebase.messaging.FirebaseMessaging;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmy
{
    private static final long e;
    public final agmn a;
    public final FirebaseMessaging b;
    public final Map c;
    public final agmx d;
    private final Context f;
    private final agmq g;
    private final ScheduledExecutorService h;
    private boolean i;
    
    static {
        e = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public agmy(final FirebaseMessaging b, final agmq g, final agmx d, final agmn a, final Context f, final ScheduledExecutorService h) {
        this.c = new abh();
        this.i = false;
        this.b = b;
        this.g = g;
        this.d = d;
        this.a = a;
        this.f = f;
        this.h = h;
    }
    
    public static nnc a(final FirebaseMessaging firebaseMessaging, final agmq agmq, final agmn agmn, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return nnv.a((Executor)scheduledExecutorService, (Callable)new iii(context, scheduledExecutorService, firebaseMessaging, agmq, agmn, 7));
    }
    
    public static void c(final nnc ex) {
        try {
            nnv.e((nnc)ex, 30L, TimeUnit.SECONDS);
        }
        catch (final TimeoutException ex) {
            goto Label_0017;
        }
        catch (final InterruptedException ex2) {}
        catch (final ExecutionException ex3) {
            final Throwable cause = ex3.getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException(ex3);
        }
    }
    
    final nnc b(final agmw agmw) {
        this.d.c(agmw);
        final nns nns = new nns();
        synchronized (this.c) {
            final String c = agmw.c;
            ArrayDeque<?> arrayDeque;
            if (this.c.containsKey(c)) {
                arrayDeque = this.c.get(c);
            }
            else {
                arrayDeque = new ArrayDeque<Object>();
                this.c.put(c, arrayDeque);
            }
            arrayDeque.add(nns);
            monitorexit(this.c);
            return (nnc)nns.a;
        }
    }
    
    final void d(final Runnable runnable, final long n) {
        this.h.schedule(runnable, n, TimeUnit.SECONDS);
    }
    
    final void e(final boolean i) {
        synchronized (this) {
            this.i = i;
        }
    }
    
    public final void f() {
        if (this.d.a() != null && !this.h()) {
            this.g(0L);
        }
    }
    
    final void g(final long n) {
        this.d(new agna(this, this.f, this.g, Math.min(Math.max(30L, n + n), agmy.e)), n);
        this.e(true);
    }
    
    final boolean h() {
        synchronized (this) {
            return this.i;
        }
    }
}
