// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.content.Context;
import android.opengl.GLSurfaceView;

class CardboardView$SafeGLSurfaceView extends GLSurfaceView implements CardboardView$SafeSurfaceView
{
    private boolean isViewAttached;
    private Runnable onViewDetachedRunnable;
    
    public CardboardView$SafeGLSurfaceView(final Context context) {
        super(context);
        this.isViewAttached = false;
    }
    
    public boolean isViewAttached() {
        return this.isViewAttached;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
    }
    
    protected void onDetachedFromWindow() {
        final Runnable onViewDetachedRunnable = this.onViewDetachedRunnable;
        if (onViewDetachedRunnable != null) {
            onViewDetachedRunnable.run();
        }
        this.isViewAttached = false;
        super.onDetachedFromWindow();
    }
    
    public void setOnViewDetachedRunnable(final Runnable onViewDetachedRunnable) {
        this.onViewDetachedRunnable = onViewDetachedRunnable;
    }
}
