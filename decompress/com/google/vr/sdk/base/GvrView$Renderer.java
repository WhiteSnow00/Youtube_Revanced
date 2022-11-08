// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import javax.microedition.khronos.egl.EGLConfig;

public interface GvrView$Renderer
{
    void onDrawFrame(final HeadTransform p0, final Eye p1, final Eye p2);
    
    void onFinishFrame(final Viewport p0);
    
    void onRendererShutdown();
    
    void onSurfaceChanged(final int p0, final int p1);
    
    void onSurfaceCreated(final EGLConfig p0);
}
