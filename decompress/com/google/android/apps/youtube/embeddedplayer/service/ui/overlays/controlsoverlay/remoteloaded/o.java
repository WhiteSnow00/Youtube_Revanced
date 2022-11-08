// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.MotionEvent;
import android.content.Context;
import android.os.Handler;
import j$.time.Duration;

public final class o
{
    public static final Duration a;
    public Runnable b;
    public final Handler c;
    public final abff d;
    public boolean e;
    public abfi f;
    private final aazw g;
    
    static {
        a = Duration.ofSeconds(10L);
    }
    
    public o(final Context context, final Handler c, final aazw g) {
        this.c = c;
        this.g = g;
        this.d = new n(context);
    }
    
    public final void a(final MotionEvent motionEvent, final View view) {
        final aeef aeef = new aeef(motionEvent, aeef.a(motionEvent, view.getWidth(), false), false);
        final int b = aeef.b;
        if (b != 0 && this.f != null) {
            if (b == 1) {
                this.g.m();
            }
            else {
                this.g.l();
            }
            this.d.d(aeef);
            this.c.removeCallbacks(this.b);
            this.c.postDelayed(this.b, 650L);
            this.e = true;
            this.f.g(this.d.b(), aeef, false);
        }
    }
    
    public final void b() {
        this.e = false;
        this.d.c();
    }
}
