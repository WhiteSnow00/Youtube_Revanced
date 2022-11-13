import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auac
{
    public static long a(final String s) {
        final long n = -1L;
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static final int b(final atzw atzw, final int n) {
        final int[] f = atzw.f;
        int n2 = atzw.e.length - 1;
        int i = 0;
        while (true) {
            while (i <= n2) {
                final int n3 = n + 1;
                final int n4 = i + n2 >>> 1;
                final int n5 = f[n4];
                if (n5 < n3) {
                    i = n4 + 1;
                }
                else {
                    final int n6 = n4;
                    if (n5 > n3) {
                        n2 = n4 - 1;
                    }
                    else {
                        if (n6 >= 0) {
                            return n6;
                        }
                        return ~n6;
                    }
                }
            }
            final int n6 = -i - 1;
            continue;
        }
    }
    
    public static final atly c(final atnk atnk, final Object o, final atly atly) {
        Object create;
        if (atnk instanceof atmi) {
            create = ((atmi)atnk).create(o, atly);
        }
        else {
            final atmd context = atly.getContext();
            if (context == atme.a) {
                create = new atmg(atly, atnk, o);
            }
            else {
                create = new atmh(atly, context, atnk, o);
            }
        }
        return (atly)create;
    }
    
    public static final atly d(atly intercepted) {
        intercepted.getClass();
        atmk atmk;
        if (intercepted instanceof atmk) {
            atmk = (atmk)intercepted;
        }
        else {
            atmk = null;
        }
        if (atmk != null) {
            intercepted = atmk.intercepted();
        }
        return intercepted;
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
