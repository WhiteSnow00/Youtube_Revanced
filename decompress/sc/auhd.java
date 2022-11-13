import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class auhd extends auia
{
    private final augv b;
    
    public auhd(final augv b, final aufv aufv) {
        super(aufp.m, aufv);
        this.b = b;
    }
    
    public final int a(final long n) {
        return this.b.P(n);
    }
    
    public final int b(final Locale locale) {
        return auhf.a(locale).k;
    }
    
    public final int c() {
        return 7;
    }
    
    public final int d() {
        return 1;
    }
    
    public final String k(final int n, final Locale locale) {
        return auhf.a(locale).c[n];
    }
    
    public final String m(final int n, final Locale locale) {
        return auhf.a(locale).b[n];
    }
    
    public final aufv s() {
        return this.b.d;
    }
    
    protected final int tT(final String s, final Locale locale) {
        final Integer n = auhf.a(locale).h.get(s);
        if (n != null) {
            return n;
        }
        throw new aufy(aufp.m, s);
    }
}
