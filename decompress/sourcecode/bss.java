import androidx.media3.common.DrmInitData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bss
{
    private static final int[] b;
    
    static {
        b = new int[] { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
    }
    
    public static ayf a(final bar bar, final String a, final String c, final DrmInitData n) {
        bar.H(1);
        int y;
        if (1 != (bar.i() & 0x20) >> 5) {
            y = 44100;
        }
        else {
            y = 48000;
        }
        final aye aye = new aye();
        aye.a = a;
        aye.k = "audio/ac4";
        aye.x = 2;
        aye.y = y;
        aye.n = n;
        aye.c = c;
        return aye.a();
    }
    
    public static void b(final int n, final bar bar) {
        bar.C(7);
        final byte[] a = bar.a;
        a[0] = -84;
        a[1] = 64;
        a[2] = -1;
        a[3] = -1;
        a[4] = (byte)(n >> 16 & 0xFF);
        a[5] = (byte)(n >> 8 & 0xFF);
        a[6] = (byte)(n & 0xFF);
    }
    
    public static aerl c(final athu athu) {
        final int g = athu.g(16);
        int n = athu.g(16);
        int n2;
        if (n == 65535) {
            n = athu.g(24);
            n2 = 7;
        }
        else {
            n2 = 4;
        }
        int n3 = n + n2;
        if (g == 44097) {
            n3 += 2;
        }
        if (athu.g(2) == 3) {
            do {
                athu.g(2);
            } while (athu.q());
        }
        final int g2 = athu.g(10);
        if (athu.q() && athu.g(3) > 0) {
            athu.o(2);
        }
        int n4;
        if (!athu.q()) {
            n4 = 44100;
        }
        else {
            n4 = 48000;
        }
        final int g3 = athu.g(4);
        int n5;
        if (n4 == 44100 && g3 == 13) {
            n5 = bss.b[13];
        }
        else if (n4 == 48000 && g3 < 14) {
            n5 = bss.b[g3];
            final int n6 = g2 % 5;
            Label_0260: {
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 != 4) {
                                return new aerl(n4, n3, n5, (byte[])null);
                            }
                            if (g3 == 3 || g3 == 8) {
                                break Label_0260;
                            }
                            if (g3 == 11) {
                                break Label_0260;
                            }
                            return new aerl(n4, n3, n5, (byte[])null);
                        }
                    }
                    else {
                        if (g3 == 8) {
                            break Label_0260;
                        }
                        if (g3 == 11) {
                            break Label_0260;
                        }
                        return new aerl(n4, n3, n5, (byte[])null);
                    }
                }
                if (g3 == 3) {
                    break Label_0260;
                }
                if (g3 == 8) {
                    break Label_0260;
                }
                return new aerl(n4, n3, n5, (byte[])null);
            }
            ++n5;
        }
        else {
            n5 = 0;
        }
        return new aerl(n4, n3, n5, (byte[])null);
    }
}
