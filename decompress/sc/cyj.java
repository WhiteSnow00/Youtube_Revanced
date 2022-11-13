import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyj
{
    private static final eab a;
    private static final eab b;
    
    static {
        a = eab.y("ch", "size", "w", "style", "fFamily", "data");
        b = eab.y("shapes");
    }
    
    static cwi a(final czg czg, final ctv ctv) {
        final ArrayList list = new ArrayList();
        czg.i();
        String g = null;
        String g2 = null;
        double a = 0.0;
        char char1 = '\0';
        while (czg.o()) {
            final int r = czg.r(cyj.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            if (r != 4) {
                                if (r != 5) {
                                    czg.m();
                                    czg.n();
                                }
                                else {
                                    czg.i();
                                    while (czg.o()) {
                                        if (czg.r(cyj.b) != 0) {
                                            czg.m();
                                            czg.n();
                                        }
                                        else {
                                            czg.h();
                                            while (czg.o()) {
                                                list.add(cyg.a(czg, ctv));
                                            }
                                            czg.j();
                                        }
                                    }
                                    czg.k();
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
                    else {
                        a = czg.a();
                    }
                }
                else {
                    czg.a();
                }
            }
            else {
                char1 = czg.g().charAt(0);
            }
        }
        czg.k();
        return new cwi(list, char1, a, g, g2);
    }
}
