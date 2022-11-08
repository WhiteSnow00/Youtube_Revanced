import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyp
{
    static final eaa a;
    
    static {
        a = eaa.y("k");
    }
    
    public static List a(final czf czf, final ctu ctu, final float n, final czc czc, final boolean b) {
        final ArrayList list = new ArrayList();
        if (czf.q() == 6) {
            ctu.d("Lottie doesn't support expressions.");
            return list;
        }
        czf.i();
        while (czf.o()) {
            if (czf.r(cyp.a) != 0) {
                czf.n();
            }
            else if (czf.q() == 1) {
                czf.h();
                if (czf.q() != 7) {
                    while (czf.o()) {
                        list.add(cyo.a(czf, ctu, n, czc, true, b));
                    }
                }
                else {
                    list.add(cyo.a(czf, ctu, n, czc, false, b));
                }
                czf.j();
            }
            else {
                list.add(cyo.a(czf, ctu, n, czc, false, b));
            }
        }
        czf.k();
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
            final czr czr = list.get(n);
            final int n3 = n + 1;
            final czr czr2 = list.get(n3);
            czr.h = czr2.g;
            n = n3;
            if (czr.c != null) {
                continue;
            }
            final Object b = czr2.b;
            n = n3;
            if (b == null) {
                continue;
            }
            czr.c = b;
            n = n3;
            if (!(czr instanceof cvw)) {
                continue;
            }
            ((cvw)czr).a();
            n = n3;
        }
        final czr czr3 = list.get(n2);
        if ((czr3.b == null || czr3.c == null) && list.size() > 1) {
            list.remove(czr3);
        }
    }
}
