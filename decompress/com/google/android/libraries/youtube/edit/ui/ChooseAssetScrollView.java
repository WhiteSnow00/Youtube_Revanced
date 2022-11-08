// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.HorizontalScrollView;

public class ChooseAssetScrollView extends HorizontalScrollView
{
    public ChooseAssetScrollView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final ViewParent parent = this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
