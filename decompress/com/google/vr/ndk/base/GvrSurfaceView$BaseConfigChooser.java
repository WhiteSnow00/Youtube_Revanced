// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLSurfaceView$EGLConfigChooser;

abstract class GvrSurfaceView$BaseConfigChooser implements GLSurfaceView$EGLConfigChooser
{
    protected int[] mConfigSpec;
    final GvrSurfaceView this$0;
    
    public GvrSurfaceView$BaseConfigChooser(final GvrSurfaceView this$0, final int[] array) {
        this.this$0 = this$0;
        this.mConfigSpec = this.filterConfigSpec(array);
    }
    
    private int[] filterConfigSpec(final int[] array) {
        if (GvrSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) != 2 && GvrSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) != 3) {
            return array;
        }
        final int[] array2 = new int[15];
        System.arraycopy(array, 0, array2, 0, 12);
        array2[12] = 12352;
        if (GvrSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) == 2) {
            array2[13] = 4;
        }
        else {
            array2[13] = 64;
        }
        array2[14] = 12344;
        return array2;
    }
    
    public EGLConfig chooseConfig(final EGL10 egl10, final EGLDisplay eglDisplay) {
        int n = 1;
        final int[] array = { 0 };
        if (!egl10.eglChooseConfig(eglDisplay, this.mConfigSpec, (EGLConfig[])null, 0, array)) {
            while (true) {
                final int[] mConfigSpec = this.mConfigSpec;
                if (n >= mConfigSpec.length) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                if (mConfigSpec[n - 1] == 12352 && mConfigSpec[n] == 64) {
                    Log.w("GvrSurfaceView", "Failed to choose GLES 3 config, will try 2.");
                    this.mConfigSpec[n] = 4;
                    return this.chooseConfig(egl10, eglDisplay);
                }
                ++n;
            }
        }
        else {
            final int n2 = array[0];
            if (n2 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            final EGLConfig[] array2 = new EGLConfig[n2];
            if (!egl10.eglChooseConfig(eglDisplay, this.mConfigSpec, array2, n2, array)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            final EGLConfig chooseConfig = this.chooseConfig(egl10, eglDisplay, array2);
            if (chooseConfig != null) {
                return chooseConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }
    
    public abstract EGLConfig chooseConfig(final EGL10 p0, final EGLDisplay p1, final EGLConfig[] p2);
}
