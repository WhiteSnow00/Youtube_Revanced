// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public interface DataChannel$Observer
{
    void onBufferedAmountChange(final long p0);
    
    void onMessage(final DataChannel$Buffer p0);
    
    void onStateChange();
}
