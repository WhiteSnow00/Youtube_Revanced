// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.content.Context;

class CardboardView$SafeCardboardGLSurfaceView extends CardboardGLSurfaceView implements CardboardView$SafeSurfaceView
{
    private boolean isViewAttached;
    private Runnable onViewDetachedRunnable;
    
    public CardboardView$SafeCardboardGLSurfaceView(final Context context) {
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
