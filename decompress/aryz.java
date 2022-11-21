import java.util.logging.Level;
import java.util.Locale;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aryz
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
    
    public aryz(String lowerCase, final boolean b, final Object c) {
        lowerCase.getClass();
        this.e = lowerCase;
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        adme.L(lowerCase.isEmpty() ^ true, "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            arze.a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
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
            if (!aryz.d.get(char1)) {
                throw new IllegalArgumentException(adzw.O("Invalid character '%s' in key name '%s'", new Object[] { char1, lowerCase }));
            }
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(afas.a);
        this.c = c;
    }
    
    public static aryz c(final String s, final aryv aryv) {
        return (aryz)new aryu(s, aryv);
    }
    
    public static aryz d(final String s, final aryx aryx) {
        return (aryz)new aryw(s, aryx);
    }
    
    public static aryz e(final String s, final boolean b, final arzd arzd) {
        return (aryz)new arzc(s, b, arzd);
    }
    
    public static void g(final aryy aryy) {
        new arza(aryy);
    }
    
    public abstract Object a(final byte[] p0);
    
    public abstract byte[] b(final Object p0);
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((aryz)o).a));
    }
    
    public boolean f() {
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
