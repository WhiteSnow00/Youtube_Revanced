import android.util.Log;
import java.util.logging.Level;
import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afmy extends afmq
{
    public static final AtomicReference a;
    private static final AtomicLong b;
    private static final ConcurrentLinkedQueue c;
    private volatile aflp d;
    
    static {
        a = new AtomicReference();
        b = new AtomicLong();
        c = new ConcurrentLinkedQueue();
    }
    
    public afmy(String fingerprint) {
        super(fingerprint);
        fingerprint = Build.FINGERPRINT;
        boolean b = false;
        final boolean b2 = fingerprint == null || "robolectric".equals(Build.FINGERPRINT);
        final boolean b3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            b = true;
        }
        if (b2 || b3) {
            this.d = new afmr().a(this.a());
            return;
        }
        if (b) {
            final afna afna = new afna();
            this.d = new afna(Level.OFF, afna.a, afna.b).a(this.a());
            return;
        }
        this.d = null;
    }
    
    public static void e() {
        while (true) {
            final afmy afmy = afmx.a.poll();
            if (afmy == null) {
                break;
            }
            afmy.d = afmy.a.get().a(afmy.a());
        }
        f();
    }
    
    private static void f() {
        while (true) {
            final arzp arzp = afmy.c.poll();
            if (arzp == null) {
                break;
            }
            afmy.b.getAndDecrement();
            final Object a = arzp.a;
            final Object b = arzp.b;
            if (!((aflo)b).A() && !((aflp)a).d(((aflo)b).n())) {
                continue;
            }
            ((aflp)a).c((aflo)b);
        }
    }
    
    public final void b(final RuntimeException ex, final aflo aflo) {
        if (this.d != null) {
            this.d.b(ex, aflo);
            return;
        }
        Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", (Throwable)ex);
    }
    
    public final void c(final aflo aflo) {
        if (this.d != null) {
            this.d.c(aflo);
            return;
        }
        if (afmy.b.incrementAndGet() > 20L) {
            afmy.c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        afmy.c.offer(new arzp((aflp)this, aflo));
        if (this.d != null) {
            f();
        }
    }
    
    public final boolean d(final Level level) {
        return this.d == null || this.d.d(level);
    }
}
