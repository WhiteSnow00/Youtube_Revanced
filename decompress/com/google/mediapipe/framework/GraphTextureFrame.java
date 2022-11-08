// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class GraphTextureFrame implements TextureFrame
{
    private long a;
    private int b;
    private int c;
    private int d;
    private long e;
    
    public GraphTextureFrame(final long a, final long e) {
        this.e = Long.MIN_VALUE;
        this.a = a;
        this.b = this.nativeGetTextureName(a);
        this.c = this.nativeGetWidth(this.a);
        this.d = this.nativeGetHeight(this.a);
        this.e = e;
    }
    
    private native long nativeCreateSyncTokenForCurrentExternalContext(final long p0);
    
    private native int nativeGetHeight(final long p0);
    
    private native int nativeGetTextureName(final long p0);
    
    private native int nativeGetWidth(final long p0);
    
    private native void nativeGpuWait(final long p0);
    
    private native void nativeReleaseBuffer(final long p0, final long p1);
    
    @Override
    public final int getHeight() {
        return this.d;
    }
    
    @Override
    public final int getTextureName() {
        if (this.a == 0L) {
            return 0;
        }
        return this.b;
    }
    
    @Override
    public final long getTimestamp() {
        return this.e;
    }
    
    @Override
    public final int getWidth() {
        return this.c;
    }
    
    @Override
    public final void release() {
        this.release(new GraphGlSyncToken(this.nativeCreateSyncTokenForCurrentExternalContext(this.a)));
    }
    
    @Override
    public final void release(final GlSyncToken glSyncToken) {
        if (this.a != 0L) {
            long nativeToken;
            if (glSyncToken == null) {
                nativeToken = 0L;
            }
            else {
                nativeToken = glSyncToken.nativeToken();
            }
            this.nativeReleaseBuffer(this.a, nativeToken);
            this.a = 0L;
        }
        if (glSyncToken != null) {
            glSyncToken.release();
        }
    }
}
