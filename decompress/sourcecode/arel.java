import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arel
{
    final int a;
    int b;
    private final ByteBuffer c;
    
    public arel(final ByteBuffer c) {
        this.b = 0;
        this.c = c;
        this.a = c.position();
    }
    
    public arel(final ByteBuffer c, final byte[] array) {
        this.c = c;
        this.a = c.position();
    }
    
    public final void a(int b, int a) {
        final int b2 = this.b;
        final int n = 8 - b2 % 8;
        final int n2 = 1;
        if (a <= n) {
            final byte value = this.c.get(this.a + b2 / 8);
            int n3;
            if ((n3 = value) < 0) {
                n3 = value + 256;
            }
            final int n4 = n3 + (b << n - a);
            final ByteBuffer c = this.c;
            final int a2 = this.a;
            final int n5 = this.b / 8;
            if ((b = n4) > 127) {
                b = n4 - 256;
            }
            c.put(a2 + n5, (byte)b);
            this.b += a;
        }
        else {
            a -= n;
            this.a(b >> a, n);
            this.a(b & (1 << a) - 1, a);
        }
        final ByteBuffer c2 = this.c;
        a = this.a;
        b = this.b;
        final int n6 = b / 8;
        if (b % 8 > 0) {
            b = n2;
        }
        else {
            b = 0;
        }
        c2.position(a + n6 + b);
    }
    
    public final int b(int n) {
        int value;
        final byte b = (byte)(value = this.c.get(this.a + this.b / 8));
        if (b < 0) {
            value = b + 256;
        }
        final int b2 = this.b;
        final int n2 = b2 % 8;
        final int n3 = 8 - n2;
        if (n <= n3) {
            final int n4 = (value << n2 & 0xFF) >> n2 + (n3 - n);
            this.b = b2 + n;
            n = n4;
        }
        else {
            n -= n3;
            n = (this.b(n3) << n) + this.b(n);
        }
        final ByteBuffer c = this.c;
        final int a = this.a;
        final double n5 = this.b;
        Double.isNaN(n5);
        c.position(a + (int)Math.ceil(n5 / 8.0));
        return n;
    }
    
    public final int c() {
        return this.c.limit() * 8 - this.b;
    }
}
