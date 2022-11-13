import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixc implements abcy, iuu
{
    public static final ixa a;
    public final atjz b;
    public final atjm c;
    public abbs d;
    public abcx e;
    
    static {
        final ixe ixe = new ixe();
        ixe.f(false);
        ixe.j(false);
        ixe.q(abbx.a);
        ixe.h(false);
        ixe.b(false);
        ixe.c(false);
        ixe.o(false);
        ixe.l(false);
        ixe.k(false);
        ixe.g(false);
        ixe.p(ControlsOverlayStyle.a);
        ixe.i(false);
        ixe.n(false);
        ixe.d(false);
        ixe.m(false);
        ixe.e(false);
        a = ixa.a(ixe.a(), false);
    }
    
    public ixc(final aaor aaor) {
        this.b = ((atjz)atjm.e()).bc();
        this.c = atjm.e();
        aaor.d((ttg)new iwz(this));
        aaor.e((aaoq)new jrg(this, 1));
    }
    
    private final void g(final ixd ixd, final Object o, final boolean b) {
        this.b.tu((Object)new ixb(new msn(ixd, o), b, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void b(final boolean b) {
        this.d((ixd)iwy.k, b);
    }
    
    public final void d(final ixd ixd, final Object o) {
        this.g(ixd, o, false);
    }
    
    public final void f(final boolean b) {
        this.d((ixd)iwy.g, b);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        this.d((ixd)iwy.o, controlsOverlayStyle);
    }
    
    public final void l(final boolean b) {
        this.d((ixd)iwy.f, b);
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oD(final boolean b) {
        this.d((ixd)iwy.b, b);
    }
    
    public final void oY(final boolean b) {
        this.g((ixd)iwy.j, false, b);
    }
    
    public final void oZ(final ControlsState controlsState) {
        this.d((ixd)iwy.h, controlsState.a);
    }
    
    public final void pa(final boolean b) {
        this.d((ixd)iwy.a, b);
    }
    
    public final void pb(final boolean b) {
        this.d((ixd)iwy.d, b);
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
        this.d((ixd)iwy.c, fkr.c());
    }
    
    public final void re(final abcx e) {
        this.e = e;
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
        this.d((ixd)iwy.n, b);
    }
    
    public final void u(final boolean b) {
        this.d((ixd)iwy.i, b);
    }
    
    public final void v(final boolean b) {
        this.d((ixd)iwy.l, b);
    }
    
    public final void w(final boolean b) {
        this.d((ixd)iwy.e, b);
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        this.g((ixd)iwy.j, true, b);
    }
}
