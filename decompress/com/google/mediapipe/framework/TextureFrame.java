// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public interface TextureFrame extends TextureReleaseCallback
{
    int getHeight();
    
    int getTextureName();
    
    long getTimestamp();
    
    int getWidth();
    
    void release();
    
    void release(final GlSyncToken p0);
}
