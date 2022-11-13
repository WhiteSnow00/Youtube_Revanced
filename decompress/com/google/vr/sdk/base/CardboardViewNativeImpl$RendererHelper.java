// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.util.Log;
import android.opengl.EGL14;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.GLSurfaceView$Renderer;

class CardboardViewNativeImpl$RendererHelper implements GLSurfaceView$Renderer
{
    private EGLDisplay eglDisplay;
    private boolean invalidSurfaceSizeWarningShown;
    private GvrView$Renderer renderer;
    private ScreenParams screenParams;
    private boolean stereoMode;
    private GvrView$StereoRenderer stereoRenderer;
    private boolean surfaceCreated;
    final CardboardViewNativeImpl this$0;
    
    static /* bridge */ GvrView$Renderer -$$Nest$fgetrenderer(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        return cardboardViewNativeImpl$RendererHelper.renderer;
    }
    
    static /* bridge */ ScreenParams -$$Nest$fgetscreenParams(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        return cardboardViewNativeImpl$RendererHelper.screenParams;
    }
    
    static /* bridge */ boolean -$$Nest$fgetstereoMode(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        return cardboardViewNativeImpl$RendererHelper.stereoMode;
    }
    
    static /* bridge */ GvrView$StereoRenderer -$$Nest$fgetstereoRenderer(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        return cardboardViewNativeImpl$RendererHelper.stereoRenderer;
    }
    
    static /* bridge */ boolean -$$Nest$fgetsurfaceCreated(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        return cardboardViewNativeImpl$RendererHelper.surfaceCreated;
    }
    
    static /* bridge */ void -$$Nest$fputstereoMode(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper, final boolean stereoMode) {
        cardboardViewNativeImpl$RendererHelper.stereoMode = stereoMode;
    }
    
    static /* bridge */ void -$$Nest$fputsurfaceCreated(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper, final boolean b) {
        cardboardViewNativeImpl$RendererHelper.surfaceCreated = false;
    }
    
    static /* bridge */ void -$$Nest$mcallOnRendererShutdown(final CardboardViewNativeImpl$RendererHelper cardboardViewNativeImpl$RendererHelper) {
        cardboardViewNativeImpl$RendererHelper.callOnRendererShutdown();
    }
    
    public CardboardViewNativeImpl$RendererHelper(final CardboardViewNativeImpl this$0) {
        this.this$0 = this$0;
        this.screenParams = new ScreenParams(this$0.getScreenParams());
        this.stereoMode = CardboardViewNativeImpl.-$$Nest$fgetstereoMode(this$0);
    }
    
    private void callOnRendererShutdown() {
        final GvrView$Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.onRendererShutdown();
            return;
        }
        final GvrView$StereoRenderer stereoRenderer = this.stereoRenderer;
        if (stereoRenderer != null) {
            stereoRenderer.onRendererShutdown();
        }
    }
    
    private void callOnSurfaceChanged(final int n, final int n2) {
        final GvrView$Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.onSurfaceChanged(n, n2);
            return;
        }
        final GvrView$StereoRenderer stereoRenderer = this.stereoRenderer;
        if (stereoRenderer != null) {
            if (this.stereoMode) {
                stereoRenderer.onSurfaceChanged(n / 2, n2);
                return;
            }
            stereoRenderer.onSurfaceChanged(n, n2);
        }
    }
    
    private void callOnSurfaceCreated(final EGLConfig eglConfig) {
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeOnSurfaceCreated(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0));
        final GvrView$Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.onSurfaceCreated(eglConfig);
            return;
        }
        final GvrView$StereoRenderer stereoRenderer = this.stereoRenderer;
        if (stereoRenderer != null) {
            stereoRenderer.onSurfaceCreated(eglConfig);
        }
    }
    
    public void onDrawFrame(final GL10 gl10) {
        if ((this.renderer == null && this.stereoRenderer == null) || !this.surfaceCreated) {
            return;
        }
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeOnDrawFrame(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0));
        EGL14.eglSwapInterval(this.eglDisplay, 1);
    }
    
    public void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        if ((this.renderer == null && this.stereoRenderer == null) || !this.surfaceCreated) {
            return;
        }
        if (this.stereoMode && (n != this.screenParams.getWidth() || n2 != this.screenParams.getHeight())) {
            if (!this.invalidSurfaceSizeWarningShown) {
                final String -$$Nest$sfgetTAG = CardboardViewNativeImpl.-$$Nest$sfgetTAG();
                final int width = this.screenParams.getWidth();
                final int height = this.screenParams.getHeight();
                final StringBuilder sb = new StringBuilder("Surface size ");
                sb.append(n);
                sb.append("x");
                sb.append(n2);
                sb.append(" does not match the expected screen size ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(". Stereo rendering might feel off.");
                Log.e(-$$Nest$sfgetTAG, sb.toString());
            }
            this.invalidSurfaceSizeWarningShown = true;
        }
        else {
            this.invalidSurfaceSizeWarningShown = false;
        }
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeOnSurfaceChanged(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0), n, n2);
        this.callOnSurfaceChanged(n, n2);
    }
    
    public void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        if (this.renderer == null && this.stereoRenderer == null) {
            return;
        }
        this.surfaceCreated = true;
        this.eglDisplay = EGL14.eglGetCurrentDisplay();
        this.callOnSurfaceCreated(eglConfig);
    }
    
    public void setRenderer(final GvrView$StereoRenderer stereoRenderer) {
        this.stereoRenderer = stereoRenderer;
        final CardboardViewNativeImpl this$0 = this.this$0;
        CardboardViewNativeImpl.-$$Nest$mnativeSetStereoRenderer(this$0, CardboardViewNativeImpl.-$$Nest$fgetnativeCardboardView(this$0), stereoRenderer);
    }
    
    public void setScreenParams(final ScreenParams screenParams) {
        this.screenParams = screenParams;
    }
    
    public void setStereoModeEnabled(final boolean stereoModeEnabled) {
        CardboardViewNativeImpl.-$$Nest$mcheckNativeCardboardView(this.this$0);
        CardboardViewNativeImpl.-$$Nest$fgetgvrLayout(this.this$0).setStereoModeEnabled(stereoModeEnabled);
        CardboardViewNativeImpl.-$$Nest$mqueueEvent(this.this$0, (Runnable)new CardboardViewNativeImpl$RendererHelper$2(this, stereoModeEnabled));
    }
    
    public void shutdown() {
        CardboardViewNativeImpl.-$$Nest$mqueueEvent(this.this$0, (Runnable)new CardboardViewNativeImpl$RendererHelper$1(this));
    }
}
