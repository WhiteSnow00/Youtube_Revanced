// 
// Decompiled by Procyon v0.6.0
// 

final class auhh extends auhs
{
    private final augv a;
    
    public auhh(final aufn aufn, final augv a) {
        super(aufn, aufp.c);
        this.a = a;
    }
    
    public final int a(final long n) {
        int a;
        final int n2 = a = super.b.a(n);
        if (n2 <= 0) {
            a = 1 - n2;
        }
        return a;
    }
    
    public final int c() {
        return super.b.c();
    }
    
    public final int d() {
        return 1;
    }
    
    public final long e(final long n, final int n2) {
        return super.b.e(n, n2);
    }
    
    public final long f(final long n) {
        return super.b.f(n);
    }
    
    public final long g(final long n) {
        return super.b.g(n);
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, 1, this.c());
        int n3 = n2;
        if (this.a.Z(n) <= 0) {
            n3 = 1 - n2;
        }
        return super.h(n, n3);
    }
    
    public final aufv s() {
        return this.a.h;
    }
}
