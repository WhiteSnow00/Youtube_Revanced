import android.util.Log;
import java.util.logging.Level;
import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afky extends afkq
{
    public static final AtomicReference a;
    private static final AtomicLong b;
    private static final ConcurrentLinkedQueue c;
    private volatile afjp d;
    
    static {
        a = new AtomicReference();
        b = new AtomicLong();
        c = new ConcurrentLinkedQueue();
    }
    
    public afky(String fingerprint) {
        super(fingerprint);
        fingerprint = Build.FINGERPRINT;
        boolean b = false;
        final boolean b2 = fingerprint == null || "robolectric".equals(Build.FINGERPRINT);
        final boolean b3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            b = true;
        }
        if (b2 || b3) {
            this.d = new afkr().a(this.a());
            return;
        }
        if (b) {
            final afla afla = new afla();
            this.d = new afla(Level.OFF, afla.a, afla.b).a(this.a());
            return;
        }
        this.d = null;
    }
    
    public static void e() {
        while (true) {
            final afky afky = afkx.a.poll();
            if (afky == null) {
                break;
            }
            afky.d = afky.a.get().a(afky.a());
        }
        f();
    }
    
    private static void f() {
        while (true) {
            final aseo aseo = afky.c.poll();
            if (aseo == null) {
                break;
            }
            afky.b.getAndDecrement();
            final Object b = aseo.b;
            final Object a = aseo.a;
            if (!((afjo)a).A() && !((afjp)b).d(((afjo)a).n())) {
                continue;
            }
            ((afjp)b).c((afjo)a);
        }
    }
    
    public final void b(final RuntimeException ex, final afjo afjo) {
        if (this.d != null) {
            this.d.b(ex, afjo);
            return;
        }
        Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", (Throwable)ex);
    }
    
    public final void c(final afjo afjo) {
        if (this.d != null) {
            this.d.c(afjo);
            return;
        }
        if (afky.b.incrementAndGet() > 20L) {
            afky.c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        afky.c.offer(new aseo((afjp)this, afjo));
        if (this.d != null) {
            f();
        }
    }
    
    public final boolean d(final Level level) {
        return this.d == null || this.d.d(level);
    }
}
