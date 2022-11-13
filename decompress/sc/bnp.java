import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnp implements bnv, bnu
{
    public final long a;
    public bny b;
    public bnv c;
    public long d;
    public final ayy e;
    private bnu f;
    private final brf g;
    
    public bnp(final ayy e, final brf g, final long a) {
        this.e = e;
        this.g = g;
        this.a = a;
        this.d = -9223372036854775807L;
    }
    
    private final long p(final long n) {
        final long d = this.d;
        if (d != -9223372036854775807L) {
            return d;
        }
        return n;
    }
    
    public final long a(final long n, final bfv bfv) {
        final bnv c = this.c;
        final int a = bax.a;
        return c.a(n, bfv);
    }
    
    public final /* bridge */ void b(final boy boy) {
        final bnv bnv = (bnv)boy;
        final bnu f = this.f;
        final int a = bax.a;
        f.b((boy)this);
    }
    
    public final long c() {
        final bnv c = this.c;
        final int a = bax.a;
        return c.c();
    }
    
    public final long d() {
        final bnv c = this.c;
        final int a = bax.a;
        return c.d();
    }
    
    public final long e() {
        final bnv c = this.c;
        final int a = bax.a;
        return c.e();
    }
    
    public final long f(final long n) {
        final bnv c = this.c;
        final int a = bax.a;
        return c.f(n);
    }
    
    public final long g(final bqw[] array, final boolean[] array2, final bow[] array3, final boolean[] array4, long n) {
        final long d = this.d;
        if (d != -9223372036854775807L && n == this.a) {
            this.d = -9223372036854775807L;
            n = d;
        }
        final bnv c = this.c;
        final int a = bax.a;
        return c.g(array, array2, array3, array4, n);
    }
    
    public final bpe h() {
        final bnv c = this.c;
        final int a = bax.a;
        return c.h();
    }
    
    public final void i(final long n, final boolean b) {
        final bnv c = this.c;
        final int a = bax.a;
        c.i(n, b);
    }
    
    public final void j() {
        try {
            final bnv c = this.c;
            if (c != null) {
                c.j();
                return;
            }
            final bny b = this.b;
            if (b != null) {
                b.sQ();
            }
        }
        catch (final IOException ex) {
            throw ex;
        }
    }
    
    public final void k(final ayy ayy) {
        final long p = this.p(this.a);
        final bny b = this.b;
        dk.d((Object)b);
        final bnv su = b.sU(ayy, this.g, p);
        this.c = su;
        if (this.f != null) {
            su.l((bnu)this, p);
        }
    }
    
    public final void kX(final bnv bnv) {
        final bnu f = this.f;
        final int a = bax.a;
        f.kX((bnv)this);
    }
    
    public final void l(final bnu f, final long n) {
        this.f = f;
        final bnv c = this.c;
        if (c != null) {
            c.l((bnu)this, this.p(this.a));
        }
    }
    
    public final void m(final long n) {
        final bnv c = this.c;
        final int a = bax.a;
        c.m(n);
    }
    
    public final boolean n(final long n) {
        final bnv c = this.c;
        return c != null && c.n(n);
    }
    
    public final boolean o() {
        final bnv c = this.c;
        return c != null && c.o();
    }
}
