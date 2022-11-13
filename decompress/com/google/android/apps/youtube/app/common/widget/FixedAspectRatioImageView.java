// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class FixedAspectRatioImageView extends ImageView
{
    private float a;
    
    public FixedAspectRatioImageView(final Context context) {
        this(context, null);
    }
    
    public FixedAspectRatioImageView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.a = 0.0f;
        if (set != null) {
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, gmt.a);
            try {
                this.a = ((TypedArray)obtainStyledAttributes).getFraction(0, 1, 1, this.a);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
    }
    
    protected final void onMeasure(int min, int round) {
        if (this.a <= 0.0f) {
            super.onMeasure(min, round);
            return;
        }
        final int mode = View$MeasureSpec.getMode(min);
        final int size = View$MeasureSpec.getSize(min);
        final int mode2 = View$MeasureSpec.getMode(round);
        final int size2 = View$MeasureSpec.getSize(round);
        if (mode == 0) {
            if (mode2 != 0) {
                final float a = this.a;
                final StringBuilder sb = new StringBuilder("Aspect ratio not preserved in onMeasure: aspect ratio=");
                sb.append(a);
                sb.append(", width=");
                sb.append(size);
                sb.append(", widthMode=0, height=");
                sb.append(size2);
                sb.append(", heightMode=");
                sb.append(mode2);
                Log.w("FixedAspectRatioImageView", sb.toString());
            }
            super.onMeasure(min, round);
        }
        round = Math.round(size / this.a);
        if (mode2 != Integer.MIN_VALUE) {
            min = size2;
            if (mode2 != 1073741824) {
                min = round;
            }
        }
        else {
            min = Math.min(round, size2);
        }
        this.setMeasuredDimension(size, min);
    }
}
