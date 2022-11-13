import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyn
{
    private static final eab a;
    private static final eab b;
    private static final eab c;
    
    static {
        a = eab.y("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
        b = eab.y("p", "k");
        c = eab.y("n", "v");
    }
    
    static cxd a(final czg czg, final ctv ctv) {
        final ArrayList list = new ArrayList();
        String g = null;
        int n = 0;
        cwp cwp = null;
        cws j = null;
        cws i = null;
        cwo f = null;
        int n2 = 0;
        int n3 = 0;
        float n4 = 0.0f;
        cwo cwo = null;
        boolean p2 = false;
        cwq k = null;
        while (czg.o()) {
            cwp h = null;
            switch (czg.r(cyn.a)) {
                default: {
                    czg.m();
                    czg.n();
                    h = cwp;
                    break;
                }
                case 11: {
                    czg.h();
                    cwo cwo2 = cwo;
                    while (czg.o()) {
                        czg.i();
                        cwo f2 = null;
                        String g2 = null;
                        while (czg.o()) {
                            final int r = czg.r(cyn.c);
                            if (r != 0) {
                                if (r != 1) {
                                    czg.m();
                                    czg.n();
                                }
                                else {
                                    f2 = cix.f(czg, ctv);
                                }
                            }
                            else {
                                g2 = czg.g();
                            }
                        }
                        czg.k();
                        if (g2.equals("o")) {
                            cwo2 = f2;
                        }
                        else {
                            if (!g2.equals("d") && !g2.equals("g")) {
                                continue;
                            }
                            ctv.f();
                            list.add(f2);
                        }
                    }
                    czg.j();
                    if (list.size() == 1) {
                        list.add(list.get(0));
                    }
                    cwo = cwo2;
                    continue;
                }
                case 10: {
                    p2 = czg.p();
                    continue;
                }
                case 9: {
                    n4 = (float)czg.a();
                    h = cwp;
                    break;
                }
                case 8: {
                    n3 = ciw.e()[czg.b() - 1];
                    h = cwp;
                    break;
                }
                case 7: {
                    n2 = civ.j()[czg.b() - 1];
                    h = cwp;
                    break;
                }
                case 6: {
                    f = cix.f(czg, ctv);
                    continue;
                }
                case 5: {
                    i = cix.j(czg, ctv);
                    continue;
                }
                case 4: {
                    j = cix.j(czg, ctv);
                    continue;
                }
                case 3: {
                    if (czg.b() == 1) {
                        n = 1;
                        continue;
                    }
                    n = 2;
                    h = cwp;
                    break;
                }
                case 2: {
                    k = cix.i(czg, ctv);
                    continue;
                }
                case 1: {
                    czg.i();
                    int b = -1;
                    h = cwp;
                    while (czg.o()) {
                        final int r2 = czg.r(cyn.b);
                        if (r2 != 0) {
                            if (r2 != 1) {
                                czg.m();
                                czg.n();
                            }
                            else {
                                h = cix.h(czg, ctv, b);
                            }
                        }
                        else {
                            b = czg.b();
                        }
                    }
                    czg.k();
                    break;
                }
                case 0: {
                    g = czg.g();
                    continue;
                }
            }
            cwp = h;
        }
        cwq cwq;
        if ((cwq = k) == null) {
            cwq = new cwq((List)Collections.singletonList(new czs(100)));
        }
        return new cxd(g, n, cwp, cwq, j, i, f, n2, n3, n4, list, cwo, p2);
    }
}
