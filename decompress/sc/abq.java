// 
// Decompiled by Procyon v0.6.0
// 

public final class abq
{
    public static final int[] a;
    public static final long[] b;
    public static final Object[] c;
    
    static {
        a = new int[0];
        b = new long[0];
        c = new Object[0];
    }
    
    public static final int a(final int[] array, int n, final int n2) {
        array.getClass();
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static final int b(final long[] array, int n, final long n2) {
        array.getClass();
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final long n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static final int c(final int n) {
        for (int i = 4; i < 32; ++i) {
            final int n2 = (1 << i) - 12;
            if (n <= n2) {
                return n2;
            }
        }
        return n;
    }
    
    public static final int d(final int n) {
        return c(n * 4) / 4;
    }
    
    public static final int e(final int n) {
        return c(n * 8) / 8;
    }
}
