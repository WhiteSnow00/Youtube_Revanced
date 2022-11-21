// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

public final class b implements Runnable
{
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;
    public final CharSequence d;
    public final int e;
    public final CharSequence f;
    public final int g;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b h;
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b h, final CharSequence a, final CharSequence b, final boolean c, final CharSequence d, final int e, final CharSequence f, final int g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.h.a.t(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
