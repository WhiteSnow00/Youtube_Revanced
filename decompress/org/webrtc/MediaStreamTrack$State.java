// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public enum MediaStreamTrack$State
{
    a("LIVE", 0), 
    b("ENDED", 1);
    
    private MediaStreamTrack$State(final String s, final int n) {
    }
    
    static MediaStreamTrack$State fromNativeIndex(final int n) {
        return values()[n];
    }
}
