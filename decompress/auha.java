// 
// Decompiled by Procyon v0.6.0
// 

final class auha extends auia
{
    private final augv b;
    
    public auha(final augv b, final aufv aufv) {
        super(aufp.l, aufv);
        this.b = b;
    }
    
    public final int a(final long n) {
        return this.b.V(n);
    }
    
    public final int c() {
        return 53;
    }
    
    public final int d() {
        return 1;
    }
    
    public final long f(final long n) {
        return super.f(n + 259200000L);
    }
    
    public final long g(final long n) {
        return super.g(n + 259200000L) - 259200000L;
    }
    
    public final aufv s() {
        return this.b.e;
    }
    
    public final int v(final long n) {
        return this.b.X(this.b.Y(n));
    }
    
    protected final int w(final long n, final int n2) {
        if (n2 > 52) {
            return ((auhq)this).v(n);
        }
        return 52;
    }
}
