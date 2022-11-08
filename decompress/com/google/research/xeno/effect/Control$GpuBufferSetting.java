// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureReleaseCallback;

public class Control$GpuBufferSetting
{
    private final long a;
    
    private Control$GpuBufferSetting(final long a) {
        this.a = a;
    }
    
    private static void releaseWithSyncToken(final long n, final TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(n));
    }
    
    public final void a(final TextureFrame textureFrame) {
        if (textureFrame == null) {
            Control.nativeUnsetGpuBufferValue(this.a);
            return;
        }
        Control.nativeSetGpuBufferValue(this.a, textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame);
    }
}
