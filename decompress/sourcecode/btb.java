// 
// Decompiled by Procyon v0.6.0
// 

public final class btb implements btz, bvv
{
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    
    public btb(long g, final long b, final int e, final int n) {
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
    
    @Override
    public final long a() {
        return this.f;
    }
    
    @Override
    public final btx b(long n) {
        final long d = this.d;
        if (d != -1L) {
            final int e = this.e;
            final long n2 = this.c;
            long min = e * n / 8000000L / n2 * n2;
            if (d != -1L) {
                min = Math.min(min, d - n2);
            }
            final long n3 = this.b + Math.max(min, 0L);
            final long d2 = this.d(n3);
            final bua bua = new bua(d2, n3);
            if (this.d != -1L && d2 < n) {
                n = n3 + this.c;
                if (n < this.a) {
                    return new btx(bua, new bua(this.d(n), n));
                }
            }
            return new btx(bua, bua);
        }
        final bua bua2 = new bua(0L, this.b);
        return new btx(bua2, bua2);
    }
    
    @Override
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
