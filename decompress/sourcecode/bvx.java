// 
// Decompiled by Procyon v0.6.0
// 

final class bvx implements bvv
{
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;
    
    public bvx(long n, final int b, long c, final long d, final long[] f) {
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
    
    public final btx b(long r) {
        if (!this.c()) {
            final bua bua = new bua(0L, this.a + this.b);
            return new btx(bua, bua);
        }
        r = baw.r(r, 0L, this.c);
        final double n = (double)r;
        Double.isNaN(n);
        final double n2 = (double)this.c;
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
        final long d = this.d;
        final double n9 = n4 / 256.0;
        final double n10 = (double)d;
        Double.isNaN(n10);
        final bua bua2 = new bua(r, this.a + baw.r(Math.round(n9 * n10), (long)this.b, this.d - 1L));
        return new btx(bua2, bua2);
    }
    
    public final boolean c() {
        return this.f != null;
    }
    
    public final long e() {
        return this.e;
    }
    
    public final long f(long n) {
        n -= this.a;
        if (this.c() && n > this.b) {
            final long[] array = (long[])dk.e((Object)this.f);
            final double n2 = (double)n;
            Double.isNaN(n2);
            final double n3 = (double)this.d;
            Double.isNaN(n3);
            final double n4 = n2 * 256.0 / n3;
            final int av = baw.av(array, (long)n4, true);
            final long d = this.d(av);
            final long n5 = array[av];
            final int n6 = av + 1;
            final long d2 = this.d(n6);
            if (av == 99) {
                n = 256L;
            }
            else {
                n = array[n6];
            }
            double n7;
            if (n5 == n) {
                n7 = 0.0;
            }
            else {
                final double n8 = (double)n5;
                Double.isNaN(n8);
                final double n9 = (double)(n - n5);
                Double.isNaN(n9);
                n7 = (n4 - n8) / n9;
            }
            final double n10 = (double)(d2 - d);
            Double.isNaN(n10);
            return d + Math.round(n7 * n10);
        }
        return 0L;
    }
}
