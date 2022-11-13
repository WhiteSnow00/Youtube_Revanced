// 
// Decompiled by Procyon v0.6.0
// 

public final class cad implements cah
{
    private ayg a;
    private baw b;
    private bud c;
    
    public cad(final String k) {
        final ayf ayf = new ayf();
        ayf.k = k;
        this.a = ayf.a();
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.b);
        final int a = bax.a;
        final long d = this.b.d();
        final long e = this.b.e();
        if (d != -9223372036854775807L) {
            if (e != -9223372036854775807L) {
                final ayg a2 = this.a;
                if (e != a2.r) {
                    final ayf b = a2.b();
                    b.o = e;
                    final ayg a3 = b.a();
                    this.a = a3;
                    this.c.b(a3);
                }
                final int a4 = bas.a();
                this.c.c(bas, a4);
                this.c.e(d, 1, a4, 0, (buc)null);
            }
        }
    }
    
    public final void b(final baw b, final btm btm, final cao cao) {
        this.b = b;
        cao.c();
        (this.c = btm.q(cao.a(), 5)).b(this.a);
    }
}
