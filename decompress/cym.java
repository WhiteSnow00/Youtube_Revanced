import java.util.List;
import java.util.Collections;
import android.graphics.Path$FillType;

// 
// Decompiled by Procyon v0.6.0
// 

final class cym
{
    private static final eab a;
    private static final eab b;
    
    static {
        a = eab.y("nm", "g", "o", "t", "s", "e", "r", "hd");
        b = eab.y("p", "k");
    }
    
    static cxc a(final czg czg, final ctv ctv) {
        final Path$FillType winding = Path$FillType.WINDING;
        final cwq cwq = null;
        String g = null;
        cws j;
        Object h = j = null;
        int n = 0;
        boolean p2 = false;
        cws i = j;
        Path$FillType path$FillType = winding;
        cwq k = cwq;
        while (czg.o()) {
            switch (czg.r(cym.a)) {
                default: {
                    czg.m();
                    czg.n();
                    continue;
                }
                case 7: {
                    p2 = czg.p();
                    continue;
                }
                case 6: {
                    if (czg.b() == 1) {
                        path$FillType = Path$FillType.WINDING;
                        continue;
                    }
                    path$FillType = Path$FillType.EVEN_ODD;
                    continue;
                }
                case 5: {
                    j = cix.j(czg, ctv);
                    continue;
                }
                case 4: {
                    i = cix.j(czg, ctv);
                    continue;
                }
                case 3: {
                    if (czg.b() == 1) {
                        n = 1;
                        continue;
                    }
                    n = 2;
                    continue;
                }
                case 2: {
                    k = cix.i(czg, ctv);
                    continue;
                }
                case 1: {
                    czg.i();
                    int b = -1;
                    while (czg.o()) {
                        final int r = czg.r(cym.b);
                        if (r != 0) {
                            if (r != 1) {
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
                    continue;
                }
                case 0: {
                    g = czg.g();
                    continue;
                }
            }
        }
        if (k == null) {
            k = new cwq((List)Collections.singletonList(new czs(100)));
        }
        return new cxc(g, n, path$FillType, (cwp)h, k, i, j, p2);
    }
}
