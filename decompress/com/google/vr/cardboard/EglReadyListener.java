// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import android.opengl.GLES20;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public class EglReadyListener
{
    public volatile EGLContext a;
    public volatile int b;
    public volatile int c;
    public final Object d;
    public volatile aqzm e;
    public final Object f;
    
    public EglReadyListener() {
        this.c = 2;
        this.d = new Object();
        this.f = new Object();
    }
    
    public void onEglReady() {
        synchronized (this.d) {
            this.a = ((EGL10)EGLContext.getEGL()).eglGetCurrentContext();
            if (this.a == null || this.a == EGL10.EGL_NO_CONTEXT) {
                Log.e("EglReadyListener", "Unable to obtain the application's OpenGL context.");
            }
            final String glGetString = GLES20.glGetString(7938);
            int c = 2;
            if (glGetString == null) {
                Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
            }
            else {
                final int index = glGetString.indexOf(46);
                if (index <= 0) {
                    Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
                }
                else {
                    final int numericValue = Character.getNumericValue(glGetString.charAt(index - 1));
                    if (numericValue < 0) {
                        Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
                    }
                    else {
                        c = numericValue;
                    }
                }
            }
            this.c = c;
            final int[] array = { 0 };
            GLES20.glGetIntegerv(33310, array, 0);
            GLES20.glGetError();
            this.b = array[0];
            monitorexit(this.d);
            final Object f = this.f;
            synchronized (this.d) {
                if (this.e != null) {
                    this.e.onEglReady();
                }
            }
        }
    }
}
