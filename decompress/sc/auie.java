import java.util.Locale;
import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auie extends aufn implements Serializable
{
    private static HashMap a;
    private static final long serialVersionUID = -1934618396111902255L;
    private final aufp b;
    private final aufv c;
    
    private auie(final aufp b, final aufv c) {
        if (c != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    private Object readResolve() {
        return v(this.b, this.c);
    }
    
    public static auie v(final aufp aufp, final aufv aufv) {
        synchronized (auie.class) {
            final HashMap a = auie.a;
            auie auie = null;
            if (a == null) {
                auie.a = new HashMap(7);
            }
            else {
                final auie auie2 = a.get(aufp);
                if (auie2 == null || auie2.c == aufv) {
                    auie = auie2;
                }
            }
            if (auie == null) {
                final auie auie3 = new auie(aufp, aufv);
                auie.a.put(aufp, auie3);
                return auie3;
            }
            return auie;
        }
    }
    
    private final UnsupportedOperationException w() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }
    
    public final int a(final long n) {
        throw this.w();
    }
    
    public final int b(final Locale locale) {
        throw this.w();
    }
    
    public final int c() {
        throw this.w();
    }
    
    public final int d() {
        throw this.w();
    }
    
    public final long e(final long n, final int n2) {
        return this.c.b(n, n2);
    }
    
    public final long f(final long n) {
        throw this.w();
    }
    
    public final long g(final long n) {
        throw this.w();
    }
    
    public final long h(final long n, final int n2) {
        throw this.w();
    }
    
    public final long i(final long n, final String s, final Locale locale) {
        throw this.w();
    }
    
    public final String k(final int n, final Locale locale) {
        throw this.w();
    }
    
    public final String l(final long n, final Locale locale) {
        throw this.w();
    }
    
    public final String m(final int n, final Locale locale) {
        throw this.w();
    }
    
    public final String n(final long n, final Locale locale) {
        throw this.w();
    }
    
    public final String o() {
        return this.b.y;
    }
    
    public final aufp p() {
        return this.b;
    }
    
    public final aufv q() {
        return this.c;
    }
    
    public final aufv r() {
        return null;
    }
    
    public final aufv s() {
        return null;
    }
    
    public final boolean t(final long n) {
        throw this.w();
    }
    
    public final String toString() {
        return "UnsupportedDateTimeField";
    }
    
    public final boolean u() {
        return false;
    }
}
