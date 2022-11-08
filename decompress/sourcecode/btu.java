// 
// Decompiled by Procyon v0.6.0
// 

public final class btu
{
    public static final String[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    
    static {
        a = new String[] { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
        b = new int[] { 44100, 48000, 32000 };
        c = new int[] { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
        d = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
        e = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
        f = new int[] { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
        g = new int[] { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
    }
    
    public static int a(int n) {
        if (!d(n)) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 == 0 || n4 == 15) {
            return -1;
        }
        final int n5 = n >>> 10 & 0x3;
        if (n5 == 3) {
            return -1;
        }
        final int n6 = btu.b[n5];
        int n7;
        if (n2 == 2) {
            n7 = n6 / 2;
        }
        else {
            n7 = n6;
            if (n2 == 0) {
                n7 = n6 / 4;
            }
        }
        final int n8 = n >>> 9 & 0x1;
        if (n3 == 3) {
            if (n2 == 3) {
                n = btu.c[n4 - 1];
            }
            else {
                n = btu.d[n4 - 1];
            }
            return (n * 12 / n7 + n8) * 4;
        }
        if (n2 == 3) {
            if (n3 == 2) {
                n = btu.e[n4 - 1];
            }
            else {
                n = btu.f[n4 - 1];
            }
        }
        else {
            n = btu.g[n4 - 1];
        }
        int n9 = 144;
        if (n2 == 3) {
            return n * 144 / n7 + n8;
        }
        if (n3 == 1) {
            n9 = 72;
        }
        return n9 * n / n7 + n8;
    }
    
    public static int b(final int n, final int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return 384;
            }
            return 1152;
        }
        else {
            if (n == 3) {
                return 1152;
            }
            return 576;
        }
    }
    
    public static int c(final int n) {
        if (!d(n)) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 != 0 && n4 != 15 && (n >>> 10 & 0x3) != 0x3) {
            return b(n2, n3);
        }
        return -1;
    }
    
    public static boolean d(final int n) {
        return (n & 0xFFE00000) == 0xFFE00000;
    }
}
