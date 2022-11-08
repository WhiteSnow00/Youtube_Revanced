// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLSurfaceView$EGLConfigChooser;

abstract class CardboardGLSurfaceView$BaseConfigChooser implements GLSurfaceView$EGLConfigChooser
{
    private static final String LOG_TAG = "CardboardGLSurfaceView::BaseConfigChooser";
    protected int[] mConfigSpec;
    final /* synthetic */ CardboardGLSurfaceView this$0;
    
    public CardboardGLSurfaceView$BaseConfigChooser(final CardboardGLSurfaceView this$0, final int[] array) {
        this.this$0 = this$0;
        this.mConfigSpec = this.filterConfigSpec(array);
    }
    
    private int[] filterConfigSpec(final int[] array) {
        if (CardboardGLSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) != 2 && CardboardGLSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) != 3) {
            return array;
        }
        final int length = array.length;
        final int[] array2 = new int[length + 2];
        final int n = length - 1;
        System.arraycopy(array, 0, array2, 0, n);
        array2[n] = 12352;
        if (CardboardGLSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) == 2) {
            array2[length] = 4;
        }
        else {
            array2[length] = 64;
        }
        array2[length + 1] = 12344;
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
                    Log.w("CardboardGLSurfaceView::BaseConfigChooser", "Failed to choose GLES 3 config, will try 2.");
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
