import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class afhz
{
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;
    
    public afhz() {
        this.n(3);
    }
    
    public afhz(final int n) {
        this(n, null);
    }
    
    public afhz(final int n, final byte[] array) {
        this.n(n);
    }
    
    public afhz(final afhz afhz) {
        this.n(afhz.c);
        for (int i = afhz.a(); i != -1; i = afhz.e(i)) {
            this.o(afhz.h(i), afhz.c(i));
        }
    }
    
    private static int q(final long n) {
        return (int)(n >>> 32);
    }
    
    private final int r() {
        return this.e.length - 1;
    }
    
    private static long s(final long n, final int n2) {
        return (n & 0xFFFFFFFF00000000L) | ((long)n2 & 0xFFFFFFFFL);
    }
    
    private final void t(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        final float n = (float)i;
        final float g = this.g;
        final int[] u = u(i);
        final long[] f = this.f;
        final int length = u.length;
        int q;
        int n2;
        for (i = 0; i < this.c; ++i) {
            q = q(f[i]);
            n2 = (length - 1 & q);
            f[u[n2] = i] = ((long)q << 32 | ((long)u[n2] & 0xFFFFFFFFL));
        }
        this.h = (int)(n * g) + 1;
        this.e = u;
    }
    
    private static int[] u(final int n) {
        final int[] array = new int[n];
        Arrays.fill(array, -1);
        return array;
    }
    
    public int a() {
        if (this.c == 0) {
            return -1;
        }
        return 0;
    }
    
    public final int b(final Object o) {
        final int d = this.d(o);
        if (d == -1) {
            return 0;
        }
        return this.b[d];
    }
    
    final int c(final int n) {
        adkp.Y(n, this.c);
        return this.b[n];
    }
    
    final int d(final Object o) {
        final int ah = agpc.ah(o);
        long n;
        for (int i = this.e[this.r() & ah]; i != -1; i = (int)n) {
            n = this.f[i];
            if (q(n) == ah && adkp.ae(o, this.a[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public int e(int n) {
        if (++n < this.c) {
            return n;
        }
        return -1;
    }
    
    public final int f(final Object o, int n) {
        final int n2 = this.r() & n;
        int n3 = this.e[n2];
        if (n3 != -1) {
            int n4 = -1;
            while (q(this.f[n3]) != n || !adkp.ae(o, this.a[n3])) {
                final int n5 = (int)this.f[n3];
                if (n5 == -1) {
                    return 0;
                }
                n4 = n3;
                n3 = n5;
            }
            n = this.b[n3];
            if (n4 == -1) {
                this.e[n2] = (int)this.f[n3];
            }
            else {
                final long[] f = this.f;
                f[n4] = s(f[n4], (int)f[n3]);
            }
            this.k(n3);
            --this.c;
            ++this.d;
            return n;
        }
        return 0;
    }
    
    final int g(final int n) {
        return this.f(this.a[n], q(this.f[n]));
    }
    
    final Object h(final int n) {
        adkp.Y(n, this.c);
        return this.a[n];
    }
    
    final void i(int highestOneBit) {
        if (highestOneBit > this.f.length) {
            this.l(highestOneBit);
        }
        if (highestOneBit >= this.h) {
            highestOneBit = Integer.highestOneBit(highestOneBit - 1);
            this.t(Math.max(2, highestOneBit + highestOneBit));
        }
    }
    
    public void j(final int n, final Object o, final int n2, final int n3) {
        this.f[n] = ((long)n3 << 32 | 0xFFFFFFFFL);
        this.a[n] = o;
        this.b[n] = n2;
    }
    
    public void k(final int n) {
        final int n2 = this.c - 1;
        if (n >= n2) {
            this.a[n] = null;
            this.b[n] = 0;
            this.f[n] = -1L;
            return;
        }
        final Object[] a = this.a;
        a[n] = a[n2];
        final int[] b = this.b;
        b[n] = b[n2];
        a[n2] = null;
        b[n2] = 0;
        final long[] f = this.f;
        final long n3 = f[n2];
        f[n] = n3;
        f[n2] = -1L;
        final int n4 = q(n3) & this.r();
        final int[] e = this.e;
        int n5 = e[n4];
        if (n5 != n2) {
            long[] f2;
            long n6;
            while (true) {
                f2 = this.f;
                n6 = f2[n5];
                final int n7 = (int)n6;
                if (n7 == n2) {
                    break;
                }
                n5 = n7;
            }
            f2[n5] = s(n6, n);
            return;
        }
        e[n4] = n;
    }
    
    public void l(final int n) {
        this.a = Arrays.copyOf(this.a, n);
        this.b = Arrays.copyOf(this.b, n);
        final long[] f = this.f;
        final int length = f.length;
        final long[] copy = Arrays.copyOf(f, n);
        if (n > length) {
            Arrays.fill(copy, length, n, -1L);
        }
        this.f = copy;
    }
    
    final void m(final int n, final int n2) {
        adkp.Y(n, this.c);
        this.b[n] = n2;
    }
    
    public void n(final int n) {
        adkp.I(n >= 0, (Object)"Initial capacity must be non-negative");
        adkp.I(true, (Object)"Illegal load factor");
        final int ai = agpc.ai(n);
        this.e = u(ai);
        this.g = 1.0f;
        this.a = new Object[n];
        this.b = new int[n];
        final long[] f = new long[n];
        Arrays.fill(f, -1L);
        this.f = f;
        this.h = Math.max(1, (int)(float)ai);
    }
    
    public final void o(final Object o, int length) {
        if (length <= 0) {
            final StringBuilder sb = new StringBuilder("count must be positive but was: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        final long[] f = this.f;
        final Object[] a = this.a;
        final int[] b = this.b;
        final int ah = agpc.ah(o);
        final int n = this.r() & ah;
        final int c = this.c;
        final int[] e = this.e;
        int n2;
        if ((n2 = e[n]) == -1) {
            e[n] = c;
        }
        else {
            while (true) {
                final long n3 = f[n2];
                if (q(n3) == ah && adkp.ae(o, a[n2])) {
                    final int n4 = b[n2];
                    b[n2] = length;
                    return;
                }
                final int n5 = (int)n3;
                if (n5 == -1) {
                    f[n2] = s(n3, c);
                    break;
                }
                n2 = n5;
            }
        }
        final int n6 = Integer.MAX_VALUE;
        if (c != Integer.MAX_VALUE) {
            final int c2 = c + 1;
            final int length2 = this.f.length;
            if (c2 > length2) {
                int n7 = Math.max(1, length2 >>> 1) + length2;
                if (n7 < 0) {
                    n7 = n6;
                }
                if (n7 != length2) {
                    this.l(n7);
                }
            }
            this.j(c, o, length, ah);
            this.c = c2;
            if (c >= this.h) {
                length = this.e.length;
                this.t(length + length);
            }
            ++this.d;
            return;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }
    
    final afhs p(final int n) {
        adkp.Y(n, this.c);
        return new afhs(this, n);
    }
}
