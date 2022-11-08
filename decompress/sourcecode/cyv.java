// 
// Decompiled by Procyon v0.6.0
// 

final class cyv
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "c", "o", "tr", "hd");
    }
    
    static cxg a(final czf czf, final ctu ctu) {
        Object g2;
        Object g = g2 = null;
        Object a;
        cwn g3 = (cwn)(a = g2);
        boolean p2 = false;
        while (czf.o()) {
            final int r = czf.r(cyv.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                czf.n();
                            }
                            else {
                                p2 = czf.p();
                            }
                        }
                        else {
                            a = cyd.a(czf, ctu);
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
                g = czf.g();
            }
        }
        return new cxg((String)g, (cwn)g2, g3, (cww)a, p2);
    }
}
