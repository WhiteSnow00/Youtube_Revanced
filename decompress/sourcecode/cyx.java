import android.graphics.Path$FillType;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyx
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "c", "o", "fillEnabled", "r", "hd");
    }
    
    static cxi a(final czf czf, final ctu ctu) {
        cwp i = null;
        cwm e;
        Object g = e = null;
        int b = 1;
        boolean p2 = false;
        boolean p3 = false;
        while (czf.o()) {
            final int r = czf.r(cyx.a);
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
                                    p3 = czf.p();
                                }
                            }
                            else {
                                b = czf.b();
                            }
                        }
                        else {
                            p2 = czf.p();
                        }
                    }
                    else {
                        i = ciw.i(czf, ctu);
                    }
                }
                else {
                    e = ciw.e(czf, ctu);
                }
            }
            else {
                g = czf.g();
            }
        }
        cwp cwp;
        if ((cwp = i) == null) {
            cwp = new cwp((List)Collections.singletonList(new czr(100)));
        }
        Path$FillType path$FillType;
        if (b == 1) {
            path$FillType = Path$FillType.WINDING;
        }
        else {
            path$FillType = Path$FillType.EVEN_ODD;
        }
        return new cxi((String)g, p2, path$FillType, e, cwp, p3);
    }
}
