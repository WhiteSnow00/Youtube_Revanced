// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class CenteredHorizontalFlowLayout extends ViewGroup
{
    private final sxz a;
    
    public CenteredHorizontalFlowLayout(final Context context) {
        this(context, null);
    }
    
    public CenteredHorizontalFlowLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new sxz();
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (n2 == Integer.MIN_VALUE) {
            return Math.min(n3, n);
        }
        if (n2 != 1073741824) {
            return n3;
        }
        return n;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(new ViewGroup$LayoutParams(-2, -2));
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(this.getContext(), set);
    }
    
    protected final void onLayout(final boolean b, int i, int n, int paddingRight, int paddingBottom) {
        final sxz a = this.a;
        n = this.getPaddingLeft();
        i = this.getPaddingTop();
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        this.getWidth();
        a.c(n, i, paddingRight, paddingBottom, this.getWidth(), anc.f((View)this), true);
        View child;
        for (n = this.getChildCount(), i = 0; i < n; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                this.a.a(child);
            }
        }
        this.a.b();
    }
    
    protected final void onMeasure(int a, final int n) {
        final int size = View$MeasureSpec.getSize(a);
        final int mode = View$MeasureSpec.getMode(a);
        int n2;
        if (mode == 0) {
            n2 = Integer.MAX_VALUE;
        }
        else {
            n2 = size;
        }
        final int size2 = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n);
        this.a.c(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom(), n2, anc.f((View)this), false);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
                adme.L(viewGroup$MarginLayoutParams.height != -1, "A child view in HorizontalFlowLayout has a layoutParam.height: MATCH_PARENT which is not supported");
                child.measure(getChildMeasureSpec(a, this.getPaddingLeft() + this.getPaddingRight(), viewGroup$MarginLayoutParams.width), getChildMeasureSpec(n, this.getPaddingTop() + this.getPaddingBottom(), viewGroup$MarginLayoutParams.height));
                this.a.a(child);
            }
        }
        this.a.b();
        a = a(size, mode, this.a.a.width());
        final sxz a2 = this.a;
        this.setMeasuredDimension(a, a(size2, mode2, a2.a.height() + a2.b));
    }
}
