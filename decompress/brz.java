// 
// Decompiled by Procyon v0.6.0
// 

public final class brz
{
    public static final Object a;
    public static final Object b;
    public static boolean c;
    public static long d;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static long a(final byte[] array, final int n) {
        final long c = c(array, n);
        final long c2 = c(array, n + 4);
        long n2 = c;
        if (c == 0L) {
            if (c2 == 0L) {
                return 0L;
            }
            n2 = 0L;
        }
        return (n2 - 2208988800L) * 1000L + c2 * 1000L / 4294967296L;
    }
    
    public static boolean b() {
        synchronized (brz.b) {
            return brz.c;
        }
    }
    
    private static long c(final byte[] array, int n) {
        final int n2 = array[n];
        final byte b = array[n + 1];
        final byte b2 = array[n + 2];
        final byte b3 = array[n + 3];
        n = n2;
        if ((n2 & 0x80) == 0x80) {
            n = (n2 & 0x7F) + 128;
        }
        int n3 = b;
        if ((b & 0x80) == 0x80) {
            n3 = (b & 0x7F) + 128;
        }
        int n4 = b2;
        if ((b2 & 0x80) == 0x80) {
            n4 = (b2 & 0x7F) + 128;
        }
        int n5 = b3;
        if ((b3 & 0x80) == 0x80) {
            n5 = (b3 & 0x7F) + 128;
        }
        return ((long)n << 24) + ((long)n3 << 16) + ((long)n4 << 8) + n5;
    }
}
