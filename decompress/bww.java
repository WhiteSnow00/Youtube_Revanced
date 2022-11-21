// 
// Decompiled by Procyon v0.6.0
// 

final class bww implements bud
{
    final bwx a;
    
    public bww(final bwx a) {
        this.a = a;
    }
    
    public final long a() {
        final bwx a = this.a;
        return a.c.e(a.d);
    }
    
    public final bub b(final long n) {
        final bwx a = this.a;
        final long f = a.c.f(n);
        final long a2 = a.a;
        final long b = a.b;
        final bue bue = new bue(n, baz.r(-30000L + (f * (b - a2) / a.d + a2), a2, -1L + b));
        return new bub(bue, bue);
    }
    
    public final boolean c() {
        return true;
    }
}
