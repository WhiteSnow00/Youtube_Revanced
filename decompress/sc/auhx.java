import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhx extends aufv implements Serializable
{
    public static final aufv a;
    private static final long serialVersionUID = 2656707858124633367L;
    
    static {
        a = new auhx();
    }
    
    private auhx() {
    }
    
    private Object readResolve() {
        return auhx.a;
    }
    
    public final int a(final long n, final long n2) {
        return atoc.g(atoc.j(n, n2));
    }
    
    public final long b(final long n, final int n2) {
        return atoc.h(n, (long)n2);
    }
    
    public final long c(final long n, final long n2) {
        return atoc.h(n, n2);
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final long e = ((aufv)o).e();
        int n;
        if (e == 1L) {
            n = 0;
        }
        else {
            if (e <= 1L) {
                return 1;
            }
            n = -1;
        }
        return n;
    }
    
    public final long d(final long n, final long n2) {
        return atoc.j(n, n2);
    }
    
    public final long e() {
        return 1L;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof auhx) {
            final auhx auhx = (auhx)o;
            return true;
        }
        return false;
    }
    
    public final aufx f() {
        return aufx.l;
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
