// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c;
import android.view.Surface;

public final class d extends a
{
    public Surface c;
    
    public d(final c c) {
        super(c);
    }
    
    public final SurfaceHolder A() {
        return null;
    }
    
    public final zdu B() {
        return zdu.c;
    }
    
    public final void C() {
        final Surface c = this.c;
        if (c != null) {
            c.release();
        }
    }
    
    public final boolean D() {
        return this.c != null;
    }
    
    public final Surface z() {
        return this.c;
    }
}
