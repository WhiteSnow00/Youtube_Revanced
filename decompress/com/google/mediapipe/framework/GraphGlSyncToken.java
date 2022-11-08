// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public final class GraphGlSyncToken implements GlSyncToken
{
    private long a;
    
    public GraphGlSyncToken(final long a) {
        this.a = a;
    }
    
    private static native void nativeRelease(final long p0);
    
    private static native void nativeWaitOnCpu(final long p0);
    
    private static native void nativeWaitOnGpu(final long p0);
    
    @Override
    public final long nativeToken() {
        return this.a;
    }
    
    @Override
    public final void release() {
        final long a = this.a;
        if (a != 0L) {
            nativeRelease(a);
            this.a = 0L;
        }
    }
    
    @Override
    public final void waitOnCpu() {
        final long a = this.a;
        if (a != 0L) {
            nativeWaitOnCpu(a);
        }
    }
    
    @Override
    public final void waitOnGpu() {
        final long a = this.a;
        if (a != 0L) {
            nativeWaitOnGpu(a);
        }
    }
}
