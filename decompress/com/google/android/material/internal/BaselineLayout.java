// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup
{
    private int a;
    
    public BaselineLayout(final Context context) {
        super(context, (AttributeSet)null, 0);
        this.a = -1;
    }
    
    public BaselineLayout(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.a = -1;
    }
    
    public BaselineLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = -1;
    }
    
    public final int getBaseline() {
        return this.a;
    }
    
    protected final void onLayout(final boolean b, final int n, int i, final int n2, int n3) {
        final int childCount = this.getChildCount();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        View child;
        int measuredWidth;
        int measuredHeight;
        int n4;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n4 = (n2 - n - paddingRight - paddingLeft - measuredWidth) / 2 + paddingLeft;
                if (this.a != -1 && child.getBaseline() != -1) {
                    n3 = this.a + paddingTop - child.getBaseline();
                }
                else {
                    n3 = paddingTop;
                }
                child.layout(n4, n3, measuredWidth + n4, measuredHeight + n3);
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int a = -1;
        int n6 = -1;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int max = n3;
            int max2 = n4;
            int combineMeasuredStates = n5;
            int max3 = a;
            int max4 = n6;
            if (child.getVisibility() != 8) {
                this.measureChild(child, n, n2);
                final int baseline = child.getBaseline();
                max3 = a;
                max4 = n6;
                if (baseline != -1) {
                    max3 = Math.max(a, baseline);
                    max4 = Math.max(n6, child.getMeasuredHeight() - baseline);
                }
                max2 = Math.max(n4, child.getMeasuredWidth());
                max = Math.max(n3, child.getMeasuredHeight());
                combineMeasuredStates = View.combineMeasuredStates(n5, child.getMeasuredState());
            }
            ++i;
            n3 = max;
            n4 = max2;
            n5 = combineMeasuredStates;
            a = max3;
            n6 = max4;
        }
        int max5 = n3;
        if (a != -1) {
            max5 = Math.max(n3, Math.max(n6, this.getPaddingBottom()) + a);
            this.a = a;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(n4, this.getSuggestedMinimumWidth()), n, n5), View.resolveSizeAndState(Math.max(max5, this.getSuggestedMinimumHeight()), n2, n5 << 16));
    }
}
