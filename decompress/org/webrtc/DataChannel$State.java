// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public enum DataChannel$State
{
    a("CONNECTING", 0), 
    b("OPEN", 1), 
    c("CLOSING", 2), 
    d("CLOSED", 3);
    
    private DataChannel$State(final String s, final int n) {
    }
    
    static DataChannel$State fromNativeIndex(final int n) {
        return values()[n];
    }
}
