import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum asmr implements asln
{
    a;
    
    private static final asmr[] b;
    
    public static void a() {
        aqvq.w((Throwable)new asly("Disposable already set!"));
    }
    
    public static boolean b(final AtomicReference atomicReference) {
        final asln asln = atomicReference.get();
        final asmr a = asmr.a;
        if (asln != a) {
            final asln asln2 = atomicReference.getAndSet(a);
            if (asln2 != a) {
                if (asln2 != null) {
                    asln2.dispose();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean c(final asln asln) {
        return asln == asmr.a;
    }
    
    public static boolean d(final AtomicReference atomicReference, final asln asln) {
        asln asln2;
        do {
            asln2 = atomicReference.get();
            if (asln2 == asmr.a) {
                if (asln != null) {
                    asln.dispose();
                }
                return false;
            }
        } while (!atrh.e(atomicReference, asln2, asln));
        if (asln2 != null) {
            asln2.dispose();
        }
        return true;
    }
    
    public static boolean f(final AtomicReference atomicReference, final asln asln) {
        asng.b(asln, "d is null");
        if (!atrh.e(atomicReference, null, asln)) {
            asln.dispose();
            if (atomicReference.get() != asmr.a) {
                a();
            }
            return false;
        }
        return true;
    }
    
    public static boolean g(final asln asln, final asln asln2) {
        if (asln2 == null) {
            aqvq.w((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (asln != null) {
            asln2.dispose();
            a();
            return false;
        }
        return true;
    }
    
    public static void h(final AtomicReference atomicReference, final asln asln) {
        asln asln2;
        do {
            asln2 = atomicReference.get();
            if (asln2 == asmr.a) {
                if (asln != null) {
                    asln.dispose();
                }
            }
        } while (!atrh.e(atomicReference, asln2, asln));
    }
    
    public static void i(final AtomicReference atomicReference, final asln asln) {
        if (!atrh.e(atomicReference, null, asln) && atomicReference.get() == asmr.a) {
            asln.dispose();
        }
    }
    
    @Override
    public final void dispose() {
    }
    
    @Override
    public final boolean tz() {
        return true;
    }
}
