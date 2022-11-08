import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum athh implements aujq
{
    a;
    
    public static void a(final AtomicReference atomicReference, final AtomicLong atomicLong, long andSet) {
        final aujq aujq = atomicReference.get();
        if (aujq != null) {
            aujq.e(andSet);
            return;
        }
        if (h(andSet)) {
            atnp.i(atomicLong, andSet);
            final aujq aujq2 = atomicReference.get();
            if (aujq2 != null) {
                andSet = atomicLong.getAndSet(0L);
                if (andSet != 0L) {
                    aujq2.e(andSet);
                }
            }
        }
    }
    
    public static void b(final long n) {
        final StringBuilder sb = new StringBuilder("More produced than requested: ");
        sb.append(n);
        aulo.r((Throwable)new asin(sb.toString()));
    }
    
    public static void d() {
        aulo.r((Throwable)new asin("Subscription already set!"));
    }
    
    public static boolean f(final AtomicReference atomicReference) {
        final aujq aujq = atomicReference.get();
        final athh a = athh.a;
        if (aujq != a) {
            final aujq aujq2 = atomicReference.getAndSet(a);
            if (aujq2 != a) {
                if (aujq2 != null) {
                    aujq2.tq();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean g(final AtomicReference atomicReference, final aujq aujq) {
        asjv.b((Object)aujq, "s is null");
        while (!atomicReference.compareAndSet(null, aujq)) {
            if (atomicReference.get() != null) {
                aujq.tq();
                if (atomicReference.get() != athh.a) {
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
            aulo.r((Throwable)new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }
    
    public static boolean i(final aujq aujq, final aujq aujq2) {
        if (aujq2 == null) {
            aulo.r((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (aujq != null) {
            aujq2.tq();
            d();
            return false;
        }
        return true;
    }
    
    public static void j(final AtomicReference atomicReference, final AtomicLong atomicLong, final aujq aujq) {
        if (g(atomicReference, aujq)) {
            final long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0L) {
                aujq.e(andSet);
            }
        }
    }
    
    public static void k(final AtomicReference atomicReference, final aujq aujq, final long n) {
        if (g(atomicReference, aujq)) {
            aujq.e(n);
        }
    }
    
    public final void e(final long n) {
    }
    
    public final void tq() {
    }
}
