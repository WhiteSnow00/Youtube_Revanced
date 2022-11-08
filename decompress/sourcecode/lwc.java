// 
// Decompiled by Procyon v0.6.0
// 

public final class lwc
{
    private static final String[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        h = new String[] { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
        i = new int[] { 44100, 48000, 32000 };
        j = new int[] { 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
        k = new int[] { 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 };
        l = new int[] { 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 };
        m = new int[] { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 };
        n = new int[] { 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 };
    }
    
    public static int a(int n) {
        if ((n & 0xFFE00000) != 0xFFE00000) {
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
        final int n6 = lwc.i[n5];
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
                n = lwc.j[n4 - 1];
            }
            else {
                n = lwc.k[n4 - 1];
            }
            return (n * 12000 / n7 + n8) * 4;
        }
        if (n2 == 3) {
            if (n3 == 2) {
                n = lwc.l[n4 - 1];
            }
            else {
                n = lwc.m[n4 - 1];
            }
        }
        else {
            n = lwc.n[n4 - 1];
        }
        int n9 = 144000;
        if (n2 == 3) {
            return n * 144000 / n7 + n8;
        }
        if (n3 == 1) {
            n9 = 72000;
        }
        return n9 * n / n7 + n8;
    }
    
    public static boolean b(final int n, final lwc lwc) {
        if ((n & 0xFFE00000) != 0xFFE00000) {
            return false;
        }
        final int a = n >>> 19 & 0x3;
        if (a == 1) {
            return false;
        }
        final int n2 = n >>> 17 & 0x3;
        if (n2 == 0) {
            return false;
        }
        final int n3 = n >>> 12 & 0xF;
        if (n3 == 0 || n3 == 15) {
            return false;
        }
        final int n4 = n >>> 10 & 0x3;
        if (n4 == 3) {
            return false;
        }
        final int n5 = lwc.i[n4];
        int e = 2;
        int d;
        if (a == 2) {
            d = n5 / 2;
        }
        else {
            d = n5;
            if (a == 0) {
                d = n5 / 4;
            }
        }
        final int n6 = n >>> 9 & 0x1;
        int n7;
        int c;
        int g;
        if (n2 == 3) {
            if (a == 3) {
                n7 = lwc.j[n3 - 1];
            }
            else {
                n7 = lwc.k[n3 - 1];
            }
            c = (n7 * 12000 / d + n6) * 4;
            g = 384;
        }
        else {
            int n8 = 144000;
            int n9 = 1152;
            if (a == 3) {
                if (n2 == 2) {
                    n7 = lwc.l[n3 - 1];
                }
                else {
                    n7 = lwc.m[n3 - 1];
                }
                c = 144000 * n7 / d + n6;
                g = 1152;
            }
            else {
                final int n10 = lwc.n[n3 - 1];
                if (n2 == 1) {
                    n9 = 576;
                }
                if (n2 == 1) {
                    n8 = 72000;
                }
                c = n8 * n10 / d + n6;
                g = n9;
                n7 = n10;
            }
        }
        final String b = lwc.h[3 - n2];
        if ((n >> 6 & 0x3) == 0x3) {
            e = 1;
        }
        lwc.a = a;
        lwc.b = b;
        lwc.c = c;
        lwc.d = d;
        lwc.e = e;
        lwc.f = n7 * 1000;
        lwc.g = g;
        return true;
    }
}
