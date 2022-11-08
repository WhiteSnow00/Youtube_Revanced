// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class LibvpxVp9Decoder extends aulw
{
    static native long nativeCreateDecoder();
    
    public static native boolean nativeIsSupported();
    
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
