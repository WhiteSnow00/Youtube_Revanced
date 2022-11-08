// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import javax.microedition.khronos.egl.EGLConfig;

public interface GvrView$StereoRenderer
{
    void onDrawEye(final Eye p0);
    
    void onFinishFrame(final Viewport p0);
    
    void onNewFrame(final HeadTransform p0);
    
    void onRendererShutdown();
    
    void onSurfaceChanged(final int p0, final int p1);
    
    void onSurfaceCreated(final EGLConfig p0);
}
