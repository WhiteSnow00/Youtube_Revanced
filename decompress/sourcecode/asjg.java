import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum asjg implements asic
{
    a;
    
    public static void a() {
        aulo.r((Throwable)new asin("Disposable already set!"));
    }
    
    public static boolean b(final AtomicReference atomicReference) {
        final asic asic = atomicReference.get();
        final asjg a = asjg.a;
        if (asic != a) {
            final asic asic2 = atomicReference.getAndSet(a);
            if (asic2 != a) {
                if (asic2 != null) {
                    asic2.dispose();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean c(final asic asic) {
        return asic == asjg.a;
    }
    
    public static boolean d(final AtomicReference atomicReference, final asic asic) {
        asic asic2;
        do {
            asic2 = atomicReference.get();
            if (asic2 == asjg.a) {
                if (asic != null) {
                    asic.dispose();
                }
                return false;
            }
        } while (!asey.c(atomicReference, (Object)asic2, (Object)asic));
        if (asic2 != null) {
            asic2.dispose();
        }
        return true;
    }
    
    public static boolean f(final AtomicReference atomicReference, final asic asic) {
        asjv.b((Object)asic, "d is null");
        if (!asey.c(atomicReference, (Object)null, (Object)asic)) {
            asic.dispose();
            if (atomicReference.get() != asjg.a) {
                a();
            }
            return false;
        }
        return true;
    }
    
    public static boolean g(final asic asic, final asic asic2) {
        if (asic2 == null) {
            aulo.r((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (asic != null) {
            asic2.dispose();
            a();
            return false;
        }
        return true;
    }
    
    public static void h(final AtomicReference atomicReference, final asic asic) {
        asic asic2;
        do {
            asic2 = atomicReference.get();
            if (asic2 == asjg.a) {
                if (asic != null) {
                    asic.dispose();
                }
            }
        } while (!asey.c(atomicReference, (Object)asic2, (Object)asic));
    }
    
    public static void i(final AtomicReference atomicReference, final asic asic) {
        if (!asey.c(atomicReference, (Object)null, (Object)asic) && atomicReference.get() == asjg.a) {
            asic.dispose();
        }
    }
    
    public final void dispose() {
    }
    
    public final boolean tx() {
        return true;
    }
}
