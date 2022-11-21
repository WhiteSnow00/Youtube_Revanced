// 
// Decompiled by Procyon v0.6.0
// 

public final class cag implements cak
{
    private ayh a;
    private bay b;
    private bug c;
    
    public cag(final String k) {
        final ayg ayg = new ayg();
        ayg.k = k;
        this.a = ayg.a();
    }
    
    @Override
    public final void a(final bat bat) {
        bad.c(this.b);
        final int a = baz.a;
        final long d = this.b.d();
        final long e = this.b.e();
        if (d != -9223372036854775807L) {
            if (e != -9223372036854775807L) {
                final ayh a2 = this.a;
                if (e != a2.r) {
                    final ayg b = a2.b();
                    b.o = e;
                    final ayh a3 = b.a();
                    this.a = a3;
                    this.c.b(a3);
                }
                final int a4 = bat.a();
                this.c.c(bat, a4);
                this.c.e(d, 1, a4, 0, (buf)null);
            }
        }
    }
    
    @Override
    public final void b(final bay b, final btp btp, final car car) {
        this.b = b;
        car.c();
        (this.c = btp.q(car.a(), 5)).b(this.a);
    }
}
