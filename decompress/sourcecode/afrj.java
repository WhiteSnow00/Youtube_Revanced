import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class afrj extends afqw
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
                final afri afri = new(afri.class)();
                final afri afri3;
                final afri afri2 = afri3 = afri;
                new afri();
                final afri afri4 = afri2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)afri4);
                final Unsafe unsafe;
                final Unsafe unsafe3 = unsafe = unsafe2;
            }
            try {
                final afri afri = new(afri.class)();
                final afri afri3;
                final afri afri2 = afri3 = afri;
                new afri();
                final afri afri4 = afri2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)afri4);
                final Unsafe unsafe = unsafe2;
                try {
                    c = unsafe.objectFieldOffset(afrl.class.getDeclaredField("waiters"));
                    b = unsafe.objectFieldOffset(afrl.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(afrl.class.getDeclaredField("value"));
                    e = unsafe.objectFieldOffset(afrk.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(afrk.class.getDeclaredField("next"));
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
    
    public afrj() {
    }
    
    public final afra a(final afrl afrl, final afra afra) {
        afra listeners;
        do {
            listeners = afrl.listeners;
            if (afra == listeners) {
                return listeners;
            }
        } while (!this.e(afrl, listeners, afra));
        return listeners;
    }
    
    public final afrk b(final afrl afrl, final afrk afrk) {
        afrk waiters;
        do {
            waiters = afrl.waiters;
            if (afrk == waiters) {
                return waiters;
            }
        } while (!this.g(afrl, waiters, afrk));
        return waiters;
    }
    
    public final void c(final afrk afrk, final afrk afrk2) {
        afrj.a.putObject(afrk, afrj.f, afrk2);
    }
    
    public final void d(final afrk afrk, final Thread thread) {
        afrj.a.putObject(afrk, afrj.e, thread);
    }
    
    public final boolean e(final afrl afrl, final afra afra, final afra afra2) {
        return afrh.a(afrj.a, (Object)afrl, afrj.b, (Object)afra, (Object)afra2);
    }
    
    public final boolean f(final afrl afrl, final Object o, final Object o2) {
        return afrh.a(afrj.a, (Object)afrl, afrj.d, o, o2);
    }
    
    public final boolean g(final afrl afrl, final afrk afrk, final afrk afrk2) {
        return afrh.a(afrj.a, (Object)afrl, afrj.c, (Object)afrk, (Object)afrk2);
    }
}
