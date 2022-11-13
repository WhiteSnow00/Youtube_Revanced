import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class augu extends auhz
{
    public augu() {
        super(aufp.n, augv.s, augv.t);
    }
    
    public final int b(final Locale locale) {
        return auhf.a(locale).m;
    }
    
    public final long i(final long n, final String s, final Locale locale) {
        final String[] f = auhf.a(locale).f;
        int length = f.length;
        int n2;
        do {
            n2 = length - 1;
            if (n2 < 0) {
                throw new aufy(aufp.n, s);
            }
            length = n2;
        } while (!f[n2].equalsIgnoreCase(s));
        return ((auia)this).h(n, n2);
    }
    
    public final String m(final int n, final Locale locale) {
        return auhf.a(locale).f[n];
    }
}
