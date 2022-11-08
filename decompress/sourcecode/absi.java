// 
// Decompiled by Procyon v0.6.0
// 

public final class absi
{
    public final atjj a;
    public final tox b;
    public absp c;
    public abso d;
    public absn e;
    public boolean f;
    private final atjj g;
    private final abhq h;
    private final aajs i;
    private final aujp j;
    private absh k;
    
    static {
        trn.a("player.ui.PlayerControlsListener");
    }
    
    public absi(final atjj a, final atjj g, final tox b, final abhq h, final aamd aamd, final aajs i, final aujp j, final byte[] array) {
        this.f = false;
        this.a = a;
        this.g = g;
        b.getClass();
        this.b = b;
        h.getClass();
        this.h = h;
        this.i = i;
        this.j = j;
        aamd.E().aB((asix)new uqp(this, a, 12));
    }
    
    public final dz a() {
        synchronized (this) {
            if (this.k == null) {
                this.k = new absh(this);
            }
            return this.k;
        }
    }
    
    public final void b() {
        this.b.b();
        if (this.h.j) {
            this.j.tr((Object)aajc.c);
        }
        final absn e = this.e;
        if (e == null) {
            ((absg)this.a.a()).R();
            return;
        }
        final xng xng = (xng)e;
        if (xng.b.o()) {
            ((xnr)((xno)xng.b).g.a()).d();
            return;
        }
        final xnj d = ((xno)xng.b).d;
        if (d != null) {
            ((xlo)d).A();
            return;
        }
        trn.m(xng.a, "onDismissPlayback got called when mdx session isn't active");
    }
    
    public final void c() {
        this.b.b();
        ((absg)this.a.a()).a();
    }
    
    public final void d() {
        if (this.f) {
            return;
        }
        this.b.b();
        ((absg)this.a.a()).D();
    }
    
    public final void e() {
        this.b.b();
        ((absg)this.a.a()).G();
    }
    
    public final void f() {
        this.b.b();
        ((absf)this.g.a()).o();
    }
    
    public final void g(final long n) {
        this.k(n, anwx.a);
    }
    
    public final void h(final long n) {
        this.l(n, anwx.a);
    }
    
    public final void i() {
        this.b.b();
        final abso d = this.d;
        if (d != null) {
            d.a();
            return;
        }
        ((absf)this.g.a()).a(abmp.a);
    }
    
    public final void j() {
        this.b.b();
        final absp c = this.c;
        if (c != null) {
            c.b();
            return;
        }
        ((absg)this.a.a()).X();
        if (!((absf)this.g.a()).l(abmp.b)) {
            ((absg)this.a.a()).aa(0L);
            return;
        }
        ((absf)this.g.a()).a(abmp.b);
    }
    
    public final void k(final long n, final anwx anwx) {
        this.b.b();
        this.i.d();
        ((absg)this.a.a()).am(n, anwx);
    }
    
    public final void l(final long n, final anwx anwx) {
        this.b.b();
        this.i.d();
        ((absg)this.a.a()).ab(n, anwx);
    }
}
