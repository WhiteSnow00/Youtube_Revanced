import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixe
{
    private boolean a;
    private boolean b;
    private abbx c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ControlsOverlayStyle n;
    private boolean o;
    private boolean p;
    private short q;
    
    public ixe() {
    }
    
    public ixe(final ixf ixf) {
        this.a = ixf.a;
        this.b = ixf.b;
        this.c = ixf.c;
        this.d = ixf.d;
        this.e = ixf.e;
        this.f = ixf.f;
        this.g = ixf.g;
        this.h = ixf.h;
        this.i = ixf.i;
        this.j = ixf.j;
        this.k = ixf.k;
        this.l = ixf.l;
        this.m = ixf.m;
        this.n = ixf.n;
        this.o = ixf.o;
        this.p = ixf.p;
        this.q = 16383;
    }
    
    public final ixf a() {
        if (this.q == 16383) {
            final abbx c = this.c;
            if (c != null) {
                final ControlsOverlayStyle n = this.n;
                if (n != null) {
                    return new ixf(this.a, this.b, c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, n, this.o, this.p);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.q & 0x1) == 0x0) {
            sb.append(" isControlsOverlayVisible");
        }
        if ((this.q & 0x2) == 0x0) {
            sb.append(" isMagicWindowMidUiEduVisible");
        }
        if (this.c == null) {
            sb.append(" videoState");
        }
        if ((this.q & 0x4) == 0x0) {
            sb.append(" isFullscreen");
        }
        if ((this.q & 0x8) == 0x0) {
            sb.append(" hasNext");
        }
        if ((this.q & 0x10) == 0x0) {
            sb.append(" hasPrevious");
        }
        if ((this.q & 0x20) == 0x0) {
            sb.append(" isUserScrubbing");
        }
        if ((this.q & 0x40) == 0x0) {
            sb.append(" isSeekEDUVisible");
        }
        if ((this.q & 0x80) == 0x0) {
            sb.append(" isQuickSeekVisible");
        }
        if ((this.q & 0x100) == 0x0) {
            sb.append(" isFineScrubbingEDUVisible");
        }
        if ((this.q & 0x200) == 0x0) {
            sb.append(" isFullscreenEngagementViewVisible");
        }
        if ((this.q & 0x400) == 0x0) {
            sb.append(" isStickyControlsEnabled");
        }
        if ((this.q & 0x800) == 0x0) {
            sb.append(" isAutonavToggleEnabled");
        }
        if (this.n == null) {
            sb.append(" style");
        }
        if ((this.q & 0x1000) == 0x0) {
            sb.append(" isSingletonVod");
        }
        if ((this.q & 0x2000) == 0x0) {
            sb.append(" isClip");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean e) {
        this.e = e;
        this.q |= 0x8;
    }
    
    public final void c(final boolean f) {
        this.f = f;
        this.q |= 0x10;
    }
    
    public final void d(final boolean m) {
        this.m = m;
        this.q |= 0x800;
    }
    
    public final void e(final boolean p) {
        this.p = p;
        this.q |= 0x2000;
    }
    
    public final void f(final boolean a) {
        this.a = a;
        this.q |= 0x1;
    }
    
    public final void g(final boolean j) {
        this.j = j;
        this.q |= 0x100;
    }
    
    public final void h(final boolean d) {
        this.d = d;
        this.q |= 0x4;
    }
    
    public final void i(final boolean k) {
        this.k = k;
        this.q |= 0x200;
    }
    
    public final void j(final boolean b) {
        this.b = b;
        this.q |= 0x2;
    }
    
    public final void k(final boolean i) {
        this.i = i;
        this.q |= 0x80;
    }
    
    public final void l(final boolean h) {
        this.h = h;
        this.q |= 0x40;
    }
    
    public final void m(final boolean o) {
        this.o = o;
        this.q |= 0x1000;
    }
    
    public final void n(final boolean l) {
        this.l = l;
        this.q |= 0x400;
    }
    
    public final void o(final boolean g) {
        this.g = g;
        this.q |= 0x20;
    }
    
    public final void p(final ControlsOverlayStyle n) {
        if (n != null) {
            this.n = n;
            return;
        }
        throw new NullPointerException("Null style");
    }
    
    public final void q(final abbx c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null videoState");
    }
}
