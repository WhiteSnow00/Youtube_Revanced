// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.View$MeasureSpec;
import android.graphics.Rect;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.util.List;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class AppBarLayout$ScrollingViewBehavior extends adsy
{
    public AppBarLayout$ScrollingViewBehavior() {
    }
    
    public AppBarLayout$ScrollingViewBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adsz.f);
        super.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    static final AppBarLayout A(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final View view = list.get(i);
            if (view instanceof AppBarLayout) {
                return (AppBarLayout)view;
            }
        }
        return null;
    }
    
    public /* bridge */ boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        super.h(coordinatorLayout, view, n);
        return true;
    }
    
    public final boolean k(final CoordinatorLayout coordinatorLayout, final View view, final Rect rect, final boolean b) {
        final AppBarLayout a = A(coordinatorLayout.b(view));
        if (a != null) {
            rect.offset(view.getLeft(), view.getTop());
            final Rect d = this.d;
            d.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!d.contains(rect)) {
                a.m(false, b ^ true);
                return true;
            }
        }
        return false;
    }
    
    public boolean n(final View view) {
        return view instanceof AppBarLayout;
    }
    
    public final void o(final CoordinatorLayout coordinatorLayout, final View view) {
        if (view instanceof AppBarLayout) {
            anb.K((View)coordinatorLayout, aol.d.a());
            anb.K((View)coordinatorLayout, aol.e.a());
            anb.N((View)coordinatorLayout, null);
        }
    }
    
    public final /* bridge */ boolean p(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, int height) {
        final int height2 = view.getLayoutParams().height;
        final boolean b = false;
        int n3 = height2;
        if (height2 != -1) {
            final boolean b2 = b;
            if (height2 != -2) {
                return b2;
            }
            n3 = -2;
        }
        final View z = this.z(coordinatorLayout.b(view));
        boolean b2 = b;
        if (z != null) {
            final int size = View$MeasureSpec.getSize(height);
            if (size > 0) {
                height = size;
                if (anb.ai(z)) {
                    final aob f = coordinatorLayout.f;
                    height = size;
                    if (f != null) {
                        height = size + (f.d() + f.a());
                    }
                }
            }
            else {
                height = coordinatorLayout.getHeight();
            }
            height += this.y(z);
            final int measuredHeight = z.getMeasuredHeight();
            if (this.w()) {
                view.setTranslationY((float)(-measuredHeight));
            }
            else {
                view.setTranslationY(0.0f);
                height -= measuredHeight;
            }
            int n4;
            if (n3 == -1) {
                n4 = 1073741824;
            }
            else {
                n4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.n(view, n, n2, View$MeasureSpec.makeMeasureSpec(height, n4));
            b2 = true;
        }
        return b2;
    }
    
    public boolean qJ(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final aei a = ((aek)view2.getLayoutParams()).a;
        if (a instanceof AppBarLayout$BaseBehavior) {
            anb.F(view, view2.getBottom() - view.getTop() + ((AppBarLayout$BaseBehavior)a).a + super.f - this.B(view2));
        }
        if (view2 instanceof AppBarLayout) {
            final AppBarLayout appBarLayout = (AppBarLayout)view2;
            if (appBarLayout.d) {
                appBarLayout.o(appBarLayout.p(view));
            }
        }
        return false;
    }
    
    public final float x(final View view) {
        if (view instanceof AppBarLayout) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            final int g = appBarLayout.g();
            final int c = appBarLayout.c();
            final aei a = ((aek)appBarLayout.getLayoutParams()).a;
            int y;
            if (a instanceof AppBarLayout$BaseBehavior) {
                y = ((AppBarLayout$BaseBehavior)a).y();
            }
            else {
                y = 0;
            }
            if (c != 0 && g + y <= c) {
                return 0.0f;
            }
            final int n = g - c;
            if (n != 0) {
                return y / (float)n + 1.0f;
            }
        }
        return 0.0f;
    }
    
    public final int y(final View view) {
        return ((AppBarLayout)view).g();
    }
    
    public final /* bridge */ View z(final List list) {
        return (View)A(list);
    }
}
