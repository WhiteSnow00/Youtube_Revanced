// 
// Decompiled by Procyon v0.6.0
// 

final class cyz
{
    static final eaa a;
    
    static {
        a = eaa.y("nm", "ind", "ks", "hd");
    }
    
    static cxk a(final czf czf, final ctu ctu) {
        String g = null;
        cwt k = null;
        int b = 0;
        boolean p2 = false;
        while (czf.o()) {
            final int r = czf.r(cyz.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            czf.n();
                        }
                        else {
                            p2 = czf.p();
                        }
                    }
                    else {
                        k = ciw.k(czf, ctu);
                    }
                }
                else {
                    b = czf.b();
                }
            }
            else {
                g = czf.g();
            }
        }
        return new cxk(g, b, k, p2);
    }
}
