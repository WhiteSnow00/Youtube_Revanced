// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

class Histogram
{
    private static native void nativeAddSample(final long p0, final int p1);
    
    private static native long nativeCreateCounts(final String p0, final int p1, final int p2, final int p3);
    
    private static native long nativeCreateEnumeration(final String p0, final int p1);
}
