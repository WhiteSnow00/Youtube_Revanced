import java.util.Locale;
import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhn extends auew implements Serializable
{
    private static HashMap a;
    private static final long serialVersionUID = -1934618396111902255L;
    private final auey b;
    private final aufe c;
    
    private auhn(final auey b, final aufe c) {
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
    
    public static auhn v(final auey auey, final aufe aufe) {
        synchronized (auhn.class) {
            final HashMap a = auhn.a;
            auhn auhn = null;
            if (a == null) {
                auhn.a = new HashMap(7);
            }
            else {
                final auhn auhn2 = a.get(auey);
                if (auhn2 == null || auhn2.c == aufe) {
                    auhn = auhn2;
                }
            }
            if (auhn == null) {
                final auhn auhn3 = new auhn(auey, aufe);
                auhn.a.put(auey, auhn3);
                return auhn3;
            }
            return auhn;
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
    
    public final auey p() {
        return this.b;
    }
    
    public final aufe q() {
        return this.c;
    }
    
    public final aufe r() {
        return null;
    }
    
    public final aufe s() {
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
