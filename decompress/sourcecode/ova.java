import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ova
{
    static final orz a;
    
    static {
        a = orz.a().a();
    }
    
    static dss a(final dsw dsw, @dyi final ouo ouo, @dyi final orz orz, final AtomicReference atomicReference, final AtomicReference atomicReference2) {
        if (atomicReference2.get() == null || atomicReference2.get().get() != ouo) {
            atomicReference2.set(new WeakReference(ouo));
            atomicReference.set(null);
        }
        final dss dss = atomicReference.get();
        if (dss == null) {
            final dss a = ouo.a(dsw, orz);
            atomicReference.set(a);
            return a;
        }
        return dss;
    }
    
    static void b(@dyi final Boolean b, final AtomicReference atomicReference) {
        if (b != null && b) {
            atomicReference.set(null);
        }
    }
    
    static void c(final elw elw, final elw elw2) {
        elw.a = new AtomicReference();
        elw2.a = new AtomicReference();
    }
}
