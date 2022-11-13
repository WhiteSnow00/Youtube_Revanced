// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.MotionEvent;

final class j implements trz
{
    final l a;
    
    public j(final l a) {
        this.a = a;
    }
    
    public final boolean c(final MotionEvent motionEvent, final boolean b) {
        if (this.a.mn()) {
            final l a = this.a;
            if (a.M) {
                if (!a.E.e) {
                    if (aegg.b((int)motionEvent.getX(), this.a.g.getWidth(), false) != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void pg(final MotionEvent motionEvent, final boolean b) {
        if (this.a.U(motionEvent)) {
            final l a = this.a;
            a.E.a(motionEvent, (View)a.g);
        }
    }
}
