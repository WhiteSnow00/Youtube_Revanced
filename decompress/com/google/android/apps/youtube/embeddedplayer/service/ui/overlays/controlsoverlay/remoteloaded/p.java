// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import android.view.MotionEvent;
import android.content.Context;
import android.os.Handler;
import j$.time.Duration;

public final class p
{
    public static final Duration a;
    public Runnable b;
    public final Handler c;
    public final abgz d;
    public boolean e;
    public abhc f;
    private final abbr g;
    
    static {
        a = Duration.ofSeconds(10L);
    }
    
    public p(final Context context, final Handler c, final abbr g) {
        this.c = c;
        this.g = g;
        this.d = new o(context);
    }
    
    public final void a(final MotionEvent motionEvent, final View view) {
        final aegg aegg = new aegg(motionEvent, aegg.a(motionEvent, view.getWidth(), false), false);
        final int b = aegg.b;
        if (b != 0 && this.f != null) {
            if (b == 1) {
                this.g.m();
            }
            else {
                this.g.l();
            }
            this.d.d(aegg);
            this.c.removeCallbacks(this.b);
            this.c.postDelayed(this.b, 650L);
            this.e = true;
            this.f.g(this.d.b(), aegg, false);
        }
    }
    
    public final void b() {
        this.e = false;
        this.d.c();
    }
}
