// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.util.Log;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLSurfaceView$EGLContextFactory;

class CardboardGLSurfaceView$DefaultContextFactory implements GLSurfaceView$EGLContextFactory
{
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final String LOG_TAG = "CardboardGLSurfaceView::DefaultContextFactory";
    final /* synthetic */ CardboardGLSurfaceView this$0;
    
    private CardboardGLSurfaceView$DefaultContextFactory(final CardboardGLSurfaceView this$0) {
        this.this$0 = this$0;
    }
    
    public EGLContext createContext(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig) {
        int[] array = { 12440, CardboardGLSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0), 12344 };
        final EGLContext egl_NO_CONTEXT = EGL10.EGL_NO_CONTEXT;
        if (CardboardGLSurfaceView.-$$Nest$fgetmEGLContextClientVersion(this.this$0) == 0) {
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
            CardboardGLSurfaceView$EglHelper.throwEglException("eglDestroyContext", egl10.eglGetError());
        }
    }
}
