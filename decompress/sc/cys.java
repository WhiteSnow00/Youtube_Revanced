import android.graphics.Rect;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cys
{
    static final eab a;
    private static final eab b;
    private static final eab c;
    private static final eab d;
    
    static {
        b = eab.y("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
        a = eab.y("id", "layers", "w", "h", "p", "u");
        c = eab.y("list");
        d = eab.y("cm", "tm", "dr");
    }
    
    public static ctv a(final czg czg) {
        final float a = czr.a();
        final abl e = new abl();
        final ArrayList f = new ArrayList();
        final HashMap a2 = new HashMap();
        final HashMap b = new HashMap();
        HashMap c = new HashMap();
        ArrayList list = new ArrayList();
        abp d = new abp();
        final ctv ctv = new ctv();
        czg.i();
        float h = 0.0f;
        float i = 0.0f;
        float j = 0.0f;
        int b2 = 0;
        int b3 = 0;
        while (czg.o()) {
            ArrayList list2 = null;
            HashMap hashMap2 = null;
            Label_1059: {
                switch (czg.r(cys.b)) {
                    default: {
                        final HashMap hashMap = c;
                        list2 = list;
                        czg.m();
                        czg.n();
                        hashMap2 = hashMap;
                        break Label_1059;
                    }
                    case 10: {
                        czg.h();
                        while (czg.o()) {
                            czg.i();
                            while (czg.o()) {
                                final int r = czg.r(cys.d);
                                if (r != 0) {
                                    if (r != 1) {
                                        if (r != 2) {
                                            czg.m();
                                            czg.n();
                                        }
                                        else {
                                            czg.a();
                                        }
                                    }
                                    else {
                                        czg.a();
                                    }
                                }
                                else {
                                    czg.g();
                                }
                            }
                            czg.k();
                            list.add(new civ());
                        }
                        czg.j();
                        break;
                    }
                    case 9: {
                        czg.h();
                        while (czg.o()) {
                            final cwi a3 = cyj.a(czg, ctv);
                            d.h(a3.hashCode(), a3);
                        }
                        czg.j();
                        break;
                    }
                    case 8: {
                        czg.i();
                        while (czg.o()) {
                            if (czg.r(cys.c) != 0) {
                                czg.m();
                                czg.n();
                            }
                            else {
                                czg.h();
                                while (czg.o()) {
                                    final ajb a4 = cyk.a(czg);
                                    c.put(a4.c, a4);
                                }
                                czg.j();
                            }
                        }
                        czg.k();
                        break;
                    }
                    case 7: {
                        czg.h();
                        int n = b3;
                        final int n2 = b2;
                        final float n3 = i;
                        final float n4 = h;
                        while (czg.o()) {
                            final ArrayList list3 = new ArrayList();
                            final abl abl = new abl();
                            czg.i();
                            String g = null;
                            String g2 = null;
                            final int n5 = 0;
                            int b4 = 0;
                            final int n6 = n;
                            int b5 = n5;
                            while (czg.o()) {
                                final int r2 = czg.r(cys.a);
                                if (r2 != 0) {
                                    if (r2 != 1) {
                                        if (r2 != 2) {
                                            if (r2 != 3) {
                                                if (r2 != 4) {
                                                    if (r2 != 5) {
                                                        czg.m();
                                                        czg.n();
                                                    }
                                                    else {
                                                        czg.g();
                                                    }
                                                }
                                                else {
                                                    g = czg.g();
                                                }
                                            }
                                            else {
                                                b4 = czg.b();
                                            }
                                        }
                                        else {
                                            b5 = czg.b();
                                        }
                                    }
                                    else {
                                        czg.h();
                                        while (czg.o()) {
                                            final cxs b6 = cyr.b(czg, ctv);
                                            abl.i(b6.d, (Object)b6);
                                            list3.add(b6);
                                        }
                                        czg.j();
                                    }
                                }
                                else {
                                    g2 = czg.g();
                                }
                            }
                            czg.k();
                            if (g != null) {
                                final cuj cuj = new cuj(b5, b4, g2, g);
                                b.put(cuj.c, cuj);
                            }
                            else {
                                a2.put(g2, list3);
                            }
                            n = n6;
                        }
                        final ArrayList list4 = list;
                        h = n4;
                        i = n3;
                        b2 = n2;
                        b3 = n;
                        czg.j();
                        hashMap2 = c;
                        list2 = list4;
                        break Label_1059;
                    }
                    case 6: {
                        final HashMap hashMap3 = c;
                        list2 = list;
                        czg.h();
                        int n7 = 0;
                        while (czg.o()) {
                            final cxs b7 = cyr.b(czg, ctv);
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
                                czk.a(sb.toString());
                                n7 = n8;
                            }
                        }
                        czg.j();
                        hashMap2 = hashMap3;
                        break Label_1059;
                    }
                    case 5: {
                        final HashMap hashMap4 = c;
                        final ArrayList list5 = list;
                        final abp abp = d;
                        final float n9 = h;
                        final float n10 = i;
                        final int n11 = b2;
                        final int n12 = b3;
                        final String[] split = czg.g().split("\\.");
                        hashMap2 = hashMap4;
                        list2 = list5;
                        d = abp;
                        i = n10;
                        h = n9;
                        b3 = n12;
                        b2 = n11;
                        if (!czr.k(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                            ctv.d("Lottie only supports bodymovin >= 4.4.0");
                            hashMap2 = hashMap4;
                            list2 = list5;
                            d = abp;
                            i = n10;
                            h = n9;
                            b3 = n12;
                            b2 = n11;
                        }
                        break Label_1059;
                    }
                    case 4: {
                        j = (float)czg.a();
                        continue;
                    }
                    case 3: {
                        i = (float)czg.a() - 0.01f;
                        continue;
                    }
                    case 2: {
                        h = (float)czg.a();
                        continue;
                    }
                    case 1: {
                        b3 = czg.b();
                        continue;
                    }
                    case 0: {
                        b2 = czg.b();
                        continue;
                    }
                }
                final ArrayList list6 = list;
                hashMap2 = c;
                list2 = list6;
                break Label_1059;
                continue;
            }
            final ArrayList list7 = list2;
            c = hashMap2;
            list = list7;
        }
        ctv.g = new Rect(0, 0, (int)(b2 * a), (int)(b3 * a));
        ctv.h = h;
        ctv.i = i;
        ctv.j = j;
        ctv.f = f;
        ctv.e = e;
        ctv.a = a2;
        ctv.b = b;
        ctv.d = d;
        ctv.c = c;
        return ctv;
    }
}
