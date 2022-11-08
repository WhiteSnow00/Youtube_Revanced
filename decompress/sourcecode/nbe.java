import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbe
{
    public static final StringBuilder a;
    
    static {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
        new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
        a = new StringBuilder(33);
    }
    
    public static void a(long n, final StringBuilder sb) {
        if (n == 0L) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean b = false;
        long n2 = n;
        if (n < 0L) {
            sb.append("-");
            if (n != Long.MIN_VALUE) {
                n2 = -n;
                b = b;
            }
            else {
                n2 = Long.MAX_VALUE;
                b = true;
            }
        }
        n = n2;
        if (n2 >= 86400000L) {
            sb.append(n2 / 86400000L);
            sb.append("d");
            n = n2 % 86400000L;
        }
        if (b) {
            n = 25975808L;
        }
        long n3 = n;
        if (n >= 3600000L) {
            sb.append(n / 3600000L);
            sb.append("h");
            n3 = n % 3600000L;
        }
        n = n3;
        if (n3 >= 60000L) {
            sb.append(n3 / 60000L);
            sb.append("m");
            n = n3 % 60000L;
        }
        long n4 = n;
        if (n >= 1000L) {
            sb.append(n / 1000L);
            sb.append("s");
            n4 = n % 1000L;
        }
        if (n4 > 0L) {
            sb.append(n4);
            sb.append("ms");
        }
    }
}
