// 
// Decompiled by Procyon v0.6.0
// 

final class auju extends auft
{
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final aujx f;
    final aujx g;
    
    public auju(final String s, final int e, final aujx f, final aujx g) {
        super(s);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private final aujx o(long a) {
        final int e = this.e;
        final aujx f = this.f;
        final aujx g = this.g;
        long a2;
        try {
            a2 = f.a(a, e, g.c);
        }
        catch (final IllegalArgumentException | ArithmeticException ex) {
            a2 = a;
        }
        try {
            a = g.a(a, e, f.c);
        }
        catch (final IllegalArgumentException | ArithmeticException ex2) {}
        if (a2 > a) {
            return f;
        }
        return g;
    }
    
    public final int a(final long n) {
        return this.e + this.o(n).c;
    }
    
    public final int c(final long n) {
        return this.e;
    }
    
    public final long e(long n) {
        final int e = this.e;
        final aujx f = this.f;
        final aujx g = this.g;
        while (true) {
            try {
                long a;
                final long n2 = a = f.a(n, e, g.c);
                if (n > 0L) {
                    a = n2;
                    if (n2 < 0L) {
                        a = n;
                    }
                }
                try {
                    final long a2 = g.a(n, e, f.c);
                    if (n <= 0L || a2 >= 0L) {
                        n = a2;
                    }
                }
                catch (final IllegalArgumentException | ArithmeticException ex) {}
                if (a > n) {
                    return n;
                }
                return a;
            }
            catch (final IllegalArgumentException | ArithmeticException ex2) {
                continue;
            }
            break;
        }
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof auju) {
            final auju auju = (auju)o;
            if (super.c.equals(auju.c) && this.e == auju.e && this.f.equals((Object)auju.f) && this.g.equals((Object)auju.g)) {
                return true;
            }
        }
        return false;
    }
    
    public final long f(long b) {
        final int e = this.e;
        final aujx f = this.f;
        final aujx g = this.g;
        long n = b + 1L;
        while (true) {
            try {
                final long n2 = b = f.b(n, e, g.c);
                if (n < 0L) {
                    b = n2;
                    if (n2 > 0L) {
                        b = n;
                    }
                }
                try {
                    final long b2 = g.b(n, e, f.c);
                    if (n >= 0L || b2 <= 0L) {
                        n = b2;
                    }
                }
                catch (final IllegalArgumentException | ArithmeticException ex) {}
                long n3 = b;
                if (b <= n) {
                    n3 = n;
                }
                return n3 - 1L;
            }
            catch (final IllegalArgumentException | ArithmeticException ex2) {
                continue;
            }
            break;
        }
    }
    
    public final String g(final long n) {
        return this.o(n).b;
    }
    
    public final boolean l() {
        return false;
    }
}
