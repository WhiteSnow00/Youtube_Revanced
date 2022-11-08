import androidx.media3.common.DrmInitData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsr
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    private static final int[] e;
    private static final int[] f;
    
    static {
        a = new int[] { 1, 2, 3, 6 };
        b = new int[] { 48000, 44100, 32000 };
        c = new int[] { 24000, 22050, 16000 };
        d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
        e = new int[] { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
        f = new int[] { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
    }
    
    public static int a(int n, int n2) {
        final int n3 = n2 / 2;
        if (n < 0 || n >= 3 || n2 < 0 || n3 >= 19) {
            return -1;
        }
        n = bsr.b[n];
        if (n == 44100) {
            n = bsr.f[n3] + (n2 & 0x1);
            return n + n;
        }
        n2 = bsr.e[n3];
        if (n == 32000) {
            return n2 * 6;
        }
        return n2 * 4;
    }
    
    public static int b(final byte[] array) {
        if (array[4] == -8 && array[5] == 114 && array[6] == 111) {
            final byte b = array[7];
            if ((b & 0xFE) == 0xBA) {
                int n;
                if ((b & 0xFF) == 0xBB) {
                    n = 9;
                }
                else {
                    n = 8;
                }
                return 40 << (array[n] >> 4 & 0x7);
            }
        }
        return 0;
    }
    
    public static ayf c(final bar bar, final String a, final String c, final DrmInitData n) {
        final int y = bsr.b[(bar.i() & 0xC0) >> 6];
        final int i = bar.i();
        int x = bsr.d[(i & 0x38) >> 3];
        if ((i & 0x4) != 0x0) {
            ++x;
        }
        final aye aye = new aye();
        aye.a = a;
        aye.k = "audio/ac3";
        aye.x = x;
        aye.y = y;
        aye.n = n;
        aye.c = c;
        return aye.a();
    }
    
    public static ayf d(final bar bar, final String a, final String c, final DrmInitData n) {
        bar.H(2);
        final int y = bsr.b[(bar.i() & 0xC0) >> 6];
        final int i = bar.i();
        int n3;
        final int n2 = n3 = bsr.d[(i & 0xE) >> 1];
        if ((i & 0x1) != 0x0) {
            n3 = n2 + 1;
        }
        int x = n3;
        if ((bar.i() & 0x1E) >> 1 > 0) {
            x = n3;
            if ((0x2 & bar.i()) != 0x0) {
                x = n3 + 2;
            }
        }
        String k;
        if (bar.a() > 0 && (bar.i() & 0x1) != 0x0) {
            k = "audio/eac3-joc";
        }
        else {
            k = "audio/eac3";
        }
        final aye aye = new aye();
        aye.a = a;
        aye.k = k;
        aye.x = x;
        aye.y = y;
        aye.n = n;
        aye.c = c;
        return aye.a();
    }
}
