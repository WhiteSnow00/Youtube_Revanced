// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class TouchListeningFrameLayout extends FrameLayout
{
    public tui a;
    
    public TouchListeningFrameLayout(final Context context) {
        super(context);
    }
    
    public TouchListeningFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public TouchListeningFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final tui a = this.a;
        if (a != null) {
            a.a((Object)motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
