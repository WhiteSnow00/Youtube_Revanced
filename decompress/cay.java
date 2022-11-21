// 
// Decompiled by Procyon v0.6.0
// 

final class cay implements bud
{
    private final cax a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    
    public cay(final cax a, final int b, long n, final long n2) {
        this.a = a;
        this.b = b;
        this.c = n;
        n = (n2 - n) / a.d;
        this.d = n;
        this.e = this.d(n);
    }
    
    private final long d(final long n) {
        return baz.y(n * this.b, 1000000L, this.a.c);
    }
    
    public final long a() {
        return this.e;
    }
    
    public final bub b(long n) {
        final long r = baz.r(this.a.c * n / (this.b * 1000000L), 0L, this.d - 1L);
        final long c = this.c;
        final long n2 = this.a.d;
        final long d = this.d(r);
        final bue bue = new bue(d, c + n2 * r);
        if (d < n && r != this.d - 1L) {
            n = r + 1L;
            return new bub(bue, new bue(this.d(n), this.c + this.a.d * n));
        }
        return new bub(bue, bue);
    }
    
    public final boolean c() {
        return true;
    }
}
