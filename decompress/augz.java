// 
// Decompiled by Procyon v0.6.0
// 

class augz extends auhw
{
    private final augv a;
    private final int c;
    private final int d;
    
    public augz(final augv a) {
        super(aufp.h, 2629746000L);
        this.a = a;
        this.c = 12;
        this.d = 2;
    }
    
    public final int a(final long n) {
        final augv a = this.a;
        return a.U(n, a.Z(n));
    }
    
    public final int c() {
        return this.c;
    }
    
    public final int d() {
        return 1;
    }
    
    public final long e(final long n, int abs) {
        if (abs == 0) {
            return n;
        }
        final long n2 = this.a.T(n);
        final int z = this.a.Z(n);
        final int u = this.a.U(n, z);
        final int n3 = u - 1;
        final int n4 = n3 + abs;
        int n10;
        if (n4 < 0) {
            int n7;
            if (Math.signum((float)(this.c + abs)) == Math.signum((float)abs)) {
                final int n5 = z - 1;
                final int n6 = abs + this.c;
                abs = n5;
                n7 = n6;
            }
            else {
                final int n8 = z + 1;
                n7 = abs - this.c;
                abs = n8;
            }
            final int n9 = n7 + n3;
            n10 = abs;
            abs = n9;
        }
        else {
            n10 = z;
            abs = n4;
        }
        int n12;
        if (abs >= 0) {
            final int c = this.c;
            final int n11 = n10 + abs / c;
            n12 = abs % c + 1;
            abs = n11;
        }
        else {
            final int n13 = n10 + abs / this.c - 1;
            abs = Math.abs(abs);
            final int c2 = this.c;
            if ((abs %= c2) == 0) {
                abs = c2;
            }
            final int n14 = n12 = c2 - abs + 1;
            abs = n13;
            if (n14 == 1) {
                abs = n13 + 1;
                n12 = n14;
            }
        }
        final int o = this.a.O(n, z, u);
        final int s = this.a.S(abs, n12);
        int n15;
        if ((n15 = o) > s) {
            n15 = s;
        }
        return this.a.af(abs, n12, n15) + n2;
    }
    
    public final long f(final long n) {
        return n - this.g(n);
    }
    
    public final long g(final long n) {
        final int z = this.a.Z(n);
        return this.a.ag(z, this.a.U(n, z));
    }
    
    public final long h(final long n, final int n2) {
        atoc.k((aufn)this, n2, 1, this.c);
        final int z = this.a.Z(n);
        final augv a = this.a;
        final int o = a.O(n, z, a.U(n, z));
        final int s = this.a.S(z, n2);
        int n3 = o;
        if (o > s) {
            n3 = s;
        }
        return this.a.af(z, n2, n3) + this.a.T(n);
    }
    
    public final aufv r() {
        return this.a.c;
    }
    
    public final aufv s() {
        return this.a.g;
    }
    
    public final boolean t(final long n) {
        final int z = this.a.Z(n);
        return this.a.aj(z) && this.a.U(n, z) == this.d;
    }
    
    public final long w(final long n, final long n2) {
        final int n3 = (int)n2;
        if (n3 == n2) {
            return this.e(n, n3);
        }
        final long n4 = this.a.T(n);
        final int z = this.a.Z(n);
        final int u = this.a.U(n, z);
        final long n5 = u - 1 + n2;
        long n8;
        long n9;
        if (n5 >= 0L) {
            final long n6 = z;
            final long n7 = this.c;
            n8 = n6 + n5 / n7;
            n9 = n5 % n7 + 1L;
        }
        else {
            final long n10 = z;
            final long n11 = n5 / this.c;
            final long abs = Math.abs(n5);
            final int c = this.c;
            int n12;
            if ((n12 = (int)(abs % c)) == 0) {
                n12 = c;
            }
            final long n13 = n10 + n11 - 1L;
            final long n14 = n9 = c - n12 + 1;
            n8 = n13;
            if (n14 == 1L) {
                n8 = n13 + 1L;
                n9 = n14;
            }
        }
        if (n8 >= -292275054L && n8 <= 292278993L) {
            final int n15 = (int)n9;
            final int o = this.a.O(n, z, u);
            final augv a = this.a;
            final int n16 = (int)n8;
            final int s = a.S(n16, n15);
            int n17;
            if ((n17 = o) > s) {
                n17 = s;
            }
            return this.a.af(n16, n15, n17) + n4;
        }
        final StringBuilder sb = new StringBuilder("Magnitude of add amount is too large: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final long x(final long n, long h) {
        final long n2 = h;
        if (n < n2) {
            return -this.y(n2, n);
        }
        final int z = this.a.Z(n);
        final int u = this.a.U(n, z);
        final int z2 = this.a.Z(n2);
        final int u2 = this.a.U(n2, z2);
        final long n3 = this.c;
        final long n4 = u;
        final long n5 = u2;
        final int o = this.a.O(n, z, u);
        h = n2;
        if (o == this.a.S(z, u)) {
            h = n2;
            if (this.a.O(n2, z2, u2) > o) {
                h = this.a.k.h(n2, o);
            }
        }
        long n6 = (z - z2) * n3 + n4 - n5;
        if (n - this.a.ag(z, u) < h - this.a.ag(z2, u2)) {
            --n6;
        }
        return n6;
    }
}
