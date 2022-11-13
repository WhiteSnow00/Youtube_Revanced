// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

public final class b implements Runnable
{
    public final VideoQuality[] a;
    public final int b;
    public final boolean c;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b d;
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b d, final VideoQuality[] a, final int b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.d.c.o(this.a, this.b, this.c);
    }
}
