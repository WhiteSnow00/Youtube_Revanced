import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cym
{
    private static final eaa a;
    private static final eaa b;
    private static final eaa c;
    
    static {
        a = eaa.y("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
        b = eaa.y("p", "k");
        c = eaa.y("n", "v");
    }
    
    static cxc a(final czf czf, final ctu ctu) {
        final ArrayList list = new ArrayList();
        String g = null;
        int n = 0;
        cwo cwo = null;
        cwr j = null;
        cwr i = null;
        cwn f = null;
        int n2 = 0;
        int n3 = 0;
        float n4 = 0.0f;
        cwn cwn = null;
        boolean p2 = false;
        cwp k = null;
        while (czf.o()) {
            switch (czf.r(cym.a)) {
                default: {
                    czf.m();
                    czf.n();
                    continue;
                }
                case 11: {
                    czf.h();
                    cwn cwn2 = cwn;
                    while (czf.o()) {
                        czf.i();
                        cwn f2 = null;
                        String g2 = null;
                        while (czf.o()) {
                            final int r = czf.r(cym.c);
                            if (r != 0) {
                                if (r != 1) {
                                    czf.m();
                                    czf.n();
                                }
                                else {
                                    f2 = ciw.f(czf, ctu);
                                }
                            }
                            else {
                                g2 = czf.g();
                            }
                        }
                        czf.k();
                        if (g2.equals("o")) {
                            cwn2 = f2;
                        }
                        else {
                            if (!g2.equals("d") && !g2.equals("g")) {
                                continue;
                            }
                            ctu.f();
                            list.add(f2);
                        }
                    }
                    czf.j();
                    if (list.size() == 1) {
                        list.add(list.get(0));
                    }
                    cwn = cwn2;
                    continue;
                }
                case 10: {
                    p2 = czf.p();
                    continue;
                }
                case 9: {
                    n4 = (float)czf.a();
                    continue;
                }
                case 8: {
                    n3 = civ.e()[czf.b() - 1];
                    continue;
                }
                case 7: {
                    n2 = ciu.j()[czf.b() - 1];
                    continue;
                }
                case 6: {
                    f = ciw.f(czf, ctu);
                    continue;
                }
                case 5: {
                    i = ciw.j(czf, ctu);
                    continue;
                }
                case 4: {
                    j = ciw.j(czf, ctu);
                    continue;
                }
                case 3: {
                    if (czf.b() == 1) {
                        n = 1;
                        continue;
                    }
                    n = 2;
                    continue;
                }
                case 2: {
                    k = ciw.i(czf, ctu);
                    continue;
                }
                case 1: {
                    czf.i();
                    int b = -1;
                    cwo h = cwo;
                    while (czf.o()) {
                        final int r2 = czf.r(cym.b);
                        if (r2 != 0) {
                            if (r2 != 1) {
                                czf.m();
                                czf.n();
                            }
                            else {
                                h = ciw.h(czf, ctu, b);
                            }
                        }
                        else {
                            b = czf.b();
                        }
                    }
                    czf.k();
                    cwo = h;
                    continue;
                }
                case 0: {
                    g = czf.g();
                    continue;
                }
            }
        }
        cwp cwp;
        if ((cwp = k) == null) {
            cwp = new cwp((List)Collections.singletonList(new czr(100)));
        }
        return new cxc(g, n, cwo, cwp, j, i, f, n2, n3, n4, (List)list, cwn, p2);
    }
}
