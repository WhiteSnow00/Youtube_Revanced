// 
// Decompiled by Procyon v0.6.0
// 

final class bmx extends bnl
{
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;
    
    public bmx(final azm azm, long e, long d) {
        super(azm);
        final int b = azm.b();
        final boolean b2 = false;
        if (b != 1) {
            throw new bmy(0);
        }
        final azl o = azm.o(0, new azl());
        final long max = Math.max(0L, e);
        if (!o.l && max != 0L && !o.h) {
            throw new bmy(1);
        }
        if (d == Long.MIN_VALUE) {
            e = o.n;
        }
        else {
            e = Math.max(0L, d);
        }
        final long n = o.n;
        d = e;
        if (n != -9223372036854775807L) {
            d = e;
            if (e > n) {
                d = n;
            }
            if (max > d) {
                throw new bmy(2);
            }
        }
        this.c = max;
        this.d = d;
        if (d == -9223372036854775807L) {
            e = -9223372036854775807L;
        }
        else {
            e = d - max;
        }
        this.e = e;
        boolean f = b2;
        Label_0239: {
            if (o.i) {
                if (d != -9223372036854775807L) {
                    e = o.n;
                    f = b2;
                    if (e == -9223372036854775807L) {
                        break Label_0239;
                    }
                    f = b2;
                    if (d != e) {
                        break Label_0239;
                    }
                }
                f = true;
            }
        }
        this.f = f;
    }
    
    public final azk d(final int n, final azk azk, final boolean b) {
        this.b.d(0, azk, b);
        final long n2 = azk.e - this.c;
        final long e = this.e;
        long n3;
        if (e == -9223372036854775807L) {
            n3 = -9223372036854775807L;
        }
        else {
            n3 = e - n2;
        }
        azk.g(azk.a, azk.b, n3, n2);
        return azk;
    }
    
    public final azl e(final int n, final azl azl, long m) {
        this.b.e(0, azl, 0L);
        final long q = azl.q;
        m = this.c;
        azl.q = q + m;
        azl.n = this.e;
        azl.i = this.f;
        final long i = azl.m;
        if (i != -9223372036854775807L) {
            final long max = Math.max(i, m);
            azl.m = max;
            final long d = this.d;
            m = max;
            if (d != -9223372036854775807L) {
                m = Math.min(max, d);
            }
            azl.m = m;
            azl.m = m - this.c;
        }
        m = bax.A(this.c);
        final long e = azl.e;
        if (e != -9223372036854775807L) {
            azl.e = e + m;
        }
        final long f = azl.f;
        if (f != -9223372036854775807L) {
            azl.f = f + m;
        }
        return azl;
    }
}
