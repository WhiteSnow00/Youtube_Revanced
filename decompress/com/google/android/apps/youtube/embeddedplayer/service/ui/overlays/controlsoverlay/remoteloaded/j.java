// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.MotionEvent;

final class j implements ttf
{
    final k a;
    
    public j(final k a) {
        this.a = a;
    }
    
    public final void b(final MotionEvent motionEvent) {
        if (!this.a.mm()) {
            return;
        }
        if (this.a.U(motionEvent)) {
            final k a = this.a;
            final o e = a.E;
            if (e.e) {
                e.a(motionEvent, (View)a.g);
                return;
            }
        }
        final k a2 = this.a;
        if (a2.I) {
            if (!a2.H.o) {
                a2.O();
            }
        }
        else if (a2.T()) {
            a2.H();
            this.a.Q(true);
        }
    }
}
