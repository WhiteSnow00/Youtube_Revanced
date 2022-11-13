import android.graphics.Color;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyl implements czd
{
    private int a;
    
    public cyl(final int a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ Object a(final czg czg, float n) {
        final ArrayList list = new ArrayList();
        final int q = czg.q();
        if (q == 1) {
            czg.h();
        }
        while (czg.o()) {
            list.add((float)czg.a());
        }
        if (q == 1) {
            czg.j();
        }
        int a;
        if ((a = this.a) == -1) {
            a = list.size() / 4;
            this.a = a;
        }
        final float[] array = new float[a];
        final int[] array2 = new int[a];
        final int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6;
        while (true) {
            n6 = this.a * 4;
            if (n3 >= n6) {
                break;
            }
            final int n7 = n3 / 4;
            final double n8 = (float)list.get(n3);
            final int n9 = n3 % 4;
            Label_0291: {
                if (n9 != 0) {
                    if (n9 != 1) {
                        if (n9 != 2) {
                            if (n9 == 3) {
                                Double.isNaN(n8);
                                array2[n7] = Color.argb(255, n4, n5, (int)(n8 * 255.0));
                            }
                        }
                        else {
                            Double.isNaN(n8);
                            n5 = (int)(n8 * 255.0);
                        }
                    }
                    else {
                        Double.isNaN(n8);
                        n4 = (int)(n8 * 255.0);
                    }
                }
                else {
                    if (n7 > 0) {
                        final float n10 = array[n7 - 1];
                        n = (float)n8;
                        if (n10 >= n) {
                            array[n7] = n + 0.01f;
                            break Label_0291;
                        }
                    }
                    array[n7] = (float)n8;
                }
            }
            ++n3;
        }
        final eab eab = new eab(array, array2);
        if (list.size() > n6) {
            final int n11 = (list.size() - n6) / 2;
            final double[] array3 = new double[n11];
            final double[] array4 = new double[n11];
            int n12 = 0;
            int n13 = n6;
            int i;
            while (true) {
                i = n2;
                if (n13 >= list.size()) {
                    break;
                }
                if (n13 % 2 == 0) {
                    array3[n12] = (float)list.get(n13);
                }
                else {
                    array4[n12] = (float)list.get(n13);
                    ++n12;
                }
                ++n13;
            }
        Label_0432:
            while (i < eab.i()) {
                final int n14 = ((int[])eab.b)[i];
                final double n15 = ((float[])eab.a)[i];
                while (true) {
                    for (int j = 1; j < n11; ++j) {
                        final int n16 = j - 1;
                        final double n17 = array3[n16];
                        final double n18 = array3[j];
                        if (n18 >= n15) {
                            Double.isNaN(n15);
                            final double a2 = czm.a(array4[n16], array4[j], czm.j((n15 - n17) / (n18 - n17)));
                            ((int[])eab.b)[i] = Color.argb((int)(a2 * 255.0), Color.red(n14), Color.green(n14), Color.blue(n14));
                            ++i;
                            continue Label_0432;
                        }
                    }
                    final double a2 = array4[n11 - 1];
                    continue;
                }
            }
        }
        return eab;
    }
}
