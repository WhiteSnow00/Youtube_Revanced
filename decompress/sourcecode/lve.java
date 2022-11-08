// 
// Decompiled by Procyon v0.6.0
// 

public final class lve
{
    private static final long[] b;
    public int a;
    private final byte[] c;
    private int d;
    
    static {
        b = new long[] { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
    }
    
    public lve() {
        this.c = new byte[8];
    }
    
    public static int a(final int n) {
        int i = 0;
        while (i < 8) {
            final long n2 = lve.b[i];
            final long n3 = n;
            final int n4 = ++i;
            if ((n2 & n3) != 0x0L) {
                return n4;
            }
        }
        return -1;
    }
    
    public static long b(final byte[] array, final int n, final boolean b) {
        long n3;
        final long n2 = n3 = ((long)array[0] & 0xFFL);
        if (b) {
            n3 = (n2 & ~lve.b[n - 1]);
        }
        for (int i = 1; i < n; ++i) {
            n3 = (n3 << 8 | ((long)array[i] & 0xFFL));
        }
        return n3;
    }
    
    public final void c() {
        this.d = 0;
        this.a = 0;
    }
    
    public final long d(final lsh lsh, final boolean b, final boolean b2, final int n) {
        if (this.d == 0) {
            if (!lsh.l(this.c, 0, 1, b)) {
                return -1L;
            }
            if ((this.a = a(this.c[0] & 0xFF)) == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.d = 1;
        }
        final int a = this.a;
        if (a > n) {
            this.d = 0;
            return -2L;
        }
        if (a != 1) {
            lsh.g(this.c, 1, a - 1);
        }
        this.d = 0;
        return b(this.c, this.a, b2);
    }
}
