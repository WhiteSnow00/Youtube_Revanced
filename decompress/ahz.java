import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahz
{
    private static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static double a(final int n, final int n2) {
        if (Color.alpha(n2) == 255) {
            int e = n;
            if (Color.alpha(n) < 255) {
                e = e(n, n2);
            }
            final double n3 = b(e) + 0.05;
            final double n4 = b(n2) + 0.05;
            return Math.max(n3, n4) / Math.min(n3, n4);
        }
        throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(n2))));
    }
    
    public static double b(int blue) {
        final ThreadLocal a = ahz.a;
        double[] array;
        if ((array = a.get()) == null) {
            array = new double[3];
            a.set(array);
        }
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        if (array.length == 3) {
            final double n = red;
            Double.isNaN(n);
            final double n2 = n / 255.0;
            double pow;
            if (n2 < 0.04045) {
                pow = n2 / 12.92;
            }
            else {
                pow = Math.pow((n2 + 0.055) / 1.055, 2.4);
            }
            final double n3 = green;
            Double.isNaN(n3);
            final double n4 = n3 / 255.0;
            double pow2;
            if (n4 < 0.04045) {
                pow2 = n4 / 12.92;
            }
            else {
                pow2 = Math.pow((n4 + 0.055) / 1.055, 2.4);
            }
            final double n5 = blue;
            Double.isNaN(n5);
            final double n6 = n5 / 255.0;
            double pow3;
            if (n6 < 0.04045) {
                pow3 = n6 / 12.92;
            }
            else {
                pow3 = Math.pow((n6 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.4124 * pow + 0.3576 * pow2 + 0.1805 * pow3) * 100.0;
            final double n7 = (0.2126 * pow + 0.7152 * pow2 + 0.0722 * pow3) * 100.0;
            array[1] = n7;
            array[2] = (pow * 0.0193 + pow2 * 0.1192 + pow3 * 0.9505) * 100.0;
            return n7 / 100.0;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    public static int c(double n, final double n2, final double n3) {
        final double n4 = (3.2406 * n + -1.5372 * n2 + -0.4986 * n3) / 100.0;
        double n5;
        if (n4 > 0.0031308) {
            n5 = Math.pow(n4, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n5 = n4 * 12.92;
        }
        final double n6 = (-0.9689 * n + 1.8758 * n2 + 0.0415 * n3) / 100.0;
        double n7;
        if (n6 > 0.0031308) {
            n7 = Math.pow(n6, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n7 = n6 * 12.92;
        }
        n = (0.0557 * n + -0.204 * n2 + 1.057 * n3) / 100.0;
        if (n > 0.0031308) {
            n = Math.pow(n, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n *= 12.92;
        }
        return Color.rgb(k((int)Math.round(n5 * 255.0)), k((int)Math.round(n7 * 255.0)), k((int)Math.round(n * 255.0)));
    }
    
    public static int d(final int n, final int n2, final float n3) {
        final int alpha = Color.alpha(n2);
        int n4 = 255;
        if (alpha != 255) {
            throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(n2))));
        }
        final double a = a(f(n, 255), n2);
        final double n5 = n3;
        if (a >= n5) {
            for (int n6 = 0, n7 = 0; n6 <= 10 && n4 - n7 > 1; ++n6) {
                final int n8 = (n7 + n4) / 2;
                final double a2 = a(f(n, n8), n2);
                if (a2 >= n5) {
                    n4 = n8;
                }
                if (a2 < n5) {
                    n7 = n8;
                }
            }
            return n4;
        }
        return -1;
    }
    
    public static int e(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int red = Color.red(n);
        final int red2 = Color.red(n2);
        final int n3 = 255 - (255 - alpha) * (255 - alpha2) / 255;
        return Color.argb(n3, i(red, alpha2, red2, alpha, n3), i(Color.green(n), alpha2, Color.green(n2), alpha, n3), i(Color.blue(n), alpha2, Color.blue(n2), alpha, n3));
    }
    
    public static int f(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    public static void g(final int n, final int n2, final int n3, final float[] array) {
        final float n4 = (float)n3;
        final float n5 = (float)n2;
        final float n6 = n / 255.0f;
        final float n7 = n5 / 255.0f;
        final float n8 = n4 / 255.0f;
        final float max = Math.max(n6, Math.max(n7, n8));
        final float min = Math.min(n6, Math.min(n7, n8));
        final float n9 = max - min;
        final float n10 = (max + min) / 2.0f;
        float n11;
        float n12;
        if (max == min) {
            n11 = 0.0f;
            n12 = 0.0f;
        }
        else {
            float n13;
            if (max == n6) {
                n13 = (n7 - n8) / n9 % 6.0f;
            }
            else if (max == n7) {
                n13 = (n8 - n6) / n9 + 2.0f;
            }
            else {
                n13 = 4.0f + (n6 - n7) / n9;
            }
            final float n14 = n9 / (1.0f - Math.abs(n10 + n10 - 1.0f));
            n11 = n13;
            n12 = n14;
        }
        float n16;
        final float n15 = n16 = n11 * 60.0f % 360.0f;
        if (n15 < 0.0f) {
            n16 = n15 + 360.0f;
        }
        array[0] = j(n16, 360.0f);
        array[1] = j(n12, 1.0f);
        array[2] = j(n10, 1.0f);
    }
    
    public static void h(final int n, final float[] array) {
        g(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    private static int i(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
    
    private static float j(final float n, final float n2) {
        if (n < 0.0f) {
            return 0.0f;
        }
        return Math.min(n, n2);
    }
    
    private static int k(final int n) {
        if (n < 0) {
            return 0;
        }
        return Math.min(n, 255);
    }
}
