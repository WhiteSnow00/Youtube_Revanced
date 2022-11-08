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

enum auib implements auio, auim
{
    a;
    
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    
    static {
        f = new ArrayList();
        final ArrayList d2 = new ArrayList(aufc.b);
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
                final Map e2 = auib.e;
                if (!e2.containsKey(substring)) {
                    e2.put(substring, new ArrayList());
                }
                ((List<String>)e2.get(substring)).add(substring2);
            }
            else {
                auib.f.add(s);
            }
            max = Math.max(max, s.length());
        }
        b = max;
        c = max2;
    }
    
    public final int a() {
        return auib.b;
    }
    
    public final int b() {
        return auib.b;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        List f = auib.f;
        final int length = charSequence.length();
        final int min = Math.min(length, auib.c + n);
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
                    f = (List)auib.e.get(string2);
                    if (f == null) {
                        return ~n;
                    }
                    final int n4 = n3;
                    String s = null;
                    String s3;
                    for (int j = 0; j < f.size(); ++j, s = s3) {
                        final String s2 = f.get(j);
                        s3 = s;
                        if (auma.c(charSequence, n4, s2)) {
                            if (s != null) {
                                s3 = s;
                                if (s2.length() <= s.length()) {
                                    continue;
                                }
                            }
                            s3 = s2;
                        }
                    }
                    if (s != null) {
                        auii.f(aufc.i(String.valueOf(string).concat(s)));
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
    
    public final void d(final Appendable appendable, final long n, final aueu aueu, final int n2, final aufc aufc, final Locale locale) {
        String c;
        if (aufc != null) {
            c = aufc.c;
        }
        else {
            c = "";
        }
        appendable.append(c);
    }
}
