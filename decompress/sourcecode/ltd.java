import android.util.Pair;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

final class ltd
{
    private static final int a;
    private static final Charset[] b;
    
    static {
        a = lwj.c("ID3");
        b = new Charset[] { Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8") };
    }
    
    public static lsq a(final lsh lsh) {
        final lwg lwg = new lwg(10);
        lsq a = null;
        int n = 0;
        while (true) {
            lsh.f((byte[])lwg.c, 0, 10);
            lwg.x(0);
            if (lwg.i() != ltd.a) {
                break;
            }
            final int h = lwg.h();
            final int h2 = lwg.h();
            final int h3 = lwg.h();
            final int g = lwg.g();
            Label_0868: {
                if (a == null && h2 != 255 && h >= 2 && h <= 4 && g <= 3145728 && (h != 2 || ((h3 & 0x3F) == 0x0 && (h3 & 0x40) == 0x0)) && (h != 3 || (h3 & 0x1F) == 0x0) && (h != 4 || (h3 & 0xF) == 0x0)) {
                    final byte[] array = new byte[g];
                    lsh.f(array, 0, g);
                    final lwg lwg2 = new lwg(array);
                    if (h != 4) {
                        if ((h3 & 0x80) != 0x0) {
                            final Object c = lwg2.c;
                            final byte[] array2 = (byte[])c;
                            int length = array2.length;
                            int n2 = 0;
                            while (true) {
                                final int n3 = n2 + 1;
                                if (n3 >= length) {
                                    break;
                                }
                                int n4 = length;
                                if ((array2[n2] & 0xFF) == 0xFF) {
                                    n4 = length;
                                    if (array2[n3] == 0) {
                                        System.arraycopy(c, n2 + 2, c, n3, length - n2 - 2);
                                        n4 = length - 1;
                                    }
                                }
                                n2 = n3;
                                length = n4;
                            }
                            lwg2.w(length);
                        }
                    }
                    else if (c(lwg2, false)) {
                        b(lwg2, false);
                    }
                    else if (c(lwg2, true)) {
                        b(lwg2, true);
                    }
                    lwg2.x(0);
                    Label_0371: {
                        if (h == 3) {
                            if ((h3 & 0x40) != 0x0) {
                                if (lwg2.a() < 4) {
                                    break Label_0371;
                                }
                                final int j = lwg2.j();
                                if (j > lwg2.a()) {
                                    break Label_0371;
                                }
                                if (j >= 6) {
                                    lwg2.y(2);
                                    final int i = lwg2.j();
                                    lwg2.x(4);
                                    lwg2.w(lwg2.b - i);
                                    if (lwg2.a() < j) {
                                        break Label_0371;
                                    }
                                }
                                lwg2.y(j);
                            }
                        }
                        else if (h == 4 && (h3 & 0x40) != 0x0) {
                            if (lwg2.a() < 4) {
                                break Label_0371;
                            }
                            final int g2 = lwg2.g();
                            if (g2 < 6) {
                                break Label_0371;
                            }
                            if (g2 > lwg2.a() + 4) {
                                break Label_0371;
                            }
                            lwg2.x(g2);
                        }
                        while (true) {
                            Pair create = null;
                            Label_0810: {
                                Label_0808: {
                                    int n5 = 0;
                                    Label_0798: {
                                        int h4;
                                        Charset[] b;
                                        while (true) {
                                            Label_0736: {
                                                if (h == 2) {
                                                    if (lwg2.a() >= 6) {
                                                        final String q = lwg2.q(3, Charset.forName("US-ASCII"));
                                                        if (!q.equals("\u0000\u0000\u0000")) {
                                                            n5 = lwg2.i();
                                                            if (n5 != 0) {
                                                                if (n5 <= lwg2.a()) {
                                                                    if (q.equals("COM")) {
                                                                        break Label_0736;
                                                                    }
                                                                    break Label_0798;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                else if (lwg2.a() >= 10) {
                                                    final String q2 = lwg2.q(4, Charset.forName("US-ASCII"));
                                                    if (!q2.equals("\u0000\u0000\u0000\u0000")) {
                                                        if (h == 4) {
                                                            n5 = lwg2.g();
                                                        }
                                                        else {
                                                            n5 = lwg2.j();
                                                        }
                                                        if (n5 == 0) {
                                                            break Label_0808;
                                                        }
                                                        if (n5 <= lwg2.a() - 2) {
                                                            final int k = lwg2.k();
                                                            if ((h != 4 || (k & 0xC) == 0x0) && ((h != 3 || (k & 0xC0) == 0x0) && q2.equals("COMM"))) {
                                                                break Label_0736;
                                                            }
                                                            break Label_0798;
                                                        }
                                                    }
                                                }
                                                create = null;
                                                break Label_0810;
                                            }
                                            h4 = lwg2.h();
                                            b = ltd.b;
                                            final int length2 = b.length;
                                            if (h4 >= 4) {
                                                continue;
                                            }
                                            break;
                                        }
                                        final String[] split = lwg2.q(n5 - 1, b[h4]).split("\u0000");
                                        if (split.length == 2) {
                                            create = Pair.create((Object)split[0], (Object)split[1]);
                                            break Label_0810;
                                        }
                                        break Label_0808;
                                    }
                                    lwg2.y(n5);
                                    continue;
                                }
                                create = null;
                            }
                            if (create == null) {
                                a = null;
                                break Label_0868;
                            }
                            if (((String)create.first).length() <= 3) {
                                continue;
                            }
                            a = lsq.a(((String)create.first).substring(3), (String)create.second);
                            if (a != null) {
                                break Label_0868;
                            }
                        }
                    }
                    a = null;
                }
                else {
                    lsh.d(g);
                }
            }
            n += g + 10;
        }
        lsh.h();
        lsh.d(n);
        return a;
    }
    
    private static void b(final lwg lwg, final boolean b) {
        lwg.x(0);
        final Object c = lwg.c;
        while (lwg.a() >= 10) {
            if (lwg.c() == 0) {
                return;
            }
            int n;
            if (b) {
                n = lwg.j();
            }
            else {
                n = lwg.g();
            }
            final int k = lwg.k();
            int n2;
            if ((k & 0x1) != 0x0) {
                final int a = lwg.a;
                System.arraycopy(c, a + 4, c, a, lwg.a() - 4);
                n -= 4;
                n2 = (k & 0xFFFFFFFE);
                lwg.w(lwg.b - 4);
            }
            else {
                n2 = k;
            }
            int n3 = n;
            int n4 = n2;
            if ((n2 & 0x2) != 0x0) {
                int n6;
                int n5 = n6 = lwg.a + 1;
                int n7 = 0;
                while (true) {
                    final int n8 = n7 + 1;
                    if (n8 >= n) {
                        break;
                    }
                    final byte[] array = (byte[])c;
                    int n9 = n;
                    int n10 = n5;
                    if ((array[n5 - 1] & 0xFF) == 0xFF) {
                        n9 = n;
                        n10 = n5;
                        if (array[n5] == 0) {
                            n10 = n5 + 1;
                            n9 = n - 1;
                        }
                    }
                    array[n6] = array[n10];
                    ++n6;
                    n5 = n10 + 1;
                    n = n9;
                    n7 = n8;
                }
                lwg.w(lwg.b - (n5 - n6));
                System.arraycopy(c, n5, c, n6, lwg.a() - n5);
                n4 = (n2 & 0xFFFFFFFD);
                n3 = n;
            }
            if (n4 != k || b) {
                final int n11 = lwg.a - 6;
                final byte[] array2 = (byte[])c;
                array2[n11] = (byte)(n3 >> 21 & 0x7F);
                array2[n11 + 1] = (byte)(n3 >> 14 & 0x7F);
                array2[n11 + 2] = (byte)(n3 >> 7 & 0x7F);
                array2[n11 + 3] = (byte)(n3 & 0x7F);
                array2[n11 + 4] = (byte)(n4 >> 8);
                array2[n11 + 5] = (byte)(n4 & 0xFF);
            }
            lwg.y(n3);
        }
    }
    
    private static boolean c(final lwg lwg, final boolean b) {
        lwg.x(0);
        while (lwg.a() >= 10) {
            if (lwg.c() == 0) {
                return true;
            }
            long n2;
            final long n = n2 = lwg.n();
            if (!b) {
                if ((0x808080L & n) != 0x0L) {
                    return false;
                }
                n2 = ((n >> 24 & 0x7FL) << 21 | ((n & 0x7FL) | (n >> 8 & 0x7FL) << 7 | (n >> 16 & 0x7FL) << 14));
            }
            if (n2 > lwg.a() - 2) {
                return false;
            }
            if ((0x1 & lwg.k()) != 0x0 && lwg.a() < 4) {
                return false;
            }
            lwg.y((int)n2);
        }
        return true;
    }
}
