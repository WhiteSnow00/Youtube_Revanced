import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auhq extends aufn
{
    public final aufp g;
    
    protected auhq(final aufp g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }
    
    public abstract int a(final long p0);
    
    public int b(final Locale locale) {
        final int c = this.c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }
    
    public abstract int c();
    
    public long e(final long n, final int n2) {
        return this.q().b(n, n2);
    }
    
    public long f(final long n) {
        return n - this.g(n);
    }
    
    public abstract long g(final long p0);
    
    public abstract long h(final long p0, final int p1);
    
    public long i(final long n, final String s, final Locale locale) {
        return this.h(n, this.tT(s, locale));
    }
    
    public String k(final int n, final Locale locale) {
        return this.m(n, locale);
    }
    
    public String l(final long n, final Locale locale) {
        return this.k(this.a(n), locale);
    }
    
    public String m(final int n, final Locale locale) {
        return Integer.toString(n);
    }
    
    public String n(final long n, final Locale locale) {
        return this.m(this.a(n), locale);
    }
    
    public final String o() {
        return this.g.y;
    }
    
    public final aufp p() {
        return this.g;
    }
    
    public abstract aufv q();
    
    public aufv r() {
        return null;
    }
    
    public boolean t(final long n) {
        return false;
    }
    
    protected int tT(final String s, final Locale locale) {
        try {
            return Integer.parseInt(s);
        }
        catch (final NumberFormatException ex) {
            throw new aufy(this.g, s);
        }
    }
    
    public final String toString() {
        final String o = this.o();
        final StringBuilder sb = new StringBuilder("DateTimeField[");
        sb.append(o);
        sb.append("]");
        return sb.toString();
    }
    
    public final boolean u() {
        return true;
    }
    
    public int v(final long n) {
        return this.c();
    }
}
