import java.util.List;
import android.graphics.PointF;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cye
{
    private static final eab a;
    private static final eab b;
    
    static {
        a = eab.y("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
        b = eab.y("k");
    }
    
    public static cwx a(final czg czg, final ctv ctv) {
        final int q = czg.q();
        if (q == 3) {
            czg.i();
        }
        cwo g = null;
        Object g2 = null;
        cwr a = null;
        cwy b = null;
        cwt cwt = null;
        cwo g3 = null;
        cwq i = null;
        cwo g4 = null;
        cwo g5 = null;
        while (czg.o()) {
            switch (czg.r(cye.a)) {
                default: {
                    czg.m();
                    czg.n();
                    continue;
                }
                case 9: {
                    g2 = cix.g(czg, ctv, false);
                    continue;
                }
                case 8: {
                    g3 = cix.g(czg, ctv, false);
                    continue;
                }
                case 7: {
                    g5 = cix.g(czg, ctv, false);
                    continue;
                }
                case 6: {
                    g4 = cix.g(czg, ctv, false);
                    continue;
                }
                case 5: {
                    i = cix.i(czg, ctv);
                    continue;
                }
                case 3: {
                    ctv.d("Lottie doesn't support 3D layers.");
                }
                case 4: {
                    g = cix.g(czg, ctv, false);
                    if (((cwz)g).a.isEmpty()) {
                        final List a2 = ((cwz)g).a;
                        final Float value = 0.0f;
                        a2.add(new czs(ctv, value, value, null, 0.0f, ctv.i));
                    }
                    else {
                        if (((czs)((cwz)g).a.get(0)).b != null) {
                            continue;
                        }
                        final List a3 = ((cwz)g).a;
                        final Float value2 = 0.0f;
                        a3.set(0, new czs(ctv, value2, value2, null, 0.0f, ctv.i));
                    }
                    continue;
                }
                case 2: {
                    cwt = new cwt(cix.l(czg, ctv, (czd)cyi.f));
                    continue;
                }
                case 1: {
                    b = cyc.b(czg, ctv);
                    continue;
                }
                case 0: {
                    czg.i();
                    while (czg.o()) {
                        if (czg.r(cye.b) != 0) {
                            czg.m();
                            czg.n();
                        }
                        else {
                            a = cyc.a(czg, ctv);
                        }
                    }
                    czg.k();
                    continue;
                }
            }
        }
        if (q == 3) {
            czg.k();
        }
        cwr cwr;
        if (a != null && (!a.c() || !((PointF)((czs)a.a.get(0)).b).equals(0.0f, 0.0f))) {
            cwr = a;
        }
        else {
            cwr = null;
        }
        cwy cwy;
        if (b != null && (b instanceof cwv || !b.c() || !((PointF)((czs)b.b().get(0)).b).equals(0.0f, 0.0f))) {
            cwy = b;
        }
        else {
            cwy = null;
        }
        cwo cwo = null;
        Label_0580: {
            if (g != null) {
                cwo = g;
                if (!((cwz)g).c()) {
                    break Label_0580;
                }
                cwo = g;
                if ((float)((czs)((cwz)g).a.get(0)).b != 0.0f) {
                    break Label_0580;
                }
            }
            cwo = null;
        }
        cwt cwt2 = null;
        Label_0648: {
            Label_0645: {
                if (cwt != null) {
                    if (((cwz)cwt).c()) {
                        final czu czu = (czu)((cwz)cwt).a.get(0).b;
                        if (czu.a == 1.0f && czu.b == 1.0f) {
                            break Label_0645;
                        }
                    }
                    cwt2 = cwt;
                    break Label_0648;
                }
            }
            cwt2 = null;
        }
        if (g3 == null || (((cwz)g3).c() && (float)((czs)((cwz)g3).a.get(0)).b == 0.0f)) {
            g3 = null;
        }
        if (g2 == null || (((cwz)g2).c() && (float)((czs)((cwz)g2).a.get(0)).b == 0.0f)) {
            g2 = null;
        }
        return new cwx(cwr, cwy, cwt2, cwo, i, g4, g5, g3, (cwo)g2);
    }
}
