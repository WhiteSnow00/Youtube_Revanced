// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.ar.faceviewer.runtime;

import java.util.List;

public final class ExperienceJni
{
    public static final afik a;
    public long b;
    
    static {
        a = afik.m("com/google/android/libraries/ar/faceviewer/runtime/ExperienceJni");
    }
    
    public ExperienceJni(final long b) {
        this.b = b;
    }
    
    private native List nativeGetActiveItemIds(final long p0);
    
    private native List nativeGetAllItemIds(final long p0);
    
    private native List nativeGetInitialItemIds(final long p0);
    
    private native void nativeLoadItems(final long p0, final List p1, final NativeCallback p2);
    
    @Override
    protected final void finalize() {
        if (this.b != 0L) {
            ((afii)((afii)((afig)ExperienceJni.a).g()).j("com/google/android/libraries/ar/faceviewer/runtime/ExperienceJni", "finalize", 85, "ExperienceJni.java")).r("ExperienceJni finalized with non-null nativeHandle.");
        }
    }
    
    public native void nativeActivateItems(final long p0, final List p1, final long p2, final NativeCallback p3);
    
    public native void nativeDestroy(final long p0);
    
    public native byte[] nativeGetWebConfigProto(final long p0);
    
    public native void nativePreloadAllItems(final long p0, final NativeCallback p1);
}
