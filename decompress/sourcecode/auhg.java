import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhg extends aufe implements Serializable
{
    public static final aufe a;
    private static final long serialVersionUID = 2656707858124633367L;
    
    static {
        a = new auhg();
    }
    
    private auhg() {
    }
    
    private Object readResolve() {
        return auhg.a;
    }
    
    public final int a(final long n, final long n2) {
        return aujh.d(aujh.g(n, n2));
    }
    
    public final long b(final long n, final int n2) {
        return aujh.e(n, (long)n2);
    }
    
    public final long c(final long n, final long n2) {
        return aujh.e(n, n2);
    }
    
    public final long d(final long n, final long n2) {
        return aujh.g(n, n2);
    }
    
    public final long e() {
        return 1L;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof auhg) {
            final auhg auhg = (auhg)o;
            return true;
        }
        return false;
    }
    
    public final aufg f() {
        return aufg.l;
    }
    
    public final boolean g() {
        return true;
    }
    
    public final boolean h() {
        return true;
    }
    
    public final int hashCode() {
        return 1;
    }
    
    public final String toString() {
        return "DurationField[millis]";
    }
}
