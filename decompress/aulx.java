import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aulx
{
    private static final double a;
    
    static {
        a = Math.log(10.0);
    }
    
    public static int a(final long n) {
        int n2 = 1;
        if (n >= 0L) {
            if (n >= 10L) {
                if (n < 100L) {
                    n2 = 2;
                }
                else if (n < 1000L) {
                    n2 = 3;
                }
                else {
                    if (n >= 10000L) {
                        final int a = (int)(Math.log((double)n) / aulx.a);
                        return a + 1;
                    }
                    n2 = 4;
                }
            }
            return n2;
        }
        final int a = a(-n);
        return a + 1;
    }
    
    static int b(final CharSequence charSequence, final int n) {
        final int n2 = charSequence.charAt(n) - '0';
        return (n2 << 3) + (n2 + n2) + charSequence.charAt(n + 1) - 48;
    }
    
    public static String c(final String s, final int n) {
        final int n2 = n + 32;
        String concat;
        if (s.length() <= n2 + 3) {
            concat = s;
        }
        else {
            concat = s.substring(0, n2).concat("...");
        }
        if (n <= 0) {
            final StringBuilder sb = new StringBuilder("Invalid format: \"");
            sb.append(concat);
            sb.append("\"");
            return sb.toString();
        }
        if (n >= s.length()) {
            final StringBuilder sb2 = new StringBuilder("Invalid format: \"");
            sb2.append(concat);
            sb2.append("\" is too short");
            return sb2.toString();
        }
        final String substring = concat.substring(n);
        final StringBuilder sb3 = new StringBuilder("Invalid format: \"");
        sb3.append(concat);
        sb3.append("\" is malformed at \"");
        sb3.append(substring);
        sb3.append("\"");
        return sb3.toString();
    }
    
    public static void d(final Appendable appendable, int n, int i) {
        int n2 = n;
        if (n < 0) {
            appendable.append('-');
            int j = i;
            if (n == Integer.MIN_VALUE) {
                while (j > 10) {
                    appendable.append('0');
                    --j;
                }
                appendable.append("2147483648");
                return;
            }
            n2 = -n;
        }
        if (n2 < 10) {
            while (i > 1) {
                appendable.append('0');
                --i;
            }
            appendable.append((char)(n2 + 48));
            return;
        }
        if (n2 < 100) {
            while (i > 2) {
                appendable.append('0');
                --i;
            }
            n = (n2 + 1) * 13421772 >> 27;
            appendable.append((char)(n + 48));
            appendable.append((char)(n2 - (n << 3) - (n + n) + 48));
            return;
        }
        if (n2 < 1000) {
            n = 3;
        }
        else if (n2 < 10000) {
            n = 4;
        }
        else {
            n = (int)(Math.log(n2) / aulx.a) + 1;
        }
        while (i > n) {
            appendable.append('0');
            --i;
        }
        appendable.append(Integer.toString(n2));
    }
    
    public static void e(final StringBuffer sb, final int n, final int n2) {
        try {
            d(sb, n, n2);
        }
        catch (final IOException ex) {}
    }
    
    public static void f(final Appendable appendable, int n) {
        int n2 = n;
        if (n < 0) {
            appendable.append('-');
            if (n == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            n2 = -n;
        }
        if (n2 < 10) {
            appendable.append((char)(n2 + 48));
            return;
        }
        if (n2 < 100) {
            n = (n2 + 1) * 13421772 >> 27;
            appendable.append((char)(n + 48));
            appendable.append((char)(n2 - (n << 3) - (n + n) + 48));
            return;
        }
        appendable.append(Integer.toString(n2));
    }
    
    public static void g(final StringBuffer sb, final int n) {
        try {
            f(sb, n);
        }
        catch (final IOException ex) {}
    }
    
    public static void h(final StringBuffer sb, final long n) {
        final int n2 = (int)n;
        Label_0016: {
            if (n2 != n) {
                break Label_0016;
            }
            try {
                f(sb, n2);
                return;
                sb.append(Long.toString(n));
            }
            catch (final IOException ex) {}
        }
    }
}
