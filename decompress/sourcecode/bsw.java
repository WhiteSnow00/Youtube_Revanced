// 
// Decompiled by Procyon v0.6.0
// 

public final class bsw
{
    public final long a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    private final long h;
    
    public bsw(final long a, final long b, final long d, final long e, final long f, final long h) {
        this.a = a;
        this.b = b;
        this.c = 0L;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = a(b, 0L, d, e, f, h);
    }
    
    protected static long a(long n, final long n2, final long n3, final long n4, final long n5, final long n6) {
        if (n4 + 1L < n5 && 1L + n2 < n3) {
            n = (long)((n - n2) * ((n5 - n4) / (float)(n3 - n2)));
            return baw.r(n4 + n - n6 - n / 20L, n4, -1L + n5);
        }
        return n4;
    }
    
    public final void b() {
        this.g = a(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
