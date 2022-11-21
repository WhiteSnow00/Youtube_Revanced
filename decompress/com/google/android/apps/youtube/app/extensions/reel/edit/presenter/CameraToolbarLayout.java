// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.presenter;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public final class CameraToolbarLayout extends LinearLayout
{
    public oqz a;
    
    public CameraToolbarLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final oqz a = this.a;
        if (a != null) {
            final EffectsFeatureDescriptionView an = ((gxg)a.a).an;
            if (an != null) {
                an.d();
            }
        }
        return false;
    }
}
