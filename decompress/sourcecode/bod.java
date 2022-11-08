// 
// Decompiled by Procyon v0.6.0
// 

final class bod implements bnu, bnt
{
    public final bnu a;
    private final long b;
    private bnt c;
    
    public bod(final bnu a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final bfu bfu) {
        return this.a.a(n - this.b, bfu) + this.b;
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
    
    public final long g(final bqv[] array, final boolean[] array2, final bov[] array3, final boolean[] array4, long g) {
        final bov[] array5 = new bov[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            bov a = null;
            if (n2 >= length) {
                break;
            }
            final boe boe = (boe)array3[n2];
            if (boe != null) {
                a = boe.a;
            }
            array5[n2] = a;
            ++n2;
        }
        g = this.a.g(array, array2, array5, array4, g - this.b);
        for (int i = n; i < array3.length; ++i) {
            final bov bov = array5[i];
            if (bov == null) {
                array3[i] = null;
            }
            else {
                final bov bov2 = array3[i];
                if (bov2 == null || ((boe)bov2).a != bov) {
                    array3[i] = (bov)new boe(bov, this.b);
                }
            }
        }
        return g + this.b;
    }
    
    public final bpd h() {
        return this.a.h();
    }
    
    public final void i(final long n, final boolean b) {
        this.a.i(n - this.b, b);
    }
    
    public final void j() {
        this.a.j();
    }
    
    public final void kX(final bnu bnu) {
        final bnt c = this.c;
        dk.d((Object)c);
        c.kX((bnu)this);
    }
    
    public final void l(final bnt c, final long n) {
        this.c = c;
        this.a.l((bnt)this, n - this.b);
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
