// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLSurfaceView$EGLContextFactory;

class GvrSurfaceView$DefaultContextFactory implements GLSurfaceView$EGLContextFactory
{
    final GvrSurfaceView this$0;
    
    private GvrSurfaceView$DefaultContextFactory(final GvrSurfaceView this$0) {
        this.this$0 = this$0;
    }
    
    public GvrSurfaceView$DefaultContextFactory(final GvrSurfaceView gvrSurfaceView, final GvrSurfaceView$DefaultContextFactory-IA gvrSurfaceView$DefaultContextFactory-IA) {
        this(gvrSurfaceView);
    }
    
    public EGLContext createContext(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig) {
        int[] array = { 12440, GvrSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0), 12344 };
        final EGLContext egl_NO_CONTEXT = EGL10.EGL_NO_CONTEXT;
        if (GvrSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) == 0) {
            array = null;
        }
        return egl10.eglCreateContext(eglDisplay, eglConfig, egl_NO_CONTEXT, array);
    }
    
    public void destroyContext(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLContext eglContext) {
        if (!egl10.eglDestroyContext(eglDisplay, eglContext)) {
            final String value = String.valueOf(eglDisplay);
            final String value2 = String.valueOf(eglContext);
            final StringBuilder sb = new StringBuilder("display:");
            sb.append(value);
            sb.append(" context: ");
            sb.append(value2);
            Log.e("DefaultContextFactory", sb.toString());
            GvrSurfaceView$EglHelper.throwEglException("eglDestroyContext", egl10.eglGetError());
        }
    }
}
