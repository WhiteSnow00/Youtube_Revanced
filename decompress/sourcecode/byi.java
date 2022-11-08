import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

final class byi
{
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    
    public byi(final String a, final int b, final Integer c, final Integer d, final float e, final boolean f, final boolean g, final boolean h, final boolean i, final int j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static int a(final String s) {
        while (true) {
            try {
                final int int1 = Integer.parseInt(s.trim());
                switch (int1) {
                    default: {
                        bao.c("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(s)));
                        return -1;
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        return int1;
                    }
                }
            }
            catch (final NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Integer b(final String s) {
        try {
            long n;
            if (s.startsWith("&H")) {
                n = Long.parseLong(s.substring(2), 16);
            }
            else {
                n = Long.parseLong(s);
            }
            dk.f(n <= 4294967295L);
            return Color.argb(aesy.w((n >> 24 & 0xFFL) ^ 0xFFL), aesy.w(n & 0xFFL), aesy.w(n >> 8 & 0xFFL), aesy.w(n >> 16 & 0xFFL));
        }
        catch (final IllegalArgumentException ex) {
            final StringBuilder sb = new StringBuilder("Failed to parse color expression: '");
            sb.append(s);
            sb.append("'");
            bao.d("SsaStyle", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    public static boolean c(final String s) {
        try {
            final int int1 = Integer.parseInt(s);
            return int1 == 1 || int1 == -1;
        }
        catch (final NumberFormatException ex) {
            final StringBuilder sb = new StringBuilder("Failed to parse boolean value: '");
            sb.append(s);
            sb.append("'");
            bao.d("SsaStyle", sb.toString(), (Throwable)ex);
            return false;
        }
    }
}
