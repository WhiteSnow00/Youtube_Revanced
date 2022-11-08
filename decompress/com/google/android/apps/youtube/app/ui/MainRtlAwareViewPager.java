// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import androidx.viewpager.widget.ViewPager;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;

public class MainRtlAwareViewPager extends jsu
{
    public ashj h;
    
    public MainRtlAwareViewPager(final Context context) {
        super(context);
    }
    
    public MainRtlAwareViewPager(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (((ViewPager)this).canScrollHorizontally(-1)) {
                this.h.tr(new kyp());
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
