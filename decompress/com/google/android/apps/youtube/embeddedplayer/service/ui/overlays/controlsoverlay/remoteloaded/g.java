// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.content.Context;
import android.widget.FrameLayout;

final class g extends FrameLayout
{
    final l a;
    
    public g(final l a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.a.H();
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final boolean b = !keyEvent.isSystem() || aakt.i(n);
        if (b) {
            this.a.v();
        }
        final l a = this.a;
        if (a.G.a == abbx.d && b && n != 20 && n != 21 && n != 22 && n != 19) {
            a.b.o();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            final l a = this.a;
            if (a.G.a == abbx.d) {
                a.b.o();
                return true;
            }
        }
        final l a2 = this.a;
        if (a2.M) {
            ((tse)a2.c).d((View)a2.g, motionEvent);
        }
        else if (motionEvent.getActionMasked() == 1) {
            this.a.f.b(motionEvent);
        }
        return true;
    }
}
