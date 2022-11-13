import android.graphics.Path$FillType;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyy
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "c", "o", "fillEnabled", "r", "hd");
    }
    
    static cxj a(final czg czg, final ctv ctv) {
        cwq i = null;
        String g = null;
        cwn e = null;
        int b = 1;
        boolean p2 = false;
        boolean p3 = false;
        while (czg.o()) {
            final int r = czg.r(cyy.a);
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
                                    p3 = czg.p();
                                }
                            }
                            else {
                                b = czg.b();
                            }
                        }
                        else {
                            p2 = czg.p();
                        }
                    }
                    else {
                        i = cix.i(czg, ctv);
                    }
                }
                else {
                    e = cix.e(czg, ctv);
                }
            }
            else {
                g = czg.g();
            }
        }
        cwq cwq;
        if (i == null) {
            cwq = new cwq((List)Collections.singletonList(new czs(100)));
        }
        else {
            cwq = i;
        }
        Path$FillType path$FillType;
        if (b == 1) {
            path$FillType = Path$FillType.WINDING;
        }
        else {
            path$FillType = Path$FillType.EVEN_ODD;
        }
        return new cxj(g, p2, path$FillType, e, cwq, p3);
    }
}
