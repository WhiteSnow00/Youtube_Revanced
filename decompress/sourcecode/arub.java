import java.util.logging.Level;
import java.util.Locale;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arub
{
    private static final BitSet d;
    public final String a;
    public final byte[] b;
    public final Object c;
    private final String e;
    
    static {
        final BitSet d2 = new BitSet(127);
        d2.set(45);
        d2.set(95);
        d2.set(46);
        for (int i = 48; i <= 57; i = (char)(i + 1)) {
            d2.set(i);
        }
        for (int j = 97; j <= 122; j = (char)(j + 1)) {
            d2.set(j);
        }
        d = d2;
    }
    
    public arub(String lowerCase, final boolean b, final Object c) {
        lowerCase.getClass();
        this.e = lowerCase;
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        agot.v(lowerCase.isEmpty() ^ true, (Object)"token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            arug.a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); ++i) {
            char char1;
            final char c2 = char1 = lowerCase.charAt(i);
            if (b && (char1 = c2) == ':') {
                if (i == 0) {
                    i = 0;
                    continue;
                }
                char1 = ':';
            }
            if (!arub.d.get(char1)) {
                throw new IllegalArgumentException(agnj.G("Invalid character '%s' in key name '%s'", new Object[] { char1, lowerCase }));
            }
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(aexb.a);
        this.c = c;
    }
    
    public static arub c(final String s, final artx artx) {
        return (arub)new artw(s, artx);
    }
    
    public static arub d(final String s, final artz artz) {
        return (arub)new arty(s, artz);
    }
    
    public static arub e(final String s, final arua arua) {
        return (arub)new aruc(s, arua);
    }
    
    public static arub f(final String s, final boolean b, final aruf aruf) {
        return (arub)new arue(s, b, aruf);
    }
    
    public abstract Object a(final byte[] p0);
    
    public abstract byte[] b(final Object p0);
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((arub)o).a));
    }
    
    public boolean g() {
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("Key{name='");
        sb.append(a);
        sb.append("'}");
        return sb.toString();
    }
}
