// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public enum MediaStreamTrack$MediaType
{
    a("MEDIA_TYPE_AUDIO", 0, 0), 
    b("MEDIA_TYPE_VIDEO", 1, 1);
    
    private final int d;
    
    private MediaStreamTrack$MediaType(final String s, final int n, final int d) {
        this.d = d;
    }
    
    static MediaStreamTrack$MediaType fromNativeIndex(final int n) {
        for (final MediaStreamTrack$MediaType mediaStreamTrack$MediaType : values()) {
            if (mediaStreamTrack$MediaType.getNative() == n) {
                return mediaStreamTrack$MediaType;
            }
        }
        final StringBuilder sb = new StringBuilder("Unknown native media type: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public int getNative() {
        return this.d;
    }
}
