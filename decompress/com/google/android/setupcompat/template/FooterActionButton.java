// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.template;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class FooterActionButton extends Button
{
    public aedg a;
    public boolean b;
    
    public FooterActionButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
