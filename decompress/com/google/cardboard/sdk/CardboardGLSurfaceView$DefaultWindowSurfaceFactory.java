// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;

class CardboardGLSurfaceView$DefaultWindowSurfaceFactory implements GLSurfaceView$EGLWindowSurfaceFactory
{
    private static final String LOG_TAG = "CardboardGLSurfaceView::DefaultWindowSurfaceFactory";
    
    private CardboardGLSurfaceView$DefaultWindowSurfaceFactory() {
    }
    
    public EGLSurface createWindowSurface(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final Object o) {
        final EGLSurface eglSurface = null;
        EGLSurface eglCreateWindowSurface;
        try {
            eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglDisplay, eglConfig, o, (int[])null);
        }
        catch (final IllegalArgumentException ex) {
            Log.e("CardboardGLSurfaceView::DefaultWindowSurfaceFactory", "eglCreateWindowSurface", (Throwable)ex);
            eglCreateWindowSurface = eglSurface;
        }
        return eglCreateWindowSurface;
    }
    
    public void destroySurface(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLSurface eglSurface) {
        egl10.eglDestroySurface(eglDisplay, eglSurface);
    }
}
