// 
// Decompiled by Procyon v0.6.0
// 

final class cav implements bua
{
    private final cau a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    
    public cav(final cau a, final int b, long n, final long n2) {
        this.a = a;
        this.b = b;
        this.c = n;
        n = (n2 - n) / a.d;
        this.d = n;
        this.e = this.d(n);
    }
    
    private final long d(final long n) {
        return bax.y(n * this.b, 1000000L, (long)this.a.c);
    }
    
    public final long a() {
        return this.e;
    }
    
    public final bty b(long n) {
        final long r = bax.r(this.a.c * n / (this.b * 1000000L), 0L, this.d - 1L);
        final long c = this.c;
        final long n2 = this.a.d;
        final long d = this.d(r);
        final bub bub = new bub(d, c + n2 * r);
        if (d < n && r != this.d - 1L) {
            final long n3 = r + 1L;
            final long c2 = this.c;
            n = this.a.d;
            return new bty(bub, new bub(this.d(n3), c2 + n * n3));
        }
        return new bty(bub, bub);
    }
    
    public final boolean c() {
        return true;
    }
}
