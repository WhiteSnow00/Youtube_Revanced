import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjm extends bjo implements biv
{
    final bjp a;
    
    public bjm(final ayf ayf, final List list, final bjp a, final List list2) {
        super(ayf, list, (bju)a, list2);
        this.a = a;
    }
    
    public final long a(final long n, final long n2) {
        return this.a.a(n, n2);
    }
    
    public final long b(final long n, final long n2) {
        return this.a.d(n, n2);
    }
    
    public final long c(final long n, final long n2) {
        return this.a.b(n, n2);
    }
    
    public final long d() {
        return this.a.a;
    }
    
    public final long e(final long n, long n2) {
        final bjp a = this.a;
        if (a.c != null) {
            return -9223372036854775807L;
        }
        n2 = a.b(n, n2) + a.a(n, n2);
        return a.f(n2) + a.d(n2, n) - a.d;
    }
    
    public final long f(final long n) {
        return this.a.c(n);
    }
    
    public final long g(final long n, final long n2) {
        return this.a.e(n, n2);
    }
    
    public final long h(final long n) {
        return this.a.f(n);
    }
    
    public final bjl i(final long n) {
        return this.a.g(this, n);
    }
    
    public final boolean j() {
        return this.a.h();
    }
    
    public final biv k() {
        return this;
    }
    
    public final bjl l() {
        return null;
    }
    
    public final String m() {
        return null;
    }
}
