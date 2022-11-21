// 
// Decompiled by Procyon v0.6.0
// 

public final class bpr implements boz
{
    public final bpt a;
    final bpt b;
    private final boy c;
    private final int d;
    private boolean e;
    
    public bpr(final bpt b, final bpt a, final boy c, final int d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    private final void f() {
        if (!this.e) {
            final bpt b = this.b;
            final boc f = b.f;
            final int[] b2 = b.b;
            final int d = this.d;
            f.d(b2[d], b.c[d], 0, null, b.h);
            this.e = true;
        }
    }
    
    @Override
    public final int a(final long n) {
        final bpt b = this.b;
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
    
    @Override
    public final void b() {
    }
    
    public final void c() {
        bad.f(this.b.d[this.d]);
        this.b.d[this.d] = false;
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, final int n) {
        if (this.b.k()) {
            return -3;
        }
        this.f();
        return this.c.E(bxf, bde, n, this.b.i);
    }
    
    @Override
    public final boolean la() {
        final bpt b = this.b;
        return !b.k() && this.c.A(b.i);
    }
}
