// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;

public final class b implements h
{
    final h[] a;
    
    public b(final h[] a) {
        this.a = a;
    }
    
    @Override
    public final void rd(final boolean b) {
        final h[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].rd(b);
        }
    }
    
    @Override
    public final void rf(final g g) {
        final h[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].rf(g);
        }
    }
}
