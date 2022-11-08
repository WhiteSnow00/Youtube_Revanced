// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ScrollView;

public class BottomScrollView extends ScrollView
{
    private final Runnable a;
    
    public BottomScrollView(final Context context) {
        super(context);
        this.a = (Runnable)new thr(18);
    }
    
    public BottomScrollView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = (Runnable)new thr(18);
    }
    
    public BottomScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = (Runnable)new thr(18);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View child = this.getChildAt(0);
        if (child != null) {
            Math.max(0, child.getMeasuredHeight() - n4 + n2 - this.getPaddingBottom());
        }
        if (n4 - n2 > 0) {
            this.post(this.a);
        }
    }
    
    protected void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
    }
}
