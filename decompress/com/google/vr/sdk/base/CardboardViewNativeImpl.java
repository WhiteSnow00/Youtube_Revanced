// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.opengl.GLSurfaceView$Renderer;
import android.view.MotionEvent;
import com.google.vr.ndk.base.GvrSurfaceView;
import android.util.Log;
import android.view.View;
import com.google.vr.ndk.base.GvrUiLayout;
import java.util.concurrent.CountDownLatch;
import com.google.vr.ndk.base.GvrLayout;
import com.google.vr.ndk.base.GvrApi;
import android.content.Context;

public class CardboardViewNativeImpl implements CardboardViewApi, aqzh
{
    private static final String TAG = "CardboardViewNativeImpl";
    private volatile Runnable cardboardBackListener;
    private int cardboardTriggerCount;
    private volatile Runnable cardboardTriggerListener;
    private final Context context;
    private volatile boolean distortionCorrectionEnabled;
    private final aqzi glSurfaceView;
    private final GvrApi gvrApi;
    private final GvrLayout gvrLayout;
    private final HeadMountedDisplayManager hmdManager;
    private long nativeCardboardView;
    private final CardboardViewNativeImpl$RendererHelper rendererHelper;
    private CountDownLatch shutdownLatch;
    private boolean stereoMode;
    private final GvrUiLayout uiLayout;
    
    public CardboardViewNativeImpl(final Context context) {
        this.cardboardTriggerCount = 0;
        this.stereoMode = true;
        this.distortionCorrectionEnabled = true;
        this.context = context;
        this.hmdManager = new HeadMountedDisplayManager(context);
        String s;
        try {
            final String name = this.getClass().getPackage().getName();
            final StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(".NativeProxy");
            s = (String)Class.forName(sb.toString()).getDeclaredField("PROXY_LIBRARY").get(null);
        }
        catch (final Exception ex) {
            s = "gvr";
        }
        System.loadLibrary(s);
        nativeSetApplicationState(this.getClass().getClassLoader(), context.getApplicationContext());
        final aqzi aqzi = new aqzi(context, (aqzh)this);
        this.glSurfaceView = aqzi;
        final GvrLayout gvrLayout = new GvrLayout(context);
        (this.gvrLayout = gvrLayout).setPresentationView((View)aqzi);
        this.rendererHelper = new CardboardViewNativeImpl$RendererHelper(this);
        this.uiLayout = gvrLayout.getUiLayout();
        final GvrApi gvrApi = gvrLayout.getGvrApi();
        this.gvrApi = gvrApi;
        this.nativeCardboardView = this.nativeInit(gvrApi.getNativeGvrContext());
    }
    
    private void checkNativeCardboardView() {
        if (this.nativeCardboardView != 0L) {
            return;
        }
        throw new IllegalStateException("GvrView has already been shut down.");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native void nativeGetCurrentEyeParams(final long p0, final HeadTransform p1, final Eye p2, final Eye p3, final Eye p4, final Eye p5, final Eye p6);
    
    private native float nativeGetNeckModelFactor(final long p0);
    
    private native long nativeInit(final long p0);
    
    private native void nativeLogEvent(final long p0, final int p1);
    
    private native void nativeOnDrawFrame(final long p0);
    
    private native void nativeOnSurfaceChanged(final long p0, final int p1, final int p2);
    
    private native void nativeOnSurfaceCreated(final long p0);
    
    private static native long nativeSetApplicationState(final ClassLoader p0, final Context p1);
    
    private native void nativeSetDepthStencilFormat(final long p0, final int p1);
    
    private native void nativeSetDistortionCorrectionEnabled(final long p0, final boolean p1);
    
    private native void nativeSetDistortionCorrectionScale(final long p0, final float p1);
    
    private native void nativeSetGvrViewerParams(final long p0, final byte[] p1);
    
    private native void nativeSetMultisampling(final long p0, final int p1);
    
    private native void nativeSetNeckModelEnabled(final long p0, final boolean p1);
    
    private native void nativeSetNeckModelFactor(final long p0, final float p1);
    
    private native void nativeSetRenderer(final long p0, final GvrView$Renderer p1);
    
    private native void nativeSetScreenParams(final long p0, final int p1, final int p2, final float p3, final float p4, final float p5);
    
    private native void nativeSetStereoModeEnabled(final long p0, final boolean p1);
    
    private native void nativeSetStereoRenderer(final long p0, final GvrView$StereoRenderer p1);
    
    private native void nativeUndistortTexture(final long p0, final int p1);
    
    private void onCardboardBack() {
        this.runOnCardboardBackListener();
    }
    
    private void onCardboardTrigger() {
        final Runnable cardboardTriggerListener = this.cardboardTriggerListener;
        if (cardboardTriggerListener != null) {
            arac.a(cardboardTriggerListener);
        }
    }
    
    private void queueEvent(final Runnable runnable) {
        ((GvrSurfaceView)this.glSurfaceView).queueEvent(runnable);
    }
    
    private void runOnCardboardBackListener() {
        final Runnable cardboardBackListener = this.cardboardBackListener;
        if (cardboardBackListener != null) {
            arac.a(cardboardBackListener);
        }
    }
    
    private void setGvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.uiLayout.setViewerName(new GvrViewerParams(gvrViewerParams).getModel());
        this.queueEvent(new CardboardViewNativeImpl$6(this, gvrViewerParams));
    }
    
    private void setScreenParams(final ScreenParams screenParams) {
        this.queueEvent(new CardboardViewNativeImpl$7(this, new ScreenParams(screenParams)));
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.nativeCardboardView != 0L) {
                Log.w(CardboardViewNativeImpl.TAG, "GvrView.shutdown() should be called to ensure resource cleanup");
                this.nativeDestroy(this.nativeCardboardView);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public GvrSurfaceView getGvrSurfaceView() {
        return (GvrSurfaceView)this.glSurfaceView;
    }
    
    @Override
    public GvrViewerParams getGvrViewerParams() {
        return this.hmdManager.getHeadMountedDisplay().getGvrViewerParams();
    }
    
    @Override
    public View getRootView() {
        return (View)this.gvrLayout;
    }
    
    public ScreenParams getScreenParams() {
        return this.hmdManager.getHeadMountedDisplay().getScreenParams();
    }
    
    @Override
    public void onPause() {
        this.checkNativeCardboardView();
        this.gvrApi.pauseTracking();
        this.hmdManager.onPause();
        ((GvrSurfaceView)this.glSurfaceView).onPause();
        this.gvrLayout.onPause();
    }
    
    @Override
    public void onResume() {
        this.checkNativeCardboardView();
        this.gvrLayout.onResume();
        ((GvrSurfaceView)this.glSurfaceView).onResume();
        this.hmdManager.onResume();
        this.setScreenParams(this.getScreenParams());
        this.setGvrViewerParams(this.getGvrViewerParams());
        this.gvrApi.resumeTracking();
    }
    
    public void onSurfaceViewDetachedFromWindow() {
        if (this.shutdownLatch == null) {
            this.shutdownLatch = new CountDownLatch(1);
            this.rendererHelper.shutdown();
            try {
                this.shutdownLatch.await();
            }
            catch (final InterruptedException ex) {
                Log.e(CardboardViewNativeImpl.TAG, "Interrupted during shutdown: ".concat(String.valueOf(ex.toString())));
            }
            this.shutdownLatch = null;
        }
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.cardboardTriggerListener != null) {
            this.onCardboardTrigger();
            return true;
        }
        return false;
    }
    
    @Override
    public void setOnCardboardTriggerListener(final Runnable cardboardTriggerListener) {
        this.cardboardTriggerListener = cardboardTriggerListener;
    }
    
    @Override
    public void setOnCloseButtonListener(final Runnable closeButtonListener) {
        this.uiLayout.setCloseButtonListener(closeButtonListener);
    }
    
    @Override
    public void setRenderer(final GvrView$StereoRenderer renderer) {
        this.rendererHelper.setRenderer(renderer);
        ((GvrSurfaceView)this.glSurfaceView).setRenderer((GLSurfaceView$Renderer)this.rendererHelper);
    }
    
    @Override
    public void setStereoModeEnabled(final boolean b) {
        this.stereoMode = b;
        this.rendererHelper.setStereoModeEnabled(b);
    }
    
    @Override
    public void shutdown() {
        if (this.nativeCardboardView != 0L) {
            this.hmdManager.close();
            this.gvrLayout.shutdown();
            this.nativeDestroy(this.nativeCardboardView);
            this.nativeCardboardView = 0L;
        }
    }
}
