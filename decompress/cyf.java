// 
// Decompiled by Procyon v0.6.0
// 

final class cyf
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "p", "s", "hd", "d");
    }
    
    static cxa a(final czg czg, final ctv ctv, int r) {
        boolean b = r == 3;
        String g = null;
        cws j;
        Object b2 = j = null;
        boolean p3 = false;
        while (czg.o()) {
            r = czg.r(cyf.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                czg.m();
                                czg.n();
                            }
                            else {
                                b = (czg.b() == 3);
                            }
                        }
                        else {
                            p3 = czg.p();
                        }
                    }
                    else {
                        j = cix.j(czg, ctv);
                    }
                }
                else {
                    b2 = cyc.b(czg, ctv);
                }
            }
            else {
                g = czg.g();
            }
        }
        return new cxa(g, (cwy)b2, j, b, p3);
    }
}
