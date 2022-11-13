// 
// Decompiled by Procyon v0.6.0
// 

final class auhb extends auhw
{
    private final augv a;
    
    public auhb(final augv a) {
        super(aufp.k, 31556952000L);
        this.a = a;
    }
    
    public final int a(final long n) {
        return this.a.Y(n);
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
        return this.h(n, this.a(n) + n2);
    }
    
    public final long f(final long n) {
        return n - this.g(n);
    }
    
    public final long g(long n) {
        final long g = this.a.l.g(n);
        final int v = this.a.V(g);
        n = g;
        if (v > 1) {
            n = g - (v - 1) * 604800000L;
        }
        return n;
    }
    
    public final long h(long n, final int n2) {
        atoc.k((aufn)this, Math.abs(n2), -292275054, 292278993);
        final int a = this.a(n);
        if (a == n2) {
            return n;
        }
        final int p2 = this.a.P(n);
        final int x = this.a.X(a);
        final int x2 = this.a.X(n2);
        int n3;
        if (x2 < (n3 = x)) {
            n3 = x2;
        }
        final int v = this.a.V(n);
        int n4;
        if (v <= (n4 = n3)) {
            n4 = v;
        }
        final long ah = this.a.ah(n, n2);
        final int a2 = this.a(ah);
        if (a2 < n2) {
            n = ah + 604800000L;
        }
        else {
            n = ah;
            if (a2 > n2) {
                n = ah - 604800000L;
            }
        }
        return this.a.j.h(n + (n4 - this.a.V(n)) * 604800000L, p2);
    }
    
    public final aufv r() {
        return this.a.d;
    }
    
    public final aufv s() {
        return null;
    }
    
    public final boolean t(final long n) {
        final augv a = this.a;
        return a.X(a.Y(n)) > 52;
    }
    
    public final long w(final long n, final long n2) {
        return this.e(n, atoc.g(n2));
    }
    
    public final long x(long f, long n) {
        if (f < n) {
            return -this.y(n, f);
        }
        final int a = this.a(f);
        final int a2 = this.a(n);
        final long f2 = ((auhq)this).f(f);
        n = (f = ((auhq)this).f(n));
        if (n >= 31449600000L) {
            f = n;
            if (this.a.X(a) <= 52) {
                f = n - 604800000L;
            }
        }
        int n2 = a - a2;
        if (f2 < f) {
            --n2;
        }
        return n2;
    }
}
