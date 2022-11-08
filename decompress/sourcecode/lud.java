// 
// Decompiled by Procyon v0.6.0
// 

final class lud
{
    public final byte[] a;
    private final int b;
    private int c;
    private int d;
    
    public lud(final byte[] a) {
        final int length = a.length;
        this.a = a;
        this.b = length * 8;
    }
    
    public final int a() {
        return this.c * 8 + this.d;
    }
    
    public final int b(int n) {
        final int a = this.a();
        final int b = this.b;
        int n2 = 0;
        jfi.U(a + n <= b);
        if (n == 0) {
            return 0;
        }
        final int d = this.d;
        int n4;
        int n5;
        if (d != 0) {
            final int min = Math.min(n, 8 - d);
            final byte[] a2 = this.a;
            final int c = this.c;
            final byte b2 = a2[c];
            final int d2 = this.d;
            final int n3 = b2 >>> d2 & 255 >>> 8 - min;
            final int d3 = d2 + min;
            this.d = d3;
            n4 = min;
            n5 = n3;
            if (d3 == 8) {
                this.c = c + 1;
                this.d = 0;
                n4 = min;
                n5 = n3;
            }
        }
        else {
            n4 = 0;
            n5 = 0;
        }
        final int n6 = n - n4;
        int n7 = n4;
        int n8 = n5;
        if (n6 > 7) {
            while (true) {
                n7 = n4;
                n8 = n5;
                if (n2 >= n6 >> 3) {
                    break;
                }
                n5 = (int)(((long)this.a[this.c++] & 0xFFL) << n4 | (long)n5);
                n4 += 8;
                ++n2;
            }
        }
        if (n > n7) {
            n -= n7;
            final byte b3 = this.a[this.c];
            this.d += n;
            return (255 >>> 8 - n & b3) << n7 | n8;
        }
        return n8;
    }
    
    public final void c(int d) {
        jfi.U(this.a() + d <= this.b);
        final int c = this.c + d / 8;
        this.c = c;
        d = this.d + d % 8;
        this.d = d;
        if (d > 7) {
            this.c = c + 1;
            this.d = d - 8;
        }
    }
    
    public final boolean d() {
        return this.b(1) == 1;
    }
}
