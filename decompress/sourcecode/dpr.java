// 
// Decompiled by Procyon v0.6.0
// 

public final class dpr
{
    private static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public static String a(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length + length];
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = n + 1;
            final char[] a = dpr.a;
            final byte b = array[i];
            array2[n] = a[(b & 0xF0) >>> 4];
            n = n2 + 1;
            array2[n2] = a[b & 0xF];
            ++i;
        }
        return new String(array2);
    }
}
