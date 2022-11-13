// 
// Decompiled by Procyon v0.6.0
// 

final class bvy implements bvw
{
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;
    
    public bvy(long n, final int b, long c, final long d, final long[] f) {
        this.a = n;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        c = -1L;
        if (d == -1L) {
            n = c;
        }
        else {
            n += d;
        }
        this.e = n;
    }
    
    private final long d(final int n) {
        return this.c * n / 100L;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final bty b(long r) {
        if (!this.c()) {
            final bub bub = new bub(0L, this.a + this.b);
            return new bty(bub, bub);
        }
        r = bax.r(r, 0L, this.c);
        final double n = (double)r;
        final long c = this.c;
        Double.isNaN(n);
        final double n2 = (double)c;
        Double.isNaN(n2);
        final double n3 = n * 100.0 / n2;
        double n4 = 0.0;
        if (n3 > 0.0) {
            if (n3 >= 100.0) {
                n4 = 256.0;
            }
            else {
                final int n5 = (int)n3;
                final long[] array = (long[])dk.e((Object)this.f);
                final double n6 = (double)array[n5];
                double n7;
                if (n5 == 99) {
                    n7 = 256.0;
                }
                else {
                    n7 = (double)array[n5 + 1];
                }
                final double n8 = n5;
                Double.isNaN(n8);
                Double.isNaN(n6);
                Double.isNaN(n6);
                n4 = n6 + (n3 - n8) * (n7 - n6);
            }
        }
        final double n9 = n4 / 256.0;
        final double n10 = (double)this.d;
        Double.isNaN(n10);
        final bub bub2 = new bub(r, this.a + bax.r(Math.round(n9 * n10), (long)this.b, this.d - 1L));
        return new bty(bub2, bub2);
    }
    
    public final boolean c() {
        return this.f != null;
    }
    
    @Override
    public final long e() {
        return this.e;
    }
    
    @Override
    public final long f(long d) {
        d -= this.a;
        if (this.c() && d > this.b) {
            final long[] array = (long[])dk.e((Object)this.f);
            final double n = (double)d;
            d = this.d;
            Double.isNaN(n);
            final double n2 = (double)d;
            Double.isNaN(n2);
            final double n3 = n * 256.0 / n2;
            final int av = bax.av(array, (long)n3, true);
            final long d2 = this.d(av);
            final long n4 = array[av];
            final int n5 = av + 1;
            final long d3 = this.d(n5);
            if (av == 99) {
                d = 256L;
            }
            else {
                d = array[n5];
            }
            double n6;
            if (n4 == d) {
                n6 = 0.0;
            }
            else {
                final double n7 = (double)n4;
                Double.isNaN(n7);
                final double n8 = (double)(d - n4);
                Double.isNaN(n8);
                n6 = (n3 - n7) / n8;
            }
            final double n9 = (double)(d3 - d2);
            Double.isNaN(n9);
            return d2 + Math.round(n6 * n9);
        }
        return 0L;
    }
}
