// 
// Decompiled by Procyon v0.6.0
// 

final class cye
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "p", "s", "hd", "d");
    }
    
    static cwz a(final czf czf, final ctu ctu, int r) {
        boolean b = r == 3;
        Object g = null;
        Object j;
        Object b2 = j = g;
        boolean p3 = false;
        while (czf.o()) {
            r = czf.r(cye.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                czf.m();
                                czf.n();
                            }
                            else {
                                b = (czf.b() == 3);
                            }
                        }
                        else {
                            p3 = czf.p();
                        }
                    }
                    else {
                        j = ciw.j(czf, ctu);
                    }
                }
                else {
                    b2 = cyb.b(czf, ctu);
                }
            }
            else {
                g = czf.g();
            }
        }
        return new cwz((String)g, (cwx)b2, (cwr)j, b, p3);
    }
}
