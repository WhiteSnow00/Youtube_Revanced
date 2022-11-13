// 
// Decompiled by Procyon v0.6.0
// 

public final class auhy extends auhs
{
    private final int a;
    private final int c;
    private final int d;
    
    public auhy(final aufn aufn, final aufp aufp) {
        this(aufn, aufp, 1);
    }
    
    public auhy(final aufn aufn, final aufp aufp, final int a) {
        super(aufn, aufp);
        this.a = a;
        if (aufn.d() + a > Integer.MIN_VALUE) {
            this.c = aufn.d() + a;
        }
        else {
            this.c = Integer.MIN_VALUE;
        }
        if (aufn.c() + a < Integer.MAX_VALUE) {
            this.d = aufn.c() + a;
            return;
        }
        this.d = Integer.MAX_VALUE;
    }
    
    public final int a(final long n) {
        return super.b.a(n) + this.a;
    }
    
    public final int c() {
        return this.d;
    }
    
    public final int d() {
        return this.c;
    }
    
    public final long e(long e, final int n) {
        e = super.e(e, n);
        atoc.k((aufn)this, this.a(e), this.c, this.d);
        return e;
    }
    
    public final long f(final long n) {
        return super.b.f(n);
    }
    
    public final long g(final long n) {
        return super.b.g(n);
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, this.c, this.d);
        return super.h(n, n2 - this.a);
    }
    
    public final aufv r() {
        return super.b.r();
    }
    
    public final boolean t(final long n) {
        return super.b.t(n);
    }
}
