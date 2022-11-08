import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyy
{
    private static final eaa a;
    
    static {
        a = eaa.y("nm", "hd", "it");
    }
    
    static cxj a(final czf czf, final ctu ctu) {
        final ArrayList list = new ArrayList();
        String g = null;
        boolean p2 = false;
        while (czf.o()) {
            final int r = czf.r(cyy.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czf.n();
                    }
                    else {
                        czf.h();
                        while (czf.o()) {
                            final cxa a = cyf.a(czf, ctu);
                            if (a != null) {
                                list.add(a);
                            }
                        }
                        czf.j();
                    }
                }
                else {
                    p2 = czf.p();
                }
            }
            else {
                g = czf.g();
            }
        }
        return new cxj(g, (List)list, p2);
    }
}
