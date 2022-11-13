// 
// Decompiled by Procyon v0.6.0
// 

public final class auic extends auhs
{
    final aufv a;
    final aufv c;
    
    public auic(final aufn aufn, final aufv c, final aufp aufp) {
        super(aufn, aufp);
        this.c = c;
        this.a = aufn.q();
    }
    
    public auic(final auhu auhu, final aufp aufp) {
        this(auhu, auhu.b.q(), aufp);
    }
    
    public auic(final auhu auhu, final aufv a, final aufp aufp) {
        super(auhu.b, aufp);
        final int a2 = auhu.a;
        this.a = a;
        this.c = auhu.c;
    }
    
    public final int a(final long n) {
        final int a = super.b.a(n);
        if (a >= 0) {
            return a % 100;
        }
        return (a + 1) % 100 + 99;
    }
    
    public final int c() {
        return 99;
    }
    
    public final int d() {
        return 0;
    }
    
    public final long f(final long n) {
        return super.b.f(n);
    }
    
    public final long g(final long n) {
        return super.b.g(n);
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, 0, 99);
        final int a = super.b.a(n);
        int n3;
        if (a >= 0) {
            n3 = a / 100;
        }
        else {
            n3 = (a + 1) / 100 - 1;
        }
        return super.b.h(n, n3 * 100 + n2);
    }
    
    public final aufv q() {
        return this.a;
    }
    
    public final aufv s() {
        return this.c;
    }
}
