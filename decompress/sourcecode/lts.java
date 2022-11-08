// 
// Decompiled by Procyon v0.6.0
// 

final class lts
{
    private static final int[] a;
    
    static {
        a = new int[] { lwj.c("isom"), lwj.c("iso2"), lwj.c("iso3"), lwj.c("iso4"), lwj.c("iso5"), lwj.c("iso6"), lwj.c("avc1"), lwj.c("hvc1"), lwj.c("hev1"), lwj.c("mp41"), lwj.c("mp42"), lwj.c("3g2a"), lwj.c("3g2b"), lwj.c("3gr6"), lwj.c("3gs6"), lwj.c("3ge6"), lwj.c("3gg6"), lwj.c("M4V "), lwj.c("M4A "), lwj.c("f4v "), lwj.c("kddi"), lwj.c("M4VP"), lwj.c("qt  "), lwj.c("MSNV") };
    }
    
    public static boolean a(final lsh lsh, final boolean b) {
        final long b2 = lsh.b;
        long n = 0L;
        Label_0029: {
            if (b2 != -1L) {
                n = b2;
                if (b2 <= 4096L) {
                    break Label_0029;
                }
            }
            n = 4096L;
        }
        final int n2 = (int)n;
        final lwg lwg = new lwg(64);
        int i = 0;
        int n3 = 0;
        while (i < n2) {
            lsh.f((byte[])lwg.c, 0, 8);
            lwg.x(0);
            long n4 = lwg.n();
            final int c = lwg.c();
            int n5;
            if (n4 == 1L) {
                lsh.f((byte[])lwg.c, 8, 8);
                n4 = lwg.o();
                n5 = 16;
            }
            else {
                n5 = 8;
            }
            final long n6 = n5;
            if (n4 < n6) {
                return false;
            }
            final int n7 = i += n5;
            if (c == ltk.E) {
                continue;
            }
            if (c == ltk.N || c == ltk.P) {
                final boolean b3 = true;
                return n3 != 0 && b == b3;
            }
            if (n7 + n4 - n6 >= n2) {
                break;
            }
            final int n8 = (int)(n4 - n6);
            final int n9 = n7 + n8;
            if (c == ltk.d) {
                if (n8 < 8) {
                    return false;
                }
                if (lwg.b() < n8) {
                    lwg.v(new byte[n8], n8);
                }
                lsh.f((byte[])lwg.c, 0, n8);
                int n10 = 0;
                int n11 = 0;
                Label_0372: {
                    while (true) {
                        Block_15: {
                            while (true) {
                                n11 = n3;
                                if (n10 >= n8 >> 2) {
                                    break Label_0372;
                                }
                                if (n10 == 1) {
                                    lwg.y(4);
                                }
                                else {
                                    final int c2 = lwg.c();
                                    if (c2 >>> 8 == lwj.c("3gp")) {
                                        break;
                                    }
                                    final int[] a = lts.a;
                                    final int length = a.length;
                                    for (int j = 0; j < 24; ++j) {
                                        if (a[j] == c2) {
                                            break Block_15;
                                        }
                                    }
                                }
                                ++n10;
                            }
                            n11 = 1;
                            break Label_0372;
                        }
                        continue;
                    }
                }
                if (n11 == 0) {
                    return false;
                }
                i = n9;
                n3 = n11;
            }
            else {
                i = n9;
                if (n8 == 0) {
                    continue;
                }
                lsh.d(n8);
                i = n9;
            }
        }
        final boolean b3 = false;
        return n3 != 0 && b == b3;
    }
}
