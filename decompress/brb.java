import java.util.Arrays;
import java.util.List;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class brb extends bre
{
    public abog i;
    
    protected abstract Pair l(final abog p0, final int[][][] p1, final int[] p2);
    
    @Override
    public final void m(final Object o) {
        this.i = (abog)o;
    }
    
    @Override
    public final aewv n(final bfu[] array, bph bph, final ayz ayz, final azn azn) {
        final int n = array.length + 1;
        final int[] array2 = new int[n];
        final azo[][] array3 = new azo[n][];
        final int[][][] array4 = new int[n][][];
        for (int i = 0; i < n; ++i) {
            final int b = bph.b;
            array3[i] = new azo[b];
            array4[i] = new int[b][];
        }
        final int length = array.length;
        final int[] array5 = new int[length];
        for (int j = 0; j < length; ++j) {
            array5[j] = array[j].j();
        }
        for (int k = 0; k < bph.b; ++k) {
            final azo b2 = bph.b(k);
            final int c = b2.c;
            int length2 = array.length;
            int n2 = 0;
            int n3 = 0;
            int n4 = 1;
            int length3;
            while (true) {
                length3 = array.length;
                if (n2 >= length3) {
                    break;
                }
                final bfu bfu = array[n2];
                int max = 0;
                for (int l = 0; l < b2.a; ++l) {
                    max = Math.max(max, bht.f(bfu.a(b2.a(l))));
                }
                int n5;
                if (array2[n2] == 0) {
                    n5 = 1;
                }
                else {
                    n5 = 0;
                }
                int n6;
                int n7;
                int n8;
                if (max <= n3) {
                    n6 = length2;
                    n7 = n3;
                    n8 = n4;
                    if (max == n3) {
                        n6 = length2;
                        n7 = n3;
                        n8 = n4;
                        if (c == 5) {
                            n6 = length2;
                            n7 = n3;
                            if ((n8 = n4) == 0) {
                                n6 = length2;
                                n7 = n3;
                                n8 = n4;
                                if (n5 != 0) {
                                    n6 = n2;
                                    n8 = 1;
                                    n7 = max;
                                }
                            }
                        }
                    }
                }
                else {
                    n8 = n5;
                    n6 = n2;
                    n7 = max;
                }
                ++n2;
                length2 = n6;
                n3 = n7;
                n4 = n8;
            }
            int[] array6;
            if (length2 == length3) {
                array6 = new int[b2.a];
            }
            else {
                final bfu bfu2 = array[length2];
                array6 = new int[b2.a];
                for (int n9 = 0; n9 < b2.a; ++n9) {
                    array6[n9] = bfu2.a(b2.a(n9));
                }
            }
            final int n10 = array2[length2];
            array3[length2][n10] = b2;
            array4[length2][n10] = array6;
            array2[length2] = n10 + 1;
        }
        final int length4 = array.length;
        final bph[] array7 = new bph[length4];
        final String[] array8 = new String[length4];
        final int[] array9 = new int[length4];
        int n11 = 0;
        int length5;
        while (true) {
            length5 = array.length;
            if (n11 >= length5) {
                break;
            }
            final int n12 = array2[n11];
            array7[n11] = new bph((azo[])baz.an(array3[n11], n12));
            array4[n11] = (int[][])baz.an(array4[n11], n12);
            array8[n11] = array[n11].d();
            array9[n11] = array[n11].h();
            ++n11;
        }
        final abog abog = new abog(array9, array7, array5, array4, new bph((azo[])baz.an(array3[length5], array2[length5])));
        final Pair m = this.l(abog, array4, array5);
        final brc[] array10 = (brc[])m.second;
        final List[] array11 = new List[array10.length];
        for (int n13 = 0; n13 < array10.length; ++n13) {
            final brc brc = array10[n13];
            afgh afgh;
            if (brc != null) {
                afgh = afgh.r(brc);
            }
            else {
                afgh = afgh.q();
            }
            array11[n13] = afgh;
        }
        final afgc afgc = new afgc();
        int n14 = 0;
        final List[] array12 = array11;
        while (n14 < abog.a) {
            final bph f = abog.f(n14);
            final List list = array12[n14];
            for (int n15 = 0; n15 < f.b; ++n15) {
                final azo b3 = f.b(n15);
                final int a = ((bph[])abog.e)[n14].b(n15).a;
                final int[] array13 = new int[a];
                int n16 = 0;
                int n17 = 0;
                while (n16 < a) {
                    int n18 = n17;
                    if (abog.d(n14, n15, n16) == 4) {
                        array13[n17] = n16;
                        n18 = n17 + 1;
                    }
                    ++n16;
                    n17 = n18;
                }
                final int[] copy = Arrays.copyOf(array13, n17);
                Object o = null;
                int min = 16;
                int n19 = 0;
                boolean b4 = false;
                for (int n20 = 0; n19 < copy.length; ++n19, ++n20) {
                    final String n21 = ((bph[])abog.e)[n14].b(n15).a(copy[n19]).n;
                    if (n20 == 0) {
                        o = n21;
                    }
                    else {
                        b4 |= (baz.aa(o, n21) ^ true);
                    }
                    min = Math.min(min, ((int[][][])abog.d)[n14][n15][n19] & 0x18);
                }
                int min2 = min;
                if (b4) {
                    min2 = Math.min(min, ((int[])abog.f)[n14]);
                }
                final boolean b5 = min2 != 0;
                final int a2 = b3.a;
                final int[] array14 = new int[a2];
                final boolean[] array15 = new boolean[a2];
                int n22 = 0;
            Label_1011:
                while (n22 < b3.a) {
                    array14[n22] = abog.d(n14, n15, n22);
                    while (true) {
                        for (int n23 = 0; n23 < list.size(); ++n23) {
                            final brc brc2 = list.get(n23);
                            if (brc2.j().equals((Object)b3) && brc2.e(n22) != -1) {
                                final boolean b6 = true;
                                array15[n22] = b6;
                                ++n22;
                                continue Label_1011;
                            }
                        }
                        final boolean b6 = false;
                        continue;
                    }
                }
                afgc.h(new azr(b3, b5, array14, array15));
            }
            ++n14;
        }
        final Object c2 = abog.c;
        int n24 = 0;
        while (true) {
            bph = (bph)c2;
            if (n24 >= bph.b) {
                break;
            }
            final azo b7 = bph.b(n24);
            final int[] array16 = new int[b7.a];
            Arrays.fill(array16, 0);
            afgc.h(new azr(b7, false, array16, new boolean[b7.a]));
            ++n24;
        }
        return new aewv((bfv[])m.first, (bqz[])m.second, new azs((List)afgc.g()), abog);
    }
}
