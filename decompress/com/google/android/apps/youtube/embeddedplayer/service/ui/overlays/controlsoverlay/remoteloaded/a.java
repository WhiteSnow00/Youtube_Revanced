// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b;

public final class a implements Runnable
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final b e;
    
    public a(final b e, final long a, final long b, final long c, final long d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        this.e.a.n(this.a, this.b, this.c, this.d);
    }
}
