import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyc
{
    private static final eab a;
    
    static {
        a = eab.y("k", "x", "y");
    }
    
    public static cwr a(final czg czg, final ctv ctv) {
        final ArrayList list = new ArrayList();
        if (czg.q() == 1) {
            czg.h();
            while (czg.o()) {
                list.add(new cvx(ctv, cyp.a(czg, ctv, czr.a(), cyi.d, czg.q() == 3, false)));
            }
            czg.j();
            cyq.b(list);
        }
        else {
            list.add(new czs(cyo.c(czg, czr.a())));
        }
        return new cwr(list);
    }
    
    static cwy b(final czg czg, final ctv ctv) {
        czg.i();
        boolean b = false;
        cwy a = null;
        cwo f = null;
        cwo f2 = null;
        while (czg.q() != 4) {
            final int r = czg.r(cyc.a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        czg.m();
                        czg.n();
                        continue;
                    }
                    if (czg.q() != 6) {
                        f2 = cix.f(czg, ctv);
                        continue;
                    }
                    czg.n();
                }
                else {
                    if (czg.q() != 6) {
                        f = cix.f(czg, ctv);
                        continue;
                    }
                    czg.n();
                }
                b = true;
            }
            else {
                a = a(czg, ctv);
            }
        }
        czg.k();
        if (b) {
            ctv.d("Lottie doesn't support expressions.");
        }
        if (a != null) {
            return a;
        }
        return new cwv(f, f2);
    }
}
