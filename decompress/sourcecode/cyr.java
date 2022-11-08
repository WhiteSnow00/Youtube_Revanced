import android.graphics.Rect;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyr
{
    static final eaa a;
    private static final eaa b;
    private static final eaa c;
    private static final eaa d;
    
    static {
        b = eaa.y("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
        a = eaa.y("id", "layers", "w", "h", "p", "u");
        c = eaa.y("list");
        d = eaa.y("cm", "tm", "dr");
    }
    
    public static ctu a(final czf czf) {
        final float a = czq.a();
        final abk e = new abk();
        final ArrayList f = new ArrayList();
        final HashMap a2 = new HashMap();
        final HashMap b = new HashMap();
        HashMap c = new HashMap();
        ArrayList list = new ArrayList();
        abo d = new abo();
        final ctu ctu = new ctu();
        czf.i();
        float h = 0.0f;
        float i = 0.0f;
        float j = 0.0f;
        int b2 = 0;
        int b3 = 0;
        while (czf.o()) {
            ArrayList list2 = null;
            HashMap hashMap2 = null;
            Label_1073: {
                switch (czf.r(cyr.b)) {
                    default: {
                        final HashMap hashMap = c;
                        list2 = list;
                        czf.m();
                        czf.n();
                        hashMap2 = hashMap;
                        break Label_1073;
                    }
                    case 10: {
                        czf.h();
                        while (czf.o()) {
                            czf.i();
                            while (czf.o()) {
                                final int r = czf.r(cyr.d);
                                if (r != 0) {
                                    if (r != 1) {
                                        if (r != 2) {
                                            czf.m();
                                            czf.n();
                                        }
                                        else {
                                            czf.a();
                                        }
                                    }
                                    else {
                                        czf.a();
                                    }
                                }
                                else {
                                    czf.g();
                                }
                            }
                            czf.k();
                            list.add(new ciu());
                        }
                        czf.j();
                        break;
                    }
                    case 9: {
                        czf.h();
                        while (czf.o()) {
                            final cwh a3 = cyi.a(czf, ctu);
                            d.h(a3.hashCode(), (Object)a3);
                        }
                        czf.j();
                        break;
                    }
                    case 8: {
                        czf.i();
                        while (czf.o()) {
                            if (czf.r(cyr.c) != 0) {
                                czf.m();
                                czf.n();
                            }
                            else {
                                czf.h();
                                while (czf.o()) {
                                    final aja a4 = cyj.a(czf);
                                    c.put(a4.c, a4);
                                }
                                czf.j();
                            }
                        }
                        czf.k();
                        break;
                    }
                    case 7: {
                        czf.h();
                        int n = b3;
                        final int n2 = b2;
                        final float n3 = i;
                        final float n4 = h;
                        while (czf.o()) {
                            final ArrayList list3 = new ArrayList();
                            final abk abk = new abk();
                            czf.i();
                            String g2;
                            String g = g2 = null;
                            final int n5 = 0;
                            int b4 = 0;
                            final int n6 = n;
                            int b5 = n5;
                            while (czf.o()) {
                                final int r2 = czf.r(cyr.a);
                                if (r2 != 0) {
                                    if (r2 != 1) {
                                        if (r2 != 2) {
                                            if (r2 != 3) {
                                                if (r2 != 4) {
                                                    if (r2 != 5) {
                                                        czf.m();
                                                        czf.n();
                                                    }
                                                    else {
                                                        czf.g();
                                                    }
                                                }
                                                else {
                                                    g = czf.g();
                                                }
                                            }
                                            else {
                                                b4 = czf.b();
                                            }
                                        }
                                        else {
                                            b5 = czf.b();
                                        }
                                    }
                                    else {
                                        czf.h();
                                        while (czf.o()) {
                                            final cxr b6 = cyq.b(czf, ctu);
                                            abk.i(b6.d, (Object)b6);
                                            list3.add(b6);
                                        }
                                        czf.j();
                                    }
                                }
                                else {
                                    g2 = czf.g();
                                }
                            }
                            czf.k();
                            if (g != null) {
                                final cui cui = new cui(b5, b4, g2, g);
                                b.put(cui.c, cui);
                            }
                            else {
                                a2.put(g2, list3);
                            }
                            n = n6;
                        }
                        final HashMap hashMap3 = c;
                        list2 = list;
                        h = n4;
                        i = n3;
                        b2 = n2;
                        b3 = n;
                        czf.j();
                        hashMap2 = hashMap3;
                        break Label_1073;
                    }
                    case 6: {
                        final HashMap hashMap4 = c;
                        list2 = list;
                        czf.h();
                        int n7 = 0;
                        while (czf.o()) {
                            final cxr b7 = cyq.b(czf, ctu);
                            int n8 = n7;
                            if (b7.t == 3) {
                                n8 = n7 + 1;
                            }
                            f.add(b7);
                            e.i(b7.d, (Object)b7);
                            if ((n7 = n8) > 4) {
                                final StringBuilder sb = new StringBuilder("You have ");
                                sb.append(n8);
                                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                czj.a(sb.toString());
                                n7 = n8;
                            }
                        }
                        czf.j();
                        hashMap2 = hashMap4;
                        break Label_1073;
                    }
                    case 5: {
                        final HashMap hashMap5 = c;
                        final ArrayList list4 = list;
                        final abo abo = d;
                        final float n9 = h;
                        final float n10 = i;
                        final int n11 = b2;
                        final int n12 = b3;
                        final String[] split = czf.g().split("\\.");
                        hashMap2 = hashMap5;
                        list2 = list4;
                        d = abo;
                        i = n10;
                        h = n9;
                        b3 = n12;
                        b2 = n11;
                        if (!czq.k(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                            ctu.d("Lottie only supports bodymovin >= 4.4.0");
                            hashMap2 = hashMap5;
                            list2 = list4;
                            d = abo;
                            i = n10;
                            h = n9;
                            b3 = n12;
                            b2 = n11;
                        }
                        break Label_1073;
                    }
                    case 4: {
                        j = (float)czf.a();
                        continue;
                    }
                    case 3: {
                        i = (float)czf.a() - 0.01f;
                        continue;
                    }
                    case 2: {
                        h = (float)czf.a();
                        continue;
                    }
                    case 1: {
                        b3 = czf.b();
                        continue;
                    }
                    case 0: {
                        b2 = czf.b();
                        continue;
                    }
                }
                final HashMap hashMap6 = c;
                list2 = list;
                hashMap2 = hashMap6;
                break Label_1073;
                continue;
            }
            final HashMap hashMap7 = hashMap2;
            list = list2;
            c = hashMap7;
        }
        ctu.g = new Rect(0, 0, (int)(b2 * a), (int)(b3 * a));
        ctu.h = h;
        ctu.i = i;
        ctu.j = j;
        ctu.f = f;
        ctu.e = e;
        ctu.a = a2;
        ctu.b = b;
        ctu.d = d;
        ctu.c = c;
        return ctu;
    }
}
