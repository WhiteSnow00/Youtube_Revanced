// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.view.MotionEvent;
import android.content.Context;
import android.widget.FrameLayout;

final class b extends FrameLayout
{
    final /* synthetic */ c a;
    
    public b(final c a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            final c a = this.a;
            if (a.b) {
                a.a.a();
            }
        }
        return true;
    }
}
