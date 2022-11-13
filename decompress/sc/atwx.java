import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwx
{
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final Object b(final atwe atwe, Object o, final atnk atnk) {
        atqh atqh;
        try {
            atok.c((Object)atnk, 2);
            o = atnk.invoke(o, (Object)atwe);
        }
        finally {
            final Throwable t;
            atqh = new atqh(t);
        }
        final atmf a = atmf.a;
        Object o2;
        if (atqh == a) {
            o2 = a;
        }
        else {
            o = atwe.x((Object)atqh);
            if (o == atsg.b) {
                o2 = atmf.a;
            }
            else if (o instanceof atqh) {
                final Throwable b = ((atqh)o).b;
                final atly e = atwe.e;
                if (atqw.b && e instanceof atml) {
                    throw atwf.a(b, (atml)e);
                }
                throw b;
            }
            else {
                o2 = atsg.b(o);
            }
        }
        return o2;
    }
    
    public static final void c(final Object[] array, final int n) {
        array.getClass();
        array[n] = null;
    }
    
    public static final void d(final Object[] array, int i, final int n) {
        array.getClass();
        while (i < n) {
            c(array, i);
            ++i;
        }
    }
    
    public static final Object[] e(Object[] copy, final int n) {
        copy.getClass();
        copy = Arrays.copyOf(copy, n);
        copy.getClass();
        return copy;
    }
    
    public static boolean f(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
