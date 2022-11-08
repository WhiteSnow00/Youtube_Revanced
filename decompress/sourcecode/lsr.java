// 
// Decompiled by Procyon v0.6.0
// 

final class lsr
{
    public int a;
    public int b;
    public int c;
    public int d;
    private int e;
    private long[] f;
    private int[] g;
    private int[] h;
    private long[] i;
    private byte[][] j;
    
    public lsr() {
        this.e = 1000;
        this.f = new long[1000];
        this.i = new long[1000];
        this.h = new int[1000];
        this.g = new int[1000];
        this.j = new byte[1000][];
    }
    
    public final long a() {
        synchronized (this) {
            final int a = this.a - 1;
            this.a = a;
            final int c = this.c;
            final int c2 = c + 1;
            this.c = c2;
            ++this.b;
            int n = c2;
            if (c2 == this.e) {
                n = 0;
                this.c = 0;
            }
            long n2;
            if (a > 0) {
                n2 = this.f[n];
            }
            else {
                n2 = this.g[c] + this.f[c];
            }
            return n2;
        }
    }
    
    public final long b(long n) {
        monitorenter(this);
        try {
            if (this.a != 0) {
                final long[] i = this.i;
                int c = this.c;
                if (n >= i[c]) {
                    int n2;
                    if ((n2 = this.d) == 0) {
                        n2 = this.e;
                    }
                    if (n > i[n2 - 1]) {
                        monitorexit(this);
                        return -1L;
                    }
                    int n3 = 0;
                    int n4 = -1;
                    while (c != this.d && this.i[c] <= n) {
                        if (0x1 == (this.h[c] & 0x1)) {
                            n4 = n3;
                        }
                        c = (c + 1) % this.e;
                        ++n3;
                    }
                    if (n4 == -1) {
                        monitorexit(this);
                        return -1L;
                    }
                    this.a -= n4;
                    final int c2 = (this.c + n4) % this.e;
                    this.c = c2;
                    this.b += n4;
                    n = this.f[c2];
                    monitorexit(this);
                    return n;
                }
            }
            monitorexit(this);
            return -1L;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final long n, int n2, final long n3, int d, final byte[] array) {
        synchronized (this) {
            final long[] i = this.i;
            final int d2 = this.d;
            i[d2] = n;
            final long[] f = this.f;
            f[d2] = n3;
            this.g[d2] = d;
            this.h[d2] = n2;
            this.j[d2] = array;
            d = this.a + 1;
            this.a = d;
            n2 = this.e;
            if (d == n2) {
                d = n2 + 1000;
                final long[] f2 = new long[d];
                final long[] j = new long[d];
                final int[] h = new int[d];
                final int[] g = new int[d];
                final byte[][] k = new byte[d][];
                final int c = this.c;
                n2 -= c;
                System.arraycopy(f, c, f2, 0, n2);
                System.arraycopy(this.i, this.c, j, 0, n2);
                System.arraycopy(this.h, this.c, h, 0, n2);
                System.arraycopy(this.g, this.c, g, 0, n2);
                System.arraycopy(this.j, this.c, k, 0, n2);
                final int c2 = this.c;
                System.arraycopy(this.f, 0, f2, n2, c2);
                System.arraycopy(this.i, 0, j, n2, c2);
                System.arraycopy(this.h, 0, h, n2, c2);
                System.arraycopy(this.g, 0, g, n2, c2);
                System.arraycopy(this.j, 0, k, n2, c2);
                this.f = f2;
                this.i = j;
                this.h = h;
                this.g = g;
                this.j = k;
                this.c = 0;
                n2 = this.e;
                this.d = n2;
                this.a = n2;
                this.e = d;
                return;
            }
            d = d2 + 1;
            if ((this.d = d) == n2) {
                this.d = 0;
            }
        }
    }
    
    public final boolean d(final lrm lrm, final argq argq) {
        synchronized (this) {
            if (this.a == 0) {
                return false;
            }
            final long[] i = this.i;
            final int c = this.c;
            lrm.e = i[c];
            lrm.c = this.g[c];
            lrm.d = this.h[c];
            argq.a = this.f[c];
            argq.b = this.j[c];
            return true;
        }
    }
}
