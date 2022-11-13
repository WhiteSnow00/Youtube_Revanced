import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum athz implements aukg
{
    a;
    
    private static final athz[] b;
    
    public static void a(final AtomicReference atomicReference, final AtomicLong atomicLong, long andSet) {
        final aukg aukg = atomicReference.get();
        if (aukg != null) {
            aukg.e(andSet);
            return;
        }
        if (h(andSet)) {
            asfn.w(atomicLong, andSet);
            final aukg aukg2 = atomicReference.get();
            if (aukg2 != null) {
                andSet = atomicLong.getAndSet(0L);
                if (andSet != 0L) {
                    aukg2.e(andSet);
                }
            }
        }
    }
    
    public static void b(final long n) {
        final StringBuilder sb = new StringBuilder("More produced than requested: ");
        sb.append(n);
        atqx.j((Throwable)new asjc(sb.toString()));
    }
    
    public static void d() {
        atqx.j((Throwable)new asjc("Subscription already set!"));
    }
    
    public static boolean f(final AtomicReference atomicReference) {
        final aukg aukg = atomicReference.get();
        final athz a = athz.a;
        if (aukg != a) {
            final aukg aukg2 = atomicReference.getAndSet(a);
            if (aukg2 != a) {
                if (aukg2 != null) {
                    aukg2.tt();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean g(final AtomicReference atomicReference, final aukg aukg) {
        askk.b((Object)aukg, "s is null");
        while (!atomicReference.compareAndSet(null, aukg)) {
            if (atomicReference.get() != null) {
                aukg.tt();
                if (atomicReference.get() != athz.a) {
                    d();
                }
                return false;
            }
        }
        return true;
    }
    
    public static boolean h(final long n) {
        if (n <= 0L) {
            final StringBuilder sb = new StringBuilder("n > 0 required but it was ");
            sb.append(n);
            atqx.j((Throwable)new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }
    
    public static boolean i(final aukg aukg, final aukg aukg2) {
        if (aukg2 == null) {
            atqx.j((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (aukg != null) {
            aukg2.tt();
            d();
            return false;
        }
        return true;
    }
    
    public static void j(final AtomicReference atomicReference, final AtomicLong atomicLong, final aukg aukg) {
        if (g(atomicReference, aukg)) {
            final long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0L) {
                aukg.e(andSet);
            }
        }
    }
    
    public static void k(final AtomicReference atomicReference, final aukg aukg, final long n) {
        if (g(atomicReference, aukg)) {
            aukg.e(n);
        }
    }
    
    public final void e(final long n) {
    }
    
    public final void tt() {
    }
}
