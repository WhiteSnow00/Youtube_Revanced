// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.editor;

import android.view.View;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class ShortsPlayerViewContainer extends FrameLayout
{
    public boolean a;
    public tzp b;
    private int c;
    private int d;
    
    public ShortsPlayerViewContainer(final Context context) {
        this(context, null);
    }
    
    public ShortsPlayerViewContainer(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ShortsPlayerViewContainer(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private final void a(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                this.measureChildWithMargins(child, measureSpec, 0, measureSpec2, 0);
            }
        }
        this.setMeasuredDimension(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
    }
    
    protected final void onMeasure(int n, int n2) {
        final tzp b = this.b;
        if (b != null && (b.b || b.a)) {
            if (this.a) {
                this.a(this.c, this.d);
                return;
            }
            n = View$MeasureSpec.getSize(n);
            n2 = View$MeasureSpec.getSize(n2);
            final float n3 = (float)n;
            final float n4 = (float)n2;
            final float c = b.c;
            if (n3 / n4 < c) {
                n2 = Math.round(n3 / c);
            }
            else {
                n = Math.round(n4 * c);
            }
            this.a(this.c = n, this.d = n2);
        }
        else {
            super.onMeasure(n, n2);
            if (this.a) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.c, 1073741824), View$MeasureSpec.makeMeasureSpec(this.d, 1073741824));
                return;
            }
            n2 = this.getMeasuredHeight();
            n = this.getMeasuredWidth();
            final float n5 = (float)n;
            final float n6 = (float)n2;
            if (n5 / n6 < 0.5625f) {
                n2 = Math.round(n5 / 0.5625f);
            }
            else {
                n = Math.round(n6 * 0.5625f);
            }
            this.c = n;
            this.d = n2;
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
        }
    }
}
