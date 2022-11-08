import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvy
{
    public static final byte[] a;
    private static final int[] b;
    private static final int[] c;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
        c = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
    }
    
    public static Pair a(final byte[] array) {
        final lwf lwf = new lwf(array);
        final int a = lwf.a(5);
        final int a2 = lwf.a(4);
        final boolean b = true;
        int a3;
        if (a2 == 15) {
            a3 = lwf.a(24);
        }
        else {
            jfi.S(a2 < 13);
            a3 = lvy.b[a2];
        }
        final int a4 = lwf.a(4);
        int a5 = 0;
        Label_0165: {
            if (a != 5) {
                a5 = a4;
                if (a != 29) {
                    break Label_0165;
                }
            }
            final int a6 = lwf.a(4);
            int a7;
            if (a6 == 15) {
                a7 = lwf.a(24);
            }
            else {
                jfi.S(a6 < 13);
                a7 = lvy.b[a6];
            }
            a3 = a7;
            a5 = a4;
            if (lwf.a(5) == 22) {
                a5 = lwf.a(4);
                a3 = a3;
            }
        }
        final int n = lvy.c[a5];
        jfi.S(n != -1 && b);
        return Pair.create((Object)a3, (Object)n);
    }
}
