import java.util.Locale;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class auic implements auio, auim
{
    private final int a;
    
    public auic(final int a) {
        this.a = a;
    }
    
    public final int a() {
        if (this.a == 1) {
            return 4;
        }
        return 20;
    }
    
    public final int b() {
        if (this.a == 1) {
            return 4;
        }
        return 20;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        final Map a = auez.a;
        final Iterator iterator = a.keySet().iterator();
        String s = null;
        while (iterator.hasNext()) {
            final String s2 = (String)iterator.next();
            if (auma.c(charSequence, n, s2) && (s == null || s2.length() > s.length())) {
                s = s2;
            }
        }
        if (s != null) {
            auii.f((aufc)a.get(s));
            return n + s.length();
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, long n, final aueu aueu, final int n2, final aufc aufc, final Locale locale) {
        n -= n2;
        String s = null;
        Label_0315: {
            if (aufc == null) {
                s = "";
            }
            else {
                String s3;
                if (this.a != 0) {
                    Locale default1;
                    if ((default1 = locale) == null) {
                        default1 = Locale.getDefault();
                    }
                    final String g = aufc.g(n);
                    if (g == null) {
                        s = aufc.c;
                        break Label_0315;
                    }
                    final auji d = aufc.d;
                    String s2 = null;
                    Label_0145: {
                        if (d instanceof auji) {
                            final String[] b = d.b(default1, aufc.c, aufc.m(n));
                            if (b != null) {
                                s2 = b[0];
                                break Label_0145;
                            }
                        }
                        else {
                            final String[] a = d.a(default1, aufc.c, g);
                            if (a != null) {
                                s2 = a[0];
                                break Label_0145;
                            }
                        }
                        s2 = null;
                    }
                    s3 = s2;
                    if (s2 == null) {
                        s = aufc.h(aufc.a(n));
                        break Label_0315;
                    }
                }
                else {
                    Locale default2;
                    if ((default2 = locale) == null) {
                        default2 = Locale.getDefault();
                    }
                    final String g2 = aufc.g(n);
                    if (g2 == null) {
                        s = aufc.c;
                        break Label_0315;
                    }
                    final auji d2 = aufc.d;
                    String s4 = null;
                    Label_0288: {
                        if (d2 instanceof auji) {
                            final String[] b2 = d2.b(default2, aufc.c, aufc.m(n));
                            if (b2 != null) {
                                s4 = b2[1];
                                break Label_0288;
                            }
                        }
                        else {
                            final String[] a2 = d2.a(default2, aufc.c, g2);
                            if (a2 != null) {
                                s4 = a2[1];
                                break Label_0288;
                            }
                        }
                        s4 = null;
                    }
                    s3 = s4;
                    if (s4 == null) {
                        s = aufc.h(aufc.a(n));
                        break Label_0315;
                    }
                }
                s = s3;
            }
        }
        appendable.append(s);
    }
}
