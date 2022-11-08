import java.util.List;
import java.util.Collections;
import android.graphics.Path$FillType;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyl
{
    private static final eaa a;
    private static final eaa b;
    
    static {
        a = eaa.y("nm", "g", "o", "t", "s", "e", "r", "hd");
        b = eaa.y("p", "k");
    }
    
    static cxb a(final czf czf, final ctu ctu) {
        final Path$FillType winding = Path$FillType.WINDING;
        final cwp cwp = null;
        final cwr cwr;
        Object g = cwr = null;
        cwr j = cwr;
        int n = 0;
        boolean p2 = false;
        cwr i = j;
        Object h = cwr;
        Path$FillType path$FillType = winding;
        cwp k = cwp;
        while (czf.o()) {
            switch (czf.r(cyl.a)) {
                default: {
                    czf.m();
                    czf.n();
                    continue;
                }
                case 7: {
                    p2 = czf.p();
                    continue;
                }
                case 6: {
                    if (czf.b() == 1) {
                        path$FillType = Path$FillType.WINDING;
                        continue;
                    }
                    path$FillType = Path$FillType.EVEN_ODD;
                    continue;
                }
                case 5: {
                    j = ciw.j(czf, ctu);
                    continue;
                }
                case 4: {
                    i = ciw.j(czf, ctu);
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
                    while (czf.o()) {
                        final int r = czf.r(cyl.b);
                        if (r != 0) {
                            if (r != 1) {
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
                    continue;
                }
                case 0: {
                    g = czf.g();
                    continue;
                }
            }
        }
        if (k == null) {
            k = new cwp((List)Collections.singletonList(new czr(100)));
        }
        return new cxb((String)g, n, path$FillType, (cwo)h, k, i, j, p2);
    }
}
