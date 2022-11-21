// 
// Decompiled by Procyon v0.6.0
// 

public final class abvt
{
    public final atnb a;
    public final tsd b;
    public abwc c;
    public abwb d;
    public abwa e;
    public boolean f;
    private final atnb g;
    private final abkq h;
    private final aanj i;
    private final auna j;
    private abvs k;
    
    static {
        tut.a("player.ui.PlayerControlsListener");
    }
    
    public abvt(final atnb a, final atnb g, final tsd b, final abkq h, final abwe abwe, final aanj i, final auna j) {
        this.f = false;
        this.a = a;
        this.g = g;
        b.getClass();
        this.b = b;
        h.getClass();
        this.h = h;
        this.i = i;
        this.j = j;
        abwe.a().aH((asmi)new tpd(this, a, 18));
    }
    
    public final dz a() {
        synchronized (this) {
            if (this.k == null) {
                this.k = new abvs(this);
            }
            return this.k;
        }
    }
    
    public final void b() {
        this.b.b();
        if (this.h.i) {
            this.j.tt(aamt.c);
        }
        final abwa e = this.e;
        if (e == null) {
            ((abvr)this.a.a()).S();
            return;
        }
        final xqo xqo = (xqo)e;
        if (xqo.b.o()) {
            ((xqz)((xqw)xqo.b).g.a()).d();
            return;
        }
        final xqr d = ((xqw)xqo.b).d;
        if (d != null) {
            ((xoy)d).A();
            return;
        }
        tut.m(xqo.a, "onDismissPlayback got called when mdx session isn't active");
    }
    
    public final void c() {
        this.b.b();
        ((abvr)this.a.a()).a();
    }
    
    public final void d() {
        if (this.f) {
            return;
        }
        this.b.b();
        ((abvr)this.a.a()).C();
    }
    
    public final void e() {
        this.b.b();
        ((abvr)this.a.a()).F();
    }
    
    public final void f() {
        this.b.b();
        ((abvq)this.g.a()).o();
    }
    
    public final void g(final long n) {
        this.k(n, aobh.a);
    }
    
    public final void h(final long n) {
        this.l(n, aobh.a);
    }
    
    public final void i() {
        this.b.b();
        final abwb d = this.d;
        if (d != null) {
            d.a();
            return;
        }
        ((abvq)this.g.a()).a(abpx.a);
    }
    
    public final void j() {
        this.b.b();
        final abwc c = this.c;
        if (c != null) {
            c.b();
            return;
        }
        ((abvr)this.a.a()).Y();
        if (!((abvq)this.g.a()).l(abpx.b)) {
            ((abvr)this.a.a()).ab(0L);
            return;
        }
        ((abvq)this.g.a()).a(abpx.b);
    }
    
    public final void k(final long n, final aobh aobh) {
        this.b.b();
        this.i.d();
        ((abvr)this.a.a()).an(n, aobh);
    }
    
    public final void l(final long n, final aobh aobh) {
        this.b.b();
        this.i.d();
        ((abvr)this.a.a()).ac(n, aobh);
    }
}
