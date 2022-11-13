import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyz
{
    private static final eab a;
    
    static {
        a = eab.y("nm", "hd", "it");
    }
    
    static cxk a(final czg czg, final ctv ctv) {
        final ArrayList list = new ArrayList();
        boolean p2 = false;
        String g = null;
        while (czg.o()) {
            final int r = czg.r(cyz.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czg.n();
                    }
                    else {
                        czg.h();
                        while (czg.o()) {
                            final cxb a = cyg.a(czg, ctv);
                            if (a != null) {
                                list.add(a);
                            }
                        }
                        czg.j();
                    }
                }
                else {
                    p2 = czg.p();
                }
            }
            else {
                g = czg.g();
            }
        }
        return new cxk(g, list, p2);
    }
}
