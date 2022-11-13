// 
// Decompiled by Procyon v0.6.0
// 

final class cyk
{
    private static final eab a;
    
    static {
        a = eab.y("fFamily", "fName", "fStyle", "ascent");
    }
    
    static ajb a(final czg czg) {
        czg.i();
        String g = null;
        String g2 = null;
        String g3 = null;
        while (czg.o()) {
            final int r = czg.r(cyk.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            czg.m();
                            czg.n();
                        }
                        else {
                            czg.a();
                        }
                    }
                    else {
                        g3 = czg.g();
                    }
                }
                else {
                    g2 = czg.g();
                }
            }
            else {
                g = czg.g();
            }
        }
        czg.k();
        return new ajb(g, g2, g3);
    }
}
