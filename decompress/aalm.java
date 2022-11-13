// 
// Decompiled by Procyon v0.6.0
// 

public final class aalm
{
    private final oby a;
    private final xao b;
    private boolean c;
    private long d;
    private aezp e;
    private final msr f;
    
    public aalm(final oby a, final xao b, final msr f, final byte[] array) {
        this.e = (aezp)aeyo.a;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
    }
    
    public final void a(final ashi ashi, final ashi ashi2) {
        final asiq asiq = new asiq();
        asiq.c(aale.o(ashi2, (aezf)aalg.i).an((asjm)new aakj(this, 19), (asjm)aaof.b));
        asiq.c(aale.o(ashi2, (aezf)aalg.l).an((asjm)new aakj(this, 20), (asjm)aaof.b));
        asiq.c(aale.o(ashi2, (aezf)aalg.m).an((asjm)new aaoe(this, 1), (asjm)aaof.b));
        asiq.c(aale.o(ashi2, (aezf)aalg.j).an((asjm)new aakj(this, 17), (asjm)aaof.b));
        asiq.c(aale.o(ashi, (aezf)aalg.k).am((asjm)new aakj(this, 18)));
    }
    
    public final void b(final aamg aamg) {
        if (this.c) {
            synchronized (this) {
                if (this.f.x(0.0, 1.0) < 0.10000000149011612) {
                    final xao b = this.b;
                    final long d = this.d;
                    final aezp e = this.e;
                    if (e.h()) {
                        final aami aami = (aami)e.c();
                        final xan c = b.c(almx.bY);
                        c.f(d);
                        c.d(((tfh)aami).f(), ((aamg)aami).a());
                        c.d(aamg.f(), aamg.a());
                    }
                }
                monitorexit(this);
                this.c();
            }
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.c = false;
            this.e = (aezp)aeyo.a;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.d = this.a.c();
            this.c = true;
        }
    }
    
    public final void e(final aami aami) {
        synchronized (this) {
            if (this.c) {
                this.e = aezp.k((Object)aami);
            }
        }
    }
}
