import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfa
{
    private static final asfa c;
    public final IdentityHashMap a;
    public ScheduledExecutorService b;
    
    static {
        c = new asfa();
    }
    
    public asfa() {
        this.a = new IdentityHashMap();
    }
    
    public static Object a(final asez asez) {
        return asfa.c.b(asez);
    }
    
    public static void d(final asez asez, final Object o) {
        asfa.c.e(asez, o);
    }
    
    final Object b(final asez asez) {
        synchronized (this) {
            athj athj;
            if ((athj = this.a.get(asez)) == null) {
                athj = new athj(asez.a());
                this.a.put(asez, athj);
            }
            final Object c = athj.c;
            if (c != null) {
                ((Future)c).cancel(false);
                athj.c = null;
            }
            ++athj.a;
            return athj.b;
        }
    }
    
    final void e(final asez asez, Object o) {
        synchronized (this) {
            final athj athj = this.a.get(asez);
            if (athj == null) {
                o = new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(asez))));
                throw o;
            }
            final Object b = athj.b;
            final boolean b2 = true;
            agot.v(o == b, (Object)"Releasing the wrong instance");
            agot.E(athj.a > 0, (Object)"Refcount has already reached zero");
            if (--athj.a == 0) {
                agot.E(athj.c == null && b2, (Object)"Destroy task already scheduled");
                if (this.b == null) {
                    this.b = Executors.newSingleThreadScheduledExecutor(asap.k("grpc-shared-destroyer-%d"));
                }
                athj.c = this.b.schedule((Runnable)new asbg((Runnable)new aavg(this, athj, asez, o, 11, (byte[])null)), 1L, TimeUnit.SECONDS);
            }
        }
    }
}
