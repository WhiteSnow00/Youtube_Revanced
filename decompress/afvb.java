import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvb extends afuo
{
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    
    static {
        Label_0024: {
            try {
                final Unsafe unsafe = Unsafe.getUnsafe();
                break Label_0024;
            }
            catch (final SecurityException ex) {
                final afva afva = new(afva.class)();
                final afva afva3;
                final afva afva2 = afva3 = afva;
                new afva();
                final afva afva4 = afva2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)afva4);
                final Unsafe unsafe;
                final Unsafe unsafe3 = unsafe = unsafe2;
            }
            try {
                final afva afva = new(afva.class)();
                final afva afva3;
                final afva afva2 = afva3 = afva;
                new afva();
                final afva afva4 = afva2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)afva4);
                final Unsafe unsafe = unsafe2;
                try {
                    c = unsafe.objectFieldOffset(afvd.class.getDeclaredField("waiters"));
                    b = unsafe.objectFieldOffset(afvd.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(afvd.class.getDeclaredField("value"));
                    e = unsafe.objectFieldOffset(afvc.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(afvc.class.getDeclaredField("next"));
                    a = unsafe;
                }
                catch (final RuntimeException ex2) {
                    throw ex2;
                }
                catch (final NoSuchFieldException ex3) {
                    throw new RuntimeException(ex3);
                }
            }
            catch (final PrivilegedActionException ex4) {
                throw new RuntimeException("Could not initialize intrinsics", ex4.getCause());
            }
        }
    }
    
    public afvb() {
    }
    
    @Override
    public final afus a(final afvd afvd, final afus afus) {
        afus listeners;
        do {
            listeners = afvd.listeners;
            if (afus == listeners) {
                return listeners;
            }
        } while (!this.e(afvd, listeners, afus));
        return listeners;
    }
    
    @Override
    public final afvc b(final afvd afvd, final afvc afvc) {
        afvc waiters;
        do {
            waiters = afvd.waiters;
            if (afvc == waiters) {
                return waiters;
            }
        } while (!this.g(afvd, waiters, afvc));
        return waiters;
    }
    
    @Override
    public final void c(final afvc afvc, final afvc afvc2) {
        afvb.a.putObject(afvc, afvb.f, afvc2);
    }
    
    @Override
    public final void d(final afvc afvc, final Thread thread) {
        afvb.a.putObject(afvc, afvb.e, thread);
    }
    
    @Override
    public final boolean e(final afvd afvd, final afus afus, final afus afus2) {
        return afuz.a(afvb.a, afvd, afvb.b, afus, afus2);
    }
    
    @Override
    public final boolean f(final afvd afvd, final Object o, final Object o2) {
        return afuz.a(afvb.a, afvd, afvb.d, o, o2);
    }
    
    @Override
    public final boolean g(final afvd afvd, final afvc afvc, final afvc afvc2) {
        return afuz.a(afvb.a, afvd, afvb.c, afvc, afvc2);
    }
}
