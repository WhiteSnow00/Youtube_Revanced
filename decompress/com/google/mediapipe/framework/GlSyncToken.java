// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public interface GlSyncToken
{
    long nativeToken();
    
    void release();
    
    void waitOnCpu();
    
    void waitOnGpu();
}
