import java.util.Arrays;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsh
{
    public final byte[] a;
    public final long b;
    public long c;
    private final lvl d;
    private byte[] e;
    private int f;
    private int g;
    
    public lsh(final lvl d, final long c, final long b) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = new byte[8192];
        this.a = new byte[4096];
    }
    
    private final int m(final byte[] array, final int n, int min) {
        final int g = this.g;
        if (g == 0) {
            return 0;
        }
        min = Math.min(g, min);
        System.arraycopy(this.e, 0, array, n, min);
        this.n(min);
        return min;
    }
    
    private final void n(final int n) {
        final int g = this.g - n;
        this.g = g;
        this.f = 0;
        final byte[] e = this.e;
        System.arraycopy(e, n, e, 0, g);
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        int n3;
        if ((n3 = this.m(array, n, n2)) == 0) {
            n3 = this.b(array, n, n2, 0, true);
        }
        this.e(n3);
        return n3;
    }
    
    public final int b(final byte[] array, int a, final int n, final int n2, final boolean b) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        a = this.d.a(array, a + n2, n - n2);
        if (a != -1) {
            return n2 + a;
        }
        if (n2 == 0 && b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public final long c() {
        return this.c + this.f;
    }
    
    public final void d(final int n) {
        this.j(n, false);
    }
    
    public final void e(final int n) {
        if (n != -1) {
            this.c += n;
        }
    }
    
    public final void f(final byte[] array, final int n, final int n2) {
        this.k(array, n, n2, false);
    }
    
    public final void g(final byte[] array, final int n, final int n2) {
        this.l(array, n, n2, false);
    }
    
    public final void h() {
        this.f = 0;
    }
    
    public final void i(final int n) {
        int n2 = Math.min(this.g, n);
        this.n(n2);
        while (n2 < n && n2 != -1) {
            n2 = this.b(this.a, -n2, Math.min(n, n2 + 4096), n2, false);
        }
        this.e(n2);
    }
    
    public final boolean j(int f, final boolean b) {
        final int n = this.f + f;
        final byte[] e = this.e;
        final int length = e.length;
        if (n > length) {
            this.e = Arrays.copyOf(e, Math.max(length + length, n));
        }
        int i = Math.min(this.g - this.f, f);
        while (i < f) {
            if ((i = this.b(this.e, this.f, f, i, b)) == -1) {
                return false;
            }
        }
        f += this.f;
        this.f = f;
        this.g = Math.max(this.g, f);
        return true;
    }
    
    public final boolean k(final byte[] array, final int n, final int n2, final boolean b) {
        if (!this.j(n2, b)) {
            return false;
        }
        System.arraycopy(this.e, this.f - n2, array, n, n2);
        return true;
    }
    
    public final boolean l(final byte[] array, final int n, final int n2, final boolean b) {
        int n3;
        for (n3 = this.m(array, n, n2); n3 < n2 && n3 != -1; n3 = this.b(array, n, n2, n3, b)) {}
        this.e(n3);
        return n3 != -1;
    }
}
