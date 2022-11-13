// 
// Decompiled by Procyon v0.6.0
// 

final class boe implements bnv, bnu
{
    public final bnv a;
    private final long b;
    private bnu c;
    
    public boe(final bnv a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final bfv bfv) {
        return this.a.a(n - this.b, bfv) + this.b;
    }
    
    public final /* bridge */ void b(final boy boy) {
        final bnv bnv = (bnv)boy;
        final bnu c = this.c;
        dk.d((Object)c);
        c.b((boy)this);
    }
    
    public final long c() {
        final long c = this.a.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.b;
    }
    
    public final long d() {
        final long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }
    
    public final long e() {
        final long e = this.a.e();
        if (e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return e + this.b;
    }
    
    public final long f(final long n) {
        return this.a.f(n - this.b) + this.b;
    }
    
    public final long g(final bqw[] array, final boolean[] array2, final bow[] array3, final boolean[] array4, long g) {
        final bow[] array5 = new bow[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            bow a = null;
            if (n2 >= length) {
                break;
            }
            final bof bof = (bof)array3[n2];
            if (bof != null) {
                a = bof.a;
            }
            array5[n2] = a;
            ++n2;
        }
        g = this.a.g(array, array2, array5, array4, g - this.b);
        for (int i = n; i < array3.length; ++i) {
            final bow bow = array5[i];
            if (bow == null) {
                array3[i] = null;
            }
            else {
                final bow bow2 = array3[i];
                if (bow2 == null || ((bof)bow2).a != bow) {
                    array3[i] = (bow)new bof(bow, this.b);
                }
            }
        }
        return g + this.b;
    }
    
    public final bpe h() {
        return this.a.h();
    }
    
    public final void i(final long n, final boolean b) {
        this.a.i(n - this.b, b);
    }
    
    public final void j() {
        this.a.j();
    }
    
    public final void kX(final bnv bnv) {
        final bnu c = this.c;
        dk.d((Object)c);
        c.kX((bnv)this);
    }
    
    public final void l(final bnu c, final long n) {
        this.c = c;
        this.a.l((bnu)this, n - this.b);
    }
    
    public final void m(final long n) {
        this.a.m(n - this.b);
    }
    
    public final boolean n(final long n) {
        return this.a.n(n - this.b);
    }
    
    public final boolean o() {
        return this.a.o();
    }
}
