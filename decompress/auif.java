import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auif extends aufv implements Serializable
{
    private static HashMap a;
    private static final long serialVersionUID = -6390301302770925357L;
    private final aufx b;
    
    private auif(final aufx b) {
        this.b = b;
    }
    
    public static auif j(final aufx aufx) {
        synchronized (auif.class) {
            final HashMap a = auif.a;
            auif auif;
            if (a == null) {
                auif.a = new HashMap(7);
                auif = null;
            }
            else {
                auif = a.get(aufx);
            }
            if (auif == null) {
                final auif auif2 = new auif(aufx);
                auif.a.put(aufx, auif2);
                return auif2;
            }
            return auif;
        }
    }
    
    private final UnsupportedOperationException k() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }
    
    private Object readResolve() {
        return j(this.b);
    }
    
    public final int a(final long n, final long n2) {
        throw this.k();
    }
    
    public final long b(final long n, final int n2) {
        throw this.k();
    }
    
    public final long c(final long n, final long n2) {
        throw this.k();
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final aufv aufv = (aufv)o;
        return 0;
    }
    
    public final long d(final long n, final long n2) {
        throw this.k();
    }
    
    public final long e() {
        return 0L;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof auif) {
            final auif auif = (auif)o;
            auif.i();
            return auif.i().equals(this.i());
        }
        return false;
    }
    
    public final aufx f() {
        return this.b;
    }
    
    public final boolean g() {
        return true;
    }
    
    public final boolean h() {
        return false;
    }
    
    public final int hashCode() {
        return this.i().hashCode();
    }
    
    public final String i() {
        return this.b.m;
    }
    
    public final String toString() {
        final String i = this.i();
        final StringBuilder sb = new StringBuilder("UnsupportedDurationField[");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
