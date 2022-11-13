// 
// Decompiled by Procyon v0.6.0
// 

final class cyw
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "c", "o", "tr", "hd");
    }
    
    static cxh a(final czg czg, final ctv ctv) {
        String g = null;
        Object g2 = null;
        Object a;
        cwo g3 = (cwo)(a = g2);
        boolean p2 = false;
        while (czg.o()) {
            final int r = czg.r(cyw.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                czg.n();
                            }
                            else {
                                p2 = czg.p();
                            }
                        }
                        else {
                            a = cye.a(czg, ctv);
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
                g = czg.g();
            }
        }
        return new cxh(g, (cwo)g2, g3, (cwx)a, p2);
    }
}
