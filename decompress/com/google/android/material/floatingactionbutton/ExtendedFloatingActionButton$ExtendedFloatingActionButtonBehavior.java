// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import java.util.List;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends aeh
{
    private Rect a;
    private boolean b;
    private boolean c;
    
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }
    
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adth.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
    
    private final boolean A(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final adss adss) {
        if (!this.z((View)appBarLayout, adss)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        final Rect a = this.a;
        adtl.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
        if (a.bottom <= appBarLayout.e()) {
            this.x(adss);
        }
        else {
            this.w(adss);
        }
        return true;
    }
    
    private final boolean B(final View view, final adss adss) {
        if (!this.z(view, adss)) {
            return false;
        }
        if (view.getTop() < adss.getHeight() / 2 + ((aej)adss.getLayoutParams()).topMargin) {
            this.x(adss);
        }
        else {
            this.w(adss);
        }
        return true;
    }
    
    private static boolean y(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof aej && ((aej)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final boolean z(final View view, final adss adss) {
        final aej aej = (aej)adss.getLayoutParams();
        return (this.b || this.c) && aej.f == view.getId();
    }
    
    public final void so(final aej aej) {
        if (aej.h == 0) {
            aej.h = 80;
        }
    }
    
    protected final void w(final adss adss) {
        if (this.c) {
            final int h = adss.h;
            final adtg e = adss.e;
        }
        else {
            final int h2 = adss.h;
            final adtg f = adss.f;
        }
        throw null;
    }
    
    protected final void x(final adss adss) {
        if (this.c) {
            final int h = adss.h;
            final adtg d = adss.d;
        }
        else {
            final int h2 = adss.h;
            final adtg g = adss.g;
        }
        throw null;
    }
}
