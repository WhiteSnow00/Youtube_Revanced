// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.swipetocontainer;

import android.util.AttributeSet;
import android.content.Context;

public class DrawerContainerLayout extends kqx
{
    public DrawerContainerLayout(final Context context) {
        this(context, null);
    }
    
    public DrawerContainerLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public DrawerContainerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i(1);
    }
}
