// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class FillContentLayout extends FrameLayout
{
    private int a;
    private int b;
    
    public FillContentLayout(final Context context) {
        this(context, null);
    }
    
    public FillContentLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130970442);
    }
    
    public FillContentLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aefr.f, n, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }
    
    private static int a(int max, final int n, final int n2) {
        max = Math.max(0, max - n);
        if (n2 >= 0) {
            return View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
        }
        if (n2 == -1) {
            return View$MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (n2 == -2) {
            return View$MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return 0;
    }
    
    protected final void onMeasure(int i, int childCount) {
        this.setMeasuredDimension(getDefaultSize(this.getSuggestedMinimumWidth(), i), getDefaultSize(this.getSuggestedMinimumHeight(), childCount));
        View child;
        int measuredWidth;
        int measuredHeight;
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            measuredWidth = this.getMeasuredWidth();
            measuredHeight = this.getMeasuredHeight();
            viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
            child.measure(a(Math.min(this.a, measuredWidth), this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.width), a(Math.min(this.b, measuredHeight), this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, viewGroup$MarginLayoutParams.height));
        }
    }
}
