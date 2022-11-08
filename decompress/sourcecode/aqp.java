import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqp extends aqg
{
    public final int a;
    public aqh b;
    public final /* synthetic */ aqq c;
    private final Runnable d;
    
    public aqp(final aqq c, final int a) {
        this.c = c;
        this.d = (Runnable)new uy(this, 19);
        this.a = a;
    }
    
    @Override
    public final int a(final View view) {
        if (aqq.r(view)) {
            return view.getWidth();
        }
        return 0;
    }
    
    @Override
    public final void c(final int n, final int n2) {
        View view;
        if ((n & 0x1) == 0x1) {
            view = this.c.c(3);
        }
        else {
            view = this.c.c(5);
        }
        if (view != null && this.c.a(view) == 0) {
            this.b.e(view, n2);
        }
    }
    
    @Override
    public final void d(final View view, final int n) {
        ((aqo)view.getLayoutParams()).c = false;
        this.m();
    }
    
    @Override
    public final void e(final int n) {
        final aqq c = this.c;
        final View k = this.b.k;
        final int a = c.b.a;
        final int a2 = c.c.a;
        int d;
        if (a != 1 && a2 != 1) {
            final int n2 = d = 2;
            if (a != 2) {
                if (a2 == 2) {
                    d = n2;
                }
                else {
                    d = 0;
                }
            }
        }
        else {
            d = 1;
        }
        if (k != null && n == 0) {
            final float b = ((aqo)k.getLayoutParams()).b;
            if (b == 0.0f) {
                final aqo aqo = (aqo)k.getLayoutParams();
                if ((aqo.d & 0x1) == 0x1) {
                    aqo.d = 0;
                    c.m(k, false);
                    c.l(k);
                    c.k();
                    if (c.hasWindowFocus()) {
                        final View rootView = c.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            else if (b == 1.0f) {
                final aqo aqo2 = (aqo)k.getLayoutParams();
                if ((aqo2.d & 0x1) == 0x0) {
                    aqo2.d = 1;
                    c.m(k, true);
                    c.l(k);
                    c.k();
                    if (c.hasWindowFocus()) {
                        c.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (d != c.d) {
            c.d = d;
        }
    }
    
    @Override
    public final void f(final View view, final float n, float b) {
        b = ((aqo)view.getLayoutParams()).b;
        final int width = view.getWidth();
        int n2 = 0;
        Label_0113: {
            if (this.c.n(view, 3)) {
                n2 = 0;
                if (n <= 0.0f) {
                    if (n == 0.0f && b > 0.5f) {
                        n2 = n2;
                    }
                    else {
                        n2 = -width;
                    }
                }
            }
            else {
                final int width2 = this.c.getWidth();
                if (n >= 0.0f) {
                    n2 = width2;
                    if (n != 0.0f) {
                        break Label_0113;
                    }
                    n2 = width2;
                    if (b <= 0.5f) {
                        break Label_0113;
                    }
                }
                n2 = width2 - width;
            }
        }
        this.b.j(n2, view.getTop());
        this.c.invalidate();
    }
    
    @Override
    public final boolean g(final View view, final int n) {
        return aqq.r(view) && this.c.n(view, this.a) && this.c.a(view) == 0;
    }
    
    @Override
    public final int h(final View view, final int n) {
        if (this.c.n(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(n, 0));
        }
        final int width = this.c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(n, width));
    }
    
    @Override
    public final int i(final View view, final int n) {
        return view.getTop();
    }
    
    @Override
    public final void j() {
    }
    
    @Override
    public final void k() {
        this.c.postDelayed(this.d, 160L);
    }
    
    @Override
    public final void l(final View view, int visibility, int width, final int n) {
        width = view.getWidth();
        float n2;
        if (this.c.n(view, 3)) {
            n2 = (float)(visibility + width);
        }
        else {
            n2 = (float)(this.c.getWidth() - visibility);
        }
        final float n3 = n2 / width;
        aqq.t(view, n3);
        if (n3 == 0.0f) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
        this.c.invalidate();
    }
    
    public final void m() {
        final int a = this.a;
        int n = 3;
        if (a == 3) {
            n = 5;
        }
        final View c = this.c.c(n);
        if (c != null) {
            this.c.p(c);
        }
    }
    
    public final void n() {
        this.c.removeCallbacks(this.d);
    }
}
