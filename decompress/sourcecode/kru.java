import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kru
{
    public afcr a;
    private ActionBarColor b;
    private ActionBarColor c;
    private ActionBarColor d;
    private ActionBarColor e;
    private ActionBarColor f;
    
    public final krv a() {
        final ActionBarColor b = this.b;
        if (b != null) {
            final ActionBarColor c = this.c;
            if (c != null) {
                final ActionBarColor d = this.d;
                if (d != null) {
                    final ActionBarColor e = this.e;
                    if (e != null) {
                        final ActionBarColor f = this.f;
                        if (f != null) {
                            final afcr a = this.a;
                            if (a != null) {
                                return new krv(b, c, d, e, f, a);
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" primaryText");
        }
        if (this.c == null) {
            sb.append(" secondaryText");
        }
        if (this.d == null) {
            sb.append(" background");
        }
        if (this.e == null) {
            sb.append(" statusBar");
        }
        if (this.f == null) {
            sb.append(" iconTint");
        }
        if (this.a == null) {
            sb.append(" menuItems");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final ActionBarColor d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null background");
    }
    
    public final void c(final ActionBarColor f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null iconTint");
    }
    
    public final void d(final ActionBarColor b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null primaryText");
    }
    
    public final void e(final ActionBarColor c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null secondaryText");
    }
    
    public final void f(final ActionBarColor e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null statusBar");
    }
}
