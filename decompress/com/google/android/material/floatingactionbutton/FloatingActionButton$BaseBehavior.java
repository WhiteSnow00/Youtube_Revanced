// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import java.util.List;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

public class FloatingActionButton$BaseBehavior extends aeh
{
    private Rect a;
    private boolean b;
    
    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }
    
    public FloatingActionButton$BaseBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adth.c);
        this.b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    private static boolean w(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof aej && ((aej)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final boolean x(final View view, final FloatingActionButton floatingActionButton) {
        final aej aej = (aej)floatingActionButton.getLayoutParams();
        return this.b && aej.f == view.getId() && floatingActionButton.d == 0;
    }
    
    private final boolean y(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final FloatingActionButton floatingActionButton) {
        if (!this.x((View)appBarLayout, floatingActionButton)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        final Rect a = this.a;
        adtl.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
        if (a.bottom <= appBarLayout.e()) {
            floatingActionButton.e();
        }
        else {
            floatingActionButton.f();
        }
        return true;
    }
    
    private final boolean z(final View view, final FloatingActionButton floatingActionButton) {
        if (!this.x(view, floatingActionButton)) {
            return false;
        }
        if (view.getTop() < floatingActionButton.getHeight() / 2 + ((aej)floatingActionButton.getLayoutParams()).topMargin) {
            floatingActionButton.e();
        }
        else {
            floatingActionButton.f();
        }
        return true;
    }
    
    public final void so(final aej aej) {
        if (aej.h == 0) {
            aej.h = 80;
        }
    }
}
