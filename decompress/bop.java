// 
// Decompiled by Procyon v0.6.0
// 

final class bop implements boz
{
    public final int a;
    final bor b;
    
    public bop(final bor b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final int a(final long n) {
        final bor b = this.b;
        final int a = this.a;
        final boolean y = b.y();
        int h = 0;
        if (!y) {
            b.t(a);
            final boy boy = b.k[a];
            h = boy.h(n, b.r);
            boy.y(h);
            if (h == 0) {
                b.u(a);
                return 0;
            }
        }
        return h;
    }
    
    @Override
    public final void b() {
        final bor b = this.b;
        b.k[this.a].t();
        b.v();
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, int e) {
        final bor b = this.b;
        final int a = this.a;
        final boolean y = b.y();
        final int n = -3;
        if (y) {
            e = n;
        }
        else {
            b.t(a);
            e = b.k[a].E(bxf, bde, e, b.r);
            if (e == -3) {
                b.u(a);
                return e;
            }
        }
        return e;
    }
    
    @Override
    public final boolean la() {
        final bor b = this.b;
        final int a = this.a;
        return !b.y() && b.k[a].A(b.r);
    }
}
