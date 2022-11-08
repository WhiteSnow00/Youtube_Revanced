// 
// Decompiled by Procyon v0.6.0
// 

public final class bpn implements bov
{
    public final bpp a;
    final /* synthetic */ bpp b;
    private final bou c;
    private final int d;
    private boolean e;
    
    public bpn(final bpp b, final bpp a, final bou c, final int d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    private final void f() {
        if (!this.e) {
            final bpp b = this.b;
            final bny f = b.f;
            final int[] b2 = b.b;
            final int d = this.d;
            f.d(b2[d], b.c[d], 0, (Object)null, b.h);
            this.e = true;
        }
    }
    
    public final int a(final long n) {
        final bpp b = this.b;
        if (b.k()) {
            return 0;
        }
        final int h = this.c.h(n, b.i);
        this.c.y(h);
        if (h > 0) {
            this.f();
        }
        return h;
    }
    
    public final void b() {
    }
    
    public final void c() {
        dk.h(this.b.d[this.d]);
        this.b.d[this.d] = false;
    }
    
    public final int e(final bxb bxb, final bdb bdb, final int n) {
        if (this.b.k()) {
            return -3;
        }
        this.f();
        return this.c.E(bxb, bdb, n, this.b.i);
    }
    
    public final boolean la() {
        final bpp b = this.b;
        return !b.k() && this.c.A(b.i);
    }
}
