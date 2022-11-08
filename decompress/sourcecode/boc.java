import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class boc implements bqv
{
    private final bqv a;
    private final azm b;
    
    public boc(final bqv a, final azm b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final long n, final List list) {
        return this.a.a(n, list);
    }
    
    public final int b(final int n) {
        return this.a.b(n);
    }
    
    public final int c() {
        return this.a.c();
    }
    
    public final int d() {
        return this.a.d();
    }
    
    public final int e(final int n) {
        return this.a.e(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof boc)) {
            return false;
        }
        final boc boc = (boc)o;
        return this.a.equals(boc.a) && this.b.equals((Object)boc.b);
    }
    
    public final int f(final ayf ayf) {
        return this.a.f(ayf);
    }
    
    public final int g() {
        return this.a.g();
    }
    
    public final ayf h(final int n) {
        return this.a.h(n);
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + 527) * 31 + this.a.hashCode();
    }
    
    public final ayf i() {
        return this.a.i();
    }
    
    public final azm j() {
        return this.b;
    }
    
    public final Object k() {
        return this.a.k();
    }
    
    public final void l() {
        this.a.l();
    }
    
    public final void m() {
        this.a.m();
    }
    
    public final void n(final float n) {
        this.a.n(n);
    }
    
    public final void o(final long n, final long n2, final long n3, final List list, final bpv[] array) {
        this.a.o(n, n2, n3, list, array);
    }
    
    public final boolean p(final int n, final long n2) {
        return this.a.p(n, n2);
    }
    
    public final boolean q(final int n, final long n2) {
        return this.a.q(n, n2);
    }
    
    public final void r() {
    }
}
