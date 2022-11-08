import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bjp extends bju
{
    final long a;
    final long b;
    final List c;
    final long d;
    private final long e;
    private final long f;
    
    public bjp(final bjl bjl, final long n, final long n2, final long a, final long b, final List c, final long d, final long e, final long f) {
        super(bjl, n, n2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final long a(final long n, final long n2) {
        final long c = this.c(n);
        if (c != -1L) {
            return c;
        }
        return (int)(this.e(n2 - this.f + this.d, n) - this.b(n, n2));
    }
    
    public final long b(long e, final long n) {
        if (this.c(e) == -1L) {
            final long e2 = this.e;
            if (e2 != -9223372036854775807L) {
                e = this.e(n - this.f - e2, e);
                return Math.max(this.a, e);
            }
        }
        return this.a;
    }
    
    public abstract long c(final long p0);
    
    public final long d(long n, final long n2) {
        final List c = this.c;
        if (c != null) {
            return ((bjs)c.get((int)(n - this.a))).b * 1000000L / this.i;
        }
        final long c2 = this.c(n2);
        if (c2 != -1L && n == this.a + c2 - 1L) {
            n = n2 - this.f(n);
        }
        else {
            n = this.b * 1000000L / this.i;
        }
        return n;
    }
    
    public final long e(long n, long c) {
        final long a = this.a;
        c = this.c(c);
        if (c == 0L) {
            return a;
        }
        if (this.c == null) {
            n = this.a + n / (this.b * 1000000L / this.i);
            if (n < a) {
                n = a;
            }
            else if (c != -1L) {
                return Math.min(n, a + c - 1L);
            }
            return n;
        }
        c = c + a - 1L;
        long n2 = a;
        while (n2 <= c) {
            final long n3 = (c - n2) / 2L + n2;
            final long f = this.f(n3);
            if (f < n) {
                n2 = 1L + n3;
            }
            else {
                if (f <= n) {
                    return n3;
                }
                c = n3 - 1L;
            }
        }
        if (n2 == a) {
            return n2;
        }
        return c;
    }
    
    public final long f(long n) {
        final List c = this.c;
        if (c != null) {
            n = ((bjs)c.get((int)(n - this.a))).a - this.j;
        }
        else {
            n = (n - this.a) * this.b;
        }
        return baw.y(n, 1000000L, this.i);
    }
    
    public abstract bjl g(final bjo p0, final long p1);
    
    public boolean h() {
        return this.c != null;
    }
}
