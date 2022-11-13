import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzs
{
    public String a;
    public asht b;
    public fzu c;
    public frk d;
    private boolean e;
    private RecyclerView f;
    private boolean g;
    private boolean h;
    private boolean i;
    private byte j;
    
    public final fzt a() {
        if (this.j == 15) {
            final asht b = this.b;
            if (b != null) {
                final fzu c = this.c;
                if (c != null) {
                    final frk d = this.d;
                    if (d != null) {
                        final RecyclerView f = this.f;
                        if (f != null) {
                            return new fzt(this.a, b, this.e, c, d, f, this.g, this.h, this.i);
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" isFilterAppliedObservable");
        }
        if ((this.j & 0x1) == 0x0) {
            sb.append(" isFilterApplied");
        }
        if (this.c == null) {
            sb.append(" shownCallback");
        }
        if (this.d == null) {
            sb.append(" swipeRefreshUiController");
        }
        if (this.f == null) {
            sb.append(" recyclerView");
        }
        if ((this.j & 0x2) == 0x0) {
            sb.append(" isAccessibilityEnabled");
        }
        if ((this.j & 0x4) == 0x0) {
            sb.append(" shouldSkipHideAnimationOnAppStart");
        }
        if ((this.j & 0x8) == 0x0) {
            sb.append(" isGhostFeed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean g) {
        this.g = g;
        this.j |= 0x2;
    }
    
    public final void c(final boolean e) {
        this.e = e;
        this.j |= 0x1;
    }
    
    public final void d(final boolean i) {
        this.i = i;
        this.j |= 0x8;
    }
    
    public final void e(final RecyclerView f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null recyclerView");
    }
    
    public final void f(final boolean h) {
        this.h = h;
        this.j |= 0x4;
    }
}
