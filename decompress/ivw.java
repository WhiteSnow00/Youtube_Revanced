import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivw implements iuu
{
    public boolean a;
    public final ivr b;
    public ivu c;
    public toz d;
    private boolean e;
    private boolean f;
    private final abty g;
    private final abho h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final qv m;
    
    public ivw(final abho h, final abty g, final ivr b, final qv m, final byte[] array) {
        this.h = h;
        this.g = g;
        this.b = b;
        this.m = m;
        h.b.a((abhp)new ivv(this, 0));
        g.a((abtx)new ivq(this, 2));
        m.a((iyv)new ivt(this, 0));
    }
    
    private final void d(final boolean b) {
        this.g(this.b(), b);
    }
    
    private final void f(final boolean b) {
        this.g(this.c(), b);
    }
    
    private final void g(final boolean b, final boolean b2) {
        if (b) {
            this.m.b();
        }
        final toz d = this.d;
        if (d == null) {
            return;
        }
        d.l(b, b2);
        this.d.a.setEnabled(this.j ^ true);
    }
    
    private final boolean h() {
        return !this.a;
    }
    
    public final void a() {
        if (this.i) {
            this.f(false);
            return;
        }
        this.d(false);
    }
    
    public final boolean b() {
        return this.j || (!this.k && !this.l && this.g.g() && this.h());
    }
    
    final boolean c() {
        return !this.h.b.d() && (!this.e || this.a) && this.h() && !this.f;
    }
    
    @Override
    public final void i(final boolean l) {
        if (this.l != l) {
            this.l = l;
            this.a();
        }
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        this.a();
    }
    
    @Override
    public final void l(final boolean f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        this.a();
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.i = false;
        this.d(b);
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
    }
    
    @Override
    public final void pa(final boolean b) {
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean b) {
    }
    
    @Override
    public final void r(final fkr fkr) {
        this.k = fkr.c();
        this.a();
    }
    
    @Override
    public final void s(final boolean b) {
    }
    
    @Override
    public final void t(final boolean j) {
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.a();
    }
    
    @Override
    public final void u(final boolean e) {
        if (e == this.e) {
            return;
        }
        this.e = e;
        this.a();
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean a) {
        if (a != this.a) {
            this.a = a;
            this.a();
        }
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
        this.i = true;
        this.f(b);
    }
}
