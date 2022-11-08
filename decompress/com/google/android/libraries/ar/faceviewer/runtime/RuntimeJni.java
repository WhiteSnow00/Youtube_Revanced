// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.ar.faceviewer.runtime;

import com.google.research.xeno.effect.AssetDownloader;

public final class RuntimeJni
{
    private static final afik b;
    public long a;
    
    static {
        b = afik.m("com/google/android/libraries/ar/faceviewer/runtime/RuntimeJni");
    }
    
    public RuntimeJni(final long a) {
        this.a = a;
    }
    
    public static void a(final AssetDownloader assetDownloader, final String s, final agez agez, final String s2, final phq phq) {
        nativeCreate(assetDownloader, s, ((agxl)agez).toByteArray(), s2, NativeCallback.b(phq, (nyh)nyi.c));
    }
    
    private static native void nativeCreate(final AssetDownloader p0, final String p1, final byte[] p2, final String p3, final NativeCallback p4);
    
    @Override
    protected final void finalize() {
        if (this.a != 0L) {
            ((afii)((afii)((afig)RuntimeJni.b).g()).j("com/google/android/libraries/ar/faceviewer/runtime/RuntimeJni", "finalize", 58, "RuntimeJni.java")).r("RuntimeJni finalized with non-null nativeHandle.");
        }
    }
    
    public native void nativeDestroy(final long p0);
    
    public native void nativeMakeExperience(final long p0, final byte[] p1, final NativeCallback p2);
}
