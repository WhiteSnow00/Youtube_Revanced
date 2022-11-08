// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;

class GvrLayoutImpl$FrameFlushWorkaround implements Choreographer$FrameCallback
{
    private final Choreographer choreographer;
    private int framesRemaining;
    
    public GvrLayoutImpl$FrameFlushWorkaround() {
        this.choreographer = Choreographer.getInstance();
    }
    
    public void doFrame(final long n) {
        final int framesRemaining = this.framesRemaining - 1;
        this.framesRemaining = framesRemaining;
        if (framesRemaining > 0) {
            this.choreographer.postFrameCallback((Choreographer$FrameCallback)this);
        }
    }
    
    public void onResume() {
        if (this.framesRemaining > 0) {
            this.choreographer.removeFrameCallback((Choreographer$FrameCallback)this);
        }
        this.framesRemaining = 5;
        this.choreographer.postFrameCallback((Choreographer$FrameCallback)this);
    }
}
