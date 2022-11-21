// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

final class h implements abii
{
    final k a;
    
    public h(final k a) {
        this.a = a;
    }
    
    public final void L() {
        final k a = this.a;
        if (a.N) {
            return;
        }
        a.N = true;
        a.V();
    }
    
    public final void M() {
        final k a = this.a;
        if (!a.N) {
            return;
        }
        a.N = false;
        a.V();
    }
}
