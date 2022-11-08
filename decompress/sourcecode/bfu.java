// 
// Decompiled by Procyon v0.6.0
// 

public final class bfu
{
    public static final bfu a;
    public static final bfu b;
    public static final bfu c;
    public final long d;
    public final long e;
    
    static {
        final bfu c2 = a = new bfu(0L, 0L);
        new bfu(Long.MAX_VALUE, Long.MAX_VALUE);
        b = new bfu(Long.MAX_VALUE, 0L);
        new bfu(0L, Long.MAX_VALUE);
        c = c2;
    }
    
    public bfu(final long d, final long e) {
        final boolean b = true;
        dk.f(d >= 0L);
        dk.f(e >= 0L && b);
        this.d = d;
        this.e = e;
    }
    
    public final long a(final long n, final long n2, final long n3) {
        long d;
        if ((d = this.d) == 0L) {
            if (this.e == 0L) {
                return n;
            }
            d = 0L;
        }
        final long ab = baw.aB(n, d);
        final long as = baw.as(n, this.e);
        boolean b = true;
        final boolean b2 = ab <= n2 && n2 <= as;
        if (ab > n3 || n3 > as) {
            b = false;
        }
        if (b2 && b) {
            if (Math.abs(n2 - n) <= Math.abs(n3 - n)) {
                return n2;
            }
            return n3;
        }
        else {
            if (b2) {
                return n2;
            }
            if (b) {
                return n3;
            }
            return ab;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bfu bfu = (bfu)o;
                if (this.d == bfu.d && this.e == bfu.e) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.d * 31 + (int)this.e;
    }
}
