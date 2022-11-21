// 
// Decompiled by Procyon v0.6.0
// 

public final class btw implements bud
{
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;
    
    public btw(final long[] a, final long[] b, final long c) {
        final int length = a.length;
        final int length2 = b.length;
        bad.d(length == length2);
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
    
    public final bub b(final long n) {
        if (!this.d) {
            final bue a = bue.a;
            return new bub(a, a);
        }
        int av = baz.av(this.b, n, true);
        final bue bue = new bue(this.b[av], this.a[av]);
        if (bue.b != n) {
            final long[] b = this.b;
            if (av != b.length - 1) {
                ++av;
                return new bub(bue, new bue(b[av], this.a[av]));
            }
        }
        return new bub(bue, bue);
    }
    
    public final boolean c() {
        return this.d;
    }
}
