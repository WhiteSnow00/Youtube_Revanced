// 
// Decompiled by Procyon v0.6.0
// 

final class cyv
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "p", "s", "r", "hd");
    }
    
    static cxg a(final czg czg, final ctv ctv) {
        String g = null;
        Object b = null;
        Object f;
        Object j = f = b;
        boolean p2 = false;
        while (czg.o()) {
            final int r = czg.r(cyv.a);
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
                            f = cix.f(czg, ctv);
                        }
                    }
                    else {
                        j = cix.j(czg, ctv);
                    }
                }
                else {
                    b = cyc.b(czg, ctv);
                }
            }
            else {
                g = czg.g();
            }
        }
        return new cxg(g, (cwy)b, (cwy)j, (cwo)f, p2);
    }
}
