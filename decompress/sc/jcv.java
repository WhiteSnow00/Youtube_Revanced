import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcv implements jda, iuu
{
    public final abpu a;
    public final asiq b;
    public ashj c;
    public ashi d;
    public boolean e;
    public boolean f;
    private final aonv g;
    private final aont h;
    private final asid i;
    private final iuv j;
    private boolean k;
    private boolean l;
    private boolean m;
    private asir n;
    
    public jcv(final abpu a, final iuv j, final asid i, final aonv g) {
        this.a = a;
        this.j = j;
        this.g = g;
        this.b = new asiq();
        this.i = i;
        aonx aonx;
        if ((aonx = g.g) == null) {
            aonx = aonx.a;
        }
        this.h = (aont)((ahbc)aonx).rx((ahaq)aont.b);
    }
    
    private final void f() {
        final asir n = this.n;
        if (n == null) {
            return;
        }
        athz.f((AtomicReference)n);
        this.e = true;
    }
    
    public final ashi a() {
        if (this.d == null) {
            this.d = ashi.m(new ixl(this, 2), ashb.c);
        }
        return this.d;
    }
    
    public final void b() {
        this.j.a((iuu)this);
    }
    
    public final void c() {
        final ashj c = this.c;
        if (c == null) {
            return;
        }
        final boolean d = this.h.d;
        int n = 1;
        final boolean m = (!d && !this.e) || this.k;
        if (!this.m) {
            this.m = m;
        }
        final aonv g = this.g;
        if (!d && !this.e) {
            if (!this.k) {
                n = 2;
            }
        }
        else {
            n = 0;
        }
        c.c(jcq.c(m, g, n));
    }
    
    public final void d() {
        final aont h = this.h;
        if (!h.d && !this.e && this.f) {
            if (!this.l) {
                final asir an = ashi.ae(h.c, TimeUnit.MILLISECONDS, this.i).an((asjm)new jce(this, 10), ixp.p);
                this.n = an;
                this.b.c(an);
            }
        }
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        if (this.l == ControlsOverlayStyle.a(controlsOverlayStyle)) {
            return;
        }
        final boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.l = a;
        if (this.m && a) {
            this.f();
            this.c();
            return;
        }
        this.d();
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oY(final boolean b) {
        if (this.k) {
            this.k = false;
            this.c();
        }
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        if (!this.k) {
            this.k = true;
            this.c();
            if (this.m) {
                this.f();
            }
        }
    }
}
