import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahg
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    
    public ahg(final float a, final float b, final float c, final float d, final float e, final float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    static ahg b(final int n) {
        final ahw a = ahw.a;
        final float a2 = ahh.a(Color.red(n));
        final float a3 = ahh.a(Color.green(n));
        final float a4 = ahh.a(Color.blue(n));
        final float[][] d = ahh.d;
        final float[] array = d[0];
        final float n2 = array[0];
        final float n3 = array[1];
        final float n4 = array[2];
        final float[] array2 = d[1];
        final float n5 = array2[0];
        final float n6 = array2[1];
        final float n7 = array2[2];
        final float[] array3 = d[2];
        final float[] array4 = { n2 * a2 + n3 * a3 + n4 * a4, n5 * a2 + n6 * a3 + n7 * a4, a2 * array3[0] + a3 * array3[1] + a4 * array3[2] };
        final float[][] a5 = ahh.a;
        final float n8 = array4[0];
        final float[] array5 = a5[0];
        final float n9 = array5[0];
        final float n10 = array4[1];
        final float n11 = array5[1];
        final float n12 = array4[2];
        final float n13 = array5[2];
        final float[] array6 = a5[1];
        final float n14 = array6[0];
        final float n15 = array6[1];
        final float n16 = array6[2];
        final float[] array7 = a5[2];
        final float n17 = array7[0];
        final float n18 = array7[1];
        final float n19 = array7[2];
        final float[] g = a.g;
        final float n20 = g[0] * (n9 * n8 + n11 * n10 + n13 * n12);
        final float n21 = g[1] * (n14 * n8 + n15 * n10 + n16 * n12);
        final float n22 = g[2] * (n8 * n17 + n10 * n18 + n12 * n19);
        final double n23 = a.h * Math.abs(n20);
        Double.isNaN(n23);
        final float n24 = (float)Math.pow(n23 / 100.0, 0.42);
        final double n25 = a.h * Math.abs(n21);
        Double.isNaN(n25);
        final float n26 = (float)Math.pow(n25 / 100.0, 0.42);
        final double n27 = a.h * Math.abs(n22);
        Double.isNaN(n27);
        final float n28 = (float)Math.pow(n27 / 100.0, 0.42);
        final float signum = Math.signum(n20);
        final float signum2 = Math.signum(n21);
        final float signum3 = Math.signum(n22);
        final float n29 = signum * 400.0f * n24 / (n24 + 27.13f);
        final double n30 = n29;
        final float n31 = signum2 * 400.0f * n26 / (n26 + 27.13f);
        final double n32 = n31;
        final double n33 = n29 + n31;
        final float n34 = signum3 * 400.0f * n28 / (n28 + 27.13f);
        Double.isNaN(n30);
        Double.isNaN(n32);
        final double n35 = n34;
        Double.isNaN(n35);
        Double.isNaN(n35);
        Double.isNaN(n33);
        final float n36 = (float)(n33 - (n35 + n35));
        Double.isNaN(n35);
        final float n37 = (float)(n30 * 11.0 + n32 * -12.0 + n35);
        final float n38 = n36 / 9.0f;
        final double n39 = n38;
        final float n40 = n37 / 11.0f;
        final float n41 = (float)Math.atan2(n39, n40) * 180.0f / 3.1415927f;
        float n42;
        if (n41 < 0.0f) {
            n42 = n41 + 360.0f;
        }
        else {
            n42 = n41;
            if (n41 >= 360.0f) {
                n42 = n41 - 360.0f;
            }
        }
        final float n43 = n31 * 20.0f;
        final float n44 = 3.1415927f * n42 / 180.0f;
        final float n45 = (40.0f * n29 + n43 + n34) / 20.0f * a.c / a.b;
        final float e = a.e;
        final float n46 = (float)Math.pow(n45, a.j * 0.69f);
        final float e2 = a.e;
        final float n47 = n46 * 100.0f;
        Math.sqrt(n47 / 100.0f);
        final float b = a.b;
        final float i = a.i;
        float n48;
        if (n42 < 20.14) {
            n48 = 360.0f + n42;
        }
        else {
            n48 = n42;
        }
        final float n49 = (n29 * 20.0f + n43 + n34 * 21.0f) / 20.0f;
        final double n50 = n48;
        Double.isNaN(n50);
        final float n51 = (float)(Math.cos(n50 * 3.141592653589793 / 180.0 + 2.0) + 3.8);
        final float d2 = a.d;
        final float n52 = (float)Math.sqrt(n40 * n40 + n38 * n38);
        final float n53 = (float)Math.pow(1.64 - Math.pow(0.29, a.f), 0.73);
        final float n54 = (float)Math.pow(n51 * 0.25f * 3846.1538f * d2 * n52 / (n49 + 0.305f), 0.9);
        final double n55 = n47;
        Double.isNaN(n55);
        final float n56 = (float)Math.sqrt(n55 / 100.0);
        final float j = a.i;
        final float n57 = n53 * n54;
        final float n58 = n57 * n56;
        final float e3 = a.e;
        Math.sqrt(n57 * 0.69f / (a.b + 4.0f));
        final float n59 = (float)Math.log(j * n58 * 0.0228f + 1.0f);
        final double n60 = n44;
        final double cos = Math.cos(n60);
        final float n61 = n59 * 43.85965f;
        return new ahg(n42, n58, n47, 1.7f * n47 / (0.007f * n47 + 1.0f), n61 * (float)cos, n61 * (float)Math.sin(n60));
    }
    
    public static ahg c(final float n, final float n2, final float n3) {
        final ahw a = ahw.a;
        final float e = a.e;
        final double n4 = n;
        Double.isNaN(n4);
        final double n5 = n4 / 100.0;
        Math.sqrt(n5);
        final float b = a.b;
        final float i = a.i;
        final float n6 = (float)Math.sqrt(n5);
        final float e2 = a.e;
        Math.sqrt(n2 / n6 * 0.69f / (a.b + 4.0f));
        final double n7 = i * n2;
        Double.isNaN(n7);
        final float n8 = (float)Math.log(n7 * 0.0228 + 1.0);
        final double n9 = 3.1415927f * n3 / 180.0f;
        final float n10 = (float)Math.cos(n9);
        final float n11 = (float)Math.sin(n9);
        final float n12 = n8 * 43.85965f;
        return new ahg(n3, n2, n, 1.7f * n / (0.007f * n + 1.0f), n12 * n10, n12 * n11);
    }
    
    final int a(final ahw ahw) {
        final float b = this.b;
        final double n = b;
        float n2 = 0.0f;
        if (n != 0.0) {
            final double n3 = this.c;
            if (n3 == 0.0) {
                n2 = n2;
            }
            else {
                Double.isNaN(n3);
                n2 = b / (float)Math.sqrt(n3 / 100.0);
            }
        }
        final double pow = Math.pow(0.29, ahw.f);
        final double n4 = n2;
        final double pow2 = Math.pow(1.64 - pow, 0.73);
        Double.isNaN(n4);
        final float n5 = (float)Math.pow(n4 / pow2, 1.1111111111111112);
        final double n6 = this.a * 3.1415927f / 180.0f;
        Double.isNaN(n6);
        final double cos = Math.cos(2.0 + n6);
        final float b2 = ahw.b;
        final double n7 = this.c;
        Double.isNaN(n7);
        final double n8 = n7 / 100.0;
        final float e = ahw.e;
        final double n9 = ahw.j;
        Double.isNaN(n9);
        final float n10 = (float)Math.pow(n8, 1.4492753673265821 / n9);
        final float n11 = (float)(cos + 3.8);
        final float d = ahw.d;
        final float n12 = b2 * n10 / ahw.c;
        final float n13 = (float)Math.sin(n6);
        final float n14 = (float)Math.cos(n6);
        final float n15 = (0.305f + n12) * 23.0f * n5 / (n11 * 0.25f * 3846.1538f * d * 23.0f + 11.0f * n5 * n14 + 108.0f * n5 * n13);
        final float n16 = n14 * n15;
        final float n17 = n15 * n13;
        final float n18 = n12 * 460.0f;
        final float n19 = (451.0f * n16 + n18 + 288.0f * n17) / 1403.0f;
        final double n20 = Math.abs(n19);
        final double n21 = Math.abs(n19);
        Double.isNaN(n20);
        Double.isNaN(n21);
        final float n22 = (float)Math.max(0.0, n20 * 27.13 / (400.0 - n21));
        final float signum = Math.signum(n19);
        final float n23 = 100.0f / ahw.h;
        final float n24 = (float)Math.pow(n22, 2.380952380952381);
        final float n25 = (n18 - 891.0f * n16 - 261.0f * n17) / 1403.0f;
        final double n26 = Math.abs(n25);
        final double n27 = Math.abs(n25);
        Double.isNaN(n26);
        Double.isNaN(n27);
        final float n28 = (float)Math.max(0.0, n26 * 27.13 / (400.0 - n27));
        final float signum2 = Math.signum(n25);
        final float n29 = 100.0f / ahw.h;
        final float n30 = (float)Math.pow(n28, 2.380952380952381);
        final float n31 = (n18 - n16 * 220.0f - n17 * 6300.0f) / 1403.0f;
        final double n32 = Math.abs(n31);
        final float abs = Math.abs(n31);
        Double.isNaN(n32);
        final double n33 = abs;
        Double.isNaN(n33);
        final float n34 = (float)Math.max(0.0, n32 * 27.13 / (400.0 - n33));
        final float signum3 = Math.signum(n31);
        final float n35 = 100.0f / ahw.h;
        final float n36 = (float)Math.pow(n34, 2.380952380952381);
        final float[] g = ahw.g;
        final float n37 = signum * n23 * n24 / g[0];
        final float n38 = signum2 * n29 * n30 / g[1];
        final float n39 = signum3 * n35 * n36 / g[2];
        final float[][] b3 = ahh.b;
        final float[] array = b3[0];
        final float n40 = array[0];
        final float n41 = array[1];
        final float n42 = array[2];
        final float[] array2 = b3[1];
        final float n43 = array2[0];
        final float n44 = array2[1];
        final float n45 = array2[2];
        final float[] array3 = b3[2];
        return ahz.c(n40 * n37 + n41 * n38 + n42 * n39, n43 * n37 + n44 * n38 + n45 * n39, n37 * array3[0] + n38 * array3[1] + n39 * array3[2]);
    }
}
