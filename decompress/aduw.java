import android.view.ViewParent;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduw extends aqi
{
    final SwipeDismissBehavior a;
    private int b;
    private int c;
    
    public aduw(final SwipeDismissBehavior a) {
        this.a = a;
        this.c = -1;
    }
    
    @Override
    public final int a(final View view) {
        return view.getWidth();
    }
    
    @Override
    public final void d(final View view, final int c) {
        this.c = c;
        this.b = view.getLeft();
        final ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.a.f = true);
            this.a.f = false;
        }
    }
    
    @Override
    public final void e(final int n) {
        final xsj j = this.a.j;
        if (j != null) {
            if (n != 0) {
                aebd.a().e(((aeax)j.a).v);
                return;
            }
            aebd.a().f(((aeax)j.a).v);
        }
    }
    
    @Override
    public final void f(final View view, final float n, final float n2) {
        this.c = -1;
        boolean b = true;
        final int width = view.getWidth();
        int b3 = 0;
        Label_0194: {
            Label_0185: {
                if (n != 0.0f) {
                    final int f = anc.f(view);
                    final int g = this.a.g;
                    if (g != 2) {
                        if (g == 0) {
                            if (f == 1) {
                                if (n >= 0.0f) {
                                    break Label_0185;
                                }
                            }
                            else if (n <= 0.0f) {
                                break Label_0185;
                            }
                        }
                        else if (f == 1) {
                            if (n <= 0.0f) {
                                break Label_0185;
                            }
                        }
                        else if (n >= 0.0f) {
                            break Label_0185;
                        }
                    }
                }
                else if (Math.abs(view.getLeft() - this.b) < Math.round(view.getWidth() * 0.5f)) {
                    break Label_0185;
                }
                if (n >= 0.0f) {
                    final int left = view.getLeft();
                    final int b2 = this.b;
                    if (left >= b2) {
                        b3 = b2 + width;
                        break Label_0194;
                    }
                }
                b3 = this.b - width;
                break Label_0194;
            }
            b3 = this.b;
            b = false;
        }
        if (this.a.e.j(b3, view.getTop())) {
            anc.I(view, new aduy(this.a, view, b));
            return;
        }
        if (b) {
            final xsj j = this.a.j;
            if (j != null) {
                j.G(view);
            }
        }
    }
    
    @Override
    public final boolean g(final View view, final int n) {
        final int c = this.c;
        return (c == -1 || c == n) && this.a.x(view);
    }
    
    @Override
    public final int h(final View view, final int n) {
        final int f = anc.f(view);
        final int g = this.a.g;
        int n2;
        int n4;
        if (g == 0) {
            if (f == 1) {
                n2 = this.b - view.getWidth();
                final int n3 = this.b;
                return Math.min(Math.max(n2, n), n3);
            }
            n2 = this.b;
            n4 = view.getWidth();
        }
        else {
            if (g != 1) {
                n2 = this.b - view.getWidth();
                final int n3 = view.getWidth() + this.b;
                return Math.min(Math.max(n2, n), n3);
            }
            if (f != 1) {
                n2 = this.b - view.getWidth();
                final int n3 = this.b;
                return Math.min(Math.max(n2, n), n3);
            }
            n2 = this.b;
            n4 = view.getWidth();
        }
        final int n3 = n4 + n2;
        return Math.min(Math.max(n2, n), n3);
    }
    
    @Override
    public final int i(final View view, final int n) {
        return view.getTop();
    }
    
    @Override
    public final void l(final View view, final int n, final int n2, final int n3) {
        final float n4 = view.getWidth() * this.a.h;
        final float n5 = view.getWidth() * this.a.i;
        final float n6 = (float)Math.abs(n - this.b);
        if (n6 <= n4) {
            view.setAlpha(1.0f);
            return;
        }
        if (n6 >= n5) {
            view.setAlpha(0.0f);
            return;
        }
        view.setAlpha(SwipeDismissBehavior.B(1.0f - (n6 - n4) / (n5 - n4)));
    }
}
