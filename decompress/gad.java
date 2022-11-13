import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gad
{
    public fzt a;
    public fzv b;
    public fzz c;
    public gaa d;
    public Object e;
    public fzp f;
    private fzj g;
    private boolean h;
    private boolean i;
    private ActionBarColor j;
    private ActionBarColor k;
    private int l;
    private ActionBarColor m;
    private int n;
    private ActionBarColor o;
    private ActionBarColor p;
    private boolean q;
    private boolean r;
    private byte s;
    
    public gad() {
    }
    
    public gad(final gae gae) {
        this.g = gae.a;
        this.a = gae.b;
        this.b = gae.c;
        this.c = gae.d;
        this.d = gae.e;
        this.h = gae.f;
        this.i = gae.g;
        this.e = gae.h;
        this.f = gae.i;
        this.j = gae.j;
        this.k = gae.k;
        this.l = gae.l;
        this.m = gae.m;
        this.n = gae.n;
        this.o = gae.o;
        this.p = gae.p;
        this.q = gae.q;
        this.r = gae.r;
        this.s = 63;
    }
    
    public final gae a() {
        if (this.s == 63) {
            final fzj g = this.g;
            if (g != null) {
                final fzp f = this.f;
                if (f != null) {
                    final ActionBarColor j = this.j;
                    if (j != null) {
                        final ActionBarColor k = this.k;
                        if (k != null) {
                            final ActionBarColor m = this.m;
                            if (m != null) {
                                final ActionBarColor o = this.o;
                                if (o != null) {
                                    final ActionBarColor p = this.p;
                                    if (p != null) {
                                        return new gae(g, this.a, this.b, this.c, this.d, this.h, this.i, this.e, f, j, k, this.l, m, this.n, o, p, this.q, this.r);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" actionBarModel");
        }
        if ((this.s & 0x1) == 0x0) {
            sb.append(" enableTranslucentActionBar");
        }
        if ((this.s & 0x2) == 0x0) {
            sb.append(" hideTitleOnTranslucentActionBar");
        }
        if (this.f == null) {
            sb.append(" collapseBehavior");
        }
        if (this.j == null) {
            sb.append(" backgroundColor");
        }
        if (this.k == null) {
            sb.append(" statusBarColor");
        }
        if ((this.s & 0x4) == 0x0) {
            sb.append(" primaryTextStyleResId");
        }
        if (this.m == null) {
            sb.append(" primaryTextColor");
        }
        if ((this.s & 0x8) == 0x0) {
            sb.append(" secondaryTextStyleResId");
        }
        if (this.o == null) {
            sb.append(" secondaryTextColor");
        }
        if (this.p == null) {
            sb.append(" indicatorColor");
        }
        if ((this.s & 0x10) == 0x0) {
            sb.append(" translucentWhenAccessibilityEnabled");
        }
        if ((this.s & 0x20) == 0x0) {
            sb.append(" visible");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final fzj g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null actionBarModel");
    }
    
    public final void c(final ActionBarColor j) {
        if (j != null) {
            this.j = j;
            return;
        }
        throw new NullPointerException("Null backgroundColor");
    }
    
    public final void d(final boolean h) {
        this.h = h;
        this.s |= 0x1;
    }
    
    public final void e(final boolean i) {
        this.i = i;
        this.s |= 0x2;
    }
    
    public final void f(final ActionBarColor p) {
        if (p != null) {
            this.p = p;
            return;
        }
        throw new NullPointerException("Null indicatorColor");
    }
    
    public final void g(final ActionBarColor m) {
        if (m != null) {
            this.m = m;
            return;
        }
        throw new NullPointerException("Null primaryTextColor");
    }
    
    public final void h(final int l) {
        this.l = l;
        this.s |= 0x4;
    }
    
    public final void i(final ActionBarColor o) {
        if (o != null) {
            this.o = o;
            return;
        }
        throw new NullPointerException("Null secondaryTextColor");
    }
    
    public final void j(final int n) {
        this.n = n;
        this.s |= 0x8;
    }
    
    public final void k(final ActionBarColor k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null statusBarColor");
    }
    
    public final void l(final boolean q) {
        this.q = q;
        this.s |= 0x10;
    }
    
    public final void m(final boolean r) {
        this.r = r;
        this.s |= 0x20;
    }
    
    public final void n(final aezf aezf) {
        final fzj g = this.g;
        if (g != null) {
            this.b(((tqt)aezf.apply((Object)new tqt(g))).b());
            return;
        }
        throw new IllegalStateException("Property \"actionBarModel\" has not been set");
    }
}
