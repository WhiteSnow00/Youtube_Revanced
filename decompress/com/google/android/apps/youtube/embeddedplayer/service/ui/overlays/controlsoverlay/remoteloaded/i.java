// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

final class i implements abhb
{
    final l a;
    
    public i(final l a) {
        this.a = a;
    }
    
    public final void K() {
        final l a = this.a;
        if (a.N) {
            return;
        }
        a.N = true;
        a.V();
    }
    
    public final void L() {
        final l a = this.a;
        if (!a.N) {
            return;
        }
        a.N = false;
        a.V();
    }
}
