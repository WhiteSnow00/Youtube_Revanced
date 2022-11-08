import java.util.Arrays;
import j$.util.Objects;
import java.math.RoundingMode;

// 
// Decompiled by Procyon v0.6.0
// 

public class afmx extends afmy
{
    private volatile afmy a;
    public final afmt b;
    public final Character c;
    
    public afmx(final afmt b, final Character c) {
        this.b = b;
        boolean b3;
        final boolean b2 = b3 = true;
        if (c != null) {
            final char charValue = c;
            final byte[] g = b.g;
            b3 = b2;
            if (charValue < g.length) {
                b3 = b2;
                if (g[charValue] != -1) {
                    b3 = false;
                }
            }
        }
        agot.z(b3, "Padding character %s was already in alphabet", (Object)c);
        this.c = c;
    }
    
    public afmx(final String s, final String s2, final Character c) {
        this(new afmt(s, s2.toCharArray()), c);
    }
    
    public int a(final byte[] array, CharSequence g) {
        array.getClass();
        g = this.g(g);
        if (this.b.c(g.length())) {
            int i = 0;
            int n = 0;
            while (i < g.length()) {
                long n2 = 0L;
                int n3 = 0;
                int n4 = 0;
                afmt b;
                while (true) {
                    b = this.b;
                    if (n3 >= b.e) {
                        break;
                    }
                    final long n5 = n2 <<= b.d;
                    int n6 = n4;
                    if (i + n3 < g.length()) {
                        n2 = (n5 | (long)this.b.b(g.charAt(n4 + i)));
                        n6 = n4 + 1;
                    }
                    ++n3;
                    n4 = n6;
                }
                for (int f = b.f, d = b.d, j = (f - 1) * 8; j >= f * 8 - n4 * d; j -= 8, ++n) {
                    array[n] = (byte)(n2 >>> j & 0xFFL);
                }
                i += this.b.e;
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder("Invalid input length ");
        sb.append(g.length());
        throw new afmw(sb.toString());
    }
    
    public afmy b(final afmt afmt, final Character c) {
        return new afmx(afmt, c);
    }
    
    public void c(final Appendable appendable, final byte[] array, final int n) {
        final int length = array.length;
        int i = 0;
        agot.C(0, n, length);
        while (i < n) {
            this.h(appendable, array, i, Math.min(this.b.f, n - i));
            i += this.b.f;
        }
    }
    
    public final int d(final int n) {
        return (int)((this.b.d * (long)n + 7L) / 8L);
    }
    
    public final int e(final int n) {
        final afmt b = this.b;
        return b.e * aesy.U(n, b.f, RoundingMode.CEILING);
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof afmx) {
            final afmx afmx = (afmx)o;
            if (this.b.equals((Object)afmx.b) && Objects.equals((Object)this.c, (Object)afmx.c)) {
                return true;
            }
        }
        return false;
    }
    
    public final afmy f() {
        afmy a;
        if ((a = this.a) == null) {
            final afmt b = this.b;
            final char[] b2 = b.b;
            final int length = b2.length;
            int n = 0;
            afmt afmt = null;
        Label_0357:
            while (true) {
                afmt = b;
                if (n >= length) {
                    break;
                }
                if (aeda.A(b2[n])) {
                    final char[] b3 = b.b;
                    final int length2 = b3.length;
                    int i = 0;
                    while (true) {
                        while (i < length2) {
                            if (aeda.z(b3[i])) {
                                final int n2 = 1;
                                agot.E((boolean)((n2 ^ 0x1) != 0x0), (Object)"Cannot call lowerCase() on a mixed-case alphabet");
                                final char[] array = new char[b.b.length];
                                int n3 = 0;
                                while (true) {
                                    final char[] b4 = b.b;
                                    if (n3 >= b4.length) {
                                        break;
                                    }
                                    int n4;
                                    final char c = (char)(n4 = b4[n3]);
                                    if (aeda.A(c)) {
                                        n4 = (c ^ ' ');
                                    }
                                    array[n3] = (char)n4;
                                    ++n3;
                                }
                                afmt = new afmt(b.a.concat(".lowerCase()"), array);
                                if (b.h && !afmt.h) {
                                    final byte[] g = afmt.g;
                                    final byte[] copy = Arrays.copyOf(g, g.length);
                                    for (int j = 65; j <= 90; ++j) {
                                        final int n5 = j | 0x20;
                                        final byte[] g2 = afmt.g;
                                        final byte b5 = g2[j];
                                        final byte b6 = g2[n5];
                                        if (b5 == -1) {
                                            copy[j] = b6;
                                        }
                                        else {
                                            final char c2 = (char)j;
                                            final char c3 = (char)n5;
                                            if (b6 != -1) {
                                                throw new IllegalStateException(agnj.G("Can't ignoreCase() since '%s' and '%s' encode different values", new Object[] { c2, c3 }));
                                            }
                                            copy[n5] = b5;
                                        }
                                    }
                                    afmt = new afmt(afmt.a.concat(".ignoreCase()"), afmt.b, copy, true);
                                    break Label_0357;
                                }
                                break Label_0357;
                            }
                            else {
                                ++i;
                            }
                        }
                        final int n2 = 0;
                        continue;
                    }
                }
                ++n;
            }
            if (afmt == this.b) {
                a = this;
            }
            else {
                a = this.b(afmt, this.c);
            }
            this.a = a;
        }
        return a;
    }
    
    public final CharSequence g(final CharSequence charSequence) {
        charSequence.getClass();
        final Character c = this.c;
        if (c == null) {
            return charSequence;
        }
        final char charValue = c;
        int length = charSequence.length();
        int n;
        do {
            n = length - 1;
            if (n < 0) {
                break;
            }
            length = n;
        } while (charSequence.charAt(n) == charValue);
        return charSequence.subSequence(0, n + 1);
    }
    
    final void h(final Appendable appendable, final byte[] array, int i, final int n) {
        agot.C(i, i + n, array.length);
        final int f = this.b.f;
        final int n2 = 0;
        agot.u(n <= f);
        long n3 = 0L;
        for (int j = 0; j < n; ++j) {
            n3 = (n3 | (long)(array[i + j] & 0xFF)) << 8;
        }
        final int d = this.b.d;
        afmt b;
        for (i = n2; i < n * 8; i += this.b.d) {
            b = this.b;
            appendable.append(b.a((int)(n3 >>> (n + 1) * 8 - d - i) & b.c));
        }
        if (this.c != null) {
            while (i < this.b.f * 8) {
                appendable.append(this.c);
                i += this.b.d;
            }
        }
    }
    
    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode((Object)this.c);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            }
            else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }
}
