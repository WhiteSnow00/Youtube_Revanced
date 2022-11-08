// 
// Decompiled by Procyon v0.6.0
// 

final class czb
{
    private static final eaa a;
    
    static {
        a = eaa.y("s", "e", "o", "nm", "m", "hd");
    }
    
    static cxm a(final czf czf, final ctu ctu) {
        cwn g = null;
        cwn g3;
        cwn g2 = g3 = g;
        int n = 0;
        boolean p2 = false;
        while (czf.o()) {
            final int r = czf.r(czb.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                if (r != 5) {
                                    czf.n();
                                }
                                else {
                                    p2 = czf.p();
                                }
                            }
                            else {
                                final int b = czf.b();
                                if (b != 1) {
                                    if (b != 2) {
                                        final StringBuilder sb = new StringBuilder("Unknown trim path type ");
                                        sb.append(b);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    n = 2;
                                }
                                else {
                                    n = 1;
                                }
                            }
                        }
                        else {
                            czf.g();
                        }
                    }
                    else {
                        g3 = ciw.g(czf, ctu, false);
                    }
                }
                else {
                    g2 = ciw.g(czf, ctu, false);
                }
            }
            else {
                g = ciw.g(czf, ctu, false);
            }
        }
        return new cxm(n, g, g2, g3, p2);
    }
}
