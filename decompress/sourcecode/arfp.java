import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfp
{
    static final Pattern a;
    
    static {
        a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }
    
    public static dpu a(final arde arde, final String s) {
        final List c = c(arde, s, true);
        if (c.isEmpty()) {
            return null;
        }
        return (dpu)c.get(0);
    }
    
    public static List b(final dpz dpz, final String s) {
        return c(dpz, s, false);
    }
    
    public static List c(Object c, String s, final boolean b) {
        Object o = c;
        String substring = s;
        if (s.startsWith("/")) {
            s = s.substring(1);
            while (true) {
                o = c;
                substring = s;
                if (!(c instanceof dpu)) {
                    break;
                }
                c = ((dpu)c).c();
            }
        }
        if (substring.length() == 0) {
            if (o instanceof dpu) {
                return Collections.singletonList(o);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        else {
            final boolean contains = substring.contains("/");
            int n = 0;
            String substring2;
            if (contains) {
                substring2 = substring.substring(substring.indexOf(47) + 1);
                substring = substring.substring(0, substring.indexOf(47));
            }
            else {
                substring2 = "";
            }
            final Matcher matcher = arfp.a.matcher(substring);
            if (!matcher.matches()) {
                c = new RuntimeException(String.valueOf(substring).concat(" is invalid path."));
                throw c;
            }
            s = matcher.group(1);
            if ("..".equals(s)) {
                if (o instanceof dpu) {
                    return c(((dpu)o).c(), substring2, b);
                }
                return Collections.emptyList();
            }
            else {
                if (o instanceof dpz) {
                    int int1;
                    if (matcher.group(2) != null) {
                        int1 = Integer.parseInt(matcher.group(3));
                    }
                    else {
                        int1 = -1;
                    }
                    final LinkedList list = new LinkedList();
                    for (final dpu dpu : ((dpz)o).i()) {
                        int n2 = n;
                        if (dpu.d().matches(s)) {
                            if (int1 == -1 || int1 == n) {
                                list.addAll(c(dpu, substring2, b));
                            }
                            n2 = n + 1;
                        }
                        if (!b) {
                            n = n2;
                            if (int1 < 0) {
                                continue;
                            }
                        }
                        n = n2;
                        if (!list.isEmpty()) {
                            break;
                        }
                    }
                    return list;
                }
                return Collections.emptyList();
            }
        }
    }
}
