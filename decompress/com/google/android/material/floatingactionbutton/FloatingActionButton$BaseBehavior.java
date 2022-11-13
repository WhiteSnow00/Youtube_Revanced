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

public class FloatingActionButton$BaseBehavior extends aei
{
    private Rect a;
    private boolean b;
    
    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }
    
    public FloatingActionButton$BaseBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, advj.c);
        this.b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    private static boolean w(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof aek && ((aek)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final boolean x(final View view, final FloatingActionButton floatingActionButton) {
        final aek aek = (aek)floatingActionButton.getLayoutParams();
        return this.b && aek.f == view.getId() && floatingActionButton.d == 0;
    }
    
    private final boolean y(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final FloatingActionButton floatingActionButton) {
        if (!this.x((View)appBarLayout, floatingActionButton)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        final Rect a = this.a;
        advn.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
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
        if (view.getTop() < floatingActionButton.getHeight() / 2 + ((aek)floatingActionButton.getLayoutParams()).topMargin) {
            floatingActionButton.e();
        }
        else {
            floatingActionButton.f();
        }
        return true;
    }
    
    public final /* bridge */ boolean h(final CoordinatorLayout coordinatorLayout, final View view, int right) {
        final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
        final List b = coordinatorLayout.b((View)floatingActionButton);
        final int size = b.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final View view2 = b.get(i);
            if (view2 instanceof AppBarLayout) {
                if (this.y(coordinatorLayout, (AppBarLayout)view2, floatingActionButton)) {
                    break;
                }
            }
            else if (w(view2) && this.z(view2, floatingActionButton)) {
                break;
            }
        }
        coordinatorLayout.k((View)floatingActionButton, right);
        final Rect c = floatingActionButton.c;
        if (c != null && c.centerX() > 0 && c.centerY() > 0) {
            final aek aek = (aek)floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - aek.rightMargin) {
                right = c.right;
            }
            else if (floatingActionButton.getLeft() <= aek.leftMargin) {
                right = -c.left;
            }
            else {
                right = 0;
            }
            int bottom;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - aek.bottomMargin) {
                bottom = c.bottom;
            }
            else {
                bottom = n;
                if (floatingActionButton.getTop() <= aek.topMargin) {
                    bottom = -c.top;
                }
            }
            if (bottom != 0) {
                anb.F((View)floatingActionButton, bottom);
            }
            if (right != 0) {
                anb.E((View)floatingActionButton, right);
            }
        }
        return true;
    }
    
    public final /* bridge */ boolean qJ(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
        if (view2 instanceof AppBarLayout) {
            this.y(coordinatorLayout, (AppBarLayout)view2, floatingActionButton);
        }
        else if (w(view2)) {
            this.z(view2, floatingActionButton);
        }
        return false;
    }
    
    public final /* bridge */ boolean s(final View view, final Rect rect) {
        final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
        final Rect c = floatingActionButton.c;
        rect.set(floatingActionButton.getLeft() + c.left, floatingActionButton.getTop() + c.top, floatingActionButton.getRight() - c.right, floatingActionButton.getBottom() - c.bottom);
        return true;
    }
    
    public final void su(final aek aek) {
        if (aek.h == 0) {
            aek.h = 80;
        }
    }
}
