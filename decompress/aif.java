import android.util.Log;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aif
{
    public char a;
    public final float[] b;
    
    public aif(final char a, final float[] b) {
        this.a = a;
        this.b = b;
    }
    
    public aif(final aif aif) {
        this.a = aif.a;
        final float[] b = aif.b;
        this.b = vi.d(b, b.length);
    }
    
    public static void a(final aif[] array, final Path path) {
        final float[] array2 = new float[6];
        int a = 109;
        int n13;
        for (int i = 0; i < array.length; i = n13 + 1) {
            final aif aif = array[i];
            final char a2 = aif.a;
            final float[] b = aif.b;
            final float n = array2[0];
            final float n2 = array2[1];
            final float n3 = array2[2];
            final float n4 = array2[3];
            float n5 = array2[4];
            float n6 = array2[5];
            float n7 = n;
            float n8 = n2;
            float n9 = n3;
            float n10 = n4;
            int n11 = 0;
            while (true) {
                switch (a2) {
                    default: {
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break Label_0328;
                    }
                    case 81:
                    case 83:
                    case 113:
                    case 115: {
                        n11 = 4;
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break;
                    }
                    case 76:
                    case 77:
                    case 84:
                    case 108:
                    case 109:
                    case 116: {
                        n11 = 2;
                        break;
                    }
                    case 90:
                    case 122: {
                        path.close();
                        path.moveTo(n5, n6);
                        n7 = (n9 = n5);
                        n8 = (n10 = n6);
                        continue;
                    }
                    case 72:
                    case 86:
                    case 104:
                    case 118: {
                        n11 = 1;
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break;
                    }
                    case 67:
                    case 99: {
                        n11 = 6;
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break;
                    }
                    case 65:
                    case 97: {
                        n11 = 7;
                        n10 = n4;
                        n9 = n3;
                        n8 = n2;
                        n7 = n;
                        break;
                    }
                }
                break;
            }
            final int n12 = 0;
            n13 = i;
            int n14 = a2;
            int j = n12;
            int n15 = a;
            while (j < b.length) {
                Label_2031: {
                    Label_2025: {
                        if (n14 != 65) {
                            float n84;
                            float n85;
                            if (n14 != 67) {
                                if (n14 == 72) {
                                    path.lineTo(b[j], n8);
                                    n7 = b[j];
                                    break Label_2031;
                                }
                                if (n14 != 81) {
                                    if (n14 == 86) {
                                        path.lineTo(n7, b[j]);
                                        n8 = b[j];
                                        break Label_2031;
                                    }
                                    if (n14 != 97) {
                                        float n31 = 0.0f;
                                        float n32 = 0.0f;
                                        Label_1517: {
                                            float n44 = 0.0f;
                                            float n45 = 0.0f;
                                            Label_1508: {
                                                if (n14 != 99) {
                                                    Label_0546: {
                                                        if (n14 != 104) {
                                                            if (n14 != 113) {
                                                                if (n14 != 118) {
                                                                    if (n14 != 76) {
                                                                        if (n14 != 77) {
                                                                            if (n14 == 83) {
                                                                                float n17;
                                                                                float n18;
                                                                                if (n15 != 99 && n15 != 115 && n15 != 67 && n15 != 83) {
                                                                                    final float n16 = n8;
                                                                                    n17 = n7;
                                                                                    n18 = n16;
                                                                                }
                                                                                else {
                                                                                    final float n19 = n8 + n8 - n10;
                                                                                    final float n20 = n7 + n7 - n9;
                                                                                    n18 = n19;
                                                                                    n17 = n20;
                                                                                }
                                                                                final float n21 = b[j];
                                                                                final int n22 = j + 1;
                                                                                final float n23 = b[n22];
                                                                                final int n24 = j + 2;
                                                                                final float n25 = b[n24];
                                                                                final int n26 = j + 3;
                                                                                path.cubicTo(n17, n18, n21, n23, n25, b[n26]);
                                                                                n9 = b[j];
                                                                                n10 = b[n22];
                                                                                n7 = b[n24];
                                                                                n8 = b[n26];
                                                                                break Label_0546;
                                                                            }
                                                                            if (n14 == 84) {
                                                                                float n27;
                                                                                float n28;
                                                                                if (n15 != 113 && n15 != 116 && n15 != 81 && n15 != 84) {
                                                                                    n27 = n8;
                                                                                    n28 = n7;
                                                                                }
                                                                                else {
                                                                                    n28 = n7 + n7 - n9;
                                                                                    n27 = n8 + n8 - n10;
                                                                                }
                                                                                final float n29 = b[j];
                                                                                final int n30 = j + 1;
                                                                                path.quadTo(n28, n27, n29, b[n30]);
                                                                                n7 = b[j];
                                                                                n8 = b[n30];
                                                                                n31 = n27;
                                                                                n32 = n28;
                                                                                break Label_1517;
                                                                            }
                                                                            if (n14 == 108) {
                                                                                final float n33 = b[j];
                                                                                final int n34 = j + 1;
                                                                                path.rLineTo(n33, b[n34]);
                                                                                n7 += b[j];
                                                                                n8 += b[n34];
                                                                                break Label_0546;
                                                                            }
                                                                            if (n14 != 109) {
                                                                                if (n14 == 115) {
                                                                                    float n35;
                                                                                    float n36;
                                                                                    if (n15 != 99 && n15 != 115 && n15 != 67 && n15 != 83) {
                                                                                        n35 = 0.0f;
                                                                                        n36 = 0.0f;
                                                                                    }
                                                                                    else {
                                                                                        final float n37 = n8 - n10;
                                                                                        n35 = n7 - n9;
                                                                                        n36 = n37;
                                                                                    }
                                                                                    final float n38 = b[j];
                                                                                    final int n39 = j + 1;
                                                                                    final float n40 = b[n39];
                                                                                    final int n41 = j + 2;
                                                                                    final float n42 = b[n41];
                                                                                    final int n43 = j + 3;
                                                                                    path.rCubicTo(n35, n36, n38, n40, n42, b[n43]);
                                                                                    n32 = n7 + b[j];
                                                                                    n44 = n8 + b[n39];
                                                                                    n7 += b[n41];
                                                                                    n45 = b[n43];
                                                                                    break Label_1508;
                                                                                }
                                                                                if (n14 != 116) {
                                                                                    break Label_0546;
                                                                                }
                                                                                float n46;
                                                                                float n47;
                                                                                if (n15 != 113 && n15 != 116 && n15 != 81 && n15 != 84) {
                                                                                    n46 = 0.0f;
                                                                                    n47 = 0.0f;
                                                                                }
                                                                                else {
                                                                                    n47 = n7 - n9;
                                                                                    n46 = n8 - n10;
                                                                                }
                                                                                final float n48 = b[j];
                                                                                final int n49 = j + 1;
                                                                                path.rQuadTo(n47, n46, n48, b[n49]);
                                                                                final float n50 = n7 + b[j];
                                                                                final float n51 = n8 + b[n49];
                                                                                n10 = n46 + n8;
                                                                                n9 = n47 + n7;
                                                                                n8 = n51;
                                                                                n7 = n50;
                                                                                break Label_2031;
                                                                            }
                                                                            else {
                                                                                final float n52 = b[j];
                                                                                n7 += n52;
                                                                                final float n53 = b[j + 1];
                                                                                n8 += n53;
                                                                                if (j > 0) {
                                                                                    path.rLineTo(n52, n53);
                                                                                    break Label_0546;
                                                                                }
                                                                                path.rMoveTo(n52, n53);
                                                                            }
                                                                        }
                                                                        else {
                                                                            n7 = b[j];
                                                                            n8 = b[j + 1];
                                                                            if (j > 0) {
                                                                                path.lineTo(n7, n8);
                                                                                break Label_0546;
                                                                            }
                                                                            path.moveTo(n7, n8);
                                                                        }
                                                                        n6 = n8;
                                                                        n5 = n7;
                                                                    }
                                                                    else {
                                                                        final float n54 = b[j];
                                                                        final int n55 = j + 1;
                                                                        path.lineTo(n54, b[n55]);
                                                                        n7 = b[j];
                                                                        n8 = b[n55];
                                                                    }
                                                                }
                                                                else {
                                                                    path.rLineTo(0.0f, b[j]);
                                                                    n8 += b[j];
                                                                }
                                                            }
                                                            else {
                                                                final float n56 = b[j];
                                                                final int n57 = j + 1;
                                                                final float n58 = b[n57];
                                                                final int n59 = j + 2;
                                                                final float n60 = b[n59];
                                                                final int n61 = j + 3;
                                                                path.rQuadTo(n56, n58, n60, b[n61]);
                                                                final float n62 = b[j];
                                                                final float n63 = b[n57];
                                                                final float n64 = b[n59];
                                                                final float n65 = n8 + b[n61];
                                                                n10 = n63 + n8;
                                                                n9 = n7 + n62;
                                                                n7 += n64;
                                                                n8 = n65;
                                                            }
                                                        }
                                                        else {
                                                            path.rLineTo(b[j], 0.0f);
                                                            n7 += b[j];
                                                        }
                                                    }
                                                    break Label_2031;
                                                }
                                                final float n66 = b[j];
                                                final float n67 = b[j + 1];
                                                final int n68 = j + 2;
                                                final float n69 = b[n68];
                                                final int n70 = j + 3;
                                                final float n71 = b[n70];
                                                final int n72 = j + 4;
                                                final float n73 = b[n72];
                                                final int n74 = j + 5;
                                                path.rCubicTo(n66, n67, n69, n71, n73, b[n74]);
                                                n32 = n7 + b[n68];
                                                n44 = n8 + b[n70];
                                                n7 += b[n72];
                                                n45 = b[n74];
                                            }
                                            n8 += n45;
                                            n31 = n44;
                                        }
                                        n9 = n32;
                                        n10 = n31;
                                        break Label_2031;
                                    }
                                    final int n75 = j + 5;
                                    final float n76 = b[n75];
                                    final int n77 = j + 6;
                                    b(path, n7, n8, n76 + n7, b[n77] + n8, b[j], b[j + 1], b[j + 2], b[j + 3] != 0.0f, b[j + 4] != 0.0f);
                                    n7 += b[n75];
                                    n8 += b[n77];
                                    break Label_2025;
                                }
                                else {
                                    final float n78 = b[j];
                                    final int n79 = j + 1;
                                    final float n80 = b[n79];
                                    final int n81 = j + 2;
                                    final float n82 = b[n81];
                                    final int n83 = j + 3;
                                    path.quadTo(n78, n80, n82, b[n83]);
                                    n84 = b[j];
                                    n85 = b[n79];
                                    n7 = b[n81];
                                    n8 = b[n83];
                                }
                            }
                            else {
                                final float n86 = b[j];
                                final float n87 = b[j + 1];
                                final int n88 = j + 2;
                                final float n89 = b[n88];
                                final int n90 = j + 3;
                                final float n91 = b[n90];
                                final int n92 = j + 4;
                                final float n93 = b[n92];
                                final int n94 = j + 5;
                                path.cubicTo(n86, n87, n89, n91, n93, b[n94]);
                                n7 = b[n92];
                                n8 = b[n94];
                                n84 = b[n88];
                                n85 = b[n90];
                            }
                            final float n95 = n84;
                            n10 = n85;
                            n9 = n95;
                            break Label_2031;
                        }
                        final int n96 = j + 5;
                        final float n97 = b[n96];
                        final int n98 = j + 6;
                        b(path, n7, n8, n97, b[n98], b[j], b[j + 1], b[j + 2], b[j + 3] != 0.0f, b[j + 4] != 0.0f);
                        n7 = b[n96];
                        n8 = b[n98];
                    }
                    n10 = n8;
                    n9 = n7;
                }
                j += n11;
                final int n99 = n14;
                n15 = n14;
                n14 = n99;
            }
            array2[0] = n7;
            array2[1] = n8;
            array2[2] = n9;
            array2[3] = n10;
            array2[4] = n5;
            array2[5] = n6;
            a = array[n13].a;
        }
    }
    
    private static void b(final Path path, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b, final boolean b2) {
        final double radians = Math.toRadians(n7);
        final double cos = Math.cos(radians);
        final double sin = Math.sin(radians);
        double n8 = n;
        Double.isNaN(n8);
        final double n9 = n2;
        Double.isNaN(n9);
        final double n10 = -n;
        Double.isNaN(n10);
        Double.isNaN(n9);
        final double n11 = n9;
        final double n12 = n3;
        Double.isNaN(n12);
        final double n13 = n4;
        Double.isNaN(n13);
        final double n14 = -n3;
        Double.isNaN(n14);
        Double.isNaN(n13);
        final double n15 = n6;
        Double.isNaN(n15);
        final double n16 = (n10 * sin + n9 * cos) / n15;
        Double.isNaN(n15);
        final double n17 = (n14 * sin + n13 * cos) / n15;
        final double n18 = n16 - n17;
        final double n19 = n5;
        Double.isNaN(n19);
        final double n20 = (n8 * cos + n9 * sin) / n19;
        Double.isNaN(n19);
        final double n21 = (n12 * cos + n13 * sin) / n19;
        final double n22 = n20 - n21;
        final double n23 = n22 * n22 + n18 * n18;
        if (n23 == 0.0) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        final double n24 = 1.0 / n23 - 0.25;
        if (n24 < 0.0) {
            final StringBuilder sb = new StringBuilder("Points are too far apart ");
            sb.append(n23);
            Log.w("PathParser", sb.toString());
            final float n25 = (float)(Math.sqrt(n23) / 1.99999);
            b(path, n, n2, n3, n4, n5 * n25, n6 * n25, n7, b, b2);
            return;
        }
        final double sqrt = Math.sqrt(n24);
        final double n26 = (n16 + n17) / 2.0;
        final double n27 = n22 * sqrt;
        final double n28 = (n20 + n21) / 2.0;
        final double n29 = sqrt * n18;
        double n30;
        double n31;
        if (b == b2) {
            n30 = n28 - n29;
            n31 = n26 + n27;
        }
        else {
            n30 = n28 + n29;
            n31 = n26 - n27;
        }
        double atan2 = Math.atan2(n16 - n31, n20 - n30);
        final double n32 = Math.atan2(n17 - n31, n21 - n30) - atan2;
        final boolean b3 = n32 >= 0.0;
        double n33 = n32;
        if (b2 != b3) {
            double n34;
            if (n32 > 0.0) {
                n34 = -6.283185307179586;
            }
            else {
                n34 = 6.283185307179586;
            }
            n33 = n32 + n34;
        }
        Double.isNaN(n19);
        final double n35 = n30 * n19;
        Double.isNaN(n15);
        final double n36 = n31 * n15;
        final double n37 = n35 * cos;
        final double n38 = n35 * sin;
        final double n39 = n36 * cos;
        final int n40 = (int)Math.ceil(Math.abs(n33 * 4.0 / 3.141592653589793));
        final double cos2 = Math.cos(radians);
        final double sin2 = Math.sin(radians);
        final double cos3 = Math.cos(atan2);
        final double sin3 = Math.sin(atan2);
        Double.isNaN(n19);
        final double n41 = -n19;
        final double n42 = n41 * cos2;
        Double.isNaN(n15);
        final double n43 = n15 * sin2;
        final double n44 = n41 * sin2;
        Double.isNaN(n15);
        final double n45 = n15 * cos2;
        double n46 = sin3 * n44 + cos3 * n45;
        double n47 = n42 * sin3 - n43 * cos3;
        int n48 = 0;
        double n49 = n11;
        final double n50 = n19;
        final double n51 = n44;
        final double n52 = n37;
        while (true) {
            final double n53 = n46;
            if (n48 >= n40) {
                break;
            }
            final double n54 = n40;
            Double.isNaN(n54);
            final double n55 = atan2 + n33 / n54;
            Double.isNaN(n50);
            final double sin4 = Math.sin(n55);
            final double cos4 = Math.cos(n55);
            Double.isNaN(n50);
            final double n56 = n55 - atan2;
            final double tan = Math.tan(n56 / 2.0);
            final double n57 = Math.sin(n56) * (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) / 3.0;
            path.rLineTo(0.0f, 0.0f);
            final double n58 = n38 + n39 + n50 * sin2 * cos4 + n45 * sin4;
            final double n59 = n52 - n36 * sin + n50 * cos2 * cos4 - n43 * sin4;
            n46 = sin4 * n51 + cos4 * n45;
            final double n60 = n42 * sin4 - n43 * cos4;
            path.cubicTo((float)(n8 + n47 * n57), (float)(n49 + n53 * n57), (float)(n59 - n57 * n60), (float)(n58 - n57 * n46), (float)n59, (float)n58);
            ++n48;
            atan2 = n55;
            n49 = n58;
            n47 = n60;
            n8 = n59;
        }
    }
}
