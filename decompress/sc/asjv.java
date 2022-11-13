import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum asjv implements asir
{
    a;
    
    private static final asjv[] b;
    
    public static void a() {
        atqx.j((Throwable)new asjc("Disposable already set!"));
    }
    
    public static boolean b(final AtomicReference atomicReference) {
        final asir asir = atomicReference.get();
        final asjv a = asjv.a;
        if (asir != a) {
            final asir asir2 = atomicReference.getAndSet(a);
            if (asir2 != a) {
                if (asir2 != null) {
                    asir2.dispose();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean c(final asir asir) {
        return asir == asjv.a;
    }
    
    public static boolean d(final AtomicReference atomicReference, final asir asir) {
        asir asir2;
        do {
            asir2 = atomicReference.get();
            if (asir2 == asjv.a) {
                if (asir != null) {
                    asir.dispose();
                }
                return false;
            }
        } while (!asgz.b(atomicReference, asir2, asir));
        if (asir2 != null) {
            asir2.dispose();
        }
        return true;
    }
    
    public static boolean f(final AtomicReference atomicReference, final asir asir) {
        askk.b((Object)asir, "d is null");
        if (!asgz.b(atomicReference, null, asir)) {
            asir.dispose();
            if (atomicReference.get() != asjv.a) {
                a();
            }
            return false;
        }
        return true;
    }
    
    public static boolean g(final asir asir, final asir asir2) {
        if (asir2 == null) {
            atqx.j((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (asir != null) {
            asir2.dispose();
            a();
            return false;
        }
        return true;
    }
    
    public static void h(final AtomicReference atomicReference, final asir asir) {
        asir asir2;
        do {
            asir2 = atomicReference.get();
            if (asir2 == asjv.a) {
                if (asir != null) {
                    asir.dispose();
                }
            }
        } while (!asgz.b(atomicReference, asir2, asir));
    }
    
    public static void i(final AtomicReference atomicReference, final asir asir) {
        if (!asgz.b(atomicReference, null, asir) && atomicReference.get() == asjv.a) {
            asir.dispose();
        }
    }
    
    @Override
    public final void dispose() {
    }
    
    @Override
    public final boolean tA() {
        return true;
    }
}
