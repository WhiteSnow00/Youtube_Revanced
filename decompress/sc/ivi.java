import android.view.ScaleGestureDetector;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.graphics.Rect;
import android.graphics.Point;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivi implements ivj, iuu, abhp, jec
{
    public final fpn a;
    public final Handler b;
    public final Runnable c;
    public final Point d;
    public final atjz e;
    public final iuv f;
    public final wyw g;
    public final Rect h;
    public final iws i;
    public aezp j;
    public boolean k;
    public long l;
    public boolean m;
    public final vaf n;
    public final vai o;
    public final e p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private aezp v;
    private boolean w;
    
    public ivi(final fpn a, final Handler b, final iuv f, final atjz e, final vaf n, final wyw g, final e p13, final vai o, final iws i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        this.p = p13;
        this.n = n;
        this.o = o;
        this.i = i;
        this.j = (aezp)aeyo.a;
        this.d = new Point();
        this.v = (aezp)aeyo.a;
        this.h = new Rect();
        this.c = (Runnable)new inm(this, 10);
    }
    
    public final void A(final boolean t) {
        if (this.j.h()) {
            if (this.t != t) {
                this.t = t;
                ((toz)this.j.c()).l(t, true);
                if (t) {
                    this.g.t((wzz)new wyt(xaa.c(119372)), (alhi)null);
                    return;
                }
                this.g.o((wzz)new wyt(xaa.c(119372)), (alhi)null);
            }
        }
    }
    
    public final void B() {
        if (!this.v.h()) {
            this.v = aezp.k((Object)this.q);
        }
        this.m = true;
    }
    
    public final boolean C() {
        return this.s || this.u || this.r || this.w || this.k;
    }
    
    public final void D() {
        this.b.removeCallbacks(this.c);
        if (this.v.h()) {
            final atjz e = this.e;
            final acxs acxs = new acxs(iuw.a());
            acxs.g((boolean)this.v.c());
            acxs.h(false);
            e.tu((Object)acxs.f());
            this.v = (aezp)aeyo.a;
        }
        this.p.i();
        if (!this.t) {
            return;
        }
        this.A(false);
    }
    
    public final void a() {
        this.a.h(this.d);
        if (this.o.bl()) {
            this.d.offset(-this.h.left, 0);
        }
    }
    
    public final void b(final int n, final int n2, final int n3) {
    }
    
    @Override
    public final void c() {
        this.k = true;
        this.p.i();
        this.b.removeCallbacks(this.c);
        this.D();
        this.v = (aezp)aeyo.a;
    }
    
    public final void d(final float n, final boolean b) {
        final boolean s = n > 0.0f;
        if (s == this.s) {
            return;
        }
        this.s = s;
        this.D();
    }
    
    @Override
    public final void f() {
        this.D();
        this.v = (aezp)aeyo.a;
    }
    
    @Override
    public final void i(final boolean r) {
        this.r = r;
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        final boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        boolean u;
        final boolean b = u = true;
        if (!a) {
            u = (ControlsOverlayStyle.c(controlsOverlayStyle) && b);
        }
        this.u = u;
        if (u) {
            this.D();
        }
    }
    
    @Override
    public final void l(final boolean b) {
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.q = false;
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
    
    public final void pj(final ScaleGestureDetector scaleGestureDetector) {
        this.w = true;
        this.D();
    }
    
    public final void pk(final boolean b) {
        this.w = false;
    }
    
    @Override
    public final void r(final fkr fkr) {
    }
    
    @Override
    public final void s(final boolean b) {
    }
    
    @Override
    public final void t(final boolean b) {
    }
    
    @Override
    public final void u(final boolean b) {
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean b) {
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
        this.q = true;
    }
    
    public final void z(final ScaleGestureDetector scaleGestureDetector) {
    }
}
