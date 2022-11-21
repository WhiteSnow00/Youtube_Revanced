// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.util.TypedValue;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.view.animation.Animation$AnimationListener;

public final class f implements Animation$AnimationListener
{
    public final ImageView a;
    public final Animation b;
    public final float c;
    private final float d;
    
    public f(final ImageView a, final Animation b) {
        this.a = a;
        this.b = b;
        this.c = a(a.getResources(), 2131168667);
        this.d = a(a.getResources(), 2131168666);
    }
    
    static float a(final Resources resources, final int n) {
        final TypedValue typedValue = new TypedValue();
        resources.getValue(n, typedValue, true);
        return typedValue.getFloat();
    }
    
    public final void onAnimationEnd(final Animation animation) {
        this.a.clearAnimation();
        this.a.setAlpha(this.d);
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
