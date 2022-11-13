// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui;

import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class SmoothHeightResizeLayout extends ViewGroup
{
    public boolean a;
    public float b;
    public int c;
    
    public SmoothHeightResizeLayout(final Context context) {
        super(context);
        this.b();
    }
    
    public SmoothHeightResizeLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public SmoothHeightResizeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    public SmoothHeightResizeLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b();
    }
    
    private final void b() {
        this.b = 1.0f;
        this.a = false;
    }
    
    public final void a(final float b) {
        final boolean b2 = true;
        adkp.Q(b >= 0.0f);
        adkp.Q(b <= 1.0f && b2);
        adkp.Q(this.a);
        this.b = b;
        this.requestLayout();
    }
    
    protected final void onLayout(final boolean b, int i, int measuredHeight, int c, int n) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        View child;
        for (i = 0; i < this.getChildCount(); ++i) {
            child = this.getChildAt(i);
            n = (measuredHeight = child.getMeasuredHeight());
            if (this.a) {
                c = this.c;
                if ((measuredHeight = n) < c) {
                    measuredHeight = c;
                }
            }
            this.getChildAt(i).layout(paddingLeft, paddingTop, child.getMeasuredWidth() + paddingLeft, measuredHeight + paddingTop);
        }
    }
    
    protected final void onMeasure(int i, int max) {
        final int size = View$MeasureSpec.getSize(i);
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        this.measureChildren(i, max);
        i = 0;
        max = 0;
        while (i < this.getChildCount()) {
            max = Math.max(max, this.getChildAt(i).getMeasuredHeight());
            ++i;
        }
        max += paddingTop + paddingBottom;
        if (this.a) {
            i = this.c;
            this.setMeasuredDimension(size, i + (int)((max - i) * this.b));
            return;
        }
        this.setMeasuredDimension(size, max);
        this.c = max;
    }
}
