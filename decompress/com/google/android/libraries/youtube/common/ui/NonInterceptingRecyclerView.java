// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class NonInterceptingRecyclerView extends RecyclerView
{
    public NonInterceptingRecyclerView(final Context context) {
        super(context);
    }
    
    public NonInterceptingRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
}
