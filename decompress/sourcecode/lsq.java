import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsq
{
    private static final Pattern c;
    public final int a;
    public final int b;
    
    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }
    
    private lsq(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static lsq a(final String s, final String s2) {
        final boolean equals = "iTunSMPB".equals(s);
        final lsq lsq = null;
        if (!equals) {
            return null;
        }
        final Matcher matcher = lsq.c.matcher(s2);
        lsq lsq2 = lsq;
        if (!matcher.find()) {
            return lsq2;
        }
        try {
            final int int1 = Integer.parseInt(matcher.group(1), 16);
            final int int2 = Integer.parseInt(matcher.group(2), 16);
            int n = int1;
            if (int1 == 0) {
                if (int2 == 0) {
                    lsq2 = lsq;
                    return lsq2;
                }
                n = 0;
            }
            lsq2 = new lsq(n, int2);
            return lsq2;
        }
        catch (final NumberFormatException ex) {
            lsq2 = lsq;
            return lsq2;
        }
    }
    
    public static lsq b(int n) {
        final int n2 = n >> 12;
        n &= 0xFFF;
        if (n2 == 0 && n == 0) {
            return null;
        }
        return new lsq(n2, n);
    }
}
