// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.view.MotionEvent;
import com.google.vr.ndk.base.GvrSurfaceView;
import android.content.Context;
import android.widget.FrameLayout;

public class GvrView extends FrameLayout
{
    private CardboardViewApi cardboardViewApi;
    
    public GvrView(final Context context) {
        super(context);
        this.init(context);
    }
    
    private void init(final Context context) {
        if (this.isInEditMode()) {
            return;
        }
        if (aqzg.t(context) != null) {
            final CardboardViewApi cardboardViewApi = ImplementationSelector.createCardboardViewApi(context);
            this.cardboardViewApi = cardboardViewApi;
            this.addView(cardboardViewApi.getRootView(), 0);
            final GvrSurfaceView gvrSurfaceView = this.cardboardViewApi.getGvrSurfaceView();
            gvrSurfaceView.setEGLContextClientVersion(2);
            gvrSurfaceView.setPreserveEGLContextOnPause(true);
            return;
        }
        throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
    }
    
    public CharSequence getAccessibilityClassName() {
        return GvrView.class.getName();
    }
    
    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardViewApi.getGvrViewerParams();
    }
    
    public void onPause() {
        this.cardboardViewApi.onPause();
    }
    
    public void onResume() {
        this.cardboardViewApi.onResume();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.cardboardViewApi.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }
    
    public void queueEvent(final Runnable runnable) {
        this.cardboardViewApi.getGvrSurfaceView().queueEvent(runnable);
    }
    
    public void setEGLConfigChooser(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLConfigChooser(n, n2, n3, n4, 16, 0);
    }
    
    public void setEGLWindowSurfaceFactory(final GLSurfaceView$EGLWindowSurfaceFactory eglWindowSurfaceFactory) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLWindowSurfaceFactory(eglWindowSurfaceFactory);
    }
    
    public void setOnCardboardTriggerListener(final Runnable onCardboardTriggerListener) {
        this.cardboardViewApi.setOnCardboardTriggerListener(onCardboardTriggerListener);
    }
    
    public void setOnCloseButtonListener(final Runnable onCloseButtonListener) {
        this.cardboardViewApi.setOnCloseButtonListener(onCloseButtonListener);
    }
    
    public void setRenderer(final GvrView$StereoRenderer renderer) {
        if (renderer != null) {
            this.cardboardViewApi.setRenderer(renderer);
            return;
        }
        throw new IllegalArgumentException("StereoRenderer must not be null");
    }
    
    public void setStereoModeEnabled(final boolean stereoModeEnabled) {
        this.cardboardViewApi.setStereoModeEnabled(stereoModeEnabled);
    }
    
    public void shutdown() {
        this.cardboardViewApi.shutdown();
    }
}
