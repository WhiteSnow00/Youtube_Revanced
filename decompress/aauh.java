import android.graphics.BitmapFactory;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauh extends aass implements aauw, aauu
{
    private final aaux a;
    private final aarq b;
    private final aaue c;
    private float e;
    
    public aauh(final Context context, final aaux a) {
        this.a = a;
        final float a2 = aava.a;
        final float[] array = new float[9];
        final float a3 = aava.a;
        array[0] = -a3;
        array[1] = -0.7f * a3;
        array[2] = -0.4f * a3;
        array[3] = -0.1f * a3;
        array[4] = 0.2f * a3;
        array[5] = 0.4f * a3;
        array[6] = 0.6f * a3;
        array[7] = 0.8f * a3;
        array[8] = a3;
        adme.K(true);
        adme.K(true);
        final float n = a2 + a2;
        final float[] array2 = new float[1041];
        array2[0] = 0.0f;
        final float n2 = array[8];
        array2[1] = n2;
        array2[3] = (array2[2] = n);
        array2[4] = n2;
        array2[5] = 0.0f;
        final float n3 = -n;
        array2[6] = n3;
        array2[7] = n2;
        array2[9] = (array2[8] = 0.0f);
        array2[10] = n2;
        array2[11] = n3;
        array2[12] = 0.0f;
        array2[13] = n2;
        array2[14] = n3;
        array2[15] = 0.0f;
        final float n4 = array[0];
        array2[16] = n4;
        array2[17] = n3;
        array2[18] = 0.0f;
        array2[19] = n4;
        array2[20] = n3;
        array2[21] = 0.0f;
        array2[22] = n4;
        array2[23] = n3;
        array2[24] = n;
        array2[25] = n4;
        array2[26] = 0.0f;
        array2[27] = n3;
        array2[28] = n4;
        array2[30] = (array2[29] = 0.0f);
        array2[31] = n4;
        array2[32] = n;
        for (int i = 0; i < 21; ++i) {
            final float n5 = (float)i;
            final double n6 = a2;
            final float n7 = n5 / 20.0f;
            final double n8 = (n7 + n7) * 3.1415927f;
            final double sin = Math.sin(n8);
            Double.isNaN(n6);
            final double cos = Math.cos(n8);
            Double.isNaN(n6);
            float n9;
            int n15;
            for (int j = 0; j < 8; ++j, array2[n15] = array[j], array2[n15 + 1] = n9) {
                n9 = (float)(n6 * cos);
                final float n10 = (float)(n6 * sin);
                final int n11 = (j * 21 + i) * 6 + 33;
                final int n12 = n11 + 1;
                array2[n11] = n10;
                final int n13 = n12 + 1;
                array2[n12] = array[j];
                final int n14 = n13 + 1;
                array2[n13] = n9;
                n15 = n14 + 1;
                array2[n14] = n10;
            }
        }
        final aave aave = new aave(array2, new float[694], 5);
        final aavf b = aavf.b();
        final float[] array4;
        final float[] array3 = array4 = new float[36];
        array4[0] = 0.0f;
        array4[2] = (array4[1] = 0.0f);
        array4[3] = 1.0f;
        array4[4] = 0.025f;
        array4[6] = (array4[5] = 0.025f);
        array4[7] = 1.0f;
        array4[8] = 0.05f;
        array4[10] = (array4[9] = 0.05f);
        array4[11] = 1.0f;
        array4[12] = 0.075f;
        array4[14] = (array4[13] = 0.075f);
        array4[15] = 1.0f;
        array4[16] = 0.1f;
        array4[18] = (array4[17] = 0.1f);
        array4[19] = 1.0f;
        array4[20] = 0.075f;
        array4[22] = (array4[21] = 0.075f);
        array4[23] = 1.0f;
        array4[24] = 0.05f;
        array4[26] = (array4[25] = 0.05f);
        array4[27] = 1.0f;
        array4[28] = 0.025f;
        array4[30] = (array4[29] = 0.025f);
        array4[31] = 1.0f;
        array4[32] = 0.0f;
        array4[34] = (array4[33] = 0.0f);
        array4[35] = 1.0f;
        final float[] array5 = new float[1388];
        for (int k = 0; k < 6; ++k) {
            System.arraycopy(array3, 32, array5, k * 4, 4);
        }
        for (int l = 0; l < 5; ++l) {
            System.arraycopy(array3, 0, array5, (l + 6) * 4, 4);
        }
        final int n16 = 0;
        int n17 = 0;
        int n18;
        while (true) {
            n18 = 44;
            if (n17 >= 21) {
                break;
            }
            System.arraycopy(array3, 0, array5, n17 * 8 + 44, 4);
            ++n17;
        }
        int n19 = 1;
        int n20;
        while (true) {
            n20 = n16;
            if (n19 >= 8) {
                break;
            }
            for (int n21 = 0; n21 < 21; ++n21) {
                System.arraycopy(array3, n19 * 4, array5, n21 * 8 + n18 + 4, 4);
            }
            final int n22 = n18 + 168;
            for (int n23 = 0; n23 < 21; ++n23) {
                System.arraycopy(array3, n19 * 4, array5, n23 * 8 + n22, 4);
            }
            ++n19;
            n18 = n22;
        }
        while (n20 < 21) {
            System.arraycopy(array3, 32, array5, n20 * 8 + n18 + 4, 4);
            ++n20;
        }
        final aarq b2 = new aarq(aave, b, array5, a.a.a());
        this.b = b2;
        final aaue c = new aaue(BitmapFactory.decodeResource(context.getResources(), 2131951724), aave.a(1.0f, 1.0f, aave.c), a.c.a(), a.a.b());
        this.c = c;
        a.b(this);
        a.f.add(this);
        this.b(a.h, a.i);
        this.m((aatp)b2);
        this.m((aatp)c);
    }
    
    public final void a(final boolean b) {
        final boolean v = ((aatr)this).v();
        final boolean l = b ^ true;
        if (v != l) {
            ((aatr)this).l = l;
        }
    }
    
    public final void b(float e, float e2) {
        final float n = e * 1.1f;
        final float n2 = n / 14.0f;
        final aaue c = this.c;
        e = this.e;
        e2 = e2 / 2.0f + n2 / 2.0f;
        c.k(0.0f, e - e2, 0.0f);
        this.e = e2;
        this.c.sZ(n, n2, 1.0f);
    }
    
    public final void rQ() {
        super.rQ();
        this.a.h(this);
        this.a.f.remove(this);
    }
}
