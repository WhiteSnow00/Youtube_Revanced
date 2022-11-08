// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class LibvpxVp8Encoder extends aulx
{
    static native long nativeCreateEncoder();
    
    public final long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }
    
    public final boolean isHardwareEncoder() {
        return false;
    }
}
