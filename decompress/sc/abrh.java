import android.net.Uri;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrh implements zpj
{
    public abjv a;
    public long b;
    public boolean c;
    private final tjm d;
    private final oby e;
    private final long g;
    private final String h;
    private final abkd i;
    
    public abrh(final tjm d, final abjv a, final abkd i, final oby e, final long g, final String h) {
        this.d = d;
        this.i = i;
        this.a = a;
        this.e = e;
        this.g = g;
        this.h = h;
    }
    
    private static String c(final long n) {
        final double n2 = (double)n;
        final Locale us = Locale.US;
        Double.isNaN(n2);
        return String.format(us, "%.1f", n2 / 1000.0);
    }
    
    public final String a(final Uri uri, final String s) {
        final Integer n = abrg.a.get(s);
        if (n == null) {
            return null;
        }
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return this.i.a();
            }
            case 6: {
                final abjv a = this.a;
                if (a != null) {
                    return a.a();
                }
                return "0";
            }
            case 5: {
                return c(this.e.d() - this.g);
            }
            case 4: {
                return String.valueOf(this.d.a());
            }
            case 3: {
                if (!this.c) {
                    return "pause";
                }
                return "playing";
            }
            case 2: {
                return this.h;
            }
            case 1: {
                return c(this.b);
            }
        }
    }
    
    public final String b() {
        return "VideoStats2MacroConverter";
    }
}
