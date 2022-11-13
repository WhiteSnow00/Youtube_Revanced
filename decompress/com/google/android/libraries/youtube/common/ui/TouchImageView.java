// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class TouchImageView extends ImageView
{
    private boolean a;
    
    public TouchImageView(final Context context) {
        super(context);
        this.a = false;
    }
    
    public TouchImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.setPressed(this.a = true);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setPressed(final boolean pressed) {
        if (pressed && !this.a) {
            return;
        }
        this.a = false;
        super.setPressed(pressed);
    }
}
