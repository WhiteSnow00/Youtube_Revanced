import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class ault implements Comparable
{
    auij a;
    int b;
    String c;
    Locale d;
    
    public ault() {
    }
    
    public final int a(final ault ault) {
        final auij a = ault.a;
        final int a2 = aulv.a(this.a.s(), a.s());
        if (a2 != 0) {
            return a2;
        }
        return aulv.a(this.a.q(), a.q());
    }
    
    final long b(long n, final boolean b) {
        final String c = this.c;
        if (c == null) {
            n = this.a.j(n, this.b);
        }
        else {
            n = this.a.i(n, c, this.d);
        }
        long g = n;
        if (b) {
            g = this.a.g(n);
        }
        return g;
    }
    
    final void c(final auij a, final int b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((ault)o);
    }
}
