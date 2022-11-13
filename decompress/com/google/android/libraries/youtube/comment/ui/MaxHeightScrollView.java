// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ScrollView;

public class MaxHeightScrollView extends ScrollView
{
    private int a;
    
    public MaxHeightScrollView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, snh.a, 0, 0);
        try {
            this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, 0);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        int min = n2;
        if (View$MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
            min = Math.min(View$MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE), n2);
        }
        super.onMeasure(n, min);
    }
}
