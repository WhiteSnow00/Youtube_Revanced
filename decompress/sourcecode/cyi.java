import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyi
{
    private static final eaa a;
    private static final eaa b;
    
    static {
        a = eaa.y("ch", "size", "w", "style", "fFamily", "data");
        b = eaa.y("shapes");
    }
    
    static cwh a(final czf czf, final ctu ctu) {
        final ArrayList list = new ArrayList();
        czf.i();
        String g2;
        String g = g2 = null;
        double a = 0.0;
        char char1 = '\0';
        while (czf.o()) {
            final int r = czf.r(cyi.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                if (r != 5) {
                                    czf.m();
                                    czf.n();
                                }
                                else {
                                    czf.i();
                                    while (czf.o()) {
                                        if (czf.r(cyi.b) != 0) {
                                            czf.m();
                                            czf.n();
                                        }
                                        else {
                                            czf.h();
                                            while (czf.o()) {
                                                list.add(cyf.a(czf, ctu));
                                            }
                                            czf.j();
                                        }
                                    }
                                    czf.k();
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
                    else {
                        a = czf.a();
                    }
                }
                else {
                    czf.a();
                }
            }
            else {
                char1 = czf.g().charAt(0);
            }
        }
        czf.k();
        return new cwh((List)list, char1, a, g, g2);
    }
}
