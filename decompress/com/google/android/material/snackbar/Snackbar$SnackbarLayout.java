// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;

public final class Snackbar$SnackbarLayout extends adxc
{
    public Snackbar$SnackbarLayout(final Context context) {
        super(context);
    }
    
    public Snackbar$SnackbarLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected final void onMeasure(int i, int paddingLeft) {
        super.onMeasure(i, paddingLeft);
        final int childCount = this.getChildCount();
        final int measuredWidth = this.getMeasuredWidth();
        paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        View child;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getLayoutParams().width == -1) {
                child.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth - paddingLeft - paddingRight, 1073741824), View$MeasureSpec.makeMeasureSpec(child.getMeasuredHeight(), 1073741824));
            }
        }
    }
}
