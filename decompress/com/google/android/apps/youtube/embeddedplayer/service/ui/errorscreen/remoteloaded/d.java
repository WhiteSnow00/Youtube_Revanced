// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.view.View;
import android.view.ViewGroup;

public final class d implements abbl
{
    public final ViewGroup a;
    public final b b;
    
    public d(final ViewGroup a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void d(final abbm abbm, final View view) {
        this.a.addView(view, this.b.a());
    }
}
