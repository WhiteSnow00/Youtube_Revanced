import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auho extends aufe implements Serializable
{
    private static HashMap a;
    private static final long serialVersionUID = -6390301302770925357L;
    private final aufg b;
    
    private auho(final aufg b) {
        this.b = b;
    }
    
    public static auho j(final aufg aufg) {
        synchronized (auho.class) {
            final HashMap a = auho.a;
            auho auho;
            if (a == null) {
                auho.a = new HashMap(7);
                auho = null;
            }
            else {
                auho = a.get(aufg);
            }
            if (auho == null) {
                final auho auho2 = new auho(aufg);
                auho.a.put(aufg, auho2);
                return auho2;
            }
            return auho;
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
        if (o instanceof auho) {
            final auho auho = (auho)o;
            auho.i();
            return auho.i().equals(this.i());
        }
        return false;
    }
    
    public final aufg f() {
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
