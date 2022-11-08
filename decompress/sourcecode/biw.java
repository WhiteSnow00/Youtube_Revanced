// 
// Decompiled by Procyon v0.6.0
// 

public final class biw implements biv
{
    private final bta a;
    private final long b;
    
    public biw(final bta a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final long a(final long n, final long n2) {
        return this.a.a;
    }
    
    @Override
    public final long b(final long n, final long n2) {
        return this.a.d[(int)n];
    }
    
    @Override
    public final long c(final long n, final long n2) {
        return 0L;
    }
    
    @Override
    public final long d() {
        return 0L;
    }
    
    @Override
    public final long e(final long n, final long n2) {
        return -9223372036854775807L;
    }
    
    @Override
    public final long f(final long n) {
        return this.a.a;
    }
    
    @Override
    public final long g(final long n, final long n2) {
        return this.a.d(n + this.b);
    }
    
    @Override
    public final long h(final long n) {
        return this.a.e[(int)n] - this.b;
    }
    
    @Override
    public final bjl i(final long n) {
        final bta a = this.a;
        final int n2 = (int)n;
        return new bjl((String)null, a.c[n2], (long)a.b[n2]);
    }
    
    @Override
    public final boolean j() {
        return true;
    }
}
