// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e;
import android.graphics.drawable.Drawable;

public final class b extends cjv
{
    public final MutedAutoplayIndicator b;
    
    public b(final MutedAutoplayIndicator b) {
        this.b = b;
    }
    
    public final void b(final Drawable drawable) {
        this.b.post((Runnable)new e(this, 4));
    }
}
