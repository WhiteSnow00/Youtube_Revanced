import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class augd extends auhi
{
    public augd() {
        super(auey.n, auge.s, auge.t);
    }
    
    public final int b(final Locale locale) {
        return augo.a(locale).m;
    }
    
    public final long i(final long n, final String s, final Locale locale) {
        final String[] f = augo.a(locale).f;
        int length = f.length;
        int n2;
        do {
            n2 = length - 1;
            if (n2 < 0) {
                throw new aufh(auey.n, s);
            }
            length = n2;
        } while (!f[n2].equalsIgnoreCase(s));
        return ((auhj)this).h(n, n2);
    }
    
    public final String m(final int n, final Locale locale) {
        return augo.a(locale).f[n];
    }
}
