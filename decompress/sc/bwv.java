// 
// Decompiled by Procyon v0.6.0
// 

final class bwv implements bxa
{
    public long a;
    private final btp b;
    private long c;
    private final dml d;
    
    public bwv(final btp b, final dml d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.a = -1L;
        this.c = -1L;
    }
    
    public final long a(final btk btk) {
        final long c = this.c;
        if (c >= 0L) {
            this.c = -1L;
            return -(c + 2L);
        }
        return -1L;
    }
    
    public final bua b() {
        dk.h(this.a != -1L);
        return (bua)new bto(this.b, this.a);
    }
    
    public final void c(final long n) {
        final long[] array = (long[])this.d.a;
        this.c = array[bax.av(array, n, true)];
    }
}
