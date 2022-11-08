// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.view.View;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout extends FrameLayout
{
    private View$OnTouchListener a;
    
    public TouchObserverFrameLayout(final Context context) {
        super(context);
    }
    
    public TouchObserverFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public TouchObserverFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final View$OnTouchListener a = this.a;
        if (a != null) {
            a.onTouch((View)this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void setOnTouchListener(final View$OnTouchListener a) {
        this.a = a;
    }
}
