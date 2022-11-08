// 
// Decompiled by Procyon v0.6.0
// 

final class caj
{
    public final bav a;
    public final bar b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    public caj() {
        this.a = new bav(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new bar();
    }
    
    public caj(final byte[] array) {
        this.a = new bav(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new bar();
    }
    
    public static long b(final bar bar) {
        final int b = bar.b;
        if (bar.a() < 9) {
            return -9223372036854775807L;
        }
        final byte[] array = new byte[9];
        bar.B(array, 0, 9);
        bar.G(b);
        final byte b2 = array[0];
        if ((b2 & 0xC4) == 0x44) {
            final byte b3 = array[2];
            if ((b3 & 0x4) == 0x4) {
                final byte b4 = array[4];
                if ((b4 & 0x4) == 0x4 && (array[5] & 0x1) == 0x1 && (array[8] & 0x3) == 0x3) {
                    final long n = b2;
                    final byte b5 = array[1];
                    final long n2 = b3;
                    return ((long)b5 & 0xFFL) << 20 | ((n & 0x3L) << 28 | (0x38L & n) >> 3 << 30) | (n2 & 0xF8L) >> 3 << 15 | (n2 & 0x3L) << 13 | ((long)array[3] & 0xFFL) << 5 | (0xF8L & (long)b4) >> 3;
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public static final int d(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public final void a(final btj btj) {
        this.b.D(baw.e);
        this.c = true;
        btj.l();
    }
    
    public final void c(final btj btj) {
        this.b.D(baw.e);
        this.c = true;
        btj.l();
    }
}
