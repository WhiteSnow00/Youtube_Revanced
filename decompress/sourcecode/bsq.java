// 
// Decompiled by Procyon v0.6.0
// 

public final class bsq
{
    private static final int[] b;
    private static final int[] c;
    
    static {
        b = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
        c = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
    }
    
    public static ijj a(final byte[] array) {
        return b(new athu(array, (byte[])null), false);
    }
    
    public static ijj b(final athu athu, final boolean b) {
        final int c = c(athu);
        int d = d(athu);
        final int g = athu.g(4);
        final StringBuilder sb = new StringBuilder("mp4a.40.");
        sb.append(c);
        final String string = sb.toString();
        final int n = 22;
        int c2 = 0;
        int g2 = 0;
        Label_0105: {
            if (c != 5) {
                c2 = c;
                g2 = g;
                if (c != 29) {
                    break Label_0105;
                }
            }
            final int d2 = d(athu);
            final int n2 = c2 = c(athu);
            d = d2;
            g2 = g;
            if (n2 == 22) {
                g2 = athu.g(4);
                d = d2;
                c2 = n2;
            }
        }
        if (b) {
            final int n3 = 3;
            if (c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4 && c2 != 6 && c2 != 7 && c2 != 17) {
                switch (c2) {
                    default: {
                        final StringBuilder sb2 = new StringBuilder("Unsupported audio object type: ");
                        sb2.append(c2);
                        throw ayz.d(sb2.toString());
                    }
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23: {
                        break;
                    }
                }
            }
            if (athu.q()) {
                bao.c("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (athu.q()) {
                athu.o(14);
            }
            final boolean q = athu.q();
            if (g2 == 0) {
                throw new UnsupportedOperationException();
            }
            int n4 = 0;
            Label_0295: {
                if (c2 != 6) {
                    if (c2 != 20) {
                        n4 = c2;
                        break Label_0295;
                    }
                    c2 = 20;
                    n4 = 20;
                }
                else {
                    n4 = c2;
                }
                athu.o(3);
            }
            if (q) {
                if (c2 == 22) {
                    athu.o(16);
                    c2 = n;
                }
                if (c2 == 17 || c2 == 19 || c2 == 20 || c2 == 23) {
                    athu.o(3);
                }
                athu.o(1);
            }
            switch (n4) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23: {
                    final int g3 = athu.g(2);
                    int n5;
                    if (g3 != 2) {
                        n5 = n3;
                        if (g3 != 3) {
                            break;
                        }
                    }
                    else {
                        n5 = g3;
                    }
                    final StringBuilder sb3 = new StringBuilder("Unsupported epConfig: ");
                    sb3.append(n5);
                    throw ayz.d(sb3.toString());
                }
            }
        }
        final int n6 = bsq.c[g2];
        if (n6 != -1) {
            return new ijj(d, n6, string);
        }
        throw ayz.a((String)null, (Throwable)null);
    }
    
    private static int c(final athu athu) {
        final int g = athu.g(5);
        if (g == 31) {
            return athu.g(6) + 32;
        }
        return g;
    }
    
    private static int d(final athu athu) {
        final int g = athu.g(4);
        int g2;
        if (g == 15) {
            g2 = athu.g(24);
        }
        else {
            if (g >= 13) {
                throw ayz.a((String)null, (Throwable)null);
            }
            g2 = bsq.b[g];
        }
        return g2;
    }
}
