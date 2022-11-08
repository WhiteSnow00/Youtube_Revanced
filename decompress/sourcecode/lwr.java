import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public class lwr implements Comparable
{
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;
    
    public lwr(final String a, final long b, final long c, final long f, final File e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (e != null);
        this.e = e;
        this.f = f;
    }
    
    public final int a(final lwr lwr) {
        if (!this.a.equals(lwr.a)) {
            return this.a.compareTo(lwr.a);
        }
        final long n = this.b - lwr.b;
        int n2;
        if (n == 0L) {
            n2 = 0;
        }
        else {
            if (n < 0L) {
                return -1;
            }
            n2 = 1;
        }
        return n2;
    }
    
    public final boolean b() {
        return !this.d;
    }
    
    public final boolean c() {
        return this.c == -1L;
    }
}
