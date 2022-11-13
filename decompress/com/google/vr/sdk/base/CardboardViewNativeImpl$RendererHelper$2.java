// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;

class CardboardViewNativeImpl$RendererHelper$2 implements Runnable
{
    final CardboardViewNativeImpl$RendererHelper this$1;
    final boolean val$enabled;
    
    public CardboardViewNativeImpl$RendererHelper$2(final CardboardViewNativeImpl$RendererHelper this$1, final boolean val$enabled) {
        this.this$1 = this$1;
        this.val$enabled = val$enabled;
    }
    
    @Override
    public void run() {
        final boolean -$$Nest$fgetstereoMode = CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetstereoMode(this.this$1);
        final boolean val$enabled = this.val$enabled;
        if (-$$Nest$fgetstereoMode == val$enabled) {
            return;
        }
        CardboardViewNativeImpl$RendererHelper.-$$Nest$fputstereoMode(this.this$1, val$enabled);
        final CardboardViewNativeImpl this$0 = this.this$1.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeSetStereoModeEnabled(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0), this.val$enabled);
        if (!EGL10.EGL_NO_SURFACE.equals(((EGL10)EGLContext.getEGL()).eglGetCurrentSurface(12377))) {
            final CardboardViewNativeImpl$RendererHelper this$2 = this.this$1;
            this$2.onSurfaceChanged(null, CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetscreenParams(this$2).getWidth(), CardboardViewNativeImpl$RendererHelper.-$$Nest$fgetscreenParams(this.this$1).getHeight());
        }
    }
}
