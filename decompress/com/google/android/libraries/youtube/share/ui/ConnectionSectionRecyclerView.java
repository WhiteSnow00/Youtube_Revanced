// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.share.ui;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class ConnectionSectionRecyclerView extends RecyclerView
{
    private aukv aa;
    
    public ConnectionSectionRecyclerView(final Context context) {
        super(context);
        this.aa = new aukv((View)this);
    }
    
    public ConnectionSectionRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.aa = new aukv((View)this);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.canScrollHorizontally(1) || this.canScrollHorizontally(-1)) {
            this.aa.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
