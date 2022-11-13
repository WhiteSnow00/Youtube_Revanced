import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fjo
{
    public final oby a;
    public Object b;
    public long c;
    public dbj d;
    public zpf e;
    private final atke f;
    private vkk g;
    private String h;
    
    protected fjo(final atke f, final oby a) {
        this.f = f;
        a.getClass();
        this.a = a;
        adkp.H(true);
    }
    
    private final boolean n() {
        return this.b != null && this.c + 60000L >= this.a.d();
    }
    
    public final fjn a(final vkk vkk) {
        vkk.getClass();
        return new fjn(asie.r((asig)new hsd(this, vkk, 1)).M((asjr)new fdo(this, vkk, 3)).o(), this.d(vkk));
    }
    
    public final zpf b() {
        final zpf e = this.e;
        this.e = null;
        return e;
    }
    
    public ashn c(final vkk vkk, final Throwable t) {
        return ashn.t();
    }
    
    protected ashn d(final vkk vkk) {
        return ashn.t();
    }
    
    public final void e(final vkk g) {
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
        this.i((vmq)this.f.a(), this.g, (zpf)new hvl(this, g, 1));
    }
    
    public void f(final dbj dbj) {
    }
    
    public void g(final Object o) {
        throw null;
    }
    
    public final void h(final vkk vkk, final zpf e) {
        e.getClass();
        if (!this.m(vkk)) {
            this.i((vmq)this.f.a(), vkk, e);
            return;
        }
        if (this.n()) {
            e.mX(this.b);
            this.j();
            return;
        }
        if (this.b != null) {
            this.i((vmq)this.f.a(), vkk, e);
            this.j();
            return;
        }
        if (this.e != e) {
            this.k(new dbj(new CancellationException()));
        }
        this.e = e;
        final dbj d = this.d;
        if (d != null) {
            this.k(d);
            this.j();
        }
    }
    
    protected abstract void i(final vmq p0, final vkk p1, final zpf p2);
    
    public final void j() {
        this.g = null;
        this.h = null;
        this.b = null;
        this.c = 0L;
        this.k(new dbj(new CancellationException()));
        this.d = null;
    }
    
    public final void k(final dbj dbj) {
        final zpf b = this.b();
        if (b != null) {
            b.a(dbj);
        }
    }
    
    @Deprecated
    public final boolean l() {
        return this.g != null;
    }
    
    public final boolean m(final vkk vkk) {
        final String b = vkk.b();
        b.getClass();
        return b.equals(this.h);
    }
}
