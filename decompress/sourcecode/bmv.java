// 
// Decompiled by Procyon v0.6.0
// 

public final class bmv implements bnu, bnt
{
    public final bnu a;
    long b;
    long c;
    public bmx d;
    private bnt e;
    private bmu[] f;
    private long g;
    
    public bmv(final bnu a, final boolean b, final long b2, final long c) {
        this.a = a;
        this.f = new bmu[0];
        long g;
        if (!b) {
            g = -9223372036854775807L;
        }
        else {
            g = b2;
        }
        this.g = g;
        this.b = b2;
        this.c = c;
    }
    
    public final long a(final long n, final bfu bfu) {
        final long b = this.b;
        if (n != b) {
            final long r = baw.r(bfu.d, 0L, n - b);
            final long e = bfu.e;
            final long c = this.c;
            long n2;
            if (c == Long.MIN_VALUE) {
                n2 = Long.MAX_VALUE;
            }
            else {
                n2 = c - n;
            }
            final long r2 = baw.r(e, 0L, n2);
            if (r == bfu.d) {
                final bfu bfu2 = bfu;
                if (r2 == bfu.e) {
                    return this.a.a(n, bfu2);
                }
            }
            final bfu bfu2 = new bfu(r, r2);
            return this.a.a(n, bfu2);
        }
        return b;
    }
    
    public final long c() {
        final long c = this.a.c();
        if (c != Long.MIN_VALUE) {
            final long c2 = this.c;
            if (c2 == Long.MIN_VALUE || c < c2) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final long d() {
        final long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            final long c = this.c;
            if (c == Long.MIN_VALUE || d < c) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final long e() {
        if (this.p()) {
            final long g = this.g;
            this.g = -9223372036854775807L;
            final long e = this.e();
            if (e != -9223372036854775807L) {
                return e;
            }
            return g;
        }
        else {
            final long e2 = this.a.e();
            if (e2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            final long b = this.b;
            final boolean b2 = false;
            dk.h(e2 >= b);
            final long c = this.c;
            boolean b3 = false;
            Label_0112: {
                if (c != Long.MIN_VALUE) {
                    b3 = b2;
                    if (e2 > c) {
                        break Label_0112;
                    }
                }
                b3 = true;
            }
            dk.h(b3);
            return e2;
        }
    }
    
    public final long f(long c) {
        this.g = -9223372036854775807L;
        final bmu[] f = this.f;
        final int length = f.length;
        final boolean b = false;
        for (final bmu bmu : f) {
            if (bmu != null) {
                bmu.b = false;
            }
        }
        final long f2 = this.a.f(c);
        boolean b2 = false;
        Label_0112: {
            if (f2 != c) {
                b2 = b;
                if (f2 < this.b) {
                    break Label_0112;
                }
                c = this.c;
                if (c != Long.MIN_VALUE) {
                    b2 = b;
                    if (f2 > c) {
                        break Label_0112;
                    }
                }
            }
            b2 = true;
        }
        dk.h(b2);
        return f2;
    }
    
    public final long g(final bqv[] array, final boolean[] array2, final bov[] array3, final boolean[] array4, long c) {
        final int length = array3.length;
        this.f = new bmu[length];
        final bov[] array5 = new bov[length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length2 = array3.length;
            bov a = null;
            if (n2 >= length2) {
                break;
            }
            final bmu[] f = this.f;
            final bmu bmu = (bmu)array3[n2];
            if ((f[n2] = bmu) != null) {
                a = bmu.a;
            }
            array5[n2] = a;
            ++n2;
        }
        final long g = this.a.g(array, array2, array5, array4, c);
        final boolean p5 = this.p();
        long g2;
        final long n3 = g2 = -9223372036854775807L;
        if (p5) {
            final long b = this.b;
            g2 = n3;
            if (c == b) {
                g2 = n3;
                if (b != 0L) {
                    final int length3 = array.length;
                    int n4 = 0;
                    while (true) {
                        g2 = n3;
                        if (n4 >= length3) {
                            break;
                        }
                        final bqv bqv = array[n4];
                        if (bqv != null) {
                            final ayf i = bqv.i();
                            if (!ayy.h(i.n, i.k)) {
                                g2 = g;
                                break;
                            }
                        }
                        ++n4;
                    }
                }
            }
        }
        this.g = g2;
        boolean b3;
        final boolean b2 = b3 = true;
        Label_0284: {
            if (g != c) {
                if (g >= this.b) {
                    c = this.c;
                    b3 = b2;
                    if (c == Long.MIN_VALUE) {
                        break Label_0284;
                    }
                    if (g <= c) {
                        b3 = b2;
                        break Label_0284;
                    }
                }
                b3 = false;
            }
        }
        dk.h(b3);
        for (int j = n; j < array3.length; ++j) {
            final bov bov = array5[j];
            if (bov == null) {
                this.f[j] = null;
            }
            else {
                final bmu[] f2 = this.f;
                final bmu bmu2 = f2[j];
                if (bmu2 == null || bmu2.a != bov) {
                    f2[j] = new bmu(this, bov);
                }
            }
            array3[j] = (bov)this.f[j];
        }
        return g;
    }
    
    public final bpd h() {
        return this.a.h();
    }
    
    public final void i(final long n, final boolean b) {
        this.a.i(n, b);
    }
    
    public final void j() {
        final bmx d = this.d;
        if (d == null) {
            this.a.j();
            return;
        }
        throw d;
    }
    
    public final void k(final long b, final long c) {
        this.b = b;
        this.c = c;
    }
    
    public final void kX(final bnu bnu) {
        if (this.d != null) {
            return;
        }
        final bnt e = this.e;
        dk.d((Object)e);
        e.kX((bnu)this);
    }
    
    public final void l(final bnt e, final long n) {
        this.e = e;
        this.a.l((bnt)this, n);
    }
    
    public final void m(final long n) {
        this.a.m(n);
    }
    
    public final boolean n(final long n) {
        return this.a.n(n);
    }
    
    public final boolean o() {
        return this.a.o();
    }
    
    final boolean p() {
        return this.g != -9223372036854775807L;
    }
}
