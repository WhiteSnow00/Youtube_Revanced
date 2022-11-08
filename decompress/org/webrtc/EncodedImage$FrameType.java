// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public enum EncodedImage$FrameType
{
    a("EmptyFrame", 0, 0), 
    b("VideoFrameKey", 1, 3), 
    c("VideoFrameDelta", 2, 4);
    
    public final int d;
    
    private EncodedImage$FrameType(final String s, final int n, final int d) {
        this.d = d;
    }
    
    static EncodedImage$FrameType fromNativeIndex(final int n) {
        for (final EncodedImage$FrameType encodedImage$FrameType : values()) {
            if (encodedImage$FrameType.d == n) {
                return encodedImage$FrameType;
            }
        }
        final StringBuilder sb = new StringBuilder("Unknown native frame type: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
