import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahf
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    
    public ahf(final float a, final float b, final float c, final float d, final float e, final float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    static ahf b(final int n) {
        final ahv a = ahv.a;
        final float a2 = ahg.a(Color.red(n));
        final float a3 = ahg.a(Color.green(n));
        final float a4 = ahg.a(Color.blue(n));
        final float[][] d = ahg.d;
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
        final float[][] a5 = ahg.a;
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
        final float n29 = Math.signum(n20) * 400.0f * n24 / (n24 + 27.13f);
        final float n30 = Math.signum(n21) * 400.0f * n26 / (n26 + 27.13f);
        final float n31 = Math.signum(n22) * 400.0f * n28 / (n28 + 27.13f);
        final double n32 = n31;
        final double n33 = n29;
        Double.isNaN(n33);
        final double n34 = n30;
        Double.isNaN(n34);
        Double.isNaN(n32);
        final float n35 = (float)(n33 * 11.0 + n34 * -12.0 + n32) / 11.0f;
        final double n36 = n29 + n30;
        Double.isNaN(n32);
        Double.isNaN(n32);
        Double.isNaN(n36);
        final float n37 = (float)(n36 - (n32 + n32)) / 9.0f;
        final float n38 = n30 * 20.0f;
        final float n39 = (n29 * 20.0f + n38 + 21.0f * n31) / 20.0f;
        final float n40 = (n29 * 40.0f + n38 + n31) / 20.0f;
        final float n41 = (float)Math.atan2(n37, n35) * 180.0f / 3.1415927f;
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
        final float n43 = 3.1415927f * n42 / 180.0f;
        final float c = a.c;
        final float b = a.b;
        final float e = a.e;
        final float n44 = (float)Math.pow(n40 * c / b, a.j * 0.69f) * 100.0f;
        final float e2 = a.e;
        Math.sqrt(n44 / 100.0f);
        final float b2 = a.b;
        final float i = a.i;
        float n45;
        if (n42 < 20.14) {
            n45 = 360.0f + n42;
        }
        else {
            n45 = n42;
        }
        final double n46 = n45;
        Double.isNaN(n46);
        final float n47 = (float)Math.pow(1.64 - Math.pow(0.29, a.f), 0.73) * (float)Math.pow((float)(Math.cos(n46 * 3.141592653589793 / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f * a.d * (float)Math.sqrt(n35 * n35 + n37 * n37) / (n39 + 0.305f), 0.9);
        final double n48 = n44;
        Double.isNaN(n48);
        final float n49 = n47 * (float)Math.sqrt(n48 / 100.0);
        final float j = a.i;
        final float e3 = a.e;
        Math.sqrt(n47 * 0.69f / (a.b + 4.0f));
        final float n50 = (float)Math.log(j * n49 * 0.0228f + 1.0f) * 43.85965f;
        final double n51 = n43;
        return new ahf(n42, n49, n44, 1.7f * n44 / (0.007f * n44 + 1.0f), n50 * (float)Math.cos(n51), n50 * (float)Math.sin(n51));
    }
    
    public static ahf c(final float n, final float n2, final float n3) {
        final ahv a = ahv.a;
        final float e = a.e;
        final double n4 = n;
        Double.isNaN(n4);
        final double n5 = n4 / 100.0;
        Math.sqrt(n5);
        final float b = a.b;
        final float i = a.i;
        final double sqrt = Math.sqrt(n5);
        final float e2 = a.e;
        Math.sqrt(n2 / (float)sqrt * 0.69f / (a.b + 4.0f));
        final double n6 = i * n2;
        Double.isNaN(n6);
        final float n7 = (float)Math.log(n6 * 0.0228 + 1.0) * 43.85965f;
        final double n8 = 3.1415927f * n3 / 180.0f;
        return new ahf(n3, n2, n, 1.7f * n / (0.007f * n + 1.0f), n7 * (float)Math.cos(n8), n7 * (float)Math.sin(n8));
    }
    
    final int a(final ahv ahv) {
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
        final double n4 = n2;
        final double pow = Math.pow(1.64 - Math.pow(0.29, ahv.f), 0.73);
        Double.isNaN(n4);
        final float n5 = (float)Math.pow(n4 / pow, 1.1111111111111112);
        final double n6 = this.a * 3.1415927f / 180.0f;
        Double.isNaN(n6);
        final double cos = Math.cos(2.0 + n6);
        final float b2 = ahv.b;
        final float c = this.c;
        final float e = ahv.e;
        final float j = ahv.j;
        final double n7 = c;
        Double.isNaN(n7);
        final double n8 = n7 / 100.0;
        final double n9 = j;
        Double.isNaN(n9);
        final double pow2 = Math.pow(n8, 1.4492753673265821 / n9);
        final float d = ahv.d;
        final float n10 = b2 * (float)pow2 / ahv.c;
        final float n11 = (float)Math.sin(n6);
        final float n12 = (float)Math.cos(n6);
        final float n13 = (0.305f + n10) * 23.0f * n5 / ((float)(cos + 3.8) * 0.25f * 3846.1538f * d * 23.0f + 11.0f * n5 * n12 + n5 * 108.0f * n11);
        final float n14 = n12 * n13;
        final float n15 = n13 * n11;
        final float n16 = n10 * 460.0f;
        final float n17 = (451.0f * n14 + n16 + 288.0f * n15) / 1403.0f;
        final float n18 = (n16 - 891.0f * n14 - 261.0f * n15) / 1403.0f;
        final float n19 = (n16 - n14 * 220.0f - n15 * 6300.0f) / 1403.0f;
        final float abs = Math.abs(n17);
        final float abs2 = Math.abs(n17);
        final double n20 = abs;
        Double.isNaN(n20);
        final double n21 = abs2;
        Double.isNaN(n21);
        final double max = Math.max(0.0, n20 * 27.13 / (400.0 - n21));
        final float signum = Math.signum(n17);
        final float n22 = 100.0f / ahv.h;
        final float n23 = (float)Math.pow((float)max, 2.380952380952381);
        final float abs3 = Math.abs(n18);
        final float abs4 = Math.abs(n18);
        final double n24 = abs3;
        Double.isNaN(n24);
        final double n25 = abs4;
        Double.isNaN(n25);
        final double max2 = Math.max(0.0, n24 * 27.13 / (400.0 - n25));
        final float signum2 = Math.signum(n18);
        final float n26 = 100.0f / ahv.h;
        final float n27 = (float)Math.pow((float)max2, 2.380952380952381);
        final float abs5 = Math.abs(n19);
        final float abs6 = Math.abs(n19);
        final double n28 = abs5;
        Double.isNaN(n28);
        final double n29 = abs6;
        Double.isNaN(n29);
        final double max3 = Math.max(0.0, n28 * 27.13 / (400.0 - n29));
        final float signum3 = Math.signum(n19);
        final float h = ahv.h;
        final double pow3 = Math.pow((float)max3, 2.380952380952381);
        final float[] g = ahv.g;
        final float n30 = signum * n22 * n23 / g[0];
        final float n31 = signum2 * n26 * n27 / g[1];
        final float n32 = signum3 * (100.0f / h) * (float)pow3 / g[2];
        final float[][] b3 = ahg.b;
        final float[] array = b3[0];
        final float n33 = array[0];
        final float n34 = array[1];
        final float n35 = array[2];
        final float[] array2 = b3[1];
        final float n36 = array2[0];
        final float n37 = array2[1];
        final float n38 = array2[2];
        final float[] array3 = b3[2];
        return ahy.c((double)(n33 * n30 + n34 * n31 + n35 * n32), (double)(n36 * n30 + n37 * n31 + n38 * n32), (double)(n30 * array3[0] + n31 * array3[1] + n32 * array3[2]));
    }
}
