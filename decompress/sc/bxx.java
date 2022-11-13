import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Collections;
import android.util.SparseArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxx extends bxh
{
    private final byb a;
    
    public bxx(final List list) {
        super("DvbDecoder");
        final bas bas = new bas((byte[])list.get(0));
        this.a = new byb(bas.m(), bas.m());
    }
    
    protected final bxi n(final byte[] array, int i, final boolean b) {
        if (b) {
            final bya e = this.a.e;
            e.c.clear();
            e.d.clear();
            e.e.clear();
            e.f.clear();
            e.g.clear();
            e.h = null;
            e.i = null;
        }
        final byc byc = new(byc.class)();
        final byb a = this.a;
        final atim atim = new atim(array, i);
        while (atim.d() >= 48 && atim.g(8) == 15) {
            final bya e2 = a.e;
            i = atim.g(8);
            final int g = atim.g(16);
            final int g2 = atim.g(16);
            final int e3 = atim.e();
            if (g2 * 8 > atim.d()) {
                bap.c("DvbParser", "Data field length exceeds limit");
                atim.o(atim.d());
            }
            else {
                switch (i) {
                    case 20: {
                        if (g == e2.a) {
                            atim.o(4);
                            final boolean q = atim.q();
                            atim.o(3);
                            final int g3 = atim.g(16);
                            final int g4 = atim.g(16);
                            int g5;
                            int g6;
                            int g7;
                            if (q) {
                                g5 = atim.g(16);
                                i = atim.g(16);
                                g6 = atim.g(16);
                                g7 = atim.g(16);
                            }
                            else {
                                i = g3;
                                g7 = g4;
                                g5 = 0;
                                g6 = 0;
                            }
                            e2.h = new bxy(g3, g4, g5, i, g6, g7);
                            break;
                        }
                        break;
                    }
                    case 19: {
                        if (g == e2.a) {
                            final afaj b2 = byb.b(atim);
                            e2.e.put(b2.b, (Object)b2);
                            break;
                        }
                        if (g == e2.b) {
                            final afaj b3 = byb.b(atim);
                            e2.g.put(b3.b, (Object)b3);
                            break;
                        }
                        break;
                    }
                    case 18: {
                        if (g == e2.a) {
                            final adge c = byb.c(atim, g2);
                            e2.d.put(c.a, (Object)c);
                            break;
                        }
                        if (g == e2.b) {
                            final adge c2 = byb.c(atim, g2);
                            e2.f.put(c2.a, (Object)c2);
                            break;
                        }
                        break;
                    }
                    case 17: {
                        final ikf j = e2.i;
                        if (g == e2.a && j != null) {
                            final int g8 = atim.g(8);
                            atim.o(4);
                            final boolean q2 = atim.q();
                            atim.o(3);
                            final int g9 = atim.g(16);
                            final int g10 = atim.g(16);
                            atim.g(3);
                            final int g11 = atim.g(3);
                            atim.o(2);
                            final int g12 = atim.g(8);
                            final int g13 = atim.g(8);
                            final int g14 = atim.g(4);
                            final int g15 = atim.g(2);
                            atim.o(2);
                            i = g2 - 10;
                            final SparseArray sparseArray = new SparseArray();
                            while (i > 0) {
                                final int g16 = atim.g(16);
                                final int g17 = atim.g(2);
                                atim.g(2);
                                final int g18 = atim.g(12);
                                atim.o(4);
                                final int g19 = atim.g(12);
                                final int n = i - 6;
                                Label_0684: {
                                    if (g17 != 1) {
                                        i = n;
                                        if (g17 != 2) {
                                            break Label_0684;
                                        }
                                    }
                                    atim.g(8);
                                    atim.g(8);
                                    i = n - 2;
                                }
                                sparseArray.put(g16, (Object)new byp(g18, g19, (byte[])null));
                            }
                            final bxz bxz = new bxz(g8, q2, g9, g10, g11, g12, g13, g14, g15, sparseArray);
                            if (j.a == 0) {
                                final bxz bxz2 = (bxz)e2.c.get(bxz.a);
                                if (bxz2 != null) {
                                    SparseArray k;
                                    for (k = bxz2.j, i = 0; i < k.size(); ++i) {
                                        bxz.j.put(k.keyAt(i), (Object)k.valueAt(i));
                                    }
                                }
                            }
                            e2.c.put(bxz.a, (Object)bxz);
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (g != e2.a) {
                            break;
                        }
                        final ikf l = e2.i;
                        atim.g(8);
                        final int g20 = atim.g(4);
                        final int g21 = atim.g(2);
                        atim.o(2);
                        i = g2 - 2;
                        final SparseArray sparseArray2 = new SparseArray();
                        while (i > 0) {
                            final int g22 = atim.g(8);
                            atim.o(8);
                            sparseArray2.put(g22, (Object)new byp(atim.g(16), atim.g(16), (char[])null));
                            i -= 6;
                        }
                        final ikf ikf = new ikf(g20, g21, sparseArray2);
                        if (ikf.a != 0) {
                            e2.i = ikf;
                            e2.c.clear();
                            e2.d.clear();
                            e2.e.clear();
                            break;
                        }
                        if (l != null && l.b != ikf.b) {
                            e2.i = ikf;
                            break;
                        }
                        break;
                    }
                }
                atim.p(e3 + g2 - atim.e());
            }
        }
        final bya e4 = a.e;
        final ikf m = e4.i;
        List<Object> list;
        byc byc2;
        if (m == null) {
            list = Collections.emptyList();
            byc2 = byc;
        }
        else {
            bxy bxy;
            if ((bxy = e4.h) == null) {
                bxy = a.d;
            }
            final Bitmap f = a.f;
            if (f == null || bxy.a + 1 != f.getWidth() || bxy.b + 1 != a.f.getHeight()) {
                a.f = Bitmap.createBitmap(bxy.a + 1, bxy.b + 1, Bitmap$Config.ARGB_8888);
                a.c.setBitmap(a.f);
            }
            final ArrayList list2 = new ArrayList();
            final Object c3 = m.c;
            i = 0;
            byc2 = byc;
            while (true) {
                final SparseArray sparseArray3 = (SparseArray)c3;
                if (i >= sparseArray3.size()) {
                    break;
                }
                a.c.save();
                final byp byp = (byp)sparseArray3.valueAt(i);
                final bxz bxz3 = (bxz)a.e.c.get(sparseArray3.keyAt(i));
                final int n2 = byp.b + bxy.c;
                final int n3 = byp.a + bxy.e;
                a.c.clipRect(n2, n3, Math.min(bxz3.c + n2, bxy.d), Math.min(bxz3.d + n3, bxy.f));
                adge g23;
                if ((g23 = (adge)a.e.d.get(bxz3.f)) == null && (g23 = (adge)a.e.f.get(bxz3.f)) == null) {
                    g23 = a.g;
                }
                final SparseArray j2 = bxz3.j;
                int n4 = 0;
                final int n5 = i;
                while (n4 < j2.size()) {
                    i = j2.keyAt(n4);
                    final byp byp2 = (byp)j2.valueAt(n4);
                    afaj afaj;
                    if ((afaj = (afaj)a.e.e.get(i)) == null) {
                        afaj = (afaj)a.e.g.get(i);
                    }
                    if (afaj != null) {
                        Paint a2;
                        if (afaj.a) {
                            a2 = null;
                        }
                        else {
                            a2 = a.a;
                        }
                        final int e5 = bxz3.e;
                        i = byp2.b + n2;
                        final int n6 = byp2.a + n3;
                        final Canvas c4 = a.c;
                        Object o;
                        if (e5 == 3) {
                            o = g23.c;
                        }
                        else if (e5 == 2) {
                            o = g23.d;
                        }
                        else {
                            o = g23.b;
                        }
                        final byte[] array2 = (byte[])afaj.d;
                        final int[] array3 = (int[])o;
                        byb.a(array2, array3, e5, i, n6, a2, c4);
                        byb.a((byte[])afaj.c, array3, e5, i, n6 + 1, a2, c4);
                    }
                    ++n4;
                }
                if (bxz3.b) {
                    i = bxz3.e;
                    if (i == 3) {
                        final Object c5 = g23.c;
                        i = bxz3.g;
                        i = ((int[])c5)[i];
                    }
                    else if (i == 2) {
                        final Object d = g23.d;
                        i = bxz3.h;
                        i = ((int[])d)[i];
                    }
                    else {
                        final Object b4 = g23.b;
                        i = bxz3.i;
                        i = ((int[])b4)[i];
                    }
                    a.b.setColor(i);
                    final Canvas c6 = a.c;
                    final float n7 = (float)n2;
                    final float n8 = (float)n3;
                    final int c7 = bxz3.c;
                    i = bxz3.d;
                    c6.drawRect(n7, n8, (float)(c7 + n2), (float)(i + n3), a.b);
                }
                final azx azx = new azx();
                azx.b = Bitmap.createBitmap(a.f, n2, n3, bxz3.c, bxz3.d);
                azx.f = n2 / (float)bxy.a;
                azx.g = 0;
                azx.b(n3 / (float)bxy.b, 0);
                azx.e = 0;
                azx.h = bxz3.c / (float)bxy.a;
                azx.i = bxz3.d / (float)bxy.b;
                list2.add(azx.a());
                a.c.drawColor(0, PorterDuff$Mode.CLEAR);
                a.c.restore();
                i = n5 + 1;
            }
            list = Collections.unmodifiableList((List<?>)list2);
        }
        new byc((List)list, 0);
        return (bxi)byc2;
    }
}
