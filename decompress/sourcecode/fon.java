import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public class fon
{
    public final abca a;
    public final abby b;
    final fps c;
    public abgj d;
    
    public fon(final abca a, final fps c) {
        final abby b = new abby();
        a.getClass();
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = null;
    }
    
    public static CharSequence a(final long n) {
        return tsx.j(TimeUnit.MILLISECONDS.toSeconds(n + 500L));
    }
    
    public void b(final boolean b) {
        this.c.a(b);
    }
    
    public final void c(final long n) {
        abbx.K((abcb)this.b, n);
    }
    
    public final void d() {
        if (this.a.c() == 0L) {
            return;
        }
        final abby b = this.b;
        b.b = 0L;
        this.a.mg((abcb)b);
    }
    
    public void f() {
        this.b.l();
        this.pt();
        this.a.mg((abcb)this.b);
    }
    
    public final void g(final abcc abcc) {
        this.a.q(abcc);
    }
    
    public final void h(final long v, final long w) {
        final abby b = this.b;
        b.v = v;
        b.w = w;
    }
    
    public void i(final ControlsOverlayStyle controlsOverlayStyle) {
        final abby b = this.b;
        b.j = controlsOverlayStyle.q;
        b.n = controlsOverlayStyle.r;
        b.p = controlsOverlayStyle.s;
        b.o = controlsOverlayStyle.w;
        b.q = controlsOverlayStyle.x;
        b.r = controlsOverlayStyle.y;
        b.m(controlsOverlayStyle.z);
        this.a.mg((abcb)this.b);
        this.b.u = controlsOverlayStyle.A;
        this.c.c(ControlsOverlayStyle.b(controlsOverlayStyle));
        this.c.b(controlsOverlayStyle.s);
        this.c.d(this.b.o);
    }
    
    public void j(final long n, final long n2, final long n3, final long n4) {
        final abby b = this.b;
        if (b.c == n && b.e == n2 && b.a == n3 && b.b == n4) {
            return;
        }
        b.n(n, n2, n3, n4);
        this.a.mg((abcb)this.b);
        this.pp();
        this.pr();
    }
    
    public void po(final boolean b) {
        this.c.f(b);
    }
    
    public void pp() {
        final fps c = this.c;
        final abby b = this.b;
        c.g(aaiy.l(b.c, b.a));
    }
    
    public void pr() {
        if (this.b.a <= 0L) {
            return;
        }
        this.c.e(a(this.a.lY()), a(this.b.a - this.a.lY()), a(this.b.a));
    }
    
    public final void pt() {
        this.a.mc();
        final abgj d = this.d;
        if (d != null) {
            d.f(false);
        }
    }
}
