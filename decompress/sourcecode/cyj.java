// 
// Decompiled by Procyon v0.6.0
// 

final class cyj
{
    private static final eaa a;
    
    static {
        a = eaa.y("fFamily", "fName", "fStyle", "ascent");
    }
    
    static aja a(final czf czf) {
        czf.i();
        String g = null;
        String g3;
        String g2 = g3 = null;
        while (czf.o()) {
            final int r = czf.r(cyj.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            czf.m();
                            czf.n();
                        }
                        else {
                            czf.a();
                        }
                    }
                    else {
                        g3 = czf.g();
                    }
                }
                else {
                    g2 = czf.g();
                }
            }
            else {
                g = czf.g();
            }
        }
        czf.k();
        return new aja(g, g2, g3);
    }
}
