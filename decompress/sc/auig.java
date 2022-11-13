// 
// Decompiled by Procyon v0.6.0
// 

public final class auig extends auhs
{
    public auig(final aufn aufn, final aufp aufp) {
        super(aufn, aufp);
    }
    
    public final int a(final long n) {
        int n2;
        if ((n2 = super.b.a(n)) == 0) {
            n2 = this.c();
        }
        return n2;
    }
    
    public final int c() {
        return super.b.c() + 1;
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
        final int c = this.c();
        atoc.k((aufn)this, n2, 1, c);
        int n3 = n2;
        if (n2 == c) {
            n3 = 0;
        }
        return super.b.h(n, n3);
    }
    
    public final aufv r() {
        return super.b.r();
    }
    
    public final boolean t(final long n) {
        return super.b.t(n);
    }
}
