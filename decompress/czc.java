// 
// Decompiled by Procyon v0.6.0
// 

final class czc
{
    private static final eab a;
    
    static {
        a = eab.y("s", "e", "o", "nm", "m", "hd");
    }
    
    static cxn a(final czg czg, final ctv ctv) {
        cwo g = null;
        cwo g3;
        cwo g2 = g3 = null;
        int n = 0;
        boolean p2 = false;
        while (czg.o()) {
            final int r = czg.r(czc.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                if (r != 5) {
                                    czg.n();
                                }
                                else {
                                    p2 = czg.p();
                                }
                            }
                            else {
                                final int b = czg.b();
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
                            czg.g();
                        }
                    }
                    else {
                        g3 = cix.g(czg, ctv, false);
                    }
                }
                else {
                    g2 = cix.g(czg, ctv, false);
                }
            }
            else {
                g = cix.g(czg, ctv, false);
            }
        }
        return new cxn(n, g, g2, g3, p2);
    }
}
