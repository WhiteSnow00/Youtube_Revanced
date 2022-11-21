// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ShortsEditCoordinatorLayout extends CoordinatorLayout
{
    public tui i;
    
    public ShortsEditCoordinatorLayout(final Context context) {
        super(context);
    }
    
    public ShortsEditCoordinatorLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ShortsEditCoordinatorLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final tui i = this.i;
        if (i != null) {
            i.a((Object)motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
