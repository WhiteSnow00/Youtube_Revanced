// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.view.View$MeasureSpec;
import android.view.WindowManager;
import android.util.AttributeSet;
import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;

public class FractionalHeightLimitingLayout extends FrameLayout
{
    private final DisplayMetrics a;
    private float b;
    
    public FractionalHeightLimitingLayout(final Context context) {
        this(context, null);
    }
    
    public FractionalHeightLimitingLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new DisplayMetrics();
        this.b = 0.82f;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.a);
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec((int)(this.a.heightPixels * this.b), Integer.MIN_VALUE));
    }
}
