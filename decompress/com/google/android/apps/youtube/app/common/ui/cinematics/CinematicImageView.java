// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.cinematics;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

public class CinematicImageView extends AppCompatImageView
{
    public CinematicImageView(final Context context) {
        super(context);
    }
    
    public CinematicImageView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean hasOverlappingRendering() {
        return false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public final boolean performClick() {
        return false;
    }
}
