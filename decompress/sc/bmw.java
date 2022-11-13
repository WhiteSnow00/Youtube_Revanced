// 
// Decompiled by Procyon v0.6.0
// 

public final class bmw implements bnv, bnu
{
    public final bnv a;
    long b;
    long c;
    public bmy d;
    private bnu e;
    private bmv[] f;
    private long g;
    
    public bmw(final bnv a, final boolean b, final long b2, final long c) {
        this.a = a;
        this.f = new bmv[0];
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
    
    public final long a(final long n, final bfv bfv) {
        final long b = this.b;
        if (n != b) {
            final long r = bax.r(bfv.d, 0L, n - b);
            final long e = bfv.e;
            final long c = this.c;
            long n2;
            if (c == Long.MIN_VALUE) {
                n2 = Long.MAX_VALUE;
            }
            else {
                n2 = c - n;
            }
            final long r2 = bax.r(e, 0L, n2);
            if (r == bfv.d) {
                final bfv bfv2 = bfv;
                if (r2 == bfv.e) {
                    return this.a.a(n, bfv2);
                }
            }
            final bfv bfv2 = new bfv(r, r2);
            return this.a.a(n, bfv2);
        }
        return b;
    }
    
    public final /* bridge */ void b(final boy boy) {
        final bnv bnv = (bnv)boy;
        final bnu e = this.e;
        dk.d((Object)e);
        e.b((boy)this);
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
        final bmv[] f = this.f;
        final int length = f.length;
        final boolean b = false;
        for (final bmv bmv : f) {
            if (bmv != null) {
                bmv.b = false;
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
    
    public final long g(final bqw[] array, final boolean[] array2, final bow[] array3, final boolean[] array4, long c) {
        final int length = array3.length;
        this.f = new bmv[length];
        final bow[] array5 = new bow[length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length2 = array3.length;
            bow a = null;
            if (n2 >= length2) {
                break;
            }
            final bmv[] f = this.f;
            final bmv bmv = (bmv)array3[n2];
            if ((f[n2] = bmv) != null) {
                a = bmv.a;
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
                        final bqw bqw = array[n4];
                        if (bqw != null) {
                            final ayg i = bqw.i();
                            if (!ayz.h(i.n, i.k)) {
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
            final bow bow = array5[j];
            if (bow == null) {
                this.f[j] = null;
            }
            else {
                final bmv[] f2 = this.f;
                final bmv bmv2 = f2[j];
                if (bmv2 == null || bmv2.a != bow) {
                    f2[j] = new bmv(this, bow);
                }
            }
            array3[j] = (bow)this.f[j];
        }
        return g;
    }
    
    public final bpe h() {
        return this.a.h();
    }
    
    public final void i(final long n, final boolean b) {
        this.a.i(n, b);
    }
    
    public final void j() {
        final bmy d = this.d;
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
    
    public final void kX(final bnv bnv) {
        if (this.d != null) {
            return;
        }
        final bnu e = this.e;
        dk.d((Object)e);
        e.kX((bnv)this);
    }
    
    public final void l(final bnu e, final long n) {
        this.e = e;
        this.a.l((bnu)this, n);
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
