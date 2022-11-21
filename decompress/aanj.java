// 
// Decompiled by Procyon v0.6.0
// 

public final class aanj
{
    private final oco a;
    private final xbu b;
    private boolean c;
    private long d;
    private afbh e;
    private final aefs f;
    
    public aanj(final oco a, final xbu b, final aefs f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.e = afag.a;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
    }
    
    public final void a(final aske aske, final aske aske2) {
        final aslm aslm = new aslm();
        aslm.c(aana.o(aske2, aanc.h).an(new aani(this, 2), aaqb.b));
        aslm.c(aana.o(aske2, aanc.k).an(new aani(this, 3), aaqb.b));
        aslm.c(aana.o(aske2, aanc.l).an(new aani(this, 4), aaqb.b));
        aslm.c(aana.o(aske2, aanc.i).an(new aani(this, 1), aaqb.b));
        aslm.c(aana.o(aske, aanc.j).am(new aani(this, 0)));
    }
    
    public final void b(final aaod aaod) {
        if (this.c) {
            synchronized (this) {
                if (this.f.ct(0.0, 1.0) < 0.10000000149011612) {
                    final xbu b = this.b;
                    final long d = this.d;
                    final afbh e = this.e;
                    if (e.h()) {
                        final aaof aaof = (aaof)e.c();
                        final xbt c = b.c(alox.ca);
                        c.f(d);
                        c.d(aaof.f(), aaof.a());
                        c.d(aaod.f(), aaod.a());
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
            this.e = afag.a;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.d = this.a.c();
            this.c = true;
        }
    }
    
    public final void e(final aaof aaof) {
        synchronized (this) {
            if (this.c) {
                this.e = afbh.k(aaof);
            }
        }
    }
}
