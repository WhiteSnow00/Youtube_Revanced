// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.q;
import android.view.MotionEvent;
import android.content.Context;
import android.widget.FrameLayout;

final class a extends FrameLayout
{
    final b a;
    
    public a(final b a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            final b a = this.a;
            if (a.c) {
                final pvh e = a.e;
                if (e != null) {
                    ((q)((pvh)e.a).a).o();
                }
            }
        }
        return true;
    }
}
