import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auim implements aujf, aujd
{
    protected final int a;
    protected final int b;
    private final aufp c;
    
    public auim(final aufp c, int n, final int n2) {
        this.c = c;
        this.a = n;
        n = n2;
        if (n2 > 18) {
            n = 18;
        }
        this.b = n;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        final aufn a = this.c.a(auiz.a);
        final int min = Math.min(this.b, charSequence.length() - n);
        long n2 = a.q().e() * 10L;
        int i = 0;
        long n3 = 0L;
        while (i < min) {
            final char char1 = charSequence.charAt(n + i);
            if (char1 < '0') {
                break;
            }
            if (char1 > '9') {
                break;
            }
            n2 /= 10L;
            n3 += (char1 - '0') * n2;
            ++i;
        }
        final long n4 = n3 / 10L;
        if (i == 0) {
            return ~n;
        }
        if (n4 > 2147483647L) {
            return ~n;
        }
        auiz.c().c((aufn)new auhz(aufp.x, auhx.a, a.q()), (int)n4);
        return n + i;
    }
    
    public final void d(final Appendable appendable, long n, final aufl aufl, int b, final auft auft, final Locale locale) {
        final aufn a = this.c.a(aufl);
        int i = this.a;
        try {
            final long f = a.f(n);
            if (f != 0L) {
                final long e = a.q().e();
                b = this.b;
                while (true) {
                    switch (b) {
                        default: {
                            n = 1L;
                            break;
                        }
                        case 18: {
                            n = 1000000000000000000L;
                            break;
                        }
                        case 17: {
                            n = 100000000000000000L;
                            break;
                        }
                        case 16: {
                            n = 10000000000000000L;
                            break;
                        }
                        case 15: {
                            n = 1000000000000000L;
                            break;
                        }
                        case 14: {
                            n = 100000000000000L;
                            break;
                        }
                        case 13: {
                            n = 10000000000000L;
                            break;
                        }
                        case 12: {
                            n = 1000000000000L;
                            break;
                        }
                        case 11: {
                            n = 100000000000L;
                            break;
                        }
                        case 10: {
                            n = 10000000000L;
                            break;
                        }
                        case 9: {
                            n = 1000000000L;
                            break;
                        }
                        case 8: {
                            n = 100000000L;
                            break;
                        }
                        case 7: {
                            n = 10000000L;
                            break;
                        }
                        case 6: {
                            n = 1000000L;
                            break;
                        }
                        case 5: {
                            n = 100000L;
                            break;
                        }
                        case 4: {
                            n = 10000L;
                            break;
                        }
                        case 3: {
                            n = 1000L;
                            break;
                        }
                        case 2: {
                            n = 100L;
                            break;
                        }
                        case 1: {
                            n = 10L;
                            break;
                        }
                    }
                    if (e * n / n == e) {
                        break;
                    }
                    --b;
                }
                n = f * n / e;
                b = b;
                String s;
                if ((0x7FFFFFFFL & n) == n) {
                    s = Integer.toString((int)n);
                }
                else {
                    s = Long.toString(n);
                }
                int j;
                for (j = s.length(); j < b; --b) {
                    appendable.append('0');
                    --i;
                }
                if (i < b) {
                    int n2;
                    int n3;
                    for (n2 = b, b = j; i < n2 && b > 1; --n2, b = n3) {
                        n3 = b - 1;
                        if (s.charAt(n3) != '0') {
                            break;
                        }
                    }
                    if (b < s.length()) {
                        for (i = 0; i < b; ++i) {
                            appendable.append(s.charAt(i));
                        }
                        return;
                    }
                }
                appendable.append(s);
                return;
            }
            while (--i >= 0) {
                appendable.append('0');
            }
        }
        catch (final RuntimeException ex) {
            aump.b(appendable, i);
        }
    }
}
