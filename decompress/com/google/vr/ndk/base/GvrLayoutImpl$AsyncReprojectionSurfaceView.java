// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.view.SurfaceHolder;
import android.opengl.GLSurfaceView$Renderer;
import android.content.Context;

class GvrLayoutImpl$AsyncReprojectionSurfaceView extends GvrSurfaceView
{
    private arco scanlineRacingRenderer;
    
    static /* bridge */ arco -$$Nest$fgetscanlineRacingRenderer(final GvrLayoutImpl$AsyncReprojectionSurfaceView gvrLayoutImpl$AsyncReprojectionSurfaceView) {
        return gvrLayoutImpl$AsyncReprojectionSurfaceView.scanlineRacingRenderer;
    }
    
    public GvrLayoutImpl$AsyncReprojectionSurfaceView(final Context context) {
        super(context);
    }
    
    public void setRenderer(final arco scanlineRacingRenderer) {
        super.setRenderer((GLSurfaceView$Renderer)(this.scanlineRacingRenderer = scanlineRacingRenderer));
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        if (!this.isDetachedFromWindow() && this.scanlineRacingRenderer != null) {
            this.onSurfaceDestroyed((Runnable)new GvrLayoutImpl$AsyncReprojectionSurfaceView$1(this));
            return;
        }
        this.onSurfaceDestroyed((Runnable)null);
    }
}
