// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

public final class c extends a implements SurfaceHolder$Callback
{
    private final SurfaceHolder c;
    private boolean d;
    
    public c(final SurfaceHolder c, final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c2) {
        super(c2);
        c.getClass();
        (this.c = c).addCallback((SurfaceHolder$Callback)this);
    }
    
    public final SurfaceHolder A() {
        return this.c;
    }
    
    public final zfp B() {
        return zfp.d;
    }
    
    public final void C() {
        final Surface d = ((b)this.c).d;
        if (d != null) {
            d.release();
        }
    }
    
    public final boolean D() {
        return this.d;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final zfm b = this.b;
        if (b != null) {
            b.d();
        }
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.d = true;
        final zfm b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.d = false;
        final zfm b = this.b;
        if (b != null) {
            b.f();
        }
    }
    
    public final Surface z() {
        return ((b)this.c).d;
    }
}
