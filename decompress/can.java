// 
// Decompiled by Procyon v0.6.0
// 

final class can
{
    public final bay a;
    public final bat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    public can() {
        this.a = new bay(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new bat();
    }
    
    public can(final byte[] array) {
        this.a = new bay(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new bat();
    }
    
    public static long b(final bat bat) {
        final int b = bat.b;
        if (bat.a() < 9) {
            return -9223372036854775807L;
        }
        final byte[] array = new byte[9];
        bat.B(array, 0, 9);
        bat.G(b);
        final byte b2 = array[0];
        if ((b2 & 0xC4) == 0x44) {
            final byte b3 = array[2];
            if ((b3 & 0x4) == 0x4) {
                final byte b4 = array[4];
                if ((b4 & 0x4) == 0x4 && (array[5] & 0x1) == 0x1 && (array[8] & 0x3) == 0x3) {
                    final long n = b2;
                    final long n2 = array[1];
                    final long n3 = b3;
                    return (n3 & 0x3L) << 13 | ((n & 0x3L) << 28 | (0x38L & n) >> 3 << 30 | (n2 & 0xFFL) << 20 | (n3 & 0xF8L) >> 3 << 15) | ((long)array[3] & 0xFFL) << 5 | ((long)b4 & 0xF8L) >> 3;
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public static final int d(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public final void a(final btn btn) {
        this.b.D(baz.e);
        this.c = true;
        btn.l();
    }
    
    public final void c(final btn btn) {
        this.b.D(baz.e);
        this.c = true;
        btn.l();
    }
}
