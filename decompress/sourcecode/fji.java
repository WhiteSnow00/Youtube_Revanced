import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fji
{
    public final oas a;
    public Object b;
    public long c;
    public dbi d;
    public znj e;
    private final atjj f;
    private vii g;
    private String h;
    
    protected fji(final atjj f, final oas a) {
        this.f = f;
        a.getClass();
        this.a = a;
        agot.u(true);
    }
    
    private final boolean n() {
        return this.b != null && this.c + 60000L >= this.a.d();
    }
    
    public final fjh a(final vii vii) {
        vii.getClass();
        return new fjh(ashp.r((ashr)new hri(this, vii, 1)).M((asjc)new fdk(this, vii, 3)).o(), this.d(vii));
    }
    
    public final znj b() {
        final znj e = this.e;
        this.e = null;
        return e;
    }
    
    public asgy c(final vii vii, final Throwable t) {
        return asgy.t();
    }
    
    protected asgy d(final vii vii) {
        return asgy.t();
    }
    
    public final void e(final vii g) {
        if (!this.n()) {
            this.b = null;
            this.c = 0L;
        }
        if (this.m(g)) {
            return;
        }
        if (this.g != null) {
            this.j();
        }
        this.g = g;
        this.h = g.b();
        this.i((vkm)this.f.a(), this.g, (znj)new huq(this, g, 1));
    }
    
    public void f(final dbi dbi) {
    }
    
    public void g(final Object o) {
        throw null;
    }
    
    public final void h(final vii vii, final znj e) {
        e.getClass();
        if (!this.m(vii)) {
            this.i((vkm)this.f.a(), vii, e);
            return;
        }
        if (this.n()) {
            e.mX(this.b);
            this.j();
            return;
        }
        if (this.b != null) {
            this.i((vkm)this.f.a(), vii, e);
            this.j();
            return;
        }
        if (this.e != e) {
            this.k(new dbi((Throwable)new CancellationException()));
        }
        this.e = e;
        final dbi d = this.d;
        if (d != null) {
            this.k(d);
            this.j();
        }
    }
    
    protected abstract void i(final vkm p0, final vii p1, final znj p2);
    
    public final void j() {
        this.g = null;
        this.h = null;
        this.b = null;
        this.c = 0L;
        this.k(new dbi((Throwable)new CancellationException()));
        this.d = null;
    }
    
    public final void k(final dbi dbi) {
        final znj b = this.b();
        if (b != null) {
            b.a(dbi);
        }
    }
    
    @Deprecated
    public final boolean l() {
        return this.g != null;
    }
    
    public final boolean m(final vii vii) {
        final String b = vii.b();
        b.getClass();
        return b.equals(this.h);
    }
}
