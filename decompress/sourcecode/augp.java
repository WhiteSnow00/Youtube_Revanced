import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class augp extends augi
{
    public augp(final auge auge) {
        super(auge);
    }
    
    public final int b(final Locale locale) {
        return augo.a(locale).l;
    }
    
    public final String k(final int n, final Locale locale) {
        return augo.a(locale).e[n];
    }
    
    public final String m(final int n, final Locale locale) {
        return augo.a(locale).d[n];
    }
    
    protected final int tQ(final String s, final Locale locale) {
        final Integer n = augo.a(locale).i.get(s);
        if (n != null) {
            return n;
        }
        throw new aufh(auey.h, s);
    }
}
