import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bci
{
    private static final Pattern a;
    private static final Pattern b;
    
    static {
        a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }
    
    public static long a(final String s, final String s2) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        long long1;
        final long n = long1 = -1L;
        if (!empty) {
            try {
                long1 = Long.parseLong(s);
            }
            catch (final NumberFormatException ex) {
                final StringBuilder sb = new StringBuilder("Unexpected Content-Length [");
                sb.append(s);
                sb.append("]");
                baq.a("HttpUtil", sb.toString());
                long1 = n;
            }
        }
        long max = long1;
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            final Matcher matcher = bci.a.matcher(s2);
            max = long1;
            if (matcher.matches()) {
                try {
                    final String group = matcher.group(2);
                    bad.b(group);
                    final long long2 = Long.parseLong(group);
                    final String group2 = matcher.group(1);
                    bad.b(group2);
                    final long n2 = long2 - Long.parseLong(group2) + 1L;
                    if (long1 < 0L) {
                        max = n2;
                    }
                    else {
                        max = long1;
                        if (long1 != n2) {
                            final StringBuilder sb2 = new StringBuilder("Inconsistent headers [");
                            sb2.append(s);
                            sb2.append("] [");
                            sb2.append(s2);
                            sb2.append("]");
                            baq.c("HttpUtil", sb2.toString());
                            max = Math.max(long1, n2);
                        }
                    }
                }
                catch (final NumberFormatException ex2) {
                    final StringBuilder sb3 = new StringBuilder("Unexpected Content-Range [");
                    sb3.append(s2);
                    sb3.append("]");
                    baq.a("HttpUtil", sb3.toString());
                    max = long1;
                }
            }
        }
        return max;
    }
    
    public static long b(String group) {
        if (TextUtils.isEmpty((CharSequence)group)) {
            return -1L;
        }
        final Matcher matcher = bci.b.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(1);
            bad.b(group);
            return Long.parseLong(group);
        }
        return -1L;
    }
    
    public static String c(final long n, final long n2) {
        long n3 = n;
        if (n == 0L) {
            if (n2 == -1L) {
                return null;
            }
            n3 = 0L;
        }
        final StringBuilder sb = new StringBuilder("bytes=");
        sb.append(n3);
        sb.append("-");
        if (n2 != -1L) {
            sb.append(n3 + n2 - 1L);
        }
        return sb.toString();
    }
}
