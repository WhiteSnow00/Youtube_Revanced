// 
// Decompiled by Procyon v0.6.0
// 

final class cza
{
    static final eab a;
    
    static {
        a = eab.y("nm", "ind", "ks", "hd");
    }
    
    static cxl a(final czg czg, final ctv ctv) {
        int b = 0;
        String g = null;
        cwu k = null;
        boolean p2 = false;
        while (czg.o()) {
            final int r = czg.r(cza.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            czg.n();
                        }
                        else {
                            p2 = czg.p();
                        }
                    }
                    else {
                        k = cix.k(czg, ctv);
                    }
                }
                else {
                    b = czg.b();
                }
            }
            else {
                g = czg.g();
            }
        }
        return new cxl(g, b, k, p2);
    }
}
