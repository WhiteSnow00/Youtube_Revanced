import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bod implements bqw
{
    private final bqw a;
    private final azn b;
    
    public bod(final bqw a, final azn b) {
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
        if (!(o instanceof bod)) {
            return false;
        }
        final bod bod = (bod)o;
        return this.a.equals(bod.a) && this.b.equals((Object)bod.b);
    }
    
    public final int f(final ayg ayg) {
        return this.a.f(ayg);
    }
    
    public final int g() {
        return this.a.g();
    }
    
    public final ayg h(final int n) {
        return this.a.h(n);
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + 527) * 31 + this.a.hashCode();
    }
    
    public final ayg i() {
        return this.a.i();
    }
    
    public final azn j() {
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
    
    public final void o(final long n, final long n2, final long n3, final List list, final bpw[] array) {
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
