import java.util.Locale;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class auit implements aujf, aujd
{
    private final int a;
    
    public auit(final int a) {
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
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        final Map a = aufq.a;
        final Iterator iterator = a.keySet().iterator();
        String s = null;
        while (iterator.hasNext()) {
            final String s2 = (String)iterator.next();
            if (aump.c(charSequence, n, s2) && (s == null || s2.length() > s.length())) {
                s = s2;
            }
        }
        if (s != null) {
            auiz.f((auft)a.get(s));
            return n + s.length();
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, long n, final aufl aufl, final int n2, final auft auft, final Locale locale) {
        String s = null;
        Label_0315: {
            if (auft == null) {
                s = "";
            }
            else {
                n -= n2;
                String s3;
                if (this.a != 0) {
                    Locale default1;
                    if ((default1 = locale) == null) {
                        default1 = Locale.getDefault();
                    }
                    final String g = auft.g(n);
                    if (g == null) {
                        s = auft.c;
                        break Label_0315;
                    }
                    final aujy d = auft.d;
                    String s2 = null;
                    Label_0145: {
                        if (d instanceof aujy) {
                            final String[] b = d.b(default1, auft.c, auft.m(n));
                            if (b != null) {
                                s2 = b[0];
                                break Label_0145;
                            }
                        }
                        else {
                            final String[] a = d.a(default1, auft.c, g);
                            if (a != null) {
                                s2 = a[0];
                                break Label_0145;
                            }
                        }
                        s2 = null;
                    }
                    s3 = s2;
                    if (s2 == null) {
                        s = auft.h(auft.a(n));
                        break Label_0315;
                    }
                }
                else {
                    Locale default2;
                    if ((default2 = locale) == null) {
                        default2 = Locale.getDefault();
                    }
                    final String g2 = auft.g(n);
                    if (g2 == null) {
                        s = auft.c;
                        break Label_0315;
                    }
                    final aujy d2 = auft.d;
                    String s4 = null;
                    Label_0288: {
                        if (d2 instanceof aujy) {
                            final String[] b2 = d2.b(default2, auft.c, auft.m(n));
                            if (b2 != null) {
                                s4 = b2[1];
                                break Label_0288;
                            }
                        }
                        else {
                            final String[] a2 = d2.a(default2, auft.c, g2);
                            if (a2 != null) {
                                s4 = a2[1];
                                break Label_0288;
                            }
                        }
                        s4 = null;
                    }
                    s3 = s4;
                    if (s4 == null) {
                        s = auft.h(auft.a(n));
                        break Label_0315;
                    }
                }
                s = s3;
            }
        }
        appendable.append(s);
    }
}
