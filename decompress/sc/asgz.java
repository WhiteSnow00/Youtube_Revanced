import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgz
{
    public static arub a(final arwk arwk) {
        return (arub)new agnz(arwk, 2);
    }
    
    public static boolean b(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static void c(final Throwable t) {
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
}
