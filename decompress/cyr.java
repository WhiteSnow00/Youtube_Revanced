import android.view.animation.Interpolator;
import android.graphics.Color;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyr
{
    private static final eab a;
    private static final eab b;
    private static final eab c;
    
    static {
        a = eab.y("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
        b = eab.y("d", "a");
        c = eab.y("nm");
    }
    
    public static cxs a(final ctv ctv) {
        final Rect g = ctv.g;
        return new cxs(Collections.emptyList(), ctv, "__container", -1L, 1, -1L, null, Collections.emptyList(), new cwx(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, g.width(), g.height(), null, null, Collections.emptyList(), 1, null, false, null);
    }
    
    public static cxs b(final czg czg, final ctv ctv) {
        czg czg2 = czg;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        czg.i();
        int n = 1;
        boolean b = false;
        final Float value = 0.0f;
        long n2 = -1L;
        long n3 = 0L;
        float n4 = 0.0f;
        int n5 = 0;
        String g = null;
        cwx a = null;
        int n6 = 0;
        int n7 = 0;
        int color = 0;
        float n8 = 0.0f;
        float n9 = 1.0f;
        float n10 = 0.0f;
        int n11 = 0;
        int n12 = 0;
        cww cww = null;
        des a2 = null;
        int n13 = 1;
        cwo g2 = null;
        boolean p2 = false;
        String g3 = "UNSET";
        Object g4 = null;
        while (czg.o()) {
            int n14 = 0;
            Label_1361: {
                Label_1230: {
                    switch (czg2.r(cyr.a)) {
                        default: {
                            czg.m();
                            czg.n();
                            n14 = n5;
                            break Label_1361;
                        }
                        case 22: {
                            p2 = czg.p();
                            continue;
                        }
                        case 21: {
                            g4 = czg.g();
                            continue;
                        }
                        case 20: {
                            g2 = cix.g(czg2, ctv, b);
                            continue;
                        }
                        case 19: {
                            n8 = (float)czg.a();
                            continue;
                        }
                        case 18: {
                            n4 = (float)czg.a();
                            continue;
                        }
                        case 17: {
                            n12 = (int)(czg.b() * czr.a());
                            continue;
                        }
                        case 16: {
                            n11 = (int)(czg.b() * czr.a());
                            continue;
                        }
                        case 15: {
                            n10 = (float)czg.a();
                            continue;
                        }
                        case 14: {
                            n9 = (float)czg.a();
                            continue;
                        }
                        case 13: {
                            czg.h();
                            final ArrayList list3 = new ArrayList();
                            while (czg.o()) {
                                czg.i();
                                while (czg.o()) {
                                    if (czg2.r(cyr.c) != 0) {
                                        czg.m();
                                        czg.n();
                                    }
                                    else {
                                        list3.add(czg.g());
                                    }
                                }
                                czg.k();
                            }
                            czg.j();
                            ctv.d("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(list3.toString()));
                            break;
                        }
                        case 12: {
                            czg.i();
                            while (czg.o()) {
                                final int r = czg2.r(cyr.b);
                                if (r != 0) {
                                    if (r != n) {
                                        czg.m();
                                        czg.n();
                                    }
                                    else {
                                        czg.h();
                                        if (czg.o()) {
                                            a2 = cyd.a(czg, ctv);
                                        }
                                        while (czg.o()) {
                                            czg.n();
                                        }
                                        czg.j();
                                    }
                                }
                                else {
                                    cww = new cww(cix.l(czg2, ctv, (czd)cyh.a));
                                }
                            }
                            czg.k();
                            continue;
                        }
                        case 11: {
                            czg.h();
                            while (czg.o()) {
                                final cxb a3 = cyg.a(czg, ctv);
                                if (a3 != null) {
                                    list2.add(a3);
                                }
                            }
                            czg.j();
                            break;
                        }
                        case 10: {
                            czg.h();
                            while (czg.o()) {
                                czg.i();
                                boolean p3 = false;
                                cwq i = null;
                                int n15 = 0;
                                cwu k = null;
                                while (czg.o()) {
                                    final String f = czg.f();
                                    final int hashCode = f.hashCode();
                                    int n16 = 0;
                                    Label_0734: {
                                        if (hashCode != 111) {
                                            if (hashCode != 3588) {
                                                if (hashCode != 104433) {
                                                    if (hashCode == 3357091) {
                                                        if (f.equals("mode")) {
                                                            n16 = 0;
                                                            break Label_0734;
                                                        }
                                                    }
                                                }
                                                else if (f.equals("inv")) {
                                                    n16 = 3;
                                                    break Label_0734;
                                                }
                                            }
                                            else if (f.equals("pt")) {
                                                n16 = 1;
                                                break Label_0734;
                                            }
                                        }
                                        else if (f.equals("o")) {
                                            n16 = 2;
                                            break Label_0734;
                                        }
                                        n16 = -1;
                                    }
                                    int n17 = 0;
                                    Label_0794: {
                                        if (n16 != 0) {
                                            if (n16 != 1) {
                                                if (n16 != 2) {
                                                    if (n16 != 3) {
                                                        czg.n();
                                                    }
                                                    else {
                                                        p3 = czg.p();
                                                    }
                                                }
                                                else {
                                                    i = cix.i(czg, ctv);
                                                }
                                            }
                                            else {
                                                k = cix.k(czg, ctv);
                                            }
                                            n17 = n15;
                                        }
                                        else {
                                            final String g5 = czg.g();
                                            final int hashCode2 = g5.hashCode();
                                            int n18 = 0;
                                            Label_0912: {
                                                if (hashCode2 != 97) {
                                                    if (hashCode2 != 105) {
                                                        if (hashCode2 != 110) {
                                                            if (hashCode2 == 115) {
                                                                if (g5.equals("s")) {
                                                                    n18 = 1;
                                                                    break Label_0912;
                                                                }
                                                            }
                                                        }
                                                        else if (g5.equals("n")) {
                                                            n18 = 2;
                                                            break Label_0912;
                                                        }
                                                    }
                                                    else if (g5.equals("i")) {
                                                        n18 = 3;
                                                        break Label_0912;
                                                    }
                                                }
                                                else if (g5.equals("a")) {
                                                    n18 = 0;
                                                    break Label_0912;
                                                }
                                                n18 = -1;
                                            }
                                            if (n18 != 0) {
                                                if (n18 == 1) {
                                                    n17 = 2;
                                                    break Label_0794;
                                                }
                                                if (n18 == 2) {
                                                    n17 = 4;
                                                    break Label_0794;
                                                }
                                                if (n18 == 3) {
                                                    ctv.d("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                    n17 = 3;
                                                    break Label_0794;
                                                }
                                                final StringBuilder sb = new StringBuilder("Unknown mask mode ");
                                                sb.append(f);
                                                sb.append(". Defaulting to Add.");
                                                czk.a(sb.toString());
                                            }
                                            n17 = 1;
                                        }
                                    }
                                    n15 = n17;
                                }
                                czg.k();
                                list.add(new afaj(n15, k, i, p3));
                            }
                            ctv.e(list.size());
                            czg.j();
                            break;
                        }
                        case 9: {
                            final int b2 = czg.b();
                            ciw.c();
                            if (b2 >= 6) {
                                final StringBuilder sb2 = new StringBuilder("Unsupported matte type: ");
                                sb2.append(b2);
                                ctv.d(sb2.toString());
                                break;
                            }
                            n13 = ciw.c()[b2];
                            final int n19 = n13 - 1;
                            if (n13 != 0) {
                                if (n19 != 3) {
                                    if (n19 == 4) {
                                        ctv.d("Unsupported matte type: Luma Inverted");
                                    }
                                }
                                else {
                                    ctv.d("Unsupported matte type: Luma");
                                }
                                ctv.e(1);
                                n14 = n5;
                                break Label_1361;
                            }
                            throw null;
                        }
                        case 8: {
                            a = cye.a(czg, ctv);
                            n14 = n5;
                            break Label_1361;
                        }
                        case 7: {
                            color = Color.parseColor(czg.g());
                            n14 = n5;
                            break Label_1361;
                        }
                        case 6: {
                            n7 = (int)(czg.b() * czr.a());
                            break Label_1230;
                        }
                        case 5: {
                            n6 = (int)(czg.b() * czr.a());
                            break Label_1230;
                        }
                        case 4: {
                            n2 = czg.b();
                            czg2 = czg;
                            n = 1;
                            b = false;
                            continue;
                        }
                        case 3: {
                            final int b3 = czg.b();
                            if (b3 < 6) {
                                n14 = (new int[] { 1, 2, 3, 4, 5, 6, 7 })[b3];
                                break Label_1361;
                            }
                            n14 = 7;
                            break Label_1361;
                        }
                        case 2: {
                            g = czg.g();
                            n14 = n5;
                            break Label_1361;
                        }
                        case 1: {
                            n3 = czg.b();
                            n14 = n5;
                            break Label_1361;
                        }
                        case 0: {
                            g3 = czg.g();
                            n14 = n5;
                            break Label_1361;
                        }
                    }
                    n14 = n5;
                    break Label_1361;
                }
                b = false;
                czg2 = czg;
                n = 1;
                continue;
            }
            b = false;
            final int n20 = 1;
            czg2 = czg;
            n5 = n14;
            n = n20;
        }
        czg.k();
        final ArrayList list4 = new ArrayList();
        if (n4 > 0.0f) {
            list4.add(new czs(ctv, value, value, null, 0.0f, n4));
        }
        float j = n8;
        if (n8 <= 0.0f) {
            j = ctv.i;
        }
        final Float value2 = 1.0f;
        list4.add(new czs(ctv, value2, value2, null, n4, j));
        list4.add(new czs(ctv, value, value, null, j, Float.MAX_VALUE));
        if (g3.endsWith(".ai") || "ai".equals(g4)) {
            ctv.d("Convert your Illustrator layers to shape layers.");
        }
        return new cxs(list2, ctv, g3, n3, n5, n2, g, list, a, n6, n7, color, n9, n10, n11, n12, cww, a2, list4, n13, g2, p2, null);
    }
}
