// 
// Decompiled by Procyon v0.6.0
// 

public final class bdz
{
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public long r;
    private long s;
    
    public bdz(final long e, final long f) {
        this.a = 0.97f;
        this.b = 1.03f;
        this.c = 1000L;
        this.d = 1.0E-7f;
        this.e = e;
        this.f = f;
        this.g = 0.999f;
        this.h = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.n = 0.97f;
        this.m = 1.03f;
        this.o = 1.0f;
        this.p = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
    }
    
    public static long c(final long n, final long n2) {
        return (long)(n * 0.999f + n2 * 9.999871E-4f);
    }
    
    public final void a() {
        long h = this.h;
        long n2;
        if (h != -9223372036854775807L) {
            final long s = this.s;
            if (s != -9223372036854775807L) {
                h = s;
            }
            final long j = this.j;
            long n = h;
            if (j != -9223372036854775807L) {
                n = h;
                if (h < j) {
                    n = j;
                }
            }
            final long k = this.k;
            n2 = n;
            if (k != -9223372036854775807L) {
                n2 = n;
                if (n > k) {
                    n2 = k;
                }
            }
        }
        else {
            n2 = -9223372036854775807L;
        }
        if (this.i == n2) {
            return;
        }
        this.i = n2;
        this.l = n2;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }
    
    public final void b(final long s) {
        this.s = s;
        this.a();
    }
}
