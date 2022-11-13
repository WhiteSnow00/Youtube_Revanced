import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auiu implements aujf, aujd
{
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;
    
    public auiu(final String a, final String b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static final int e(final CharSequence charSequence, final int n, int i) {
        i = Math.min(charSequence.length() - n, i);
        int n2 = 0;
        while (i > 0) {
            final char char1 = charSequence.charAt(n + n2);
            if (char1 < '0') {
                break;
            }
            if (char1 > '9') {
                break;
            }
            ++n2;
            --i;
        }
        return n2;
    }
    
    public final int a() {
        return this.b();
    }
    
    public final int b() {
        int n;
        if (!this.c) {
            n = 6;
        }
        else {
            n = 7;
        }
        final String a = this.a;
        int length = n;
        if (a != null && a.length() > (length = n)) {
            length = a.length();
        }
        return length;
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, int n) {
        final int n2 = charSequence.length() - n;
        final String b = this.b;
        final int n3 = 0;
        final Integer value = 0;
        Label_0103: {
            if (b != null) {
                if (b.length() == 0) {
                    if (n2 > 0) {
                        final char char1 = charSequence.charAt(n);
                        if (char1 == '-') {
                            break Label_0103;
                        }
                        if (char1 == '+') {
                            break Label_0103;
                        }
                    }
                    auiz.e(value);
                    return n;
                }
                if (aump.d(charSequence, n, b)) {
                    auiz.e(value);
                    return n + this.b.length();
                }
            }
        }
        if (n2 <= 1) {
            return ~n;
        }
        final char char2 = charSequence.charAt(n);
        boolean b2;
        if (char2 == '-') {
            b2 = true;
        }
        else {
            if (char2 != '+') {
                return ~n;
            }
            b2 = false;
        }
        ++n;
        if (e(charSequence, n, 2) < 2) {
            return ~n;
        }
        final int b3 = aujb.b(charSequence, n);
        if (b3 > 23) {
            return ~n;
        }
        final int n4 = b3 * 3600000;
        int n5 = n2 - 3;
        final int n6 = n + 2;
        int n7 = 0;
        Label_0698: {
            if (n5 <= 0) {
                n7 = n4;
                n = n6;
            }
            else {
                final char char3 = charSequence.charAt(n6);
                int n8;
                if (char3 == ':') {
                    n = n6 + 1;
                    --n5;
                    n8 = 1;
                }
                else {
                    n7 = n4;
                    n = n6;
                    if (char3 < '0') {
                        break Label_0698;
                    }
                    n7 = n4;
                    n = n6;
                    if (char3 > '9') {
                        break Label_0698;
                    }
                    n8 = 0;
                    n = n6;
                }
                final int e = e(charSequence, n, 2);
                int n9 = n8;
                int n10 = e;
                if (e == 0) {
                    if (n8 == 0) {
                        n7 = n4;
                        break Label_0698;
                    }
                    n9 = 1;
                    n10 = 0;
                }
                if (n10 < 2) {
                    return ~n;
                }
                final int b4 = aujb.b(charSequence, n);
                if (b4 > 59) {
                    return ~n;
                }
                final int n11 = n4 + b4 * 60000;
                final int n12 = n5 - 2;
                final int n13 = n + 2;
                if (n12 > 0) {
                    int n14 = n12;
                    n = n13;
                    if (n9 != 0) {
                        if (charSequence.charAt(n13) != ':') {
                            n7 = n11;
                            n = n13;
                            break Label_0698;
                        }
                        n = n13 + 1;
                        n14 = n12 - 1;
                    }
                    final int e2 = e(charSequence, n, 2);
                    if (e2 == 0) {
                        if (n9 == 0) {
                            n7 = n11;
                            break Label_0698;
                        }
                    }
                    else if (e2 >= 2) {
                        final int b5 = aujb.b(charSequence, n);
                        if (b5 > 59) {
                            return ~n;
                        }
                        final int n15 = n11 + b5 * 1000;
                        final int n16 = n + 2;
                        if (n14 - 2 <= 0) {
                            n7 = n15;
                            n = n16;
                            break Label_0698;
                        }
                        n = n16;
                        if (n9 != 0) {
                            if (charSequence.charAt(n16) != '.' && charSequence.charAt(n16) != ',') {
                                n7 = n15;
                                n = n16;
                                break Label_0698;
                            }
                            n = n16 + 1;
                        }
                        int e3 = e(charSequence, n, 3);
                        if (e3 == 0) {
                            e3 = n3;
                            if (n9 == 0) {
                                n7 = n15;
                                break Label_0698;
                            }
                        }
                        if (e3 <= 0) {
                            return ~n;
                        }
                        final int n17 = n + 1;
                        final int n18 = n15 + (charSequence.charAt(n) - '0') * 100;
                        n = n17;
                        n7 = n18;
                        if (e3 > 1) {
                            final int n19 = n17 + 1;
                            final int n20 = n7 = n18 + (charSequence.charAt(n17) - 48) * 10;
                            n = n19;
                            if (e3 > 2) {
                                n = n19 + 1;
                                n7 = n20 + (charSequence.charAt(n19) - '0');
                            }
                        }
                        break Label_0698;
                    }
                    return ~n;
                }
                n7 = n11;
                n = n13;
            }
        }
        int n21 = n7;
        if (b2) {
            n21 = -n7;
        }
        auiz.e(Integer.valueOf(n21));
        return n;
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, int n2, final auft auft, final Locale locale) {
        if (auft == null) {
            return;
        }
        final int n3 = 0;
        int n4;
        if ((n4 = n2) == 0) {
            final String a = this.a;
            if (a != null) {
                appendable.append(a);
                return;
            }
            n4 = 0;
        }
        if (n4 >= 0) {
            appendable.append('+');
        }
        else {
            appendable.append('-');
            n4 = -n4;
        }
        n2 = n4 / 3600000;
        aujb.d(appendable, n2, 2);
        n2 = n4 - n2 * 3600000;
        if (n2 == 0) {
            n2 = n3;
        }
        if (this.c) {
            appendable.append(':');
        }
        final int n5 = n2 / 60000;
        aujb.d(appendable, n5, 2);
        if (this.d == 2) {
            return;
        }
        n2 -= n5 * 60000;
        if (n2 != 0) {
            final int n6 = n2 / 1000;
            if (this.c) {
                appendable.append(':');
            }
            aujb.d(appendable, n6, 2);
            if (this.d == 3) {
                return;
            }
            n2 -= n6 * 1000;
            if (n2 != 0) {
                if (this.c) {
                    appendable.append('.');
                }
                aujb.d(appendable, n2, 3);
            }
        }
    }
}
