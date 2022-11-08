// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;

public abstract class ActionBarColor$TransformAlphaActionBarColor implements ActionBarColor
{
    public abstract int a();
    
    public abstract ActionBarColor b();
    
    public final int mt(final Context context) {
        return tmy.b(this.b().mt(context), this.a());
    }
}
