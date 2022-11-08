// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

import org.webrtc.VideoFrame;
import android.view.Surface;

class InternalNativeMediaCodecVideoDecoder extends aulw
{
    private Surface createDecodeSurface(final long n) {
        throw null;
    }
    
    static native boolean nativeIsSupported();
    
    static native void nativeOnSurfaceUpdated(final long p0, final VideoFrame p1);
    
    private void releaseDecodeSurface() {
        throw null;
    }
    
    private void setSurfaceGeometry(final int n, final int n2, final int n3) {
        throw null;
    }
    
    public final long createNativeVideoDecoder() {
        throw null;
    }
    
    native long nativeCreateDecoder(final String p0, final int p1, final boolean p2, final long p3, final CodecEventReporter p4);
}
