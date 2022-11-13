import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class czb
{
    private static final eab a;
    private static final eab b;
    
    static {
        a = eab.y("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
        b = eab.y("n", "v");
    }
    
    static cxm a(final czg czg, final ctv ctv) {
        final ArrayList list = new ArrayList();
        String g = null;
        cwo cwo = null;
        cwn e = null;
        cwo f = null;
        int n = 0;
        int n2 = 0;
        float n3 = 0.0f;
        boolean p2 = false;
        cwq i = null;
        while (czg.o()) {
            switch (czg.r(czb.a)) {
                default: {
                    czg.n();
                    continue;
                }
                case 8: {
                    czg.h();
                    Object o = cwo;
                    while (czg.o()) {
                        czg.i();
                        Object f2 = null;
                        String g2 = null;
                        while (czg.o()) {
                            final int r = czg.r(czb.b);
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
                        final int hashCode = g2.hashCode();
                        int n4 = 0;
                        Label_0264: {
                            if (hashCode != 100) {
                                if (hashCode != 103) {
                                    if (hashCode == 111) {
                                        if (g2.equals("o")) {
                                            n4 = 0;
                                            break Label_0264;
                                        }
                                    }
                                }
                                else if (g2.equals("g")) {
                                    n4 = 2;
                                    break Label_0264;
                                }
                            }
                            else if (g2.equals("d")) {
                                n4 = 1;
                                break Label_0264;
                            }
                            n4 = -1;
                        }
                        if (n4 != 0) {
                            if (n4 != 1 && n4 != 2) {
                                continue;
                            }
                            ctv.f();
                            list.add(f2);
                        }
                        else {
                            o = f2;
                        }
                    }
                    czg.j();
                    if (list.size() == 1) {
                        list.add(list.get(0));
                        cwo = (cwo)o;
                        continue;
                    }
                    cwo = (cwo)o;
                    continue;
                }
                case 7: {
                    p2 = czg.p();
                    continue;
                }
                case 6: {
                    n3 = (float)czg.a();
                    continue;
                }
                case 5: {
                    n2 = ciw.e()[czg.b() - 1];
                    continue;
                }
                case 4: {
                    n = civ.j()[czg.b() - 1];
                    continue;
                }
                case 3: {
                    i = cix.i(czg, ctv);
                    continue;
                }
                case 2: {
                    f = cix.f(czg, ctv);
                    continue;
                }
                case 1: {
                    e = cix.e(czg, ctv);
                    continue;
                }
                case 0: {
                    g = czg.g();
                    continue;
                }
            }
        }
        cwq cwq;
        if ((cwq = i) == null) {
            cwq = new cwq((List)Collections.singletonList(new czs(100)));
        }
        return new cxm(g, cwo, list, e, cwq, f, n, n2, n3, p2);
    }
}
