// 
// Decompiled by Procyon v0.6.0
// 

public final class biy
{
    public final bjp a;
    public final bjg b;
    public final biw c;
    public final long d;
    public final long e;
    final bpl f;
    
    public biy(final long d, final bjp a, final bjg b, final bpl f, final long e, final biw c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
    }
    
    public final long a(final long n) {
        return this.c.c(this.d, n) + this.e;
    }
    
    public final long b() {
        return this.c.d() + this.e;
    }
    
    public final long c(final long n) {
        return this.a(n) + this.c.a(this.d, n) - 1L;
    }
    
    public final long d() {
        return this.c.f(this.d);
    }
    
    public final long e(final long n) {
        return this.g(n) + this.c.b(n - this.e, this.d);
    }
    
    public final long f(final long n) {
        return this.c.g(n, this.d) + this.e;
    }
    
    public final long g(final long n) {
        return this.c.h(n - this.e);
    }
    
    public final bjm h(final long n) {
        return this.c.i(n - this.e);
    }
    
    public final boolean i(final long n, final long n2) {
        return this.c.j() || n2 == -9223372036854775807L || this.e(n) <= n2;
    }
}
