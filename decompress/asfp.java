import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfp
{
    private static final asfp c;
    public final IdentityHashMap a;
    public ScheduledExecutorService b;
    
    static {
        c = new asfp();
    }
    
    public asfp() {
        this.a = new IdentityHashMap();
    }
    
    public static Object a(final asfo asfo) {
        return asfp.c.b(asfo);
    }
    
    public static /* bridge */ void c(final asfp asfp) {
        asfp.b = null;
    }
    
    public static void d(final asfo asfo, final Object o) {
        asfp.c.e(asfo, o);
    }
    
    final Object b(final asfo asfo) {
        synchronized (this) {
            atib atib;
            if ((atib = this.a.get(asfo)) == null) {
                atib = new atib(asfo.a());
                this.a.put(asfo, atib);
            }
            final Object c = atib.c;
            if (c != null) {
                ((Future)c).cancel(false);
                atib.c = null;
            }
            ++atib.a;
            return atib.b;
        }
    }
    
    final void e(final asfo asfo, Object o) {
        synchronized (this) {
            final atib atib = this.a.get(asfo);
            if (atib == null) {
                o = new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(asfo))));
                throw o;
            }
            final Object b = atib.b;
            final boolean b2 = true;
            adkp.I(o == b, "Releasing the wrong instance");
            adkp.R(atib.a > 0, "Refcount has already reached zero");
            if (--atib.a == 0) {
                adkp.R(atib.c == null && b2, "Destroy task already scheduled");
                if (this.b == null) {
                    this.b = Executors.newSingleThreadScheduledExecutor(asby.k("grpc-shared-destroyer-%d"));
                }
                atib.c = this.b.schedule((Runnable)new ascn((Runnable)new aaxa(this, atib, asfo, o, 11, (byte[])null)), 1L, TimeUnit.SECONDS);
            }
        }
    }
}
