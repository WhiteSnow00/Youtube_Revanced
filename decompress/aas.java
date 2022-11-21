import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aas implements Comparator
{
    public static final aas a;
    public static final aas b;
    public static final aas c;
    public static final aas d;
    public static final aas e;
    public static final aas f;
    public static final aas g;
    public static final aas h;
    public static final aas i;
    public static final aas j;
    public static final aas k;
    public static final aas l;
    public static final aas m;
    public static final aas n;
    public static final aas o;
    public static final aas p;
    public static final aas q;
    public static final aas r;
    public static final aas s;
    public static final aas t;
    private final int u;
    
    static {
        t = new aas(20);
        s = new aas(19);
        r = new aas(18);
        q = new aas(17);
        p = new aas(16);
        o = new aas(15);
        n = new aas(14);
        m = new aas(13);
        l = new aas(12);
        k = new aas(11);
        j = new aas(10);
        i = new aas(9);
        h = new aas(8);
        g = new aas(7);
        f = new aas(6);
        e = new aas(5);
        d = new aas(4);
        c = new aas(3);
        b = new aas(2);
        a = new aas(1);
    }
    
    public aas(final int u) {
        this.u = u;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final int u = this.u;
        int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        final int n4 = 1;
        final int n5 = -1;
        final int n6 = 0;
        int n8 = 0;
        int n9 = 0;
        switch (u) {
            default: {
                final adoj adoj = (adoj)o;
                final adoj adoj2 = (adoj)o2;
                adoj.getClass();
                adoj2.getClass();
                final long h = adoj.h;
                final long h2 = adoj2.h;
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
                return -Long.valueOf(((aadc)o).i).compareTo(((aadc)o2).i);
            }
            case 18: {
                final arco arco = (arco)o;
                n8 = ((arco)o2).d();
                n9 = arco.d();
                break;
            }
            case 17: {
                return -gab.u((vgv)o).compareTo(gab.u((vgv)o2));
            }
            case 16: {
                return lcmp(((bzd)o).a, ((bzd)o2).a);
            }
            case 15: {
                final bze bze = (bze)o;
                final bze bze2 = (bze)o2;
                final int a = bze.c.a;
                final int a2 = bze2.c.a;
                int n10;
                if (a == a2) {
                    n10 = 0;
                }
                else {
                    if (a < a2) {
                        return -1;
                    }
                    n10 = n4;
                }
                return n10;
            }
            case 14: {
                final bxt bxt = (bxt)o;
                final int c = ((bxt)o2).c;
                final int c2 = bxt.c;
                if (c == c2) {
                    n = 0;
                }
                else if (c < c2) {
                    return -1;
                }
                return n;
            }
            case 13: {
                return Float.compare(((brv)o).c, ((brv)o2).c);
            }
            case 12: {
                return ((brv)o).a - ((brv)o2).a;
            }
            case 11: {
                final bqx bqx = (bqx)o;
                final bqx bqx2 = (bqx)o2;
                afjr afjr;
                if (bqx.e && bqx.h) {
                    afjr = bqy.a;
                }
                else {
                    afjr = bqy.a.c();
                }
                final afeq b = afeq.b;
                final int i = bqx.i;
                final int j = bqx2.i;
                final boolean x = bqx.f.x;
                return b.d(i, j, bqy.b).d(bqx.j, bqx2.j, afjr).d(bqx.i, bqx2.i, afjr).a();
            }
            case 10: {
                final bqx bqx3 = (bqx)o;
                final bqx bqx4 = (bqx)o2;
                final afeq d = afeq.b.e(bqx3.h, bqx4.h).b(bqx3.l, bqx4.l).e(bqx3.m, bqx4.m).e(bqx3.e, bqx4.e).e(bqx3.g, bqx4.g).d(bqx3.k, bqx4.k, (Comparator)afki.a);
                final boolean n11 = bqx3.n;
                final afeq e = d.e(n11, bqx4.n);
                final boolean o3 = bqx3.o;
                afeq afeq2;
                final afeq afeq = afeq2 = e.e(o3, bqx4.o);
                if (n11) {
                    afeq2 = afeq;
                    if (o3) {
                        afeq2 = afeq.b(bqx3.p, bqx4.p);
                    }
                }
                return afeq2.a();
            }
            case 9: {
                final Integer n12 = (Integer)o;
                final Integer n13 = (Integer)o2;
                final afjr a3 = bqy.a;
                return 0;
            }
            case 8: {
                final Integer n14 = (Integer)o;
                final Integer n15 = (Integer)o2;
                final afjr a4 = bqy.a;
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
                return ((List)o).get(0).a(((List)o2).get(0));
            }
            case 6: {
                final List list = (List)o;
                final List list2 = (List)o2;
                final afeq b2 = afeq.b;
                final aas k = aas.j;
                final afeq b3 = b2.d(Collections.max((Collection<? extends bqx>)list, (Comparator<? super bqx>)k), Collections.max((Collection<? extends bqx>)list2, (Comparator<? super bqx>)k), k).b(list.size(), list2.size());
                final aas l = aas.k;
                return b3.d(Collections.max((Collection<?>)list, (Comparator<? super Object>)l), Collections.max((Collection<?>)list2, (Comparator<? super Object>)l), l).a();
            }
            case 5: {
                return Collections.max((Collection<? extends bql>)o).a(Collections.max((Collection<? extends bql>)o2));
            }
            case 4: {
                final ayh ayh = (ayh)o;
                n8 = ((ayh)o2).j;
                n9 = ayh.j;
                break;
            }
            case 3: {
                final bjj bjj = (bjj)o;
                final bjj bjj2 = (bjj)o2;
                final int c3 = bjj.c;
                final int c4 = bjj2.c;
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
                return bjj.b.compareTo(bjj2.b);
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
                final yx yx = (yx)o;
                final yx yx2 = (yx)o2;
                final zj b6 = zj.b;
                return yx.a.compareTo(yx2.a);
            }
            case 0: {
                final zn zn = (zn)o;
                final zn zn2 = (zn)o2;
                final zb a5 = zn.a;
                final zb a6 = zn2.a;
                return 0;
            }
        }
        return n8 - n9;
    }
}
