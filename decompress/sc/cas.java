// 
// Decompiled by Procyon v0.6.0
// 

final class cas implements car
{
    private final btm a;
    private final bud b;
    private final cau c;
    private final ayg d;
    private final int e;
    private long f;
    private int g;
    private long h;
    
    public cas(final btm a, final bud b, final cau c, final String k, final int z) {
        this.a = a;
        this.b = b;
        this.c = c;
        final int b2 = c.b;
        final int e = c.e;
        final int d = c.d;
        final int n = b2 * e / 8;
        if (d == n) {
            final int n2 = c.c * n;
            final int n3 = n2 * 8;
            final int max = Math.max(n, n2 / 10);
            this.e = max;
            final ayf ayf = new ayf();
            ayf.k = k;
            ayf.f = n3;
            ayf.g = n3;
            ayf.l = max;
            ayf.x = c.b;
            ayf.y = c.c;
            ayf.z = z;
            this.d = ayf.a();
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected block size: ");
        sb.append(n);
        sb.append("; got: ");
        sb.append(d);
        throw aza.a(sb.toString(), (Throwable)null);
    }
    
    public final void a(final int n, final long n2) {
        this.a.x((bua)new cav(this.c, 1, n, n2));
        this.b.b(this.d);
    }
    
    public final void b(final long f) {
        this.f = f;
        this.g = 0;
        this.h = 0L;
    }
    
    public final boolean c(final btk btk, long n) {
        while (n > 0L) {
            final int g = this.g;
            final int e = this.e;
            if (g >= e) {
                break;
            }
            final int a = this.b.a((ayb)btk, (int)Math.min(e - g, n), true);
            if (a == -1) {
                n = 0L;
            }
            else {
                this.g += a;
                n -= a;
            }
        }
        final cau c = this.c;
        final int d = c.d;
        final int n2 = this.g / d;
        if (n2 > 0) {
            final long f = this.f;
            final long y = bax.y(this.h, 1000000L, (long)c.c);
            final int n3 = n2 * d;
            final int g2 = this.g - n3;
            this.b.e(f + y, 1, n3, g2, (buc)null);
            this.h += n2;
            this.g = g2;
        }
        return n <= 0L;
    }
}
