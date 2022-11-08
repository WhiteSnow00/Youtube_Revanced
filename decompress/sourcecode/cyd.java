import java.util.List;
import android.graphics.PointF;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyd
{
    private static final eaa a;
    private static final eaa b;
    
    static {
        a = eaa.y("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
        b = eaa.y("k");
    }
    
    public static cww a(final czf czf, final ctu ctu) {
        final int q = czf.q();
        if (q == 3) {
            czf.i();
        }
        cwn cwn = null;
        Object g = null;
        cwq a = null;
        cwx b = null;
        cws cws = null;
        cwn g2 = null;
        cwp i = null;
        cwn g3 = null;
        cwn g4 = null;
        while (czf.o()) {
            switch (czf.r(cyd.a)) {
                default: {
                    czf.m();
                    czf.n();
                    continue;
                }
                case 9: {
                    g = ciw.g(czf, ctu, false);
                    continue;
                }
                case 8: {
                    g2 = ciw.g(czf, ctu, false);
                    continue;
                }
                case 7: {
                    g4 = ciw.g(czf, ctu, false);
                    continue;
                }
                case 6: {
                    g3 = ciw.g(czf, ctu, false);
                    continue;
                }
                case 5: {
                    i = ciw.i(czf, ctu);
                    continue;
                }
                case 3: {
                    ctu.d("Lottie doesn't support 3D layers.");
                }
                case 4: {
                    final cwn g5 = ciw.g(czf, ctu, false);
                    if (((cwy)g5).a.isEmpty()) {
                        final List a2 = ((cwy)g5).a;
                        final Float value = 0.0f;
                        a2.add(new czr(ctu, value, value, null, 0.0f, ctu.i));
                    }
                    else {
                        cwn = g5;
                        if (((czr)((cwy)cwn).a.get(0)).b == null) {
                            final List a3 = ((cwy)cwn).a;
                            final Float value2 = 0.0f;
                            a3.set(0, new czr(ctu, value2, value2, null, 0.0f, ctu.i));
                            continue;
                        }
                    }
                    cwn = g5;
                    continue;
                }
                case 2: {
                    cws = new cws(ciw.l(czf, ctu, (czc)cyh.f));
                    continue;
                }
                case 1: {
                    b = cyb.b(czf, ctu);
                    continue;
                }
                case 0: {
                    czf.i();
                    while (czf.o()) {
                        if (czf.r(cyd.b) != 0) {
                            czf.m();
                            czf.n();
                        }
                        else {
                            a = cyb.a(czf, ctu);
                        }
                    }
                    czf.k();
                    continue;
                }
            }
        }
        if (q == 3) {
            czf.k();
        }
        cwq cwq;
        if (a != null && (!a.c() || !((PointF)((czr)a.a.get(0)).b).equals(0.0f, 0.0f))) {
            cwq = a;
        }
        else {
            cwq = null;
        }
        cwx cwx;
        if (b != null && (b instanceof cwu || !b.c() || !((PointF)((czr)b.b().get(0)).b).equals(0.0f, 0.0f))) {
            cwx = b;
        }
        else {
            cwx = null;
        }
        cwn cwn2 = null;
        Label_0571: {
            if (cwn != null) {
                cwn2 = cwn;
                if (!((cwy)cwn).c()) {
                    break Label_0571;
                }
                cwn2 = cwn;
                if ((float)((czr)((cwy)cwn).a.get(0)).b != 0.0f) {
                    break Label_0571;
                }
            }
            cwn2 = null;
        }
        cws cws2 = null;
        Label_0634: {
            Label_0632: {
                if (cws != null) {
                    if (((cwy)cws).c()) {
                        final czt czt = (czt)((cwy)cws).a.get(0).b;
                        if (czt.a == 1.0f && czt.b == 1.0f) {
                            break Label_0632;
                        }
                    }
                    cws2 = cws;
                    break Label_0634;
                }
            }
            cws2 = null;
        }
        if (g2 == null || (((cwy)g2).c() && (float)((czr)((cwy)g2).a.get(0)).b == 0.0f)) {
            g2 = null;
        }
        if (g == null || (((cwy)g).c() && (float)((czr)((cwy)g).a.get(0)).b == 0.0f)) {
            g = null;
        }
        return new cww(cwq, cwx, cws2, cwn2, i, g3, g4, g2, (cwn)g);
    }
}
