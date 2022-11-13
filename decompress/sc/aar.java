import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aar implements Comparator
{
    public static final aar a;
    public static final aar b;
    public static final aar c;
    public static final aar d;
    public static final aar e;
    public static final aar f;
    public static final aar g;
    public static final aar h;
    public static final aar i;
    public static final aar j;
    public static final aar k;
    public static final aar l;
    public static final aar m;
    public static final aar n;
    public static final aar o;
    public static final aar p;
    public static final aar q;
    public static final aar r;
    public static final aar s;
    public static final aar t;
    private final int u;
    
    static {
        t = new aar(20);
        s = new aar(19);
        r = new aar(18);
        q = new aar(17);
        p = new aar(16);
        o = new aar(15);
        n = new aar(14);
        m = new aar(13);
        l = new aar(12);
        k = new aar(11);
        j = new aar(10);
        i = new aar(9);
        h = new aar(8);
        g = new aar(7);
        f = new aar(6);
        e = new aar(5);
        d = new aar(4);
        c = new aar(3);
        b = new aar(2);
        a = new aar(1);
    }
    
    public aar(final int u) {
        this.u = u;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final int u = this.u;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        int n4 = 1;
        final int n5 = -1;
        final int n6 = 0;
        int n8 = 0;
        int n9 = 0;
        switch (u) {
            default: {
                final admv admv = (admv)o;
                final admv admv2 = (admv)o2;
                admv.getClass();
                admv2.getClass();
                final long h = admv.h;
                final long h2 = admv2.h;
                int n7;
                if (h > h2) {
                    n7 = n5;
                }
                else {
                    if (h != h2) {
                        return 1;
                    }
                    n7 = 0;
                }
                return n7;
            }
            case 19: {
                return -Long.valueOf(((aabf)o).i).compareTo(((aabf)o2).i);
            }
            case 18: {
                final aqzt aqzt = (aqzt)o;
                n8 = ((aqzt)o2).d();
                n9 = aqzt.d();
                break;
            }
            case 17: {
                return -fzw.q((vfn)o).compareTo(fzw.q((vfn)o2));
            }
            case 16: {
                return lcmp(((bza)o).a, ((bza)o2).a);
            }
            case 15: {
                final bzb bzb = (bzb)o;
                final bzb bzb2 = (bzb)o2;
                final int a = bzb.c.a;
                final int a2 = bzb2.c.a;
                if (a == a2) {
                    n4 = 0;
                }
                else if (a < a2) {
                    return -1;
                }
                return n4;
            }
            case 14: {
                final bxq bxq = (bxq)o;
                final int c = ((bxq)o2).c;
                final int c2 = bxq.c;
                int n10;
                if (c == c2) {
                    n10 = 0;
                }
                else {
                    if (c < c2) {
                        return -1;
                    }
                    n10 = n;
                }
                return n10;
            }
            case 13: {
                return Float.compare(((brs)o).c, ((brs)o2).c);
            }
            case 12: {
                return ((brs)o).a - ((brs)o2).a;
            }
            case 11: {
                final bqu bqu = (bqu)o;
                final bqu bqu2 = (bqu)o2;
                afib afib;
                if (bqu.e && bqu.h) {
                    afib = bqv.a;
                }
                else {
                    afib = bqv.a.c();
                }
                final afcz b = afcz.b;
                final int i = bqu.i;
                final int j = bqu2.i;
                final boolean x = bqu.f.x;
                return b.d(i, j, bqv.b).d(bqu.j, bqu2.j, afib).d(bqu.i, bqu2.i, afib).a();
            }
            case 10: {
                final bqu bqu3 = (bqu)o;
                final bqu bqu4 = (bqu)o2;
                final afcz d = afcz.b.e(bqu3.h, bqu4.h).b(bqu3.l, bqu4.l).e(bqu3.m, bqu4.m).e(bqu3.e, bqu4.e).e(bqu3.g, bqu4.g).d(bqu3.k, bqu4.k, (Comparator)afis.a);
                final boolean n11 = bqu3.n;
                final afcz e = d.e(n11, bqu4.n);
                final boolean o3 = bqu3.o;
                afcz afcz2;
                final afcz afcz = afcz2 = e.e(o3, bqu4.o);
                if (n11) {
                    afcz2 = afcz;
                    if (o3) {
                        afcz2 = afcz.b(bqu3.p, bqu4.p);
                    }
                }
                return afcz2.a();
            }
            case 9: {
                final Integer n12 = (Integer)o;
                final Integer n13 = (Integer)o2;
                final afib a3 = bqv.a;
                return 0;
            }
            case 8: {
                final Integer n14 = (Integer)o;
                final Integer n15 = (Integer)o2;
                final afib a4 = bqv.a;
                int n16;
                if (n14 == -1) {
                    if (n15 == -1) {
                        n16 = 0;
                    }
                    else {
                        n16 = -1;
                    }
                }
                else if (n15 == -1) {
                    n16 = n2;
                }
                else {
                    n16 = n14 - n15;
                }
                return n16;
            }
            case 7: {
                return ((List)o).get(0).a((bqr)((List)o2).get(0));
            }
            case 6: {
                final List list = (List)o;
                final List list2 = (List)o2;
                final afcz b2 = afcz.b;
                final aar k = aar.j;
                final afcz b3 = b2.d(Collections.max((Collection<? extends bqu>)list, (Comparator<? super bqu>)k), Collections.max((Collection<? extends bqu>)list2, (Comparator<? super bqu>)k), k).b(list.size(), list2.size());
                final aar l = aar.k;
                return b3.d(Collections.max((Collection<?>)list, (Comparator<? super Object>)l), Collections.max((Collection<?>)list2, (Comparator<? super Object>)l), l).a();
            }
            case 5: {
                return Collections.max((Collection<? extends bqi>)o).a((bqi)Collections.max((Collection<? extends bqi>)o2));
            }
            case 4: {
                final ayg ayg = (ayg)o;
                n8 = ((ayg)o2).j;
                n9 = ayg.j;
                break;
            }
            case 3: {
                final bjg bjg = (bjg)o;
                final bjg bjg2 = (bjg)o2;
                final int c3 = bjg.c;
                final int c4 = bjg2.c;
                int n17;
                if (c3 == c4) {
                    n17 = 0;
                }
                else {
                    n17 = n3;
                    if (c3 < c4) {
                        n17 = -1;
                    }
                }
                if (n17 != 0) {
                    return n17;
                }
                return bjg.b.compareTo(bjg2.b);
            }
            case 2: {
                final byte[] array = (byte[])o;
                final byte[] array2 = (byte[])o2;
                final int length = array.length;
                final int length2 = array2.length;
                int n18;
                if (length != length2) {
                    n18 = length - length2;
                }
                else {
                    int n19 = 0;
                    while (true) {
                        n18 = n6;
                        if (n19 >= array.length) {
                            break;
                        }
                        final byte b4 = array[n19];
                        final byte b5 = array2[n19];
                        if (b4 != b5) {
                            n18 = b4 - b5;
                            break;
                        }
                        ++n19;
                    }
                }
                return n18;
            }
            case 1: {
                final yw yw = (yw)o;
                final yw yw2 = (yw)o2;
                final zi b6 = zi.b;
                return yw.a.compareTo(yw2.a);
            }
            case 0: {
                final zm zm = (zm)o;
                final zm zm2 = (zm)o2;
                final za a5 = zm.a;
                final za a6 = zm2.a;
                return 0;
            }
        }
        return n8 - n9;
    }
}
