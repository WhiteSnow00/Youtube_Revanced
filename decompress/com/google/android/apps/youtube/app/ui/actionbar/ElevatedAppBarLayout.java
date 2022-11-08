// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.actionbar;

import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.appbar.AppBarLayout;

public final class ElevatedAppBarLayout extends AppBarLayout
{
    private float g;
    
    public ElevatedAppBarLayout(final Context context) {
        super(context);
    }
    
    public ElevatedAppBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void b(final boolean b) {
        float g;
        if (b) {
            g = 0.0f;
        }
        else {
            g = this.g;
        }
        super.setElevation(g);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (float)this.getResources().getDimensionPixelSize(2131165416);
    }
    
    public final void setElevation(final float n) {
        super.setElevation(this.g);
    }
}
