// 
// Decompiled by Procyon v0.6.0
// 

final class bmu implements bov
{
    public final bov a;
    public boolean b;
    final /* synthetic */ bmv c;
    
    public bmu(final bmv c, final bov a) {
        this.c = c;
        this.a = a;
    }
    
    public final int a(final long n) {
        if (this.c.p()) {
            return -3;
        }
        return this.a.a(n);
    }
    
    public final void b() {
        this.a.b();
    }
    
    public final int e(final bxb bxb, final bdb bdb, int e) {
        if (this.c.p()) {
            return -3;
        }
        if (this.b) {
            ((bcv)bdb).setFlags(4);
            return -4;
        }
        e = this.a.e(bxb, bdb, e);
        if (e == -5) {
            final ayf a = bxb.a;
            dk.d((Object)a);
            final int d = a.D;
            int e2 = 0;
            if ((e = d) == 0) {
                if (a.E == 0) {
                    return -5;
                }
                e = 0;
            }
            final bmv c = this.c;
            if (c.b != 0L) {
                e = 0;
            }
            if (c.c == Long.MIN_VALUE) {
                e2 = a.E;
            }
            final aye b = a.b();
            b.A = e;
            b.B = e2;
            bxb.a = b.a();
            return -5;
        }
        final bmv c2 = this.c;
        final long c3 = c2.c;
        if (c3 != Long.MIN_VALUE && ((e == -4 && bdb.e >= c3) || (e == -3 && c2.c() == Long.MIN_VALUE && !bdb.d))) {
            ((bcv)bdb).clear();
            ((bcv)bdb).setFlags(4);
            this.b = true;
            return -4;
        }
        return e;
    }
    
    public final boolean la() {
        return !this.c.p() && this.a.la();
    }
}
