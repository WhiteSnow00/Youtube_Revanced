import java.util.Locale;
import java.util.regex.Pattern;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afbj
{
    public static final int a = 0;
    
    static {
        Logger.getLogger(afbj.class.getName());
    }
    
    private afbj() {
    }
    
    static long a() {
        return System.nanoTime();
    }
    
    static afat b(final String s) {
        s.getClass();
        return new afba(Pattern.compile(s));
    }
    
    public static String c(final String s) {
        String s2 = s;
        if (f(s)) {
            s2 = null;
        }
        return s2;
    }
    
    static String d(final double n) {
        return String.format(Locale.ROOT, "%.4g", n);
    }
    
    public static String e(final String s) {
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        return s2;
    }
    
    public static boolean f(final String s) {
        return s == null || s.isEmpty();
    }
}
