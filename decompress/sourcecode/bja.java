import androidx.media3.extractor.metadata.emsg.EventMessage;

// 
// Decompiled by Procyon v0.6.0
// 

final class bja implements bov
{
    public der a;
    private final ayf b;
    private long[] c;
    private boolean d;
    private boolean e;
    private int f;
    private long g;
    private final dmk h;
    
    public bja(final der a, final ayf b, final boolean b2, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.h = new dmk(null, (byte[])null);
        this.g = -9223372036854775807L;
        this.c = (long[])a.c;
        this.f(a, b2);
    }
    
    public final int a(final long n) {
        return (this.f = Math.max(this.f, baw.au(this.c, n, true))) - this.f;
    }
    
    public final void b() {
    }
    
    public final void c(long g) {
        final int au = baw.au(this.c, g, true);
        this.f = au;
        if (!this.d || au != this.c.length) {
            g = -9223372036854775807L;
        }
        this.g = g;
    }
    
    public final int e(final bxb bxb, final bdb bdb, final int n) {
        final int f = this.f;
        final boolean b = f == this.c.length;
        if (b && !this.d) {
            ((bcv)bdb).setFlags(4);
            return -4;
        }
        if ((n & 0x2) != 0x0 || !this.e) {
            bxb.a = this.b;
            this.e = true;
            return -5;
        }
        if (b) {
            return -3;
        }
        if ((n & 0x1) == 0x0) {
            this.f = f + 1;
        }
        if ((n & 0x4) == 0x0) {
            final byte[] f2 = this.h.F(((EventMessage[])this.a.d)[f]);
            bdb.b(f2.length);
            bdb.c.put(f2);
        }
        bdb.e = this.c[f];
        ((bcv)bdb).setFlags(1);
        return -4;
    }
    
    public final void f(final der a, final boolean d) {
        final int f = this.f;
        long n;
        if (f == 0) {
            n = -9223372036854775807L;
        }
        else {
            n = this.c[f - 1];
        }
        this.d = d;
        this.a = a;
        final long[] c = (long[])a.c;
        this.c = c;
        final long g = this.g;
        if (g != -9223372036854775807L) {
            this.c(g);
            return;
        }
        if (n != -9223372036854775807L) {
            this.f = baw.au(c, n, false);
        }
    }
    
    public final boolean la() {
        return true;
    }
}
