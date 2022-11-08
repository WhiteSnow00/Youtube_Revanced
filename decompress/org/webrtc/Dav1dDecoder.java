// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class Dav1dDecoder extends aulw
{
    static native long nativeCreateDecoder();
    
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
