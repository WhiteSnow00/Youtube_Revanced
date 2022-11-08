// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.defaultaudioprocessing;

public class LevelControllerFactory
{
    public long a;
    
    public LevelControllerFactory() {
        agot.u(true);
        this.a = nativeCreateLevelController(1.0f);
    }
    
    private static native long nativeCreateLevelController(final float p0);
    
    public static native long nativeCreateWrappedLevelController(final long p0);
    
    private static native float nativeGetPeakLevelDbfs(final long p0);
}
