import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzf
{
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }
    
    public static float a(final String s) {
        if (s.endsWith("%")) {
            return Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
    
    public static long b(final String s) {
        final String[] aq = baw.aq(s, "\\.");
        int i = 0;
        final String[] ap = baw.ap(aq[0], ":");
        final int length = ap.length;
        long n = 0L;
        while (i < length) {
            n = n * 60L + Long.parseLong(ap[i]);
            ++i;
        }
        long n2 = n * 1000L;
        if (aq.length == 2) {
            n2 += Long.parseLong(aq[1]);
        }
        return n2 * 1000L;
    }
    
    public static void c(final bar bar) {
        final int b = bar.b;
        final String t = bar.t();
        if (t != null && t.startsWith("WEBVTT")) {
            return;
        }
        bar.G(b);
        throw ayz.a("Expected WEBVTT. Got ".concat(String.valueOf(bar.t())), (Throwable)null);
    }
}
