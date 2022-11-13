// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ScrollView;

public class OverridingScrollView extends ScrollView
{
    public OverridingScrollView(final Context context) {
        super(context);
    }
    
    public OverridingScrollView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public OverridingScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final ViewParent parent = this.getParent();
        final int actionMasked = motionEvent.getActionMasked();
        boolean b = true;
        if (actionMasked == 1) {
            b = false;
        }
        parent.requestDisallowInterceptTouchEvent(b);
        return super.dispatchTouchEvent(motionEvent);
    }
}
