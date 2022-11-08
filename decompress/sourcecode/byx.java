import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class byx
{
    public static final Pattern a;
    public static final Pattern b;
    public final bar c;
    public final StringBuilder d;
    
    static {
        a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }
    
    public byx() {
        this.c = new bar();
        this.d = new StringBuilder();
    }
    
    public static String a(final bar bar, final StringBuilder sb) {
        sb.setLength(0);
        int b = bar.b;
        final int c = bar.c;
    Label_0015:
        while (true) {
            for (int n = 0; b < c && n == 0; n = 1) {
                final char c2 = (char)bar.a[b];
                if ((c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_') {
                    ++b;
                    sb.append(c2);
                    continue Label_0015;
                }
            }
            break;
        }
        bar.H(b - bar.b);
        return sb.toString();
    }
    
    static String b(final bar bar, final StringBuilder sb) {
        c(bar);
        if (bar.a() == 0) {
            return null;
        }
        final String a = a(bar, sb);
        if (!"".equals(a)) {
            return a;
        }
        final int i = bar.i();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append((char)i);
        return sb2.toString();
    }
    
    static void c(final bar bar) {
    Label_0000:
        while (true) {
            for (int n = 1; bar.a() > 0 && n != 0; n = 0) {
                int b = bar.b;
                final byte[] a = bar.a;
                final byte b2 = a[b];
                final char c = (char)b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    bar.H(1);
                    continue Label_0000;
                }
                int c2 = bar.c;
                if (b + 2 <= c2) {
                    ++b;
                    if (b2 == 47) {
                        int n2 = b + 1;
                        if (a[b] == 42) {
                            while (true) {
                                final int n3 = n2 + 1;
                                if (n3 >= c2) {
                                    break;
                                }
                                if ((char)a[n2] == '*' && (char)a[n3] == '/') {
                                    n2 = (c2 = n3 + 1);
                                }
                                else {
                                    n2 = n3;
                                }
                            }
                            bar.H(c2 - bar.b);
                            continue Label_0000;
                        }
                    }
                }
            }
            break;
        }
    }
}
