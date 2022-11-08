import java.lang.reflect.Method;
import android.view.ViewGroup;
import android.support.v7.widget.ActionBarContextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ff implements alv
{
    final /* synthetic */ fw a;
    
    public ff(final fw a) {
        this.a = a;
    }
    
    public final aoa a(final View view, aoa n) {
        final int d = n.d();
        final fw a = this.a;
        int d2 = n.d();
        final ActionBarContextView q = a.q;
        final int n2 = 8;
        boolean b5;
        if (q != null && q.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)a.q.getLayoutParams();
            int n3;
            int n4;
            boolean b4;
            if (a.q.isShown()) {
                if (a.G == null) {
                    a.G = new Rect();
                    a.H = new Rect();
                }
                final Rect g = a.G;
                final Rect h = a.H;
                g.set(n.b(), n.d(), n.c(), n.a());
                final ViewGroup u = a.u;
                final Method a2 = qb.a;
                if (a2 != null) {
                    try {
                        a2.invoke(u, g, h);
                    }
                    catch (final Exception ex) {}
                }
                final int top = g.top;
                final int left = g.left;
                final int right = g.right;
                final aoa w = ana.w((View)a.u);
                int b;
                if (w == null) {
                    b = 0;
                }
                else {
                    b = w.b();
                }
                int c;
                if (w == null) {
                    c = 0;
                }
                else {
                    c = w.c();
                }
                boolean b2;
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    b2 = false;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    b2 = true;
                }
                if (top > 0 && a.v == null) {
                    (a.v = new View(a.j)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = b;
                    frameLayout$LayoutParams.rightMargin = c;
                    a.u.addView(a.v, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View v = a.v;
                    if (v != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)v.getLayoutParams();
                        if (layoutParams2.height != layoutParams.topMargin || layoutParams2.leftMargin != b || layoutParams2.rightMargin != c) {
                            layoutParams2.height = layoutParams.topMargin;
                            layoutParams2.leftMargin = b;
                            layoutParams2.rightMargin = c;
                            a.v.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View v2 = a.v;
                final boolean b3 = v2 != null;
                if (b3 && v2.getVisibility() != 0) {
                    final View v3 = a.v;
                    int backgroundColor;
                    if ((ana.k(v3) & 0x2000) != 0x0) {
                        backgroundColor = agx.a(a.j, 2131099661);
                    }
                    else {
                        backgroundColor = agx.a(a.j, 2131099660);
                    }
                    v3.setBackgroundColor(backgroundColor);
                }
                n3 = d2;
                n4 = (b2 ? 1 : 0);
                b4 = b3;
                if (!a.y) {
                    n3 = d2;
                    n4 = (b2 ? 1 : 0);
                    if (b4 = b3) {
                        n3 = 0;
                        n4 = (b2 ? 1 : 0);
                        b4 = b3;
                    }
                }
            }
            else {
                int n5;
                if (layoutParams.topMargin != 0) {
                    layoutParams.topMargin = 0;
                    n5 = 1;
                }
                else {
                    n5 = 0;
                }
                b4 = false;
                n4 = n5;
                n3 = d2;
            }
            d2 = n3;
            b5 = b4;
            if (n4 != 0) {
                a.q.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                d2 = n3;
                b5 = b4;
            }
        }
        else {
            b5 = false;
        }
        final View v4 = a.v;
        if (v4 != null) {
            int visibility;
            if (!b5) {
                visibility = n2;
            }
            else {
                visibility = 0;
            }
            v4.setVisibility(visibility);
        }
        if (d != d2) {
            n = n.n(n.b(), d2, n.c(), n.a());
        }
        return ana.x(view, n);
    }
}
