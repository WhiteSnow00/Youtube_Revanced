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

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends aei
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
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, advj.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
    
    private final boolean A(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final aduu aduu) {
        if (!this.z((View)appBarLayout, aduu)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        final Rect a = this.a;
        advn.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
        if (a.bottom <= appBarLayout.e()) {
            this.x(aduu);
        }
        else {
            this.w(aduu);
        }
        return true;
    }
    
    private final boolean B(final View view, final aduu aduu) {
        if (!this.z(view, aduu)) {
            return false;
        }
        if (view.getTop() < aduu.getHeight() / 2 + ((aek)aduu.getLayoutParams()).topMargin) {
            this.x(aduu);
        }
        else {
            this.w(aduu);
        }
        return true;
    }
    
    private static boolean y(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof aek && ((aek)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final boolean z(final View view, final aduu aduu) {
        final aek aek = (aek)aduu.getLayoutParams();
        return (this.b || this.c) && aek.f == view.getId();
    }
    
    public final /* bridge */ boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        final aduu aduu = (aduu)view;
        final List b = coordinatorLayout.b((View)aduu);
        for (int size = b.size(), i = 0; i < size; ++i) {
            final View view2 = b.get(i);
            if (view2 instanceof AppBarLayout) {
                if (this.A(coordinatorLayout, (AppBarLayout)view2, aduu)) {
                    break;
                }
            }
            else if (y(view2) && this.B(view2, aduu)) {
                break;
            }
        }
        coordinatorLayout.k((View)aduu, n);
        return true;
    }
    
    public final /* bridge */ boolean qJ(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final aduu aduu = (aduu)view;
        if (view2 instanceof AppBarLayout) {
            this.A(coordinatorLayout, (AppBarLayout)view2, aduu);
        }
        else if (y(view2)) {
            this.B(view2, aduu);
        }
        return false;
    }
    
    public final /* bridge */ boolean s(final View view, final Rect rect) {
        final aduu aduu = (aduu)view;
        return false;
    }
    
    public final void su(final aek aek) {
        if (aek.h == 0) {
            aek.h = 80;
        }
    }
    
    protected final void w(final aduu aduu) {
        if (this.c) {
            final int h = aduu.h;
            final advi e = aduu.e;
        }
        else {
            final int h2 = aduu.h;
            final advi f = aduu.f;
        }
        throw null;
    }
    
    protected final void x(final aduu aduu) {
        if (this.c) {
            final int h = aduu.h;
            final advi d = aduu.d;
        }
        else {
            final int h2 = aduu.h;
            final advi g = aduu.g;
        }
        throw null;
    }
}
