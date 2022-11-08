// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

public interface CodecEventReporter
{
    void codecThreadWaitTimeout(final long p0, final String p1);
    
    void decodeError(final int p0, final String p1);
    
    void decoderInitError(final int p0, final String p1);
}
