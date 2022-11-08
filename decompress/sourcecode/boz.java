// 
// Decompiled by Procyon v0.6.0
// 

final class boz implements bov
{
    private final long a;
    private boolean b;
    private long c;
    
    public boz(final long n) {
        this.a = bpa.b(n);
        this.c(0L);
    }
    
    public final int a(final long n) {
        final long c = this.c;
        this.c(n);
        return (int)((this.c - c) / bpa.b.length);
    }
    
    public final void b() {
    }
    
    public final void c(final long n) {
        this.c = baw.r(bpa.b(n), 0L, this.a);
    }
    
    public final int e(final bxb bxb, final bdb bdb, final int n) {
        if (!this.b || (n & 0x2) != 0x0) {
            bxb.a = bpa.a;
            this.b = true;
            return -5;
        }
        final long a = this.a;
        final long c = this.c;
        final long n2 = a - c;
        if (n2 == 0L) {
            ((bcv)bdb).addFlag(4);
            return -4;
        }
        final ayf a2 = bpa.a;
        bdb.e = c / baw.m(2, 2) * 1000000L / 44100L;
        ((bcv)bdb).addFlag(1);
        final int n3 = (int)Math.min(bpa.b.length, n2);
        if ((n & 0x4) == 0x0) {
            bdb.b(n3);
            bdb.c.put(bpa.b, 0, n3);
        }
        if ((n & 0x1) == 0x0) {
            this.c += n3;
        }
        return -4;
    }
    
    public final boolean la() {
        return true;
    }
}
