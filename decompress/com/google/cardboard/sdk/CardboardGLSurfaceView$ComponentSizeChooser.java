// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class CardboardGLSurfaceView$ComponentSizeChooser extends CardboardGLSurfaceView$BaseConfigChooser
{
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue;
    
    public CardboardGLSurfaceView$ComponentSizeChooser(final CardboardGLSurfaceView cardboardGLSurfaceView, final int mRedSize, final int mGreenSize, final int mBlueSize, final int mAlphaSize, final int mDepthSize, final int mStencilSize) {
        super(cardboardGLSurfaceView, new int[] { 12324, mRedSize, 12323, mGreenSize, 12322, mBlueSize, 12321, mAlphaSize, 12325, mDepthSize, 12326, mStencilSize, 12344 });
        this.mValue = new int[1];
        this.mRedSize = mRedSize;
        this.mGreenSize = mGreenSize;
        this.mBlueSize = mBlueSize;
        this.mAlphaSize = mAlphaSize;
        this.mDepthSize = mDepthSize;
        this.mStencilSize = mStencilSize;
    }
    
    private int findConfigAttrib(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final int n, final int n2) {
        if (egl10.eglGetConfigAttrib(eglDisplay, eglConfig, n, this.mValue)) {
            return this.mValue[0];
        }
        return n2;
    }
    
    public EGLConfig chooseConfig(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig[] array) {
        for (final EGLConfig eglConfig : array) {
            final int configAttrib = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12325, 0);
            final int configAttrib2 = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12326, 0);
            if (configAttrib >= this.mDepthSize && configAttrib2 >= this.mStencilSize) {
                final int configAttrib3 = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12324, 0);
                final int configAttrib4 = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12323, 0);
                final int configAttrib5 = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12322, 0);
                final int configAttrib6 = this.findConfigAttrib(egl10, eglDisplay, eglConfig, 12321, 0);
                if (configAttrib3 == this.mRedSize && configAttrib4 == this.mGreenSize && configAttrib5 == this.mBlueSize) {
                    if (configAttrib6 == this.mAlphaSize) {
                        return eglConfig;
                    }
                }
            }
        }
        return null;
    }
}
