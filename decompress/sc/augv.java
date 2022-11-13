// 
// Decompiled by Procyon v0.6.0
// 

abstract class augv extends augs
{
    public static final aufn A;
    public static final aufn B;
    public static final aufn C;
    public static final aufn D;
    public static final aufn E;
    public static final aufn F;
    public static final aufv o;
    public static final aufv p;
    public static final aufv q;
    public static final aufv r;
    public static final aufv s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final aufv t;
    public static final aufv u;
    public static final aufn v;
    public static final aufn w;
    public static final aufn x;
    public static final aufn y;
    public static final aufn z;
    public final int G;
    private final transient ypi[] H;
    
    static {
        final aufv aufv = o = auhx.a;
        final aufv aufv2 = p = (aufv)new auib(aufx.k, 1000L);
        final aufv aufv3 = q = (aufv)new auib(aufx.j, 60000L);
        final aufv aufv4 = r = (aufv)new auib(aufx.i, 3600000L);
        final aufv aufv5 = s = (aufv)new auib(aufx.h, 43200000L);
        final aufv aufv6 = t = (aufv)new auib(aufx.g, 86400000L);
        u = (aufv)new auib(aufx.f, 604800000L);
        v = (aufn)new auhz(aufp.x, aufv, aufv2);
        w = (aufn)new auhz(aufp.w, aufv, aufv6);
        x = (aufn)new auhz(aufp.v, aufv2, aufv3);
        y = (aufn)new auhz(aufp.u, aufv2, aufv6);
        z = (aufn)new auhz(aufp.t, aufv3, aufv4);
        A = (aufn)new auhz(aufp.s, aufv3, aufv6);
        final aufn aufn = B = (aufn)new auhz(aufp.r, aufv4, aufv6);
        final aufn aufn2 = C = (aufn)new auhz(aufp.o, aufv4, aufv5);
        D = (aufn)new auig(aufn, aufp.q);
        E = (aufn)new auig(aufn2, aufp.p);
        F = (aufn)new augu();
    }
    
    public augv(final aufl aufl, final int g) {
        super(aufl, (Object)null);
        this.H = new ypi[1024];
        this.G = g;
    }
    
    protected void N(final augr augr) {
        throw null;
    }
    
    final int O(final long n, final int n2, final int n3) {
        return (int)((n - (this.ae(n2) + this.ac(n2, n3))) / 86400000L) + 1;
    }
    
    final int P(long n) {
        if (n >= 0L) {
            n /= 86400000L;
        }
        else {
            n = (n - 86399999L) / 86400000L;
            if (n < -3L) {
                return (int)((n + 4L) % 7L) + 7;
            }
        }
        return (int)((n + 3L) % 7L) + 1;
    }
    
    final int Q(final long n, final int n2) {
        return (int)((n - this.ae(n2)) / 86400000L) + 1;
    }
    
    final int R(final long n) {
        final int z = this.Z(n);
        return this.S(z, this.U(n, z));
    }
    
    public abstract int S(final int p0, final int p1);
    
    final int T(final long n) {
        if (n >= 0L) {
            return (int)(n % 86400000L);
        }
        return (int)((n + 1L) % 86400000L) + 86399999;
    }
    
    public abstract int U(final long p0, final int p1);
    
    final int V(final long n) {
        return this.W(n, this.Z(n));
    }
    
    final int W(final long n, final int n2) {
        final long ab = this.ab(n2);
        if (n < ab) {
            return this.X(n2 - 1);
        }
        if (n >= this.ab(n2 + 1)) {
            return 1;
        }
        return (int)((n - ab) / 604800000L) + 1;
    }
    
    final int X(final int n) {
        return (int)((this.ab(n + 1) - this.ab(n)) / 604800000L);
    }
    
    final int Y(final long n) {
        final int z = this.Z(n);
        final int w = this.W(n, z);
        if (w == 1) {
            return this.Z(n + 604800000L);
        }
        if (w > 51) {
            return this.Z(n - 1209600000L);
        }
        return z;
    }
    
    final int Z(final long n) {
        long n3;
        final long n2 = n3 = (n >> 1) + 31083597720000L;
        if (n2 < 0L) {
            n3 = n2 - 15778475999L;
        }
        final int n4 = (int)(n3 / 15778476000L);
        final long ae = this.ae(n4);
        final long n5 = n - ae;
        int n6;
        if (n5 < 0L) {
            n6 = n4 - 1;
        }
        else {
            long n7 = 31536000000L;
            n6 = n4;
            if (n5 >= 31536000000L) {
                if (this.aj(n4)) {
                    n7 = 31622400000L;
                }
                if (ae + n7 > n) {
                    n6 = n4;
                }
                else {
                    n6 = n4 + 1;
                }
            }
        }
        return n6;
    }
    
    public abstract long aa(final int p0);
    
    final long ab(int p) {
        final long ae = this.ae(p);
        p = this.P(ae);
        if (p > 8 - this.G) {
            return ae + (8 - p) * 86400000L;
        }
        return ae - (p - 1) * 86400000L;
    }
    
    public abstract long ac(final int p0, final int p1);
    
    public abstract long ad(final long p0, final long p1);
    
    final long ae(final int n) {
        final ypi[] h = this.H;
        final int n2 = n & 0x3FF;
        final ypi ypi = h[n2];
        if (ypi != null) {
            final ypi ypi2 = ypi;
            if (ypi.b == n) {
                return ypi2.a;
            }
        }
        final ypi ypi2 = new ypi(n, this.aa(n), (char[])null);
        h[n2] = ypi2;
        return ypi2.a;
    }
    
    final long af(final int n, final int n2, final int n3) {
        return this.ae(n) + this.ac(n, n2) + (n3 - 1) * 86400000L;
    }
    
    final long ag(final int n, final int n2) {
        return this.ae(n) + this.ac(n, n2);
    }
    
    public abstract long ah(final long p0, final int p1);
    
    public boolean ai(final long n) {
        throw null;
    }
    
    public abstract boolean aj(final int p0);
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final augv augv = (augv)o;
            if (this.G == augv.G && this.z().equals((Object)augv.z())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.getClass().getName().hashCode() * 11 + this.z().hashCode() + this.G;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(60);
        final String name = this.getClass().getName();
        final int lastIndex = name.lastIndexOf(46);
        String substring = name;
        if (lastIndex >= 0) {
            substring = name.substring(lastIndex + 1);
        }
        sb.append(substring);
        sb.append('[');
        final auft z = this.z();
        if (z != null) {
            sb.append(z.c);
        }
        if (this.G != 4) {
            sb.append(",mdfw=");
            sb.append(this.G);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final auft z() {
        final aufl a = super.a;
        if (a != null) {
            return a.z();
        }
        return auft.a;
    }
}
