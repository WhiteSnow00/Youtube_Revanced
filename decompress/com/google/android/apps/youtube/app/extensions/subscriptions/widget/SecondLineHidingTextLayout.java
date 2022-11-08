// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.subscriptions.widget;

import android.view.View;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class SecondLineHidingTextLayout extends LinearLayout
{
    public SecondLineHidingTextLayout(final Context context) {
        super(context);
    }
    
    public SecondLineHidingTextLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SecondLineHidingTextLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public SecondLineHidingTextLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (this.getChildCount() < 2) {
            super.onMeasure(n, n2);
            return;
        }
        final View child = this.getChildAt(0);
        final View child2 = this.getChildAt(1);
        super.onMeasure(n, n2);
        if (child instanceof TextView && child2 instanceof TextView) {
            if (((TextView)child).getLineCount() != 1 || ((TextView)child2).getLineCount() != 1) {
                child2.setVisibility(8);
                super.onMeasure(n, n2);
            }
        }
    }
}
