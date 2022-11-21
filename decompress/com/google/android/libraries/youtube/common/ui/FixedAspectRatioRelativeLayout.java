// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class FixedAspectRatioRelativeLayout extends RelativeLayout
{
    public float a;
    private boolean b;
    private int c;
    private int d;
    
    public FixedAspectRatioRelativeLayout(final Context context) {
        super(context);
        this.a = 1.0f;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
    }
    
    public FixedAspectRatioRelativeLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, trt.d);
        this.a = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        this.b = obtainStyledAttributes.getBoolean(1, false);
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }
    
    public final void a(final int d) {
        this.d = d;
        this.requestLayout();
    }
    
    public final void b(final int c) {
        this.c = c;
        this.requestLayout();
    }
    
    protected final void onMeasure(int n, final int n2) {
        if (this.b) {
            super.onMeasure(n, n2);
            return;
        }
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            n = Math.min(this.c, View$MeasureSpec.getSize(n));
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec((int)(n / this.a), 1073741824));
            return;
        }
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            n = Math.min(this.d, View$MeasureSpec.getSize(n2));
            super.onMeasure(View$MeasureSpec.makeMeasureSpec((int)(n * this.a), 1073741824), View$MeasureSpec.makeMeasureSpec(n, 1073741824));
            return;
        }
        super.onMeasure(n, n2);
    }
}
