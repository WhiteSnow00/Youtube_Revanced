// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;

public abstract class ActionBarColor$ColorConstantActionBarColor implements ActionBarColor
{
    public abstract int a();
    
    public final int mt(final Context context) {
        return context.getResources().getColor(this.a());
    }
}
