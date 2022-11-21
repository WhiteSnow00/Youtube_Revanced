// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class MetadataHighlightsColumnLinearLayout extends LinearLayout
{
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public MetadataHighlightsColumnLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167977);
        this.a = dimensionPixelSize + dimensionPixelSize;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, jcd.a, 0, 0);
        this.b = obtainStyledAttributes.getInteger(2, 1);
        this.d = aaa.a(obtainStyledAttributes.getInteger(0, 1), 1, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
    
    public final void b(final int e) {
        if (this.e != e) {
            this.e = e;
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(this.e, jcd.a);
            this.b = obtainStyledAttributes.getInteger(2, 1);
            this.d = aaa.a(obtainStyledAttributes.getInteger(0, 1), 1, this.b);
            this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            this.requestLayout();
        }
    }
    
    protected void onMeasure(int a, final int n) {
        if (View$MeasureSpec.getMode(a) == 0) {
            super.onMeasure(a, n);
            return;
        }
        final int size = View$MeasureSpec.getSize(a);
        final int c = alm.c((ViewGroup$MarginLayoutParams)this.getLayoutParams());
        final int b = alm.b((ViewGroup$MarginLayoutParams)this.getLayoutParams());
        final int b2 = this.b;
        a = this.a;
        final int n2 = (size + (c + b) - b2 * a - this.c) / b2;
        final int d = this.d;
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n2 * d + (d - 1) * a, 1073741824), n);
    }
}
