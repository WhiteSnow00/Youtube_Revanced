// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class CallSessionFileRotatingLogSink
{
    private static native long nativeAddSink(final String p0, final int p1, final int p2);
    
    private static native void nativeDeleteSink(final long p0);
    
    private static native byte[] nativeGetLogData(final String p0);
}
