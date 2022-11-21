import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cji
{
    static float a(final View view) {
        return view.getTransitionAlpha();
    }
    
    static void b(final View view, final float transitionAlpha) {
        view.setTransitionAlpha(transitionAlpha);
    }
    
    public static int c(final float n, int round, final int n2) {
        if (round == n2) {
            return round;
        }
        final float n3 = (n2 >> 24 & 0xFF) / 255.0f;
        final float n4 = (round >> 24 & 0xFF) / 255.0f;
        final float e = e((round >> 16 & 0xFF) / 255.0f);
        final float e2 = e((round >> 8 & 0xFF) / 255.0f);
        final float e3 = e((round & 0xFF) / 255.0f);
        final float e4 = e((n2 >> 16 & 0xFF) / 255.0f);
        final float e5 = e((n2 >> 8 & 0xFF) / 255.0f);
        final float e6 = e((n2 & 0xFF) / 255.0f);
        final float f = f(e + (e4 - e) * n);
        final float f2 = f(e2 + (e5 - e2) * n);
        final float f3 = f(e3 + n * (e6 - e3));
        round = Math.round((n4 + (n3 - n4) * n) * 255.0f);
        return Math.round(f * 255.0f) << 16 | round << 24 | Math.round(f2 * 255.0f) << 8 | Math.round(f3 * 255.0f);
    }
    
    public static String d(final int n) {
        switch (n) {
            default: {
                return "END_DOCUMENT";
            }
            case 9: {
                return "NULL";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 7: {
                return "NUMBER";
            }
            case 6: {
                return "STRING";
            }
            case 5: {
                return "NAME";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 1: {
                return "BEGIN_ARRAY";
            }
        }
    }
    
    private static float e(float n) {
        if (n <= 0.04045f) {
            n /= 12.92f;
        }
        else {
            n = (float)Math.pow((n + 0.055f) / 1.055f, 2.4000000953674316);
        }
        return n;
    }
    
    private static float f(float n) {
        if (n <= 0.0031308f) {
            n *= 12.92f;
        }
        else {
            n = (float)(Math.pow(n, 0.4166666567325592) * 1.0549999475479126 - 0.054999999701976776);
        }
        return n;
    }
}
