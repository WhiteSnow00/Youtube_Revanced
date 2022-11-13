import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class auiv implements aujf, aujd
{
    private final aufp a;
    private final int b;
    private final boolean c;
    
    public auiv(final aufp a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        if (this.c) {
            return 4;
        }
        return 2;
    }
    
    public final int b() {
        return 2;
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, int char1) {
        int n = charSequence.length() - char1;
        final boolean c = this.c;
        final int n2 = 0;
        Label_0209: {
            if (!c) {
                if (Math.min(2, n) < 2) {
                    return ~char1;
                }
            }
            else {
                final int n3 = 0;
                boolean b = false;
                int n4 = 0;
                int i = char1;
                char1 = n3;
                int n5;
                while (true) {
                    n5 = char1;
                    if (char1 >= n) {
                        break;
                    }
                    final char char2 = charSequence.charAt(i + char1);
                    int n6 = 0;
                    Label_0149: {
                        if ((n6 = char1) == 0) {
                            int n7 = 0;
                            Label_0123: {
                                if (char2 != '-') {
                                    if (char2 != '+') {
                                        n6 = 0;
                                        break Label_0149;
                                    }
                                }
                                else if (char2 == '-') {
                                    n7 = 1;
                                    break Label_0123;
                                }
                                n7 = 0;
                            }
                            if (n7 != 0) {
                                char1 = 1;
                            }
                            else {
                                ++i;
                                --n;
                            }
                            b = true;
                            n4 = n7;
                            continue;
                        }
                    }
                    n5 = n6;
                    if (char2 < '0') {
                        break;
                    }
                    if (char2 > '9') {
                        n5 = n6;
                        break;
                    }
                    char1 = n6 + 1;
                }
                if (n5 == 0) {
                    return ~i;
                }
                if (!b) {
                    char1 = i;
                    if (n5 == 2) {
                        break Label_0209;
                    }
                }
                Label_0500: {
                    if (n5 >= 9) {
                        char1 = n5 + i;
                        final int int1 = Integer.parseInt(charSequence.subSequence(i, char1).toString());
                        i = char1;
                        char1 = int1;
                        break Label_0500;
                    }
                    if (n4 != 0) {
                        char1 = i + 1;
                    }
                    else {
                        char1 = i;
                    }
                    final int n8 = char1 + 1;
                    try {
                        char1 = charSequence.charAt(char1);
                        char1 -= 48;
                        int n9;
                        for (n9 = n5 + i, i = n8; i < n9; ++i) {
                            char1 = (char1 << 3) + (char1 + char1) + charSequence.charAt(i) - 48;
                        }
                        if (n4 != 0) {
                            char1 = -char1;
                            i = n9;
                        }
                        else {
                            i = n9;
                        }
                        auiz.d(this.a, char1);
                        return i;
                    }
                    catch (final StringIndexOutOfBoundsException ex) {
                        return ~i;
                    }
                }
            }
        }
        int char3 = charSequence.charAt(char1);
        if (char3 < 48 || char3 > 57) {
            return ~char1;
        }
        char3 -= 48;
        final char char4 = charSequence.charAt(char1 + 1);
        if (char4 >= '0' && char4 <= '9') {
            final int n10 = (char3 << 3) + (char3 + char3) + char4 - 48;
            final int n11 = this.b - 50;
            int n12;
            if (n11 >= 0) {
                n12 = n11 % 100;
            }
            else {
                n12 = (n11 + 1) % 100 + 99;
            }
            int n13 = n2;
            if (n10 < n12) {
                n13 = 100;
            }
            auiz.d(this.a, n10 + (n11 + n13 - n12));
            return char1 + 2;
        }
        return ~char1;
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, int a, final auft auft, final Locale locale) {
        try {
            final int n2 = a = this.a.a(aufl).a(n);
            if (n2 < 0) {
                a = -n2;
            }
            a %= 100;
        }
        catch (final RuntimeException ex) {
            a = -1;
        }
        if (a < 0) {
            appendable.append('\ufffd');
            appendable.append('\ufffd');
            return;
        }
        aujb.d(appendable, a, 2);
    }
}
