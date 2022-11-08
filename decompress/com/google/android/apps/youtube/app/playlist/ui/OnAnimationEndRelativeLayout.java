// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.playlist.ui;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class OnAnimationEndRelativeLayout extends RelativeLayout
{
    public Runnable a;
    
    public OnAnimationEndRelativeLayout(final Context context) {
        super(context);
    }
    
    public OnAnimationEndRelativeLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public OnAnimationEndRelativeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Runnable a = this.a;
        if (a != null) {
            a.run();
        }
    }
}
