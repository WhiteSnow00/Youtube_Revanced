import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineExceptionHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjv
{
    public static volatile asmn a;
    public static volatile asmn b;
    
    public static void a(final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
    
    public static asln b() {
        return d(asnf.b);
    }
    
    public static asln c(final asmc asmc) {
        asng.b(asmc, "run is null");
        return (asln)new asll(asmc);
    }
    
    public static asln d(final Runnable runnable) {
        asng.b(runnable, "run is null");
        return (asln)new aslp(runnable);
    }
    
    public static final Throwable e(final Throwable t, final Throwable t2) {
        if (t == t2) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", t2);
        aqvr.w((Throwable)ex, t);
        return ex;
    }
    
    public static final void f(final atpa atpa, final Throwable t) {
        atpa.getClass();
        try {
            final CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler)atpa.get(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(atpa, t);
                return;
            }
            atto.a(atpa, t);
        }
        finally {
            final Throwable t2;
            atto.a(atpa, e(t, t2));
        }
    }
    
    public static final Object g(final Object o, final atov atov) {
        atov.getClass();
        Object h = o;
        if (o instanceof atte) {
            Throwable t = ((atte)o).b;
            if (attt.b) {
                t = atzb.a(t, (atpi)atov);
            }
            h = areq.H(t);
        }
        return h;
    }
    
    public static final Object h(final Object o) {
        final Throwable a = atnj.a(o);
        if (a == null) {
            return o;
        }
        return new atte(a);
    }
    
    public static int i(final int n) {
        return 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
    }
    
    public static boolean j(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
