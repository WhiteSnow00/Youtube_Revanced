import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyq
{
    static final eab a;
    
    static {
        a = eab.y("k");
    }
    
    public static List a(final czg czg, final ctv ctv, final float n, final czd czd, final boolean b) {
        final ArrayList list = new ArrayList();
        if (czg.q() == 6) {
            ctv.d("Lottie doesn't support expressions.");
            return list;
        }
        czg.i();
        while (czg.o()) {
            if (czg.r(cyq.a) != 0) {
                czg.n();
            }
            else if (czg.q() == 1) {
                czg.h();
                if (czg.q() != 7) {
                    while (czg.o()) {
                        list.add(cyp.a(czg, ctv, n, czd, true, b));
                    }
                }
                else {
                    list.add(cyp.a(czg, ctv, n, czd, false, b));
                }
                czg.j();
            }
            else {
                list.add(cyp.a(czg, ctv, n, czd, false, b));
            }
        }
        czg.k();
        b(list);
        return list;
    }
    
    public static void b(final List list) {
        final int size = list.size();
        int n = 0;
        int n2;
        while (true) {
            n2 = size - 1;
            if (n >= n2) {
                break;
            }
            final czs czs = list.get(n);
            final int n3 = n + 1;
            final czs czs2 = list.get(n3);
            czs.h = czs2.g;
            n = n3;
            if (czs.c != null) {
                continue;
            }
            final Object b = czs2.b;
            n = n3;
            if (b == null) {
                continue;
            }
            czs.c = b;
            n = n3;
            if (!(czs instanceof cvx)) {
                continue;
            }
            ((cvx)czs).a();
            n = n3;
        }
        final czs czs3 = list.get(n2);
        if ((czs3.b == null || czs3.c == null) && list.size() > 1) {
            list.remove(czs3);
        }
    }
}
