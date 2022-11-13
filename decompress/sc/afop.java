// 
// Decompiled by Procyon v0.6.0
// 

public final class afop extends afoe
{
    public int a;
    public long b;
    public int c;
    public boolean d;
    private int e;
    
    public afop(final int a) {
        this.a = a;
        this.c = 0;
        this.d = false;
    }
    
    public final void a(final byte[] array, final int n) {
        final int length = array.length;
        int n2 = 0;
        adkp.P(0, n, length);
        int i;
        while (true) {
            final int n3 = n2 + 4;
            i = n2;
            if (n3 > n) {
                break;
            }
            final afoi a = afoq.a;
            this.c(4, (array[n2] & 0xFF) | (array[n2 + 3] << 24 | (array[n2 + 2] & 0xFF) << 16 | (array[n2 + 1] & 0xFF) << 8));
            n2 = n3;
        }
        while (i < n) {
            this.c(1, array[i] & 0xFF);
            ++i;
        }
    }
    
    public final void b(final char c) {
        this.c(2, c);
    }
    
    public final void c(int a, long b) {
        final long b2 = this.b;
        final int e = this.e;
        b = ((b & 0xFFFFFFFFL) << e | b2);
        this.b = b;
        final int e2 = e + a * 8;
        this.e = e2;
        this.c += a;
        if (e2 >= 32) {
            a = this.a;
            this.a = Integer.rotateLeft(afoq.b((int)b) ^ a, 13) * 5 - 430675100;
            this.b >>>= 32;
            this.e -= 32;
        }
    }
    
    public final afoh g() {
        throw null;
    }
}
