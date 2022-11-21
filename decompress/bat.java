import java.nio.charset.Charset;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bat
{
    public byte[] a;
    public int b;
    public int c;
    
    public bat() {
        this.a = baz.e;
    }
    
    public bat(final int c) {
        this.a = new byte[c];
        this.c = c;
    }
    
    public bat(final byte[] a) {
        this.a = a;
        this.c = a.length;
    }
    
    public bat(final byte[] a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    public final void A(final int n) {
        if (n > this.b()) {
            this.a = Arrays.copyOf(this.a, n);
        }
    }
    
    public final void B(final byte[] array, final int n, final int n2) {
        System.arraycopy(this.a, this.b, array, n, n2);
        this.b += n2;
    }
    
    public final void C(final int n) {
        byte[] a;
        if (this.b() < n) {
            a = new byte[n];
        }
        else {
            a = this.a;
        }
        this.E(a, n);
    }
    
    public final void D(final byte[] array) {
        this.E(array, array.length);
    }
    
    public final void E(final byte[] a, final int c) {
        this.a = a;
        this.c = c;
        this.b = 0;
    }
    
    public final void F(final int c) {
        boolean b = false;
        if (c >= 0) {
            b = b;
            if (c <= this.a.length) {
                b = true;
            }
        }
        bad.d(b);
        this.c = c;
    }
    
    public final void G(final int b) {
        boolean b2 = false;
        if (b >= 0) {
            b2 = b2;
            if (b <= this.c) {
                b2 = true;
            }
        }
        bad.d(b2);
        this.b = b;
    }
    
    public final void H(final int n) {
        this.G(this.b + n);
    }
    
    public final void I(final atlj atlj, final int n) {
        this.B((byte[])atlj.d, 0, n);
        atlj.m(0);
    }
    
    public final int a() {
        return this.c - this.b;
    }
    
    public final int b() {
        return this.a.length;
    }
    
    public final int c() {
        return this.a[this.b] & 0xFF;
    }
    
    public final int d() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        this.b = n3 + 1;
        return (a[n3] & 0xFF) | ((b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8);
    }
    
    public final int e() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        this.b = n3 + 1;
        return (a[n3] & 0xFF) << 24 | ((b2 & 0xFF) | (b3 & 0xFF) << 8 | (b4 & 0xFF) << 16);
    }
    
    public final int f() {
        final int e = this.e();
        if (e >= 0) {
            return e;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
    
    public final int g() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (a[n] & 0xFF) << 8 | (b2 & 0xFF);
    }
    
    public final int h() {
        return this.i() << 21 | this.i() << 14 | this.i() << 7 | this.i();
    }
    
    public final int i() {
        return this.a[this.b++] & 0xFF;
    }
    
    public final int j() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final byte b3 = a[n];
        this.b = n + 1 + 2;
        return (b3 & 0xFF) | (b2 & 0xFF) << 8;
    }
    
    public final int k() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        this.b = n2 + 1;
        return (a[n2] & 0xFF) | ((b2 & 0xFF) << 16 | (b3 & 0xFF) << 8);
    }
    
    public final int l() {
        final int d = this.d();
        if (d >= 0) {
            return d;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }
    
    public final int m() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (a[n] & 0xFF) | (b2 & 0xFF) << 8;
    }
    
    public final long n() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        this.b = n13 + 1;
        return ((long)a[n13] & 0xFFL) << 56 | ((n14 & 0xFFL) << 48 | ((n2 & 0xFFL) | (n4 & 0xFFL) << 8 | (n6 & 0xFFL) << 16 | (n8 & 0xFFL) << 24 | (n10 & 0xFFL) << 32 | (n12 & 0xFFL) << 40));
    }
    
    public final long o() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        this.b = n5 + 1;
        return ((long)a[n5] & 0xFFL) << 24 | ((n2 & 0xFFL) | (n4 & 0xFFL) << 8 | (n6 & 0xFFL) << 16);
    }
    
    public final long p() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        this.b = n13 + 1;
        return ((long)a[n13] & 0xFFL) | ((n2 & 0xFFL) << 56 | (n4 & 0xFFL) << 48 | (n6 & 0xFFL) << 40 | (n8 & 0xFFL) << 32 | (n10 & 0xFFL) << 24 | (n12 & 0xFFL) << 16 | (n14 & 0xFFL) << 8);
    }
    
    public final long q() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        this.b = n5 + 1;
        return ((long)a[n5] & 0xFFL) | ((n2 & 0xFFL) << 24 | (n4 & 0xFFL) << 16 | (n6 & 0xFFL) << 8);
    }
    
    public final long r() {
        final long p = this.p();
        if (p >= 0L) {
            return p;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(p);
        throw new IllegalStateException(sb.toString());
    }
    
    public final long s() {
        final long n = this.a[this.b];
        int n2 = 7;
        int n4;
        long n5;
        int n6;
        while (true) {
            final int n3 = 0;
            n4 = 1;
            n5 = n;
            n6 = n3;
            if (n2 < 0) {
                break;
            }
            final int n7 = 1 << n2;
            if (((long)n7 & n) == 0x0L) {
                if (n2 < 6) {
                    n5 = (n & (long)(n7 - 1));
                    n6 = 7 - n2;
                    break;
                }
                n5 = n;
                n6 = n3;
                if (n2 == 7) {
                    n6 = 1;
                    n5 = n;
                    break;
                }
                break;
            }
            else {
                --n2;
            }
        }
        if (n6 != 0) {
            for (int i = n4; i < n6; ++i) {
                final byte b = this.a[this.b + i];
                if ((b & 0xC0) != 0x80) {
                    final StringBuilder sb = new StringBuilder("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(n5);
                    throw new NumberFormatException(sb.toString());
                }
                n5 = (n5 << 6 | (long)(b & 0x3F));
            }
            this.b += n6;
            return n5;
        }
        final StringBuilder sb2 = new StringBuilder("Invalid UTF-8 sequence first byte: ");
        sb2.append(n5);
        throw new NumberFormatException(sb2.toString());
    }
    
    public final String t() {
        if (this.a() == 0) {
            return null;
        }
        int b;
        for (b = this.b; b < this.c && !baz.af(this.a[b]); ++b) {}
        int b2;
        final int n = b2 = this.b;
        if (b - n >= 3) {
            final byte[] a = this.a;
            b2 = n;
            if (a[n] == -17) {
                b2 = n;
                if (a[n + 1] == -69) {
                    b2 = n;
                    if (a[n + 2] == -65) {
                        b2 = n + 3;
                        this.b = b2;
                    }
                }
            }
        }
        final String o = baz.O(this.a, b2, b - b2);
        this.b = b;
        final int c = this.c;
        if (b == c) {
            return o;
        }
        final byte[] a2 = this.a;
        int b3 = b;
        if (a2[b] == 13) {
            b3 = b + 1;
            if ((this.b = b3) == c) {
                return o;
            }
        }
        if (a2[b3] == 10) {
            this.b = b3 + 1;
        }
        return o;
    }
    
    public final String u() {
        String o;
        if (this.a() == 0) {
            o = null;
        }
        else {
            int b;
            for (b = this.b; b < this.c && this.a[b] != 0; ++b) {}
            final byte[] a = this.a;
            final int b2 = this.b;
            o = baz.O(a, b2, b - b2);
            if ((this.b = b) < this.c) {
                this.b = b + 1;
                return o;
            }
        }
        return o;
    }
    
    public final String v(final int n) {
        if (n == 0) {
            return "";
        }
        final int b = this.b;
        final int n2 = b + n - 1;
        int n3;
        if (n2 < this.c && this.a[n2] == 0) {
            n3 = n - 1;
        }
        else {
            n3 = n;
        }
        final String o = baz.O(this.a, b, n3);
        this.b += n;
        return o;
    }
    
    public final String w(final int n) {
        return this.x(n, afas.c);
    }
    
    public final String x(final int n, final Charset charset) {
        final byte[] a = this.a;
        final int b = this.b;
        final String s = new String(a, b, n, charset);
        this.b = b + n;
        return s;
    }
    
    public final short y() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (short)((a[n] & 0xFF) << 8 | (b2 & 0xFF));
    }
    
    public final short z() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (short)((a[n] & 0xFF) | (b2 & 0xFF) << 8);
    }
}
