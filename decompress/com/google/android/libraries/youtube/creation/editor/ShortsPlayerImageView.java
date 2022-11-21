// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.editor;

import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

public class ShortsPlayerImageView extends AppCompatImageView
{
    public float a;
    public tzp b;
    
    public ShortsPlayerImageView(final Context context) {
        this(context, null);
    }
    
    public ShortsPlayerImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ShortsPlayerImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 0.0f;
    }
    
    protected final void onMeasure(int round, int round2) {
        final tzp b = this.b;
        if (b != null && b.b && this.a != 0.0f) {
            final int size = View$MeasureSpec.getSize(round2);
            final int size2 = View$MeasureSpec.getSize(round);
            if (this.a > 1.0f) {
                round2 = Math.round(View$MeasureSpec.getSize(round2) * this.a);
                round = size;
            }
            else {
                round = Math.round(View$MeasureSpec.getSize(round) / this.a);
                round2 = size2;
            }
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = View$MeasureSpec.makeMeasureSpec(round2, 1073741824);
                layoutParams.height = View$MeasureSpec.makeMeasureSpec(round, 1073741824);
                this.setLayoutParams(layoutParams);
            }
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(round2, 1073741824), View$MeasureSpec.makeMeasureSpec(round, 1073741824));
            return;
        }
        super.onMeasure(round, round2);
    }
}
