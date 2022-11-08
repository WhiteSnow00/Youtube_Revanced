// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

final class h implements abfh
{
    final /* synthetic */ k a;
    
    public h(final k a) {
        this.a = a;
    }
    
    @Override
    public final void K() {
        final k a = this.a;
        if (a.N) {
            return;
        }
        a.N = true;
        a.V();
    }
    
    @Override
    public final void L() {
        final k a = this.a;
        if (!a.N) {
            return;
        }
        a.N = false;
        a.V();
    }
}
