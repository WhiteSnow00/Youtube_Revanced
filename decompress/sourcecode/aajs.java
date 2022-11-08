// 
// Decompiled by Procyon v0.6.0
// 

public final class aajs
{
    private final oas a;
    private final wyo b;
    private boolean c;
    private long d;
    private aexq e;
    private final avt f;
    
    public aajs(final oas a, final wyo b, final avt f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = (aexq)aewp.a;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
    }
    
    public final void a(final asgt asgt, final asgt asgt2) {
        final asib asib = new asib();
        asib.c(aajj.p(asgt2, (aexg)aajm.e).am((asix)new aajl(this, 14), (asix)aamk.b));
        asib.c(aajj.p(asgt2, (aexg)aajm.h).am((asix)new aajl(this, 15), (asix)aamk.b));
        asib.c(aajj.p(asgt2, (aexg)aajm.i).am((asix)new aajl(this, 16), (asix)aamk.b));
        asib.c(aajj.p(asgt2, (aexg)aajm.f).am((asix)new aajl(this, 12), (asix)aamk.b));
        asib.c(aajj.p(asgt, (aexg)aajm.g).al((asix)new aajl(this, 13)));
    }
    
    public final void b(final aakm aakm) {
        if (this.c) {
            synchronized (this) {
                if (this.f.W(0.0, 1.0) < 0.10000000149011612) {
                    final wyo b = this.b;
                    final long d = this.d;
                    final aexq e = this.e;
                    if (e.h()) {
                        final aako aako = (aako)e.c();
                        final wyn c = b.c(alku.bY);
                        c.f(d);
                        c.d(((tdc)aako).f(), ((aakm)aako).a());
                        c.d(aakm.f(), aakm.a());
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
            this.e = (aexq)aewp.a;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.d = this.a.c();
            this.c = true;
        }
    }
    
    public final void e(final aako aako) {
        synchronized (this) {
            if (this.c) {
                this.e = aexq.k(aako);
            }
        }
    }
}
