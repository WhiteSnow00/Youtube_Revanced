// 
// Decompiled by Procyon v0.6.0
// 

final class bwp
{
    private static final int[] a;
    
    static {
        a = new int[] { 1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686 };
    }
    
    public static boolean a(final btj btj, final boolean b) {
        final long d = btj.d();
        long n = 4096L;
        if (d != -1L) {
            if (d > 4096L) {
                n = n;
            }
            else {
                n = d;
            }
        }
        int n2 = (int)n;
        final bar bar = new bar(64);
        int n3 = 0;
        int n4 = 0;
        while (true) {
            boolean b2 = false;
            if (n3 >= n2) {
                break;
            }
            bar.C(8);
            if (!btj.o(bar.a, 0, 8, true)) {
                return n4 != 0 && b == b2;
            }
            final long q = bar.q();
            final int d2 = bar.d();
            int n5;
            long p2;
            if (q == 1L) {
                btj.j(bar.a, 8, 8);
                n5 = 16;
                bar.F(16);
                p2 = bar.p();
            }
            else {
                p2 = q;
                if (q == 0L) {
                    final long d3 = btj.d();
                    p2 = q;
                    if (d3 != -1L) {
                        p2 = 8L + (d3 - btj.e());
                    }
                }
                n5 = 8;
            }
            final long n6 = n5;
            if (p2 < n6) {
                return false;
            }
            final int n7 = n3 + n5;
            if (d2 == 1836019574) {
                int n9;
                final int n8 = n9 = n2 + (int)p2;
                if (d != -1L) {
                    n9 = n8;
                    if (n8 > d) {
                        n9 = (int)d;
                    }
                }
                n2 = n9;
                n3 = n7;
            }
            else {
                if (d2 == 1836019558 || d2 == 1836475768) {
                    b2 = true;
                    return n4 != 0 && b == b2;
                }
                if (n7 + p2 - n6 >= n2) {
                    break;
                }
                final int n10 = (int)(p2 - n6);
                final int n11 = n7 + n10;
                int n15;
                if (d2 == 1718909296) {
                    if (n10 < 8) {
                        return false;
                    }
                    bar.C(n10);
                    btj.j(bar.a, 0, n10);
                    int n12 = 0;
                    int n13 = 0;
                    Label_0483: {
                        while (true) {
                            Block_21: {
                                while (true) {
                                    n13 = n4;
                                    if (n12 >= n10 >> 2) {
                                        break Label_0483;
                                    }
                                    if (n12 == 1) {
                                        bar.H(4);
                                    }
                                    else {
                                        final int d4 = bar.d();
                                        if (d4 >>> 8 == 3368816) {
                                            break;
                                        }
                                        int n14;
                                        if ((n14 = d4) == 1751476579) {
                                            n14 = 1751476579;
                                        }
                                        final int[] a = bwp.a;
                                        for (int i = 0; i < 29; ++i) {
                                            if (a[i] == n14) {
                                                break Block_21;
                                            }
                                        }
                                    }
                                    ++n12;
                                }
                                n13 = 1;
                                break Label_0483;
                            }
                            continue;
                        }
                    }
                    if (n13 == 0) {
                        return false;
                    }
                    n15 = n13;
                }
                else {
                    n15 = n4;
                    if (n10 != 0) {
                        btj.g(n10);
                        n15 = n4;
                    }
                }
                n3 = n11;
                n4 = n15;
            }
        }
        boolean b2 = false;
        return n4 != 0 && b == b2;
    }
}
