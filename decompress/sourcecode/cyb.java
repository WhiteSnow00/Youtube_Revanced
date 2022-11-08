import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyb
{
    private static final eaa a;
    
    static {
        a = eaa.y("k", "x", "y");
    }
    
    public static cwq a(final czf czf, final ctu ctu) {
        final ArrayList list = new ArrayList();
        if (czf.q() == 1) {
            czf.h();
            while (czf.o()) {
                list.add(new cvw(ctu, cyo.a(czf, ctu, czq.a(), (czc)cyh.d, czf.q() == 3, false)));
            }
            czf.j();
            cyp.b(list);
        }
        else {
            list.add(new czr(cyn.c(czf, czq.a())));
        }
        return new cwq((List)list);
    }
    
    static cwx b(final czf czf, final ctu ctu) {
        czf.i();
        Object a = null;
        cwn f2;
        cwn f = f2 = null;
        boolean b = false;
        while (czf.q() != 4) {
            final int r = czf.r(cyb.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czf.m();
                        czf.n();
                        continue;
                    }
                    if (czf.q() != 6) {
                        f2 = ciw.f(czf, ctu);
                        continue;
                    }
                    czf.n();
                }
                else {
                    if (czf.q() != 6) {
                        f = ciw.f(czf, ctu);
                        continue;
                    }
                    czf.n();
                }
                b = true;
            }
            else {
                a = a(czf, ctu);
            }
        }
        czf.k();
        if (b) {
            ctu.d("Lottie doesn't support expressions.");
        }
        if (a != null) {
            return (cwx)a;
        }
        return (cwx)new cwu(f, f2);
    }
}
