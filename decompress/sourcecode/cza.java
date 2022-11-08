import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cza
{
    private static final eaa a;
    private static final eaa b;
    
    static {
        a = eaa.y("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
        b = eaa.y("n", "v");
    }
    
    static cxl a(final czf czf, final ctu ctu) {
        final ArrayList list = new ArrayList();
        String g = null;
        cwn cwn = null;
        cwm e = null;
        cwn f = null;
        int n = 0;
        int n2 = 0;
        float n3 = 0.0f;
        boolean p2 = false;
        cwp i = null;
        while (czf.o()) {
            switch (czf.r(cza.a)) {
                default: {
                    czf.n();
                    continue;
                }
                case 8: {
                    czf.h();
                    Object o = cwn;
                    while (czf.o()) {
                        czf.i();
                        Object f2 = null;
                        String g2 = null;
                        while (czf.o()) {
                            final int r = czf.r(cza.b);
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
                        final int hashCode = g2.hashCode();
                        int n4 = 0;
                        Label_0275: {
                            if (hashCode != 100) {
                                if (hashCode != 103) {
                                    if (hashCode == 111) {
                                        if (g2.equals("o")) {
                                            n4 = 0;
                                            break Label_0275;
                                        }
                                    }
                                }
                                else if (g2.equals("g")) {
                                    n4 = 2;
                                    break Label_0275;
                                }
                            }
                            else if (g2.equals("d")) {
                                n4 = 1;
                                break Label_0275;
                            }
                            n4 = -1;
                        }
                        if (n4 != 0) {
                            if (n4 != 1 && n4 != 2) {
                                continue;
                            }
                            ctu.f();
                            list.add(f2);
                        }
                        else {
                            o = f2;
                        }
                    }
                    czf.j();
                    if (list.size() == 1) {
                        list.add(list.get(0));
                        cwn = (cwn)o;
                        continue;
                    }
                    cwn = (cwn)o;
                    continue;
                }
                case 7: {
                    p2 = czf.p();
                    continue;
                }
                case 6: {
                    n3 = (float)czf.a();
                    continue;
                }
                case 5: {
                    n2 = civ.e()[czf.b() - 1];
                    continue;
                }
                case 4: {
                    n = ciu.j()[czf.b() - 1];
                    continue;
                }
                case 3: {
                    i = ciw.i(czf, ctu);
                    continue;
                }
                case 2: {
                    f = ciw.f(czf, ctu);
                    continue;
                }
                case 1: {
                    e = ciw.e(czf, ctu);
                    continue;
                }
                case 0: {
                    g = czf.g();
                    continue;
                }
            }
        }
        cwp cwp;
        if ((cwp = i) == null) {
            cwp = new cwp((List)Collections.singletonList(new czr(100)));
        }
        return new cxl(g, cwn, (List)list, e, cwp, f, n, n2, n3, p2);
    }
}
