import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhv implements auio, auim
{
    protected final int a;
    protected final int b;
    private final auey c;
    
    public auhv(final auey c, final int a, final int n) {
        this.c = c;
        int b = n;
        if (n > 18) {
            b = 18;
        }
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        final auew a = this.c.a(auii.a);
        int min;
        long n2;
        long n3;
        int i;
        char char1;
        for (min = Math.min(this.b, charSequence.length() - n), n2 = a.q().e() * 10L, n3 = 0L, i = 0; i < min; ++i, n2 /= 10L, n3 += (char1 - '0') * n2) {
            char1 = charSequence.charAt(n + i);
            if (char1 < '0') {
                break;
            }
            if (char1 > '9') {
                break;
            }
        }
        final long n4 = n3 / 10L;
        if (i == 0) {
            return ~n;
        }
        if (n4 > 2147483647L) {
            return ~n;
        }
        auii.c().c((auew)new auhi(auey.x, auhg.a, a.q()), (int)n4);
        return n + i;
    }
    
    public final void d(final Appendable appendable, long n, final aueu aueu, int b, final aufc aufc, final Locale locale) {
        final auew a = this.c.a(aueu);
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
            auma.b(appendable, i);
        }
    }
}
