// 
// Decompiled by Procyon v0.6.0
// 

final class cav implements cau
{
    private final btp a;
    private final bug b;
    private final cax c;
    private final ayh d;
    private final int e;
    private long f;
    private int g;
    private long h;
    
    public cav(final btp a, final bug b, final cax c, final String k, final int z) {
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
            final ayg ayg = new ayg();
            ayg.k = k;
            ayg.f = n3;
            ayg.g = n3;
            ayg.l = max;
            ayg.x = c.b;
            ayg.y = c.c;
            ayg.z = z;
            this.d = ayg.a();
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected block size: ");
        sb.append(n);
        sb.append("; got: ");
        sb.append(d);
        throw azb.a(sb.toString(), null);
    }
    
    @Override
    public final void a(final int n, final long n2) {
        this.a.x((bud)new cay(this.c, 1, n, n2));
        this.b.b(this.d);
    }
    
    @Override
    public final void b(final long f) {
        this.f = f;
        this.g = 0;
        this.h = 0L;
    }
    
    @Override
    public final boolean c(final btn btn, long n) {
        while (n > 0L) {
            final int g = this.g;
            final int e = this.e;
            if (g >= e) {
                break;
            }
            final int a = this.b.a((ayc)btn, (int)Math.min(e - g, n), true);
            if (a == -1) {
                n = 0L;
            }
            else {
                this.g += a;
                n -= a;
            }
        }
        final cax c = this.c;
        final int d = c.d;
        final int n2 = this.g / d;
        if (n2 > 0) {
            final long f = this.f;
            final long y = baz.y(this.h, 1000000L, c.c);
            final int n3 = n2 * d;
            final int g2 = this.g - n3;
            this.b.e(f + y, 1, n3, g2, (buf)null);
            this.h += n2;
            this.g = g2;
        }
        return n <= 0L;
    }
}
