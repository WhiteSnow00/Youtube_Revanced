// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public abstract class DefaultNativeLibraryLoader
{
    private static volatile boolean shouldIgnoreDefaultLibrary;
    
    public static void maybeLoadDefaultLibrary() {
        if (DefaultNativeLibraryLoader.shouldIgnoreDefaultLibrary) {
            return;
        }
        try {
            System.loadLibrary("gvr");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {}
    }
}
