// 
// Decompiled by Procyon v0.6.0
// 

final class bvx implements bvw
{
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    
    public bvx(final long[] a, final long[] b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final bty b(final long n) {
        int av = bax.av(this.a, n, true);
        final bub bub = new bub(this.a[av], this.b[av]);
        if (bub.b < n) {
            final long[] a = this.a;
            if (av != a.length - 1) {
                ++av;
                return new bty(bub, new bub(a[av], this.b[av]));
            }
        }
        return new bty(bub, bub);
    }
    
    public final boolean c() {
        return true;
    }
    
    @Override
    public final long e() {
        return this.d;
    }
    
    @Override
    public final long f(final long n) {
        return this.a[bax.av(this.b, n, true)];
    }
}
