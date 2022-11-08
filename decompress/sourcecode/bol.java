// 
// Decompiled by Procyon v0.6.0
// 

final class bol implements bov
{
    public final int a;
    final /* synthetic */ bon b;
    
    public bol(final bon b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final int a(final long n) {
        final bon b = this.b;
        final int a = this.a;
        final boolean y = b.y();
        int h = 0;
        if (!y) {
            b.t(a);
            final bou bou = b.k[a];
            h = bou.h(n, b.r);
            bou.y(h);
            if (h == 0) {
                b.u(a);
                return 0;
            }
        }
        return h;
    }
    
    public final void b() {
        final bon b = this.b;
        b.k[this.a].t();
        b.v();
    }
    
    public final int e(final bxb bxb, final bdb bdb, int e) {
        final bon b = this.b;
        final int a = this.a;
        final boolean y = b.y();
        final int n = -3;
        if (y) {
            e = n;
        }
        else {
            b.t(a);
            e = b.k[a].E(bxb, bdb, e, b.r);
            if (e == -3) {
                b.u(a);
                return e;
            }
        }
        return e;
    }
    
    public final boolean la() {
        final bon b = this.b;
        final int a = this.a;
        return !b.y() && b.k[a].A(b.r);
    }
}
