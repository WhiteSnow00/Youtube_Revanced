// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class DtmfSender
{
    public long a;
    
    public DtmfSender(final long a) {
        this.a = a;
    }
    
    private static native boolean nativeCanInsertDtmf(final long p0);
    
    private static native int nativeDuration(final long p0);
    
    private static native boolean nativeInsertDtmf(final long p0, final String p1, final int p2, final int p3);
    
    private static native int nativeInterToneGap(final long p0);
    
    private static native String nativeTones(final long p0);
}
