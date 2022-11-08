import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bno implements bnu, bnt
{
    public final long a;
    public bnx b;
    public bnu c;
    public long d;
    public final ayx e;
    private bnt f;
    private final bre g;
    
    public bno(final ayx e, final bre g, final long a) {
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
    
    public final long a(final long n, final bfu bfu) {
        final bnu c = this.c;
        final int a = baw.a;
        return c.a(n, bfu);
    }
    
    public final long c() {
        final bnu c = this.c;
        final int a = baw.a;
        return c.c();
    }
    
    public final long d() {
        final bnu c = this.c;
        final int a = baw.a;
        return c.d();
    }
    
    public final long e() {
        final bnu c = this.c;
        final int a = baw.a;
        return c.e();
    }
    
    public final long f(final long n) {
        final bnu c = this.c;
        final int a = baw.a;
        return c.f(n);
    }
    
    public final long g(final bqv[] array, final boolean[] array2, final bov[] array3, final boolean[] array4, long n) {
        final long d = this.d;
        if (d != -9223372036854775807L && n == this.a) {
            this.d = -9223372036854775807L;
            n = d;
        }
        final bnu c = this.c;
        final int a = baw.a;
        return c.g(array, array2, array3, array4, n);
    }
    
    public final bpd h() {
        final bnu c = this.c;
        final int a = baw.a;
        return c.h();
    }
    
    public final void i(final long n, final boolean b) {
        final bnu c = this.c;
        final int a = baw.a;
        c.i(n, b);
    }
    
    public final void j() {
        try {
            final bnu c = this.c;
            if (c != null) {
                c.j();
                return;
            }
            final bnx b = this.b;
            if (b != null) {
                b.sK();
            }
        }
        catch (final IOException ex) {
            throw ex;
        }
    }
    
    public final void k(final ayx ayx) {
        final long p = this.p(this.a);
        final bnx b = this.b;
        dk.d((Object)b);
        final bnu so = b.sO(ayx, this.g, p);
        this.c = so;
        if (this.f != null) {
            so.l((bnt)this, p);
        }
    }
    
    public final void kX(final bnu bnu) {
        final bnt f = this.f;
        final int a = baw.a;
        f.kX((bnu)this);
    }
    
    public final void l(final bnt f, final long n) {
        this.f = f;
        final bnu c = this.c;
        if (c != null) {
            c.l((bnt)this, this.p(this.a));
        }
    }
    
    public final void m(final long n) {
        final bnu c = this.c;
        final int a = baw.a;
        c.m(n);
    }
    
    public final boolean n(final long n) {
        final bnu c = this.c;
        return c != null && c.n(n);
    }
    
    public final boolean o() {
        final bnu c = this.c;
        return c != null && c.o();
    }
}
