// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class HeightTransitionLayout extends FrameLayout
{
    public int a;
    private int b;
    
    public HeightTransitionLayout(final Context context) {
        super(context);
        this.b = -1;
        this.a = 0;
    }
    
    public HeightTransitionLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = -1;
        this.a = 0;
    }
    
    public HeightTransitionLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = -1;
        this.a = 0;
    }
    
    public HeightTransitionLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b = -1;
        this.a = 0;
    }
    
    public final void a(final int b) {
        this.b = b;
        this.requestLayout();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        adkp.R(this.getChildCount() == 0, (Object)"HeightTransitionLayout only supports a single child.");
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View child = this.getChildAt(0);
        if (this.b != -1 && child != null && child.getHeight() < this.getHeight()) {
            child.setBottom(child.getTop() + this.getHeight());
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.a = this.getMeasuredHeight();
        if (this.b != -1) {
            this.setMeasuredDimension(resolveSize(this.getMeasuredWidth(), n), resolveSize(this.b, n2));
        }
    }
}
