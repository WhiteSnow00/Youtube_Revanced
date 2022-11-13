import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hc
{
    private static final Comparator a;
    
    static {
        a = (Comparator)new mm(1);
    }
    
    public static gz a(final gy gy) {
        return b(gy, true);
    }
    
    public static gz b(final gy gy, final boolean b) {
        final int b2 = gy.b();
        final int a = gy.a();
        final ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(new ha(b2, a));
        final int n = (b2 + a + 1) / 2;
        int n2 = n + n + 1;
        final int[] array = new int[n2];
        final int[] array2 = new int[n2];
        ArrayList list3 = new ArrayList();
        while (!list2.isEmpty()) {
            final ha ha = (ha)list2.remove(list2.size() - 1);
            int n3 = n2;
            ArrayList list4 = list2;
            ArrayList list5 = list3;
            ha ha2 = ha;
            ArrayList list7 = null;
            ArrayList list8 = null;
            hb hb2 = null;
            ha ha3 = null;
            Label_0972: {
                if (ha.b() > 0) {
                    if (ha.a() <= 0) {
                        n3 = n2;
                        list4 = list2;
                        list5 = list3;
                        ha2 = ha;
                    }
                    else {
                        final int n4 = n2 >> 1;
                        final int b3 = ha.b();
                        final int a2 = ha.a();
                        final int a3 = ha.a;
                        final int n5 = n4 + 1;
                        array[n5] = a3;
                        array2[n5] = ha.b;
                        final int n6 = b3 + a2 + 1;
                        int n7 = 0;
                    Label_0216:
                        while (true) {
                            n3 = n2;
                            list4 = list2;
                            list5 = list3;
                            ha2 = ha;
                            if (n7 < n6 / 2) {
                                final int n8 = Math.abs(ha.b() - ha.a()) % 2;
                                final int b4 = ha.b();
                                final int a4 = ha.a();
                                int i;
                                final int n9 = i = -n7;
                                final ArrayList list6 = list2;
                                while (true) {
                                    while (i <= n7) {
                                        int a5;
                                        int c;
                                        if (i != n9 && (i == n7 || array[i + 1 + n4] <= array[i - 1 + n4])) {
                                            a5 = array[i - 1 + n4];
                                            c = a5 + 1;
                                        }
                                        else {
                                            a5 = (c = array[i + 1 + n4]);
                                        }
                                        int d = ha.c + (c - ha.a) - i;
                                        int b5;
                                        if (n7 != 0 && c == a5) {
                                            b5 = d - 1;
                                        }
                                        else {
                                            b5 = d;
                                        }
                                        while (c < ha.b && d < ha.d && gy.d(c, d)) {
                                            ++c;
                                            ++d;
                                        }
                                        array[i + n4] = c;
                                        if (n8 == 1) {
                                            final int n10 = b4 - a4 - i;
                                            if (n10 >= n9 + 1 && n10 <= n7 - 1 && array2[n10 + n4] <= c) {
                                                final hb hb = new hb();
                                                hb.a = a5;
                                                hb.b = b5;
                                                hb.c = c;
                                                hb.d = d;
                                                hb.e = false;
                                                list7 = list3;
                                                list8 = list6;
                                                if (hb != null) {
                                                    hb2 = hb;
                                                    ha3 = ha;
                                                    break Label_0972;
                                                }
                                                final int b6 = ha.b();
                                                final int a6 = ha.a();
                                                final int b7 = ha.b();
                                                final int a7 = ha.a();
                                                while (true) {
                                                    for (int j = n9; j <= n7; j += 2) {
                                                        int c2;
                                                        int a8;
                                                        if (j != n9 && (j == n7 || array2[j + 1 + n4] >= array2[j - 1 + n4])) {
                                                            c2 = array2[j - 1 + n4];
                                                            a8 = c2 - 1;
                                                        }
                                                        else {
                                                            c2 = (a8 = array2[j + 1 + n4]);
                                                        }
                                                        int b8 = ha.d - (ha.b - a8 - j);
                                                        int d2;
                                                        if (n7 != 0 && a8 == c2) {
                                                            d2 = b8 + 1;
                                                        }
                                                        else {
                                                            d2 = b8;
                                                        }
                                                        while (a8 > ha.a && b8 > ha.c) {
                                                            final int n11 = a8 - 1;
                                                            final int n12 = b8 - 1;
                                                            if (!gy.d(n11, n12)) {
                                                                break;
                                                            }
                                                            a8 = n11;
                                                            b8 = n12;
                                                        }
                                                        array2[j + n4] = a8;
                                                        if ((b6 - a6) % 2 == 0) {
                                                            final int n13 = b7 - a7 - j;
                                                            if (n13 >= n9 && n13 <= n7 && array[n13 + n4] >= a8) {
                                                                hb2 = new hb();
                                                                hb2.a = a8;
                                                                hb2.b = b8;
                                                                hb2.c = c2;
                                                                hb2.d = d2;
                                                                hb2.e = true;
                                                                if (hb2 != null) {
                                                                    ha3 = ha;
                                                                    break Label_0972;
                                                                }
                                                                ++n7;
                                                                final ArrayList list9 = list8;
                                                                list3 = list7;
                                                                list2 = list9;
                                                                continue Label_0216;
                                                            }
                                                        }
                                                    }
                                                    hb2 = null;
                                                    continue;
                                                }
                                            }
                                        }
                                        i += 2;
                                    }
                                    final hb hb = null;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                n2 = n3;
                list8 = list4;
                list7 = list5;
                final hb hb3 = null;
                ha3 = ha2;
                hb2 = hb3;
            }
            if (hb2 != null) {
                if (hb2.a() > 0) {
                    final int d3 = hb2.d;
                    final int b9 = hb2.b;
                    final int n14 = d3 - b9;
                    final int c3 = hb2.c;
                    final int a9 = hb2.a;
                    final int n15 = c3 - a9;
                    aetm aetm;
                    if (n14 != n15) {
                        if (hb2.e) {
                            aetm = new aetm(a9, b9, hb2.a(), (byte[])null, (byte[])null);
                        }
                        else if (n14 > n15) {
                            aetm = new aetm(a9, b9 + 1, hb2.a(), (byte[])null, (byte[])null);
                        }
                        else {
                            aetm = new aetm(a9 + 1, b9, hb2.a(), (byte[])null, (byte[])null);
                        }
                    }
                    else {
                        aetm = new aetm(a9, b9, n15, (byte[])null, (byte[])null);
                    }
                    list.add(aetm);
                }
                ha ha4;
                if (list7.isEmpty()) {
                    ha4 = new ha();
                }
                else {
                    ha4 = (ha)list7.remove(list7.size() - 1);
                }
                ha4.a = ha3.a;
                ha4.c = ha3.c;
                ha4.b = hb2.a;
                ha4.d = hb2.b;
                list8.add(ha4);
                final int b10 = ha3.b;
                final int d4 = ha3.d;
                ha3.a = hb2.c;
                ha3.c = hb2.d;
                list8.add(ha3);
            }
            else {
                list7.add(ha3);
            }
            final ArrayList list10 = list8;
            list3 = list7;
            list2 = list10;
        }
        Collections.sort((List<Object>)list, hc.a);
        return new gz(gy, list, array, array2, b);
    }
}
