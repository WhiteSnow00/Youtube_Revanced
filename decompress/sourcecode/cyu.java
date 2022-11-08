// 
// Decompiled by Procyon v0.6.0
// 

final class cyu
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "p", "s", "r", "hd");
    }
    
    static cxf a(final czf czf, final ctu ctu) {
        Object b;
        Object g = b = null;
        Object f;
        Object j = f = b;
        boolean p2 = false;
        while (czf.o()) {
            final int r = czf.r(cyu.a);
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
                            f = ciw.f(czf, ctu);
                        }
                    }
                    else {
                        j = ciw.j(czf, ctu);
                    }
                }
                else {
                    b = cyb.b(czf, ctu);
                }
            }
            else {
                g = czf.g();
            }
        }
        return new cxf((String)g, (cwx)b, (cwx)j, (cwn)f, p2);
    }
}
