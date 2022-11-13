// 
// Decompiled by Procyon v0.6.0
// 

public final class btc implements bua, bvw
{
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    
    public btc(long g, final long b, final int e, final int n) {
        this.a = g;
        this.b = b;
        int c = n;
        if (n == -1) {
            c = 1;
        }
        this.c = c;
        this.e = e;
        if (g == -1L) {
            this.d = -1L;
            g = -9223372036854775807L;
        }
        else {
            this.d = g - b;
            g = g(g, b, e);
        }
        this.f = g;
    }
    
    private static long g(final long n, final long n2, final int n3) {
        return Math.max(0L, n - n2) * 8000000L / n3;
    }
    
    public final long a() {
        return this.f;
    }
    
    public final bty b(long n) {
        final long d = this.d;
        if (d != -1L) {
            final long n2 = this.e;
            final long n3 = this.c;
            long min = n2 * n / 8000000L / n3 * n3;
            if (d != -1L) {
                min = Math.min(min, d - n3);
            }
            final long n4 = this.b + Math.max(min, 0L);
            final long d2 = this.d(n4);
            final bub bub = new bub(d2, n4);
            if (this.d != -1L && d2 < n) {
                n = n4 + this.c;
                if (n < this.a) {
                    return new bty(bub, new bub(this.d(n), n));
                }
            }
            return new bty(bub, bub);
        }
        final bub bub2 = new bub(0L, this.b);
        return new bty(bub2, bub2);
    }
    
    public final boolean c() {
        return this.d != -1L;
    }
    
    public final long d(final long n) {
        return g(n, this.b, this.e);
    }
    
    public final long e() {
        return -1L;
    }
    
    public final long f(final long n) {
        return this.d(n);
    }
}
