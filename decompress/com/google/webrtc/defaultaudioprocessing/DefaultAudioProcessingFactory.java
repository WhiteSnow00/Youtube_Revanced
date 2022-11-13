// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.defaultaudioprocessing;

public class DefaultAudioProcessingFactory
{
    public LevelControllerFactory a;
    public aref b;
    public int c;
    
    public DefaultAudioProcessingFactory() {
        this.c = 1;
        this.b = aref.a;
    }
    
    public static native long nativeCreateAudioProcessing(final long p0, final String p1, final byte[] p2, final long p3, final boolean p4, final long p5, final boolean p6, final boolean p7, final boolean p8, final boolean p9);
}
