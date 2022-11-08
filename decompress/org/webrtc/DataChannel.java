// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class DataChannel
{
    public long a;
    public long b;
    
    public DataChannel(final long a) {
        this.a = a;
    }
    
    private native long nativeBufferedAmount();
    
    private native void nativeClose();
    
    private native int nativeId();
    
    private native String nativeLabel();
    
    private native boolean nativeSend(final byte[] p0, final boolean p1);
    
    private native DataChannel$State nativeState();
    
    long getNativeDataChannel() {
        return this.a;
    }
    
    public native long nativeRegisterObserver(final DataChannel$Observer p0);
    
    public native void nativeUnregisterObserver(final long p0);
}
