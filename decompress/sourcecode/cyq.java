import android.view.animation.Interpolator;
import android.graphics.Color;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyq
{
    private static final eaa a;
    private static final eaa b;
    private static final eaa c;
    
    static {
        a = eaa.y("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
        b = eaa.y("d", "a");
        c = eaa.y("nm");
    }
    
    public static cxr a(final ctu ctu) {
        final Rect g = ctu.g;
        return new cxr(Collections.emptyList(), ctu, "__container", -1L, 1, -1L, null, Collections.emptyList(), new cww((cwq)null, (cwx)null, (cws)null, (cwn)null, (cwp)null, (cwn)null, (cwn)null, (cwn)null, (cwn)null), 0, 0, 0, 0.0f, 0.0f, g.width(), g.height(), null, null, Collections.emptyList(), 1, null, false, null);
    }
    
    public static cxr b(final czf czf, final ctu ctu) {
        czf czf2 = czf;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        czf.i();
        boolean b = false;
        final Float value = 0.0f;
        int n = 1;
        long n2 = 0L;
        long n3 = -1L;
        Object g = null;
        float n4 = 0.0f;
        int n5 = 0;
        String g2 = null;
        cww a = null;
        int n6 = 0;
        int n7 = 0;
        int color = 0;
        float i = 0.0f;
        float n8 = 1.0f;
        float n9 = 0.0f;
        int n10 = 0;
        int n11 = 0;
        cwv cwv = null;
        der a2 = null;
        int n12 = 1;
        cwn g3 = null;
        boolean p2 = false;
        String g4 = "UNSET";
        while (czf.o()) {
            int n13 = 0;
            Label_1345: {
                Label_1324: {
                    Label_1096: {
                        switch (czf2.r(cyq.a)) {
                            default: {
                                czf.m();
                                czf.n();
                                n13 = n5;
                                break Label_1345;
                            }
                            case 22: {
                                p2 = czf.p();
                                continue;
                            }
                            case 21: {
                                g = czf.g();
                                continue;
                            }
                            case 20: {
                                g3 = ciw.g(czf2, ctu, b);
                                continue;
                            }
                            case 19: {
                                i = (float)czf.a();
                                break;
                            }
                            case 18: {
                                n4 = (float)czf.a();
                                break;
                            }
                            case 17: {
                                n11 = (int)(czf.b() * czq.a());
                                break;
                            }
                            case 16: {
                                n10 = (int)(czf.b() * czq.a());
                                break;
                            }
                            case 15: {
                                n9 = (float)czf.a();
                                break;
                            }
                            case 14: {
                                n8 = (float)czf.a();
                                break;
                            }
                            case 13: {
                                czf.h();
                                final ArrayList list3 = new ArrayList();
                                while (czf.o()) {
                                    czf.i();
                                    while (czf.o()) {
                                        if (czf2.r(cyq.c) != 0) {
                                            czf.m();
                                            czf.n();
                                        }
                                        else {
                                            list3.add(czf.g());
                                        }
                                    }
                                    czf.k();
                                }
                                czf.j();
                                ctu.d("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(list3.toString()));
                                break Label_1096;
                            }
                            case 12: {
                                czf.i();
                                while (czf.o()) {
                                    final int r = czf2.r(cyq.b);
                                    if (r != 0) {
                                        if (r != n) {
                                            czf.m();
                                            czf.n();
                                        }
                                        else {
                                            czf.h();
                                            if (czf.o()) {
                                                a2 = cyc.a(czf, ctu);
                                            }
                                            while (czf.o()) {
                                                czf.n();
                                            }
                                            czf.j();
                                        }
                                    }
                                    else {
                                        cwv = new cwv(ciw.l(czf2, ctu, (czc)cyg.a));
                                    }
                                }
                                czf.k();
                                break;
                            }
                            case 11: {
                                czf.h();
                                while (czf.o()) {
                                    final cxa a3 = cyf.a(czf, ctu);
                                    if (a3 != null) {
                                        list2.add(a3);
                                    }
                                }
                                czf.j();
                                break Label_1096;
                            }
                            case 10: {
                                czf.h();
                                while (czf.o()) {
                                    czf.i();
                                    boolean p3 = false;
                                    int n14 = 0;
                                    cwt k = null;
                                    cwp j = null;
                                    while (czf.o()) {
                                        final String f = czf.f();
                                        final int hashCode = f.hashCode();
                                        int n15 = 0;
                                        Label_0727: {
                                            if (hashCode != 111) {
                                                if (hashCode != 3588) {
                                                    if (hashCode != 104433) {
                                                        if (hashCode == 3357091) {
                                                            if (f.equals("mode")) {
                                                                n15 = 0;
                                                                break Label_0727;
                                                            }
                                                        }
                                                    }
                                                    else if (f.equals("inv")) {
                                                        n15 = 3;
                                                        break Label_0727;
                                                    }
                                                }
                                                else if (f.equals("pt")) {
                                                    n15 = 1;
                                                    break Label_0727;
                                                }
                                            }
                                            else if (f.equals("o")) {
                                                n15 = 2;
                                                break Label_0727;
                                            }
                                            n15 = -1;
                                        }
                                        int n16 = 0;
                                        Label_1001: {
                                            if (n15 != 0) {
                                                if (n15 != 1) {
                                                    if (n15 != 2) {
                                                        if (n15 != 3) {
                                                            czf.n();
                                                            n16 = n14;
                                                        }
                                                        else {
                                                            p3 = czf.p();
                                                            n16 = n14;
                                                        }
                                                    }
                                                    else {
                                                        j = ciw.i(czf, ctu);
                                                        n16 = n14;
                                                    }
                                                }
                                                else {
                                                    k = ciw.k(czf, ctu);
                                                    n16 = n14;
                                                }
                                            }
                                            else {
                                                final String g5 = czf.g();
                                                final int hashCode2 = g5.hashCode();
                                                int n17 = 0;
                                                Label_0912: {
                                                    if (hashCode2 != 97) {
                                                        if (hashCode2 != 105) {
                                                            if (hashCode2 != 110) {
                                                                if (hashCode2 == 115) {
                                                                    if (g5.equals("s")) {
                                                                        n17 = 1;
                                                                        break Label_0912;
                                                                    }
                                                                }
                                                            }
                                                            else if (g5.equals("n")) {
                                                                n17 = 2;
                                                                break Label_0912;
                                                            }
                                                        }
                                                        else if (g5.equals("i")) {
                                                            n17 = 3;
                                                            break Label_0912;
                                                        }
                                                    }
                                                    else if (g5.equals("a")) {
                                                        n17 = 0;
                                                        break Label_0912;
                                                    }
                                                    n17 = -1;
                                                }
                                                if (n17 != 0) {
                                                    if (n17 == 1) {
                                                        n16 = 2;
                                                        break Label_1001;
                                                    }
                                                    if (n17 == 2) {
                                                        n16 = 4;
                                                        break Label_1001;
                                                    }
                                                    if (n17 == 3) {
                                                        ctu.d("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                        n16 = 3;
                                                        break Label_1001;
                                                    }
                                                    final StringBuilder sb = new StringBuilder("Unknown mask mode ");
                                                    sb.append(f);
                                                    sb.append(". Defaulting to Add.");
                                                    czj.a(sb.toString());
                                                }
                                                n16 = 1;
                                            }
                                        }
                                        n14 = n16;
                                    }
                                    czf.k();
                                    list.add(new aeyk(n14, k, j, p3));
                                }
                                ctu.e(list.size());
                                czf.j();
                                break Label_1096;
                            }
                            case 9: {
                                final int b2 = czf.b();
                                civ.c();
                                if (b2 >= 6) {
                                    final StringBuilder sb2 = new StringBuilder("Unsupported matte type: ");
                                    sb2.append(b2);
                                    ctu.d(sb2.toString());
                                    break Label_1096;
                                }
                                n12 = civ.c()[b2];
                                final int n18 = n12 - 1;
                                if (n12 != 0) {
                                    if (n18 != 3) {
                                        if (n18 == 4) {
                                            ctu.d("Unsupported matte type: Luma Inverted");
                                        }
                                    }
                                    else {
                                        ctu.d("Unsupported matte type: Luma");
                                    }
                                    ctu.e(1);
                                    n13 = n5;
                                    break Label_1345;
                                }
                                throw null;
                            }
                            case 8: {
                                a = cyd.a(czf, ctu);
                                n13 = n5;
                                break Label_1345;
                            }
                            case 7: {
                                color = Color.parseColor(czf.g());
                                n13 = n5;
                                break Label_1345;
                            }
                            case 6: {
                                n7 = (int)(czf.b() * czq.a());
                                break Label_1324;
                            }
                            case 5: {
                                n6 = (int)(czf.b() * czq.a());
                                break Label_1324;
                            }
                            case 4: {
                                n3 = czf.b();
                                break Label_1324;
                            }
                            case 3: {
                                final int b3 = czf.b();
                                if (b3 < 6) {
                                    n13 = (new int[] { 1, 2, 3, 4, 5, 6, 7 })[b3];
                                    break Label_1345;
                                }
                                n13 = 7;
                                break Label_1345;
                            }
                            case 2: {
                                g2 = czf.g();
                                n13 = n5;
                                break Label_1345;
                            }
                            case 1: {
                                n2 = czf.b();
                                break Label_1324;
                            }
                            case 0: {
                                g4 = czf.g();
                                n13 = n5;
                                break Label_1345;
                            }
                        }
                        b = false;
                        continue;
                    }
                    n13 = n5;
                    break Label_1345;
                }
                n = 1;
                czf2 = czf;
                b = false;
                continue;
            }
            final int n19 = 1;
            b = false;
            czf2 = czf;
            n5 = n13;
            n = n19;
        }
        czf.k();
        final ArrayList list4 = new ArrayList();
        if (n4 > 0.0f) {
            list4.add(new czr(ctu, value, value, null, 0.0f, n4));
        }
        if (i <= 0.0f) {
            i = ctu.i;
        }
        final Float value2 = 1.0f;
        list4.add(new czr(ctu, value2, value2, null, n4, i));
        list4.add(new czr(ctu, value, value, null, i, Float.MAX_VALUE));
        if (g4.endsWith(".ai") || "ai".equals(g)) {
            ctu.d("Convert your Illustrator layers to shape layers.");
        }
        return new cxr(list2, ctu, g4, n2, n5, n3, g2, list, a, n6, n7, color, n8, n9, n10, n11, cwv, a2, list4, n12, g3, p2, null);
    }
}
