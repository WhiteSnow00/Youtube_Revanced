// 
// Decompiled by Procyon v0.6.0
// 

public class aflu extends afls
{
    private static final String a;
    
    static {
        while (true) {
            try {
                String property = System.getProperty("line.separator");
                if (!property.matches("\\n|\\r(?:\\n)?")) {
                    property = "\n";
                }
                a = property;
            }
            catch (final SecurityException ex) {
                continue;
            }
            break;
        }
    }
    
    public static int b(final String s, int i) {
        while (i < s.length()) {
            final int n = i + 1;
            if (s.charAt(i) != '%') {
                i = n;
            }
            else {
                if (n >= s.length()) {
                    throw aflt.c("trailing unquoted '%' character", s, n - 1);
                }
                i = s.charAt(n);
                if (i != 37 && i != 110) {
                    return n - 1;
                }
                i = n + 1;
            }
        }
        return -1;
    }
    
    public final void a(final StringBuilder sb, final String s, int i, final int n) {
        int n2 = i;
        while (i < n) {
            final int n3 = i + 1;
            Label_0101: {
                if (s.charAt(i) == '%') {
                    if (n3 == n) {
                        break;
                    }
                    i = s.charAt(n3);
                    if (i == 37) {
                        sb.append(s, n2, n3);
                    }
                    else {
                        if (i != 110) {
                            break Label_0101;
                        }
                        sb.append(s, n2, n3 - 1);
                        sb.append(aflu.a);
                    }
                    n2 = (i = n3 + 1);
                    continue;
                }
            }
            i = n3;
        }
        if (n2 < n) {
            sb.append(s, n2, n);
        }
    }
}
