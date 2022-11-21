// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.MotionEvent;

final class i implements ttb
{
    final k a;
    
    public i(final k a) {
        this.a = a;
    }
    
    public final boolean c(final MotionEvent motionEvent, final boolean b) {
        if (this.a.mm()) {
            final k a = this.a;
            if (a.M) {
                if (!a.E.e) {
                    if (aehz.b((int)motionEvent.getX(), this.a.g.getWidth(), false) != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void ph(final MotionEvent motionEvent, final boolean b) {
        if (this.a.U(motionEvent)) {
            final k a = this.a;
            a.E.a(motionEvent, (View)a.g);
        }
    }
}
