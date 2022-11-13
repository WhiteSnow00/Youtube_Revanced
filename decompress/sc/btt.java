// 
// Decompiled by Procyon v0.6.0
// 

public final class btt implements bua
{
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;
    
    public btt(final long[] a, final long[] b, final long c) {
        final int length = a.length;
        final int length2 = b.length;
        dk.f(length == length2);
        final boolean d = length2 > 0;
        this.d = d;
        if (d && b[0] > 0L) {
            final int n = length2 + 1;
            final long[] a2 = new long[n];
            this.a = a2;
            final long[] b2 = new long[n];
            this.b = b2;
            System.arraycopy(a, 0, a2, 1, length2);
            System.arraycopy(b, 0, b2, 1, length2);
        }
        else {
            this.a = a;
            this.b = b;
        }
        this.c = c;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final bty b(final long n) {
        if (!this.d) {
            final bub a = bub.a;
            return new bty(a, a);
        }
        int av = bax.av(this.b, n, true);
        final bub bub = new bub(this.b[av], this.a[av]);
        if (bub.b != n) {
            final long[] b = this.b;
            if (av != b.length - 1) {
                ++av;
                return new bty(bub, new bub(b[av], this.a[av]));
            }
        }
        return new bty(bub, bub);
    }
    
    public final boolean c() {
        return this.d;
    }
}
