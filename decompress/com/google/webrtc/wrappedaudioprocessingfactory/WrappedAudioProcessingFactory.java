// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.wrappedaudioprocessingfactory;

import com.google.webrtc.defaultaudioprocessing.DefaultAudioProcessingFactory;

public final class WrappedAudioProcessingFactory
{
    public final DefaultAudioProcessingFactory a;
    public long b;
    
    static {
        afji.o("WrappedAudioProcessingFactory");
    }
    
    public WrappedAudioProcessingFactory(final DefaultAudioProcessingFactory a) {
        this.b = 0L;
        this.a = a;
    }
    
    public static native long nativeConvertToWebrtcAudioProcessing(final long p0);
    
    private static native byte[] nativeGetMetrics(final long p0);
    
    private static native void nativeSetRuntimeSetting(final long p0, final byte[] p1);
}
