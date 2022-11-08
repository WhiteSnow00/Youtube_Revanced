// 
// Decompiled by Procyon v0.6.0
// 

final class cau implements btz
{
    private final cat a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    
    public cau(final cat a, final int b, long n, final long n2) {
        this.a = a;
        this.b = b;
        this.c = n;
        n = (n2 - n) / a.d;
        this.d = n;
        this.e = this.d(n);
    }
    
    private final long d(final long n) {
        return baw.y(n * this.b, 1000000L, this.a.c);
    }
    
    public final long a() {
        return this.e;
    }
    
    public final btx b(long n) {
        final long r = baw.r(this.a.c * n / (this.b * 1000000L), 0L, this.d - 1L);
        final long c = this.c;
        final int d = this.a.d;
        final long d2 = this.d(r);
        final bua bua = new bua(d2, c + d * r);
        if (d2 < n && r != this.d - 1L) {
            n = r + 1L;
            return new btx(bua, new bua(this.d(n), this.c + n * this.a.d));
        }
        return new btx(bua, bua);
    }
    
    public final boolean c() {
        return true;
    }
}
