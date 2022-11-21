import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucx
{
    public static final int a(final aucs aucs, final int n) {
        final int[] f = aucs.f;
        int n2 = aucs.e.length - 1;
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
    
    public static final void b(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder("size=");
        sb.append(n);
        sb.append(" offset=");
        sb.append(n2);
        sb.append(" byteCount=");
        sb.append(n3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final boolean c(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        array.getClass();
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static Object d(final atox atox, final Object o, final atqh atqh) {
        atqh.getClass();
        return atqh.invoke(o, atox);
    }
    
    public static atox e(final atox atox, final atoy atoy) {
        atoy.getClass();
        if (atqz.c(atox.getKey(), atoy)) {
            atox.getClass();
            return atox;
        }
        return null;
    }
    
    public static atpa f(final atox atox, final atoy atoy) {
        atoy.getClass();
        Object a = atox;
        if (atqz.c(atox.getKey(), atoy)) {
            a = atpb.a;
        }
        return (atpa)a;
    }
    
    public static atpa g(final atox atox, final atpa atpa) {
        atpa.getClass();
        return aucu.d((atpa)atox, atpa);
    }
    
    public static boolean h(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
