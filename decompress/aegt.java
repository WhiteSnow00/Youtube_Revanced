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

public final class aegt
{
    static final Intent a;
    public static final aefs c;
    private static volatile aegt d;
    final ServiceConnection b;
    private final Context e;
    private final AtomicReference f;
    private volatile arjd g;
    
    static {
        c = new aefs("SetupCompatServiceProvider");
        a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    }
    
    public aegt(final Context context) {
        this.b = (ServiceConnection)new aegs(this);
        this.g = new arjd(1);
        this.f = new AtomicReference();
        this.e = context.getApplicationContext();
    }
    
    public static aegh a(final Context context, final long n, final TimeUnit timeUnit) {
        aegu.l(context, "Context object cannot be null.");
        aegt d;
        if ((d = aegt.d) == null) {
            synchronized (aegt.class) {
                if ((d = aegt.d) == null) {
                    d = new aegt(context.getApplicationContext());
                    (aegt.d = d).c();
                }
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
        final arjd e = d.e();
        switch (e.a - 1) {
            default: {
                aegt.c.f("NOT_STARTED state only possible before instance is created.");
                return null;
            }
            case 6: {
                d.c();
                return d.d(n, timeUnit);
            }
            case 3: {
                return (aegh)e.b;
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
                if (this.e.bindService(aegt.a, this.b, 1)) {
                    if (this.g.a != 4) {
                        this.b(new arjd(3));
                    }
                    return;
                }
            }
            catch (final SecurityException ex) {
                aegt.c.d("Unable to bind to compat service. ".concat(ex.toString()));
            }
            this.b(new arjd(2));
            aegt.c.d("Context#bindService did not succeed.");
        }
    }
    
    private final aegh d(final long n, final TimeUnit timeUnit) {
        final arjd e = this.e();
        if (e.a == 4) {
            return (aegh)e.b;
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
            final arjd e2 = this.e();
            String.format("Finished waiting for service to get connected. Current state = %s", aegu.i(e2.a));
            return (aegh)e2.b;
        }
        this.c();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", n, timeUnit));
    }
    
    private final arjd e() {
        synchronized (this) {
            return this.g;
        }
    }
    
    final void b(final arjd g) {
        String.format("State changed: %s -> %s", aegu.i(this.g.a), aegu.i(g.a));
        this.g = g;
        final CountDownLatch countDownLatch = this.f.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
