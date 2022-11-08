// 
// Decompiled by Procyon v0.6.0
// 

public final class gcb
{
    private int A;
    public int a;
    public aexq b;
    public aexq c;
    public int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    public gcb() {
    }
    
    public gcb(final byte[] array) {
        final aewp a = aewp.a;
        this.b = (aexq)a;
        this.c = (aexq)a;
    }
    
    public final gcc a() {
        if (this.d != 16777215) {
            final StringBuilder sb = new StringBuilder();
            if ((this.d & 0x1) == 0x0) {
                sb.append(" hasAvatar");
            }
            if ((this.d & 0x2) == 0x0) {
                sb.append(" hasCheckbox");
            }
            if ((this.d & 0x4) == 0x0) {
                sb.append(" hasIcon");
            }
            if ((this.d & 0x8) == 0x0) {
                sb.append(" hasText");
            }
            if ((this.d & 0x10) == 0x0) {
                sb.append(" shouldUseButtonStyleText");
            }
            if ((this.d & 0x20) == 0x0) {
                sb.append(" shouldSkipIconTint");
            }
            if ((this.d & 0x40) == 0x0) {
                sb.append(" clickable");
            }
            if ((this.d & 0x80) == 0x0) {
                sb.append(" useTouchFeedbackCircleAsBackground");
            }
            if ((this.d & 0x100) == 0x0) {
                sb.append(" useMultilineTextView");
            }
            if ((this.d & 0x200) == 0x0) {
                sb.append(" iconMarginStart");
            }
            if ((this.d & 0x400) == 0x0) {
                sb.append(" iconMarginEnd");
            }
            if ((this.d & 0x800) == 0x0) {
                sb.append(" iconDimensions");
            }
            if ((this.d & 0x1000) == 0x0) {
                sb.append(" textPaddingStart");
            }
            if ((this.d & 0x2000) == 0x0) {
                sb.append(" textPaddingEnd");
            }
            if ((this.d & 0x4000) == 0x0) {
                sb.append(" textPaddingStartWithImage");
            }
            if ((this.d & 0x8000) == 0x0) {
                sb.append(" minimumWidth");
            }
            if ((this.d & 0x10000) == 0x0) {
                sb.append(" cornerRadius");
            }
            if ((this.d & 0x20000) == 0x0) {
                sb.append(" textViewGravity");
            }
            if ((this.d & 0x40000) == 0x0) {
                sb.append(" selectedTextColor");
            }
            if ((this.d & 0x80000) == 0x0) {
                sb.append(" unselectedTextColor");
            }
            if ((this.d & 0x100000) == 0x0) {
                sb.append(" selectedBackgroundResource");
            }
            if ((this.d & 0x200000) == 0x0) {
                sb.append(" unselectedBackgroundResource");
            }
            if ((this.d & 0x400000) == 0x0) {
                sb.append(" selectedRippleColor");
            }
            if ((this.d & 0x800000) == 0x0) {
                sb.append(" unselectedRippleColor");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gcc(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.a, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.b, this.x, this.y, this.c, this.z, this.A);
    }
    
    public final void b(final boolean k) {
        this.k = k;
        this.d |= 0x40;
    }
    
    public final void c(final int t) {
        this.t = t;
        this.d |= 0x10000;
    }
    
    public final void d(final boolean e) {
        this.e = e;
        this.d |= 0x1;
    }
    
    public final void e(final boolean f) {
        this.f = f;
        this.d |= 0x2;
    }
    
    public final void f(final boolean g) {
        this.g = g;
        this.d |= 0x4;
    }
    
    public final void g(final boolean h) {
        this.h = h;
        this.d |= 0x8;
    }
    
    public final void h(final int p) {
        this.p = p;
        this.d |= 0x800;
    }
    
    public final void i(final int o) {
        this.o = o;
        this.d |= 0x400;
    }
    
    public final void j(final int n) {
        this.n = n;
        this.d |= 0x200;
    }
    
    public final void k(final int s) {
        this.s = s;
        this.d |= 0x8000;
    }
    
    public final void l(final int x) {
        this.x = x;
        this.d |= 0x100000;
    }
    
    public final void m(final int z) {
        this.z = z;
        this.d |= 0x400000;
    }
    
    public final void n(final int v) {
        this.v = v;
        this.d |= 0x40000;
    }
    
    public final void o(final boolean j) {
        this.j = j;
        this.d |= 0x20;
    }
    
    public final void p(final boolean i) {
        this.i = i;
        this.d |= 0x10;
    }
    
    public final void q(final int q) {
        this.q = q;
        this.d |= 0x2000;
    }
    
    public final void r(final int r) {
        this.r = r;
        this.d |= 0x4000;
    }
    
    public final void s(final int u) {
        this.u = u;
        this.d |= 0x20000;
    }
    
    public final void t(final int y) {
        this.y = y;
        this.d |= 0x200000;
    }
    
    public final void u(final int a) {
        this.A = a;
        this.d |= 0x800000;
    }
    
    public final void v(final int w) {
        this.w = w;
        this.d |= 0x80000;
    }
    
    public final void w(final boolean m) {
        this.m = m;
        this.d |= 0x100;
    }
    
    public final void x(final boolean l) {
        this.l = l;
        this.d |= 0x80;
    }
}
