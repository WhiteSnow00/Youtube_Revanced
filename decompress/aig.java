import android.util.Log;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aig
{
    public char a;
    public final float[] b;
    
    public aig(final char a, final float[] b) {
        this.a = a;
        this.b = b;
    }
    
    public aig(final aig aig) {
        this.a = aig.a;
        final float[] b = aig.b;
        this.b = vi.d(b, b.length);
    }
    
    public static void a(final aig[] array, final Path path) {
        final float[] array2 = new float[6];
        int a = 109;
        int n15;
        for (int i = 0; i < array.length; i = n15 + 1) {
            final aig aig = array[i];
            final char a2 = aig.a;
            final float[] b = aig.b;
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
            final float n12 = n7;
            float n13 = n8;
            final int n14 = 0;
            n15 = i;
            int n16 = a2;
            float n17 = n12;
            int n95;
            for (int j = n14; j < b.length; j += n11, n95 = n16, a = n16, n16 = n95) {
                Label_2011: {
                    if (n16 != 65) {
                        float n80;
                        float n81;
                        if (n16 != 67) {
                            if (n16 == 72) {
                                path.lineTo(b[j], n13);
                                n17 = b[j];
                                continue;
                            }
                            if (n16 != 81) {
                                if (n16 == 86) {
                                    path.lineTo(n17, b[j]);
                                    n13 = b[j];
                                    continue;
                                }
                                if (n16 != 97) {
                                    float n28 = 0.0f;
                                    float n29 = 0.0f;
                                    Label_1503: {
                                        float n40 = 0.0f;
                                        float n41 = 0.0f;
                                        Label_1494: {
                                            if (n16 != 99) {
                                                Label_0550: {
                                                    if (n16 != 104) {
                                                        if (n16 != 113) {
                                                            if (n16 != 118) {
                                                                if (n16 != 76) {
                                                                    if (n16 != 77) {
                                                                        if (n16 == 83) {
                                                                            if (a == 99 || a == 115 || a == 67 || a == 83) {
                                                                                n13 = n13 + n13 - n10;
                                                                                n17 = n17 + n17 - n9;
                                                                            }
                                                                            final float n18 = b[j];
                                                                            final int n19 = j + 1;
                                                                            final float n20 = b[n19];
                                                                            final int n21 = j + 2;
                                                                            final float n22 = b[n21];
                                                                            final int n23 = j + 3;
                                                                            path.cubicTo(n17, n13, n18, n20, n22, b[n23]);
                                                                            n9 = b[j];
                                                                            n10 = b[n19];
                                                                            n17 = b[n21];
                                                                            n13 = b[n23];
                                                                            break Label_0550;
                                                                        }
                                                                        if (n16 == 84) {
                                                                            float n24;
                                                                            float n25;
                                                                            if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                n24 = n13;
                                                                                n25 = n17;
                                                                            }
                                                                            else {
                                                                                n25 = n17 + n17 - n9;
                                                                                n24 = n13 + n13 - n10;
                                                                            }
                                                                            final float n26 = b[j];
                                                                            final int n27 = j + 1;
                                                                            path.quadTo(n25, n24, n26, b[n27]);
                                                                            n17 = b[j];
                                                                            n13 = b[n27];
                                                                            n28 = n24;
                                                                            n29 = n25;
                                                                            break Label_1503;
                                                                        }
                                                                        if (n16 == 108) {
                                                                            final float n30 = b[j];
                                                                            final int n31 = j + 1;
                                                                            path.rLineTo(n30, b[n31]);
                                                                            n17 += b[j];
                                                                            n13 += b[n31];
                                                                            break Label_0550;
                                                                        }
                                                                        if (n16 != 109) {
                                                                            if (n16 == 115) {
                                                                                float n32;
                                                                                float n33;
                                                                                if (a != 99 && a != 115 && a != 67 && a != 83) {
                                                                                    n32 = 0.0f;
                                                                                    n33 = 0.0f;
                                                                                }
                                                                                else {
                                                                                    n33 = n13 - n10;
                                                                                    n32 = n17 - n9;
                                                                                }
                                                                                final float n34 = b[j];
                                                                                final int n35 = j + 1;
                                                                                final float n36 = b[n35];
                                                                                final int n37 = j + 2;
                                                                                final float n38 = b[n37];
                                                                                final int n39 = j + 3;
                                                                                path.rCubicTo(n32, n33, n34, n36, n38, b[n39]);
                                                                                n29 = n17 + b[j];
                                                                                n40 = n13 + b[n35];
                                                                                n17 += b[n37];
                                                                                n41 = b[n39];
                                                                                break Label_1494;
                                                                            }
                                                                            if (n16 != 116) {
                                                                                break Label_0550;
                                                                            }
                                                                            float n42;
                                                                            float n43;
                                                                            if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                n42 = 0.0f;
                                                                                n43 = 0.0f;
                                                                            }
                                                                            else {
                                                                                n43 = n17 - n9;
                                                                                n42 = n13 - n10;
                                                                            }
                                                                            final float n44 = b[j];
                                                                            final int n45 = j + 1;
                                                                            path.rQuadTo(n43, n42, n44, b[n45]);
                                                                            final float n46 = n17 + b[j];
                                                                            final float n47 = n13 + b[n45];
                                                                            n10 = n42 + n13;
                                                                            n9 = n43 + n17;
                                                                            n13 = n47;
                                                                            n17 = n46;
                                                                            continue;
                                                                        }
                                                                        else {
                                                                            final float n48 = b[j];
                                                                            n17 += n48;
                                                                            final float n49 = b[j + 1];
                                                                            n13 += n49;
                                                                            if (j > 0) {
                                                                                path.rLineTo(n48, n49);
                                                                                break Label_0550;
                                                                            }
                                                                            path.rMoveTo(n48, n49);
                                                                        }
                                                                    }
                                                                    else {
                                                                        n17 = b[j];
                                                                        n13 = b[j + 1];
                                                                        if (j > 0) {
                                                                            path.lineTo(n17, n13);
                                                                            break Label_0550;
                                                                        }
                                                                        path.moveTo(n17, n13);
                                                                    }
                                                                    n6 = n13;
                                                                    n5 = n17;
                                                                }
                                                                else {
                                                                    final float n50 = b[j];
                                                                    final int n51 = j + 1;
                                                                    path.lineTo(n50, b[n51]);
                                                                    n17 = b[j];
                                                                    n13 = b[n51];
                                                                }
                                                            }
                                                            else {
                                                                path.rLineTo(0.0f, b[j]);
                                                                n13 += b[j];
                                                            }
                                                        }
                                                        else {
                                                            final float n52 = b[j];
                                                            final int n53 = j + 1;
                                                            final float n54 = b[n53];
                                                            final int n55 = j + 2;
                                                            final float n56 = b[n55];
                                                            final int n57 = j + 3;
                                                            path.rQuadTo(n52, n54, n56, b[n57]);
                                                            final float n58 = b[j];
                                                            final float n59 = b[n53];
                                                            final float n60 = b[n55];
                                                            final float n61 = n13 + b[n57];
                                                            n10 = n59 + n13;
                                                            n9 = n17 + n58;
                                                            n17 += n60;
                                                            n13 = n61;
                                                        }
                                                    }
                                                    else {
                                                        path.rLineTo(b[j], 0.0f);
                                                        n17 += b[j];
                                                    }
                                                }
                                                continue;
                                            }
                                            final float n62 = b[j];
                                            final float n63 = b[j + 1];
                                            final int n64 = j + 2;
                                            final float n65 = b[n64];
                                            final int n66 = j + 3;
                                            final float n67 = b[n66];
                                            final int n68 = j + 4;
                                            final float n69 = b[n68];
                                            final int n70 = j + 5;
                                            path.rCubicTo(n62, n63, n65, n67, n69, b[n70]);
                                            n29 = n17 + b[n64];
                                            n40 = n13 + b[n66];
                                            n17 += b[n68];
                                            n41 = b[n70];
                                        }
                                        n13 += n41;
                                        n28 = n40;
                                    }
                                    n9 = n29;
                                    n10 = n28;
                                    continue;
                                }
                                final int n71 = j + 5;
                                final float n72 = b[n71];
                                final int n73 = j + 6;
                                b(path, n17, n13, n72 + n17, b[n73] + n13, b[j], b[j + 1], b[j + 2], b[j + 3] != 0.0f, b[j + 4] != 0.0f);
                                n17 += b[n71];
                                n13 += b[n73];
                                break Label_2011;
                            }
                            else {
                                final float n74 = b[j];
                                final int n75 = j + 1;
                                final float n76 = b[n75];
                                final int n77 = j + 2;
                                final float n78 = b[n77];
                                final int n79 = j + 3;
                                path.quadTo(n74, n76, n78, b[n79]);
                                n80 = b[j];
                                n81 = b[n75];
                                n17 = b[n77];
                                n13 = b[n79];
                            }
                        }
                        else {
                            final float n82 = b[j];
                            final float n83 = b[j + 1];
                            final int n84 = j + 2;
                            final float n85 = b[n84];
                            final int n86 = j + 3;
                            final float n87 = b[n86];
                            final int n88 = j + 4;
                            final float n89 = b[n88];
                            final int n90 = j + 5;
                            path.cubicTo(n82, n83, n85, n87, n89, b[n90]);
                            n17 = b[n88];
                            n13 = b[n90];
                            n80 = b[n84];
                            n81 = b[n86];
                        }
                        final float n91 = n80;
                        n10 = n81;
                        n9 = n91;
                        continue;
                    }
                    final int n92 = j + 5;
                    final float n93 = b[n92];
                    final int n94 = j + 6;
                    b(path, n17, n13, n93, b[n94], b[j], b[j + 1], b[j + 2], b[j + 3] != 0.0f, b[j + 4] != 0.0f);
                    n17 = b[n92];
                    n13 = b[n94];
                }
                n10 = n13;
                n9 = n17;
            }
            array2[0] = n17;
            array2[1] = n13;
            array2[2] = n9;
            array2[3] = n10;
            array2[4] = n5;
            array2[5] = n6;
            a = array[n15].a;
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
