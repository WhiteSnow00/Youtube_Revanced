// 
// Decompiled by Procyon v0.6.0
// 

public final class bud
{
    public int a;
    public int b;
    private final byte[] c;
    private final int d;
    
    public bud(final byte[] c) {
        this.c = c;
        this.d = c.length;
    }
    
    public final int a(final int n) {
        final int a = this.a;
        int i = Math.min(n, 8 - this.b);
        int n2 = a + 1;
        int n3 = (this.c[a] & 0xFF) >> this.b & 255 >> 8 - i;
        while (i < n) {
            n3 |= (this.c[n2] & 0xFF) << i;
            i += 8;
            ++n2;
        }
        this.b(n);
        return -1 >>> 32 - n & n3;
    }
    
    public final void b(int b) {
        final int n = b / 8;
        final int a = this.a + n;
        this.a = a;
        final int b2 = this.b + (b - n * 8);
        this.b = b2;
        int a2 = a;
        b = b2;
        if (b2 > 7) {
            a2 = a + 1;
            this.a = a2;
            b = b2 - 8;
            this.b = b;
        }
        boolean b4;
        final boolean b3 = b4 = false;
        Label_0109: {
            if (a2 >= 0) {
                final int d = this.d;
                if (a2 >= d) {
                    b4 = b3;
                    if (a2 != d) {
                        break Label_0109;
                    }
                    b4 = b3;
                    if (b != 0) {
                        break Label_0109;
                    }
                }
                b4 = true;
            }
        }
        dk.h(b4);
    }
    
    public final boolean c() {
        final byte b = this.c[this.a];
        final int b2 = this.b;
        this.b(1);
        return 0x1 == ((b & 0xFF) >> b2 & 0x1);
    }
}
