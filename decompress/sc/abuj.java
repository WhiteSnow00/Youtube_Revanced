// 
// Decompiled by Procyon v0.6.0
// 

public final class abuj
{
    public final atke a;
    public final trc b;
    public abuq c;
    public abup d;
    public abuo e;
    public boolean f;
    private final atke g;
    private final abjj h;
    private final aalm i;
    private final aukf j;
    private abui k;
    
    static {
        ttr.a("player.ui.PlayerControlsListener");
    }
    
    public abuj(final atke a, final atke g, final trc b, final abjj h, final aanx aanx, final aalm i, final aukf j, final byte[] array, final byte[] array2) {
        this.f = false;
        this.a = a;
        this.g = g;
        b.getClass();
        this.b = b;
        h.getClass();
        this.h = h;
        this.i = i;
        this.j = j;
        aanx.F().aH((asjm)new tod(this, a, 18));
    }
    
    public final dz a() {
        synchronized (this) {
            if (this.k == null) {
                this.k = new abui(this);
            }
            return this.k;
        }
    }
    
    public final void b() {
        this.b.b();
        if (this.h.i) {
            this.j.tu((Object)aakx.c);
        }
        final abuo e = this.e;
        if (e == null) {
            ((abuh)this.a.a()).Q();
            return;
        }
        final xpe xpe = (xpe)e;
        if (xpe.b.o()) {
            ((xpp)((xpm)xpe.b).g.a()).d();
            return;
        }
        final xph d = ((xpm)xpe.b).d;
        if (d != null) {
            ((xnm)d).A();
            return;
        }
        ttr.m(xpe.a, "onDismissPlayback got called when mdx session isn't active");
    }
    
    public final void c() {
        this.b.b();
        ((abuh)this.a.a()).a();
    }
    
    public final void d() {
        if (this.f) {
            return;
        }
        this.b.b();
        ((abuh)this.a.a()).C();
    }
    
    public final void e() {
        this.b.b();
        ((abuh)this.a.a()).F();
    }
    
    public final void f() {
        this.b.b();
        ((abug)this.g.a()).o();
    }
    
    public final void g(final long n) {
        this.k(n, anza.a);
    }
    
    public final void h(final long n) {
        this.l(n, anza.a);
    }
    
    public final void i() {
        this.b.b();
        final abup d = this.d;
        if (d != null) {
            d.a();
            return;
        }
        ((abug)this.g.a()).a(abop.a);
    }
    
    public final void j() {
        this.b.b();
        final abuq c = this.c;
        if (c != null) {
            c.b();
            return;
        }
        ((abuh)this.a.a()).W();
        if (!((abug)this.g.a()).l(abop.b)) {
            ((abuh)this.a.a()).Z(0L);
            return;
        }
        ((abug)this.g.a()).a(abop.b);
    }
    
    public final void k(final long n, final anza anza) {
        this.b.b();
        this.i.d();
        ((abuh)this.a.a()).al(n, anza);
    }
    
    public final void l(final long n, final anza anza) {
        this.b.b();
        this.i.d();
        ((abuh)this.a.a()).aa(n, anza);
    }
}
