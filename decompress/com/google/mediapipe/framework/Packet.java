// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class Packet
{
    private long a;
    
    private Packet(final long a) {
        this.a = a;
    }
    
    public static Packet create(final long n) {
        return new Packet(n);
    }
    
    private native long nativeCopyPacket(final long p0);
    
    private native long nativeGetTimestamp(final long p0);
    
    private native boolean nativeIsEmpty(final long p0);
    
    private native void nativeReleasePacket(final long p0);
    
    public final long a() {
        return this.nativeGetTimestamp(this.a);
    }
    
    public final Packet b() {
        return new Packet(this.nativeCopyPacket(this.a));
    }
    
    public long getNativeHandle() {
        return this.a;
    }
    
    public void release() {
        final long a = this.a;
        if (a != 0L) {
            this.nativeReleasePacket(a);
            this.a = 0L;
        }
    }
}
