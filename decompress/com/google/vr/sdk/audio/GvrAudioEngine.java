// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.audio;

import android.content.Context;

public class GvrAudioEngine
{
    private static UnsatisfiedLinkError nativeLibraryLoadException;
    private final long vrAudioSystemRef;
    
    static {
        try {
            System.loadLibrary("gvr_audio");
        }
        catch (final UnsatisfiedLinkError nativeLibraryLoadException) {
            GvrAudioEngine.nativeLibraryLoadException = nativeLibraryLoadException;
        }
    }
    
    private native int nativeCreateSoundObject(final long p0, final String p1);
    
    private native int nativeCreateSoundfield(final long p0, final String p1);
    
    private native int nativeCreateStereoSound(final long p0, final String p1);
    
    private native void nativeEnableRoom(final long p0, final boolean p1);
    
    private native void nativeEnableStereoSpeakerMode(final long p0, final boolean p1);
    
    private native long nativeInitialize(final ClassLoader p0, final Context p1, final int p2);
    
    private native boolean nativeIsSoundPlaying(final long p0, final int p1);
    
    private native boolean nativeIsSourceIdValid(final long p0, final int p1);
    
    private native void nativePause(final long p0);
    
    private native void nativePauseSound(final long p0, final int p1);
    
    private native void nativePlaySound(final long p0, final int p1, final boolean p2);
    
    private native boolean nativePreloadSoundFile(final long p0, final String p1);
    
    private native void nativeRelease(final long p0);
    
    private native void nativeResume(final long p0);
    
    private native void nativeResumeSound(final long p0, final int p1);
    
    private native void nativeSetHeadPosition(final long p0, final float p1, final float p2, final float p3);
    
    private native void nativeSetHeadRotation(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    private native void nativeSetRoomProperties(final long p0, final float p1, final float p2, final float p3, final int p4, final int p5, final int p6);
    
    private native void nativeSetRoomReverbAdjustments(final long p0, final float p1, final float p2, final float p3);
    
    private native void nativeSetSoundObjectDistanceRolloffModel(final long p0, final int p1, final int p2, final float p3, final float p4);
    
    private native void nativeSetSoundObjectPosition(final long p0, final int p1, final float p2, final float p3, final float p4);
    
    private native void nativeSetSoundVolume(final long p0, final int p1, final float p2);
    
    private native void nativeSetSoundfieldRotation(final long p0, final int p1, final float p2, final float p3, final float p4, final float p5);
    
    private native void nativeStopSound(final long p0, final int p1);
    
    private native void nativeUnloadSoundFile(final long p0, final String p1);
    
    private native void nativeUpdate(final long p0);
    
    @Override
    protected void finalize() {
        try {
            this.nativeRelease(this.vrAudioSystemRef);
        }
        finally {
            super.finalize();
        }
    }
}
