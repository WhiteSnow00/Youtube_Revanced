// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public enum MediaSource$State
{
    a("INITIALIZING", 0), 
    b("LIVE", 1), 
    c("ENDED", 2), 
    d("MUTED", 3);
    
    private MediaSource$State(final String s, final int n) {
    }
    
    static MediaSource$State fromNativeIndex(final int n) {
        return values()[n];
    }
}
