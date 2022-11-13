// 
// Decompiled by Procyon v0.6.0
// 

final class auhc extends auhw
{
    protected final augv a;
    
    public auhc(final augv a) {
        super(aufp.f, 31556952000L);
        this.a = a;
    }
    
    public final int a(final long n) {
        return this.a.Z(n);
    }
    
    public final int c() {
        return 292278993;
    }
    
    public final int d() {
        return -292275054;
    }
    
    public final long e(final long n, final int n2) {
        if (n2 == 0) {
            return n;
        }
        final int a = this.a(n);
        final int n3 = a + n2;
        if ((a ^ n3) < 0 && (a ^ n2) >= 0) {
            final StringBuilder sb = new StringBuilder("The calculation caused an overflow: ");
            sb.append(a);
            sb.append(" + ");
            sb.append(n2);
            throw new ArithmeticException(sb.toString());
        }
        return this.h(n, n3);
    }
    
    public final long f(final long n) {
        return n - this.g(n);
    }
    
    public final long g(final long n) {
        return this.a.ae(this.a(n));
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, -292275054, 292278993);
        return this.a.ah(n, n2);
    }
    
    public final long j(final long n, final int n2) {
        atoc.k((aufn)this, n2, -292275055, 292278994);
        return this.a.ah(n, n2);
    }
    
    public final aufv r() {
        return this.a.c;
    }
    
    public final aufv s() {
        return null;
    }
    
    public final boolean t(final long n) {
        return this.a.aj(this.a(n));
    }
    
    public final long w(final long n, final long n2) {
        return this.e(n, atoc.g(n2));
    }
    
    public final long x(final long n, final long n2) {
        if (n < n2) {
            return -this.a.ad(n2, n);
        }
        return this.a.ad(n, n2);
    }
}
