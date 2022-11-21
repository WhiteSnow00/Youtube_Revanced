// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.f;
import android.graphics.drawable.Drawable;

public final class b extends cjy
{
    public final MutedAutoplayIndicator b;
    
    public b(final MutedAutoplayIndicator b) {
        this.b = b;
    }
    
    @Override
    public final void b(final Drawable drawable) {
        this.b.post((Runnable)new f(this, 2));
    }
}
