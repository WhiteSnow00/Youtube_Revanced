// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class FixedAspectRatioFrameLayout extends FrameLayout
{
    public float a;
    
    public FixedAspectRatioFrameLayout(final Context context) {
        super(context);
        this.a = 1.0f;
    }
    
    public FixedAspectRatioFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, tqs.c);
        this.a = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec((int)(View$MeasureSpec.getSize(n) / this.a), 1073741824));
            return;
        }
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec((int)(View$MeasureSpec.getSize(n2) * this.a), 1073741824), n2);
            return;
        }
        super.onMeasure(n, n2);
    }
}
