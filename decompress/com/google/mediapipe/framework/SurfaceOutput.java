// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class SurfaceOutput
{
    private native void nativeSetEglSurface(final long p0, final long p1, final long p2);
    
    private native void nativeSetFlipY(final long p0, final boolean p1);
    
    private native void nativeSetSurface(final long p0, final long p1, final Object p2);
}
