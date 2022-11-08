// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

class GvrSurfaceView$GLThread$GLThreadManager
{
    private GvrSurfaceView$GLThread$GLThreadManager() {
    }
    
    public void releaseEglContextLocked(final GvrSurfaceView$GLThread gvrSurfaceView$GLThread) {
        this.notifyAll();
    }
    
    public void threadExiting(final GvrSurfaceView$GLThread gvrSurfaceView$GLThread) {
        synchronized (this) {
            GvrSurfaceView$GLThread.-$$Nest$fputmExited(gvrSurfaceView$GLThread, true);
            this.notifyAll();
        }
    }
}
