// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.util.AttributeSet;
import android.content.Context;

public class ReelWatchPagerViewPager extends tss
{
    public boolean h;
    public boolean i;
    private final bx j;
    
    public ReelWatchPagerViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = false;
        this.i = false;
        this.j = new bx(context, (GestureDetector$OnGestureListener)new hpn(this));
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 0xFF) == 0x0) {
            this.i = false;
        }
        this.j.y(motionEvent);
        return !this.i && (this.h && super.onInterceptTouchEvent(motionEvent));
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.h && super.onTouchEvent(motionEvent);
    }
}
