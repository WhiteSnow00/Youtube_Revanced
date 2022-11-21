// 
// Decompiled by Procyon v0.6.0
// 

final class bmy implements boz
{
    public final boz a;
    public boolean b;
    final bmz c;
    
    public bmy(final bmz c, final boz a) {
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final int a(final long n) {
        if (this.c.p()) {
            return -3;
        }
        return this.a.a(n);
    }
    
    @Override
    public final void b() {
        this.a.b();
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, int e) {
        if (this.c.p()) {
            return -3;
        }
        if (this.b) {
            ((bcy)bde).setFlags(4);
            return -4;
        }
        e = this.a.e(bxf, bde, e);
        if (e == -5) {
            final ayh a = bxf.a;
            bad.b(a);
            final int d = a.D;
            int e2 = 0;
            if ((e = d) == 0) {
                if (a.E == 0) {
                    return -5;
                }
                e = 0;
            }
            final bmz c = this.c;
            if (c.b != 0L) {
                e = 0;
            }
            if (c.c == Long.MIN_VALUE) {
                e2 = a.E;
            }
            final ayg b = a.b();
            b.A = e;
            b.B = e2;
            bxf.a = b.a();
            return -5;
        }
        final bmz c2 = this.c;
        final long c3 = c2.c;
        if (c3 != Long.MIN_VALUE && ((e == -4 && bde.e >= c3) || (e == -3 && c2.c() == Long.MIN_VALUE && !bde.d))) {
            ((bcy)bde).clear();
            ((bcy)bde).setFlags(4);
            this.b = true;
            return -4;
        }
        return e;
    }
    
    @Override
    public final boolean la() {
        return !this.c.p() && this.a.la();
    }
}
