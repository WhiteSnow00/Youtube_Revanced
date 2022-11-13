// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.studio.elements.charts;

import android.text.Layout;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;

public class WrapWidthBaselineTextView extends pdx
{
    public WrapWidthBaselineTextView(final Context context) {
        super(context);
    }
    
    public WrapWidthBaselineTextView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public WrapWidthBaselineTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onMeasure(int i, final int n) {
        Layout layout;
        if ((layout = this.getLayout()) == null) {
            super.onMeasure(i, n);
            layout = this.getLayout();
        }
        if (layout != null) {
            final int lineCount = layout.getLineCount();
            i = 0;
            float max = 0.0f;
            while (i < lineCount) {
                max = Math.max(max, layout.getLineWidth(i));
                ++i;
            }
            i = View$MeasureSpec.makeMeasureSpec((int)Math.ceil(max) + this.getCompoundPaddingLeft() + this.getCompoundPaddingRight(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, n);
    }
}
