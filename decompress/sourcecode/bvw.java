// 
// Decompiled by Procyon v0.6.0
// 

final class bvw implements bvv
{
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    
    public bvw(final long[] a, final long[] b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final btx b(final long n) {
        int av = baw.av(this.a, n, true);
        final bua bua = new bua(this.a[av], this.b[av]);
        if (bua.b < n) {
            final long[] a = this.a;
            if (av != a.length - 1) {
                ++av;
                return new btx(bua, new bua(a[av], this.b[av]));
            }
        }
        return new btx(bua, bua);
    }
    
    public final boolean c() {
        return true;
    }
    
    public final long e() {
        return this.d;
    }
    
    public final long f(final long n) {
        return this.a[baw.av(this.b, n, true)];
    }
}
