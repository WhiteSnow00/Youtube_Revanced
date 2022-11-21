// 
// Decompiled by Procyon v0.6.0
// 

final class bwy implements bxd
{
    public long a;
    private final bts b;
    private long c;
    private final dmo d;
    
    public bwy(final bts b, final dmo d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.a = -1L;
        this.c = -1L;
    }
    
    public final long a(final btn btn) {
        final long c = this.c;
        if (c >= 0L) {
            this.c = -1L;
            return -(c + 2L);
        }
        return -1L;
    }
    
    public final bud b() {
        bad.f(this.a != -1L);
        return (bud)new btr(this.b, this.a);
    }
    
    public final void c(final long n) {
        final long[] array = (long[])this.d.a;
        this.c = array[baz.av(array, n, true)];
    }
}
