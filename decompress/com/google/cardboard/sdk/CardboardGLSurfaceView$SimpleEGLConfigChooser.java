// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

class CardboardGLSurfaceView$SimpleEGLConfigChooser extends CardboardGLSurfaceView$ComponentSizeChooser
{
    public CardboardGLSurfaceView$SimpleEGLConfigChooser(final CardboardGLSurfaceView cardboardGLSurfaceView, final boolean b) {
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 16;
        }
        super(cardboardGLSurfaceView, 8, 8, 8, 0, n, 0);
    }
}
