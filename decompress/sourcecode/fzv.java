import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzv
{
    public fzl a;
    public fzn b;
    public fzr c;
    public fzs d;
    public Object e;
    public fzh f;
    private fzb g;
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
    
    public fzv() {
    }
    
    public fzv(final fzw fzw) {
        this.g = fzw.a;
        this.a = fzw.b;
        this.b = fzw.c;
        this.c = fzw.d;
        this.d = fzw.e;
        this.h = fzw.f;
        this.i = fzw.g;
        this.e = fzw.h;
        this.f = fzw.i;
        this.j = fzw.j;
        this.k = fzw.k;
        this.l = fzw.l;
        this.m = fzw.m;
        this.n = fzw.n;
        this.o = fzw.o;
        this.p = fzw.p;
        this.q = fzw.q;
        this.r = fzw.r;
        this.s = 63;
    }
    
    public final fzw a() {
        if (this.s == 63) {
            final fzb g = this.g;
            if (g != null) {
                final fzh f = this.f;
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
                                        return new fzw(g, this.a, this.b, this.c, this.d, this.h, this.i, this.e, f, j, k, this.l, m, this.n, o, p, this.q, this.r);
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
    
    public final void b(final fzb g) {
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
    
    public final void n(final aexg aexg) {
        final fzb g = this.g;
        if (g != null) {
            this.b(((too)aexg.apply((Object)new too(g))).b());
            return;
        }
        throw new IllegalStateException("Property \"actionBarModel\" has not been set");
    }
}
