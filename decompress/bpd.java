// 
// Decompiled by Procyon v0.6.0
// 

final class bpd implements boz
{
    private final long a;
    private boolean b;
    private long c;
    
    public bpd(final long n) {
        this.a = bpe.b(n);
        this.c(0L);
    }
    
    @Override
    public final int a(final long n) {
        final long c = this.c;
        this.c(n);
        return (int)((this.c - c) / bpe.b.length);
    }
    
    @Override
    public final void b() {
    }
    
    public final void c(final long n) {
        this.c = baz.r(bpe.b(n), 0L, this.a);
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, final int n) {
        if (!this.b || (n & 0x2) != 0x0) {
            bxf.a = bpe.a;
            this.b = true;
            return -5;
        }
        final long a = this.a;
        final long c = this.c;
        final long n2 = a - c;
        if (n2 == 0L) {
            ((bcy)bde).addFlag(4);
            return -4;
        }
        final ayh a2 = bpe.a;
        bde.e = c / baz.m(2, 2) * 1000000L / 44100L;
        ((bcy)bde).addFlag(1);
        final int n3 = (int)Math.min(bpe.b.length, n2);
        if ((n & 0x4) == 0x0) {
            bde.b(n3);
            bde.c.put(bpe.b, 0, n3);
        }
        if ((n & 0x1) == 0x0) {
            this.c += n3;
        }
        return -4;
    }
    
    @Override
    public final boolean la() {
        return true;
    }
}
