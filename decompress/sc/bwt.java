// 
// Decompiled by Procyon v0.6.0
// 

final class bwt implements bua
{
    final bwu a;
    
    public bwt(final bwu a) {
        this.a = a;
    }
    
    public final long a() {
        final bwu a = this.a;
        return a.c.e(a.d);
    }
    
    public final bty b(final long n) {
        final bwu a = this.a;
        final long f = a.c.f(n);
        final long a2 = a.a;
        final long b = a.b;
        final bub bub = new bub(n, bax.r(-30000L + (f * (b - a2) / a.d + a2), a2, -1L + b));
        return new bty(bub, bub);
    }
    
    public final boolean c() {
        return true;
    }
}
