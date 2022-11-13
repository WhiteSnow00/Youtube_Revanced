// 
// Decompiled by Procyon v0.6.0
// 

final class ahw
{
    static final ahw a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    
    static {
        final float[] c = ahh.c;
        final double n = ahh.c();
        final float[][] a2 = ahh.a;
        final float n2 = c[0];
        final float[] array = a2[0];
        final float n3 = array[0];
        final float n4 = c[1];
        final float n5 = array[1];
        final float n6 = c[2];
        final float n7 = array[2];
        final float[] array2 = a2[1];
        final float n8 = array2[0];
        final float n9 = array2[1];
        final float n10 = array2[2];
        final float[] array3 = a2[2];
        final float n11 = array3[0];
        final float n12 = array3[1];
        final float n13 = array3[2];
        Double.isNaN(n);
        final float n14 = (float)(n * 63.66197723675813 / 100.0);
        float n15 = 1.0f - (float)Math.exp((-n14 - 42.0f) / 92.0f) * 0.2777778f;
        final double n16 = n15;
        if (n16 > 1.0) {
            n15 = 1.0f;
        }
        else if (n16 < 0.0) {
            n15 = 0.0f;
        }
        final float n17 = n2 * n11 + n4 * n12 + n6 * n13;
        final float n18 = n8 * n2 + n9 * n4 + n10 * n6;
        final float n19 = n3 * n2 + n5 * n4 + n7 * n6;
        final float[] array4 = { 100.0f / n19 * n15 + 1.0f - n15, 100.0f / n18 * n15 + 1.0f - n15, 100.0f / n17 * n15 + 1.0f - n15 };
        final float n20 = 1.0f / (5.0f * n14 + 1.0f);
        final float n21 = n20 * n20 * n20 * n20;
        final float n22 = 1.0f - n21;
        final double n23 = n14;
        Double.isNaN(n23);
        final float n24 = (float)Math.cbrt(n23 * 5.0);
        final float n25 = ahh.c() / c[1];
        final double n26 = n25;
        final float n27 = (float)Math.sqrt(n26);
        final float n28 = (float)Math.pow(n26, 0.2);
        final float[] array5 = new float[3];
        final float n29 = array4[0];
        final float n30 = n21 * n14 + 0.1f * n22 * n22 * n24;
        final double n31 = n29 * n30 * n19;
        Double.isNaN(n31);
        array5[0] = (float)Math.pow(n31 / 100.0, 0.42);
        final double n32 = array4[1] * n30 * n18;
        Double.isNaN(n32);
        array5[1] = (float)Math.pow(n32 / 100.0, 0.42);
        final double n33 = array4[2] * n30 * n17;
        Double.isNaN(n33);
        final float n34 = (float)Math.pow(n33 / 100.0, 0.42);
        array5[2] = n34;
        final float n35 = array5[0];
        final float n36 = n35 * 400.0f / (n35 + 27.13f);
        final float n37 = array5[1];
        final float n38 = n37 * 400.0f / (n37 + 27.13f);
        final float n39 = 400.0f * n34 / (n34 + 27.13f);
        final float n40 = (float)Math.pow(n30, 0.25);
        final float n41 = 0.725f / n28;
        a = new ahw(n25, (n36 + n36 + n38 + n39 * 0.05f) * n41, n41, n41, array4, n30, n40, n27 + 1.48f);
    }
    
    private ahw(final float f, final float b, final float c, final float d, final float[] g, final float h, final float i, final float j) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = 0.69f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
}
