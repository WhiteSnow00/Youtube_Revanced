// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.view.ViewGroup$MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.TimeInterpolator;
import java.util.LinkedHashSet;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior extends aeh
{
    public ViewPropertyAnimator a;
    private final LinkedHashSet b;
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g;
    private int h;
    
    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
    
    public HideBottomViewOnScrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
    
    private final void w(final View view, final int n, final long duration, final TimeInterpolator interpolator) {
        this.a = view.animate().translationY((float)n).setInterpolator(interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new adrb(this));
    }
    
    private final void x(final int h) {
        this.h = h;
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((adrc)iterator.next()).a();
        }
    }
    
    public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        this.g = view.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)view.getLayoutParams()).bottomMargin;
        this.c = adwd.j(view.getContext(), 2130969940, 225);
        this.d = adwd.j(view.getContext(), 2130969946, 175);
        this.e = adwd.o(view.getContext(), 2130969956, adqd.d);
        this.f = adwd.o(view.getContext(), 2130969956, adqd.c);
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
        return n == 2;
    }
    
    public final void sn(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (n2 > 0) {
            if (this.h != 1) {
                final ViewPropertyAnimator a = this.a;
                if (a != null) {
                    a.cancel();
                    view.clearAnimation();
                }
                this.x(1);
                this.w(view, this.g, this.d, this.f);
            }
        }
        else if (n2 < 0 && this.h != 2) {
            final ViewPropertyAnimator a2 = this.a;
            if (a2 != null) {
                a2.cancel();
                view.clearAnimation();
            }
            this.x(2);
            this.w(view, 0, this.c, this.e);
        }
    }
}
