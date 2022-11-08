// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.audio;

import android.util.Log;
import java.nio.ByteBuffer;

public class GvrAudioSurround
{
    private static UnsatisfiedLinkError nativeLibraryLoadException;
    private final int numFramesPerOutputBuffer;
    private final int numInputChannels;
    private long vrAudioSystemRef;
    
    static {
        try {
            System.loadLibrary("gvr_audio");
        }
        catch (final UnsatisfiedLinkError nativeLibraryLoadException) {
            GvrAudioSurround.nativeLibraryLoadException = nativeLibraryLoadException;
        }
    }
    
    public GvrAudioSurround(final int n, final int n2, final int numInputChannels, final int n3) {
        this.vrAudioSystemRef = 0L;
        final UnsatisfiedLinkError nativeLibraryLoadException = GvrAudioSurround.nativeLibraryLoadException;
        if (nativeLibraryLoadException == null) {
            this.vrAudioSystemRef = this.nativeInitialize(n, n2, numInputChannels, 1024);
            this.numFramesPerOutputBuffer = 1024;
            this.numInputChannels = numInputChannels;
            return;
        }
        throw nativeLibraryLoadException;
    }
    
    private native int nativeAddInput(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native void nativeFlush(final long p0);
    
    private native int nativeGetAvailableInputSize(final long p0);
    
    private native int nativeGetAvailableOutputSize(final long p0);
    
    private native int nativeGetOutput(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native long nativeInitialize(final int p0, final int p1, final int p2, final int p3);
    
    private native void nativeRelease(final long p0);
    
    private native void nativeSetOrientationQuaternion(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    private native boolean nativeTriggerProcessing(final long p0);
    
    public int addInput(final ByteBuffer byteBuffer, final int n, final int n2) {
        return this.nativeAddInput(this.vrAudioSystemRef, byteBuffer, n, n2);
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.vrAudioSystemRef != 0L) {
                Log.w("GvrAudioSurround", "GvrAudioSurround not correctly released");
                this.release();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public void flush() {
        this.nativeFlush(this.vrAudioSystemRef);
    }
    
    public int getAvailableOutputSize() {
        return this.nativeGetAvailableOutputSize(this.vrAudioSystemRef);
    }
    
    public int getOutput(final ByteBuffer byteBuffer, final int n, final int n2) {
        return this.nativeGetOutput(this.vrAudioSystemRef, byteBuffer, 0, n2);
    }
    
    public void release() {
        this.nativeRelease(this.vrAudioSystemRef);
        this.vrAudioSystemRef = 0L;
    }
    
    public boolean triggerProcessing() {
        return this.nativeTriggerProcessing(this.vrAudioSystemRef);
    }
    
    public void updateNativeOrientation(final float n, final float n2, final float n3, final float n4) {
        this.nativeSetOrientationQuaternion(this.vrAudioSystemRef, n, n2, n3, n4);
    }
}
