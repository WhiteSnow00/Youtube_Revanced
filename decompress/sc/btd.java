import java.util.Arrays;
import java.io.EOFException;
import java.io.InterruptedIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btd implements btk
{
    public final byte[] a;
    public final long b;
    public long c;
    public byte[] d;
    public int e;
    public int f;
    private final ayb g;
    
    static {
        ayv.a("media3.extractor");
    }
    
    public btd(final ayb g, final long c, final long b) {
        this.g = g;
        this.c = c;
        this.b = b;
        this.d = new byte[65536];
        this.a = new byte[4096];
    }
    
    private final int q(final byte[] array, final int n, int min) {
        final int f = this.f;
        if (f == 0) {
            return 0;
        }
        min = Math.min(f, min);
        System.arraycopy(this.d, 0, array, n, min);
        this.r(min);
        return min;
    }
    
    private final void r(final int n) {
        final int f = this.f - n;
        this.f = f;
        this.e = 0;
        final byte[] d = this.d;
        byte[] d2;
        if (f < d.length - 524288) {
            d2 = new byte[65536 + f];
        }
        else {
            d2 = d;
        }
        System.arraycopy(d, n, d2, 0, f);
        this.d = d2;
    }
    
    @Override
    public final int a(final byte[] array, final int n, final int n2) {
        int n3;
        if ((n3 = this.q(array, n, n2)) == 0) {
            n3 = this.b(array, n, n2, 0, true);
        }
        this.h(n3);
        return n3;
    }
    
    public final int b(final byte[] array, int a, final int n, final int n2, final boolean b) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        a = this.g.a(array, a + n2, n - n2);
        if (a != -1) {
            return n2 + a;
        }
        if (n2 == 0 && b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public final int c(int min) {
        min = Math.min(this.f, min);
        this.r(min);
        return min;
    }
    
    @Override
    public final long d() {
        return this.b;
    }
    
    @Override
    public final long e() {
        return this.c + this.e;
    }
    
    @Override
    public final long f() {
        return this.c;
    }
    
    @Override
    public final void g(final int n) {
        this.n(n, false);
    }
    
    public final void h(final int n) {
        if (n != -1) {
            this.c += n;
        }
    }
    
    public final void i(int e) {
        e += this.e;
        final int length = this.d.length;
        if (e > length) {
            e = bax.e(length + length, 65536 + e, e + 524288);
            this.d = Arrays.copyOf(this.d, e);
        }
    }
    
    @Override
    public final void j(final byte[] array, final int n, final int n2) {
        this.o(array, n, n2, false);
    }
    
    @Override
    public final void k(final byte[] array, final int n, final int n2) {
        this.p(array, n, n2, false);
    }
    
    @Override
    public final void l() {
        this.e = 0;
    }
    
    @Override
    public final void m(final int n) {
        int n2;
        for (n2 = this.c(n); n2 < n && n2 != -1; n2 = this.b(this.a, -n2, Math.min(n, n2 + 4096), n2, false)) {}
        this.h(n2);
    }
    
    public final boolean n(final int n, final boolean b) {
        this.i(n);
        int i = this.f - this.e;
        while (i < n) {
            i = this.b(this.d, this.e, n, i, b);
            if (i == -1) {
                return false;
            }
            this.f = this.e + i;
        }
        this.e += n;
        return true;
    }
    
    @Override
    public final boolean o(final byte[] array, final int n, final int n2, final boolean b) {
        if (!this.n(n2, b)) {
            return false;
        }
        System.arraycopy(this.d, this.e - n2, array, n, n2);
        return true;
    }
    
    @Override
    public final boolean p(final byte[] array, final int n, final int n2, final boolean b) {
        int n3;
        for (n3 = this.q(array, n, n2); n3 < n2 && n3 != -1; n3 = this.b(array, n, n2, n3, b)) {}
        this.h(n3);
        return n3 != -1;
    }
}
