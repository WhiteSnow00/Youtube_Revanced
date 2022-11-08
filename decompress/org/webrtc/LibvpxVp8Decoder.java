// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class LibvpxVp8Decoder extends aulw
{
    static native long nativeCreateDecoder();
    
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
