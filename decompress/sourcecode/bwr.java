// 
// Decompiled by Procyon v0.6.0
// 

final class bwr
{
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    public final long g;
    public final lyo h;
    
    public bwr(final lyo h, final long[] b, final int[] c, int d, final long[] e, final int[] f, final long g, final byte[] array) {
        final int length = c.length;
        final int length2 = e.length;
        final boolean b2 = true;
        dk.f(length == length2);
        final int length3 = b.length;
        dk.f(length3 == length2);
        final int length4 = f.length;
        dk.f(length4 == length2 && b2);
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = length3;
        if (length4 > 0) {
            d = length4 - 1;
            f[d] |= 0x20000000;
        }
    }
    
    public final int a(final long n) {
        for (int i = baw.av(this.e, n, false); i >= 0; --i) {
            if ((this.f[i] & 0x1) != 0x0) {
                return i;
            }
        }
        return -1;
    }
    
    public final int b(final long n) {
        for (int i = baw.au(this.e, n, true); i < this.e.length; ++i) {
            if ((this.f[i] & 0x1) != 0x0) {
                return i;
            }
        }
        return -1;
    }
}
