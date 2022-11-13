// 
// Decompiled by Procyon v0.6.0
// 

public final class auhu extends auhs
{
    final int a;
    final aufv c;
    final aufv d;
    private final int e;
    private final int f;
    
    public auhu(final aufn aufn, final aufp aufp) {
        final aufv s = aufn.s();
        super(aufn, aufp);
        final aufv q = aufn.q();
        if (q == null) {
            this.c = null;
        }
        else {
            this.c = (aufv)new auid(q, ((aufo)aufp).a);
        }
        this.d = s;
        this.a = 100;
        final int d = aufn.d();
        int e;
        if (d >= 0) {
            e = d / 100;
        }
        else {
            e = (d + 1) / 100 - 1;
        }
        final int c = aufn.c();
        int f;
        if (c >= 0) {
            f = c / 100;
        }
        else {
            f = (c + 1) / 100 - 1;
        }
        this.e = e;
        this.f = f;
    }
    
    public final int a(final long n) {
        final int a = super.b.a(n);
        if (a >= 0) {
            return a / 100;
        }
        return (a + 1) / 100 - 1;
    }
    
    public final int c() {
        return this.f;
    }
    
    public final int d() {
        return this.e;
    }
    
    public final long e(final long n, final int n2) {
        return super.b.e(n, n2 * 100);
    }
    
    public final long f(final long n) {
        return this.h(n, this.a(super.b.f(n)));
    }
    
    public final long g(final long n) {
        final aufn b = super.b;
        return b.g(b.h(n, this.a(n) * 100));
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, this.e, this.f);
        final int a = super.b.a(n);
        int n3;
        if (a >= 0) {
            n3 = a % 100;
        }
        else {
            n3 = (a + 1) % 100 + 99;
        }
        return super.b.h(n, n2 * 100 + n3);
    }
    
    public final aufv q() {
        return this.c;
    }
    
    public final aufv s() {
        final aufv d = this.d;
        if (d != null) {
            return d;
        }
        return super.s();
    }
}
