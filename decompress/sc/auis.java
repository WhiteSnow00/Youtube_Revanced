import java.util.Locale;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

enum auis implements aujf, aujd
{
    a;
    
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final auis[] g;
    
    static {
        f = new ArrayList();
        final ArrayList d2 = new ArrayList(auft.b);
        Collections.sort((List<Comparable>)(d = d2));
        e = new HashMap();
        final Iterator iterator = d2.iterator();
        int max = 0;
        int max2 = 0;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            final int index = s.indexOf(47);
            if (index >= 0) {
                int n;
                if ((n = index) < s.length()) {
                    n = index + 1;
                }
                max2 = Math.max(max2, n);
                final String substring = s.substring(0, n + 1);
                final String substring2 = s.substring(n);
                final Map e2 = auis.e;
                if (!e2.containsKey(substring)) {
                    e2.put(substring, new ArrayList());
                }
                ((List<String>)e2.get(substring)).add(substring2);
            }
            else {
                auis.f.add(s);
            }
            max = Math.max(max, s.length());
        }
        b = max;
        c = max2;
    }
    
    public final int a() {
        return auis.b;
    }
    
    public final int b() {
        return auis.b;
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        List f = auis.f;
        final int length = charSequence.length();
        final int min = Math.min(length, auis.c + n);
        int i = n;
        while (true) {
            while (i < min) {
                if (charSequence.charAt(i) == '/') {
                    final int n2 = i + 1;
                    final String string = charSequence.subSequence(n, n2).toString();
                    final int n3 = string.length() + n;
                    String string2;
                    if (i < length) {
                        final char char1 = charSequence.charAt(n2);
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(char1);
                        string2 = sb.toString();
                    }
                    else {
                        string2 = string;
                    }
                    f = (List)auis.e.get(string2);
                    if (f == null) {
                        return ~n;
                    }
                    final int n4 = n3;
                    int j = 0;
                    String s = null;
                    while (j < f.size()) {
                        final String s2 = f.get(j);
                        String s3 = s;
                        Label_0250: {
                            if (aump.c(charSequence, n4, s2)) {
                                if (s != null) {
                                    s3 = s;
                                    if (s2.length() <= s.length()) {
                                        break Label_0250;
                                    }
                                }
                                s3 = s2;
                            }
                        }
                        ++j;
                        s = s3;
                    }
                    if (s != null) {
                        auiz.f(auft.i(String.valueOf(string).concat(s)));
                        return n4 + s.length();
                    }
                    return ~n;
                }
                else {
                    ++i;
                }
            }
            final String string = "";
            final int n4 = n;
            continue;
        }
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, final int n2, final auft auft, final Locale locale) {
        String c;
        if (auft != null) {
            c = auft.c;
        }
        else {
            c = "";
        }
        appendable.append(c);
    }
}
