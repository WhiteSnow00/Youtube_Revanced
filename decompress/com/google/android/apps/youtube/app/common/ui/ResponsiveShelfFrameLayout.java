// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class ResponsiveShelfFrameLayout extends FrameLayout
{
    private final int a;
    private final int b;
    private final int c;
    
    public ResponsiveShelfFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fyo.a);
        this.a = obtainStyledAttributes.getInteger(0, 1);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
    }
    
    protected final void onMeasure(int n, final int n2) {
        if (View$MeasureSpec.getMode(n) == 0) {
            super.onMeasure(n, n2);
            return;
        }
        final int size = View$MeasureSpec.getSize(n);
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        n = size;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n = size + (all.c(viewGroup$MarginLayoutParams) + all.b(viewGroup$MarginLayoutParams));
        }
        final int a = this.a;
        super.onMeasure(View$MeasureSpec.makeMeasureSpec((n - (a + 1) * this.b - this.c) / a, 1073741824), n2);
    }
}
