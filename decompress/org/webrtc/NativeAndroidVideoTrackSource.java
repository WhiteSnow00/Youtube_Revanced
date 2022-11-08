// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class NativeAndroidVideoTrackSource
{
    public final long a;
    
    public NativeAndroidVideoTrackSource(final long a) {
        this.a = a;
    }
    
    static VideoProcessor$FrameAdaptationParameters createFrameAdaptationParameters(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final long n7, final boolean b) {
        return new VideoProcessor$FrameAdaptationParameters(n, n2, n3, n4, n5, n6, n7, b);
    }
    
    public static native VideoProcessor$FrameAdaptationParameters nativeAdaptFrame(final long p0, final int p1, final int p2, final int p3, final long p4);
    
    private static native void nativeAdaptOutputFormat(final long p0, final int p1, final int p2, final Integer p3, final int p4, final int p5, final Integer p6, final Integer p7);
    
    public static native void nativeOnFrameCaptured(final long p0, final int p1, final long p2, final VideoFrame$Buffer p3);
    
    private static native void nativeSetIsScreencast(final long p0, final boolean p1);
    
    private static native void nativeSetState(final long p0, final boolean p1);
    
    public final void a(final boolean b) {
        nativeSetState(this.a, b);
    }
}
