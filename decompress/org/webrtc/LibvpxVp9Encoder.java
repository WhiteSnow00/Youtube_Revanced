// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class LibvpxVp9Encoder extends aulx
{
    static native long nativeCreateEncoder();
    
    static native boolean nativeIsSupported();
    
    public final long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }
    
    public final boolean isHardwareEncoder() {
        return false;
    }
}
