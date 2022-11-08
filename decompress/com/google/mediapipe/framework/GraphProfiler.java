// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class GraphProfiler
{
    private native byte[][] nativeGetCalculatorProfiles(final long p0);
    
    private native void nativePause(final long p0);
    
    private native void nativeReset(final long p0);
    
    private native void nativeResume(final long p0);
}
