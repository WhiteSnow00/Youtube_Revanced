import java.math.RoundingMode;
import java.math.BigInteger;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjr extends bjp
{
    final long e;
    final adec f;
    final adec g;
    
    public bjr(final bjl bjl, final long n, final long n2, final long n3, final long e, final long n4, final List list, final long n5, final adec f, final adec g, final long n6, final long n7, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(bjl, n, n2, n3, n4, list, n5, n6, n7);
        this.f = f;
        this.g = g;
        this.e = e;
    }
    
    public final long c(final long n) {
        final List c = this.c;
        if (c != null) {
            return c.size();
        }
        final long e = this.e;
        if (e != -1L) {
            return e - this.a + 1L;
        }
        if (n != -9223372036854775807L) {
            return afqd.a(BigInteger.valueOf(n).multiply(BigInteger.valueOf(this.i)), BigInteger.valueOf(this.b).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }
        return -1L;
    }
    
    public final bjl g(final bjo bjo, final long n) {
        final List c = this.c;
        long a;
        if (c != null) {
            a = c.get((int)(n - this.a)).a;
        }
        else {
            a = (n - this.a) * this.b;
        }
        final adec g = this.g;
        final ayf d = bjo.d;
        return new bjl(g.i(d.c, n, d.j, a), 0L, -1L);
    }
    
    public final bjl i(final bjo bjo) {
        final adec f = this.f;
        if (f != null) {
            final ayf d = bjo.d;
            return new bjl(f.i(d.c, 0L, d.j, 0L), 0L, -1L);
        }
        return ((bju)this).h;
    }
}
