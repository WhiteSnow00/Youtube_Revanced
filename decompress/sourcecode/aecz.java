import java.util.concurrent.TimeoutException;
import java.util.concurrent.CountDownLatch;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecz
{
    static final Intent a;
    public static final aeby c;
    private static volatile aecz d;
    final ServiceConnection b;
    private final Context e;
    private final AtomicReference f;
    private volatile ardu g;
    
    static {
        c = new aeby("SetupCompatServiceProvider");
        a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    }
    
    public aecz(final Context context) {
        this.b = (ServiceConnection)new aecy(this);
        this.g = new ardu(1);
        this.f = new AtomicReference();
        this.e = context.getApplicationContext();
    }
    
    public static aecn a(final Context context, final long n, final TimeUnit timeUnit) {
        aeda.g(context, "Context object cannot be null.");
        aecz d;
        if ((d = aecz.d) == null) {
            synchronized (aecz.class) {
                if ((d = aecz.d) == null) {
                    d = new aecz(context.getApplicationContext());
                    (aecz.d = d).c();
                }
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
        final ardu e = d.e();
        switch (e.a - 1) {
            default: {
                aecz.c.e("NOT_STARTED state only possible before instance is created.");
                return null;
            }
            case 6: {
                d.c();
                return d.d(n, timeUnit);
            }
            case 3: {
                return (aecn)e.b;
            }
            case 2:
            case 4: {
                return d.d(n, timeUnit);
            }
            case 1:
            case 5: {
                return null;
            }
        }
    }
    
    private final void c() {
        synchronized (this) {
            final int a = this.e().a;
            if (a == 4) {
                return;
            }
            if (a != 1) {
                this.e.unbindService(this.b);
            }
            try {
                if (this.e.bindService(aecz.a, this.b, 1)) {
                    if (this.g.a != 4) {
                        this.b(new ardu(3));
                    }
                    return;
                }
            }
            catch (final SecurityException ex) {
                aecz.c.c("Unable to bind to compat service. ".concat(ex.toString()));
            }
            this.b(new ardu(2));
            aecz.c.c("Context#bindService did not succeed.");
        }
    }
    
    private final aecn d(final long n, final TimeUnit timeUnit) {
        final ardu e = this.e();
        if (e.a == 4) {
            return (aecn)e.b;
        }
        CountDownLatch countDownLatch = null;
    Label_0078:
        while ((countDownLatch = this.f.get()) == null) {
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            final AtomicReference f = this.f;
            do {
                countDownLatch = countDownLatch2;
                if (!f.compareAndSet(null, countDownLatch2)) {
                    continue;
                }
                break Label_0078;
            } while (f.get() == null);
        }
        if (countDownLatch.await(n, timeUnit)) {
            final ardu e2 = this.e();
            String.format("Finished waiting for service to get connected. Current state = %s", aeda.d(e2.a));
            return (aecn)e2.b;
        }
        this.c();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", n, timeUnit));
    }
    
    private final ardu e() {
        synchronized (this) {
            return this.g;
        }
    }
    
    final void b(final ardu g) {
        String.format("State changed: %s -> %s", aeda.d(this.g.a), aeda.d(g.a));
        this.g = g;
        final CountDownLatch countDownLatch = this.f.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
