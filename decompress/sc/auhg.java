import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class auhg extends augz
{
    public auhg(final augv augv) {
        super(augv);
    }
    
    public final int b(final Locale locale) {
        return auhf.a(locale).l;
    }
    
    public final String k(final int n, final Locale locale) {
        return auhf.a(locale).e[n];
    }
    
    public final String m(final int n, final Locale locale) {
        return auhf.a(locale).d[n];
    }
    
    protected final int tT(final String s, final Locale locale) {
        final Integer n = auhf.a(locale).i.get(s);
        if (n != null) {
            return n;
        }
        throw new aufy(aufp.h, s);
    }
}
