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

public class CardboardViewNativeImpl implements CardboardViewApi, arbv
{
    private static final String TAG = "CardboardViewNativeImpl";
    private volatile Runnable cardboardBackListener;
    private int cardboardTriggerCount;
    private volatile Runnable cardboardTriggerListener;
    private final Context context;
    private volatile boolean distortionCorrectionEnabled;
    private final arbw glSurfaceView;
    private final GvrApi gvrApi;
    private final GvrLayout gvrLayout;
    private final HeadMountedDisplayManager hmdManager;
    private long nativeCardboardView;
    private final CardboardViewNativeImpl$RendererHelper rendererHelper;
    private CountDownLatch shutdownLatch;
    private boolean stereoMode;
    private final GvrUiLayout uiLayout;
    
    static /* bridge */ GvrLayout -$$Nest$fgetgvrLayout(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        return cardboardViewNativeImpl.gvrLayout;
    }
    
    static /* bridge */ long -$$Nest$fgetnativeCardboardView(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        return cardboardViewNativeImpl.nativeCardboardView;
    }
    
    static /* bridge */ CardboardViewNativeImpl$RendererHelper -$$Nest$fgetrendererHelper(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        return cardboardViewNativeImpl.rendererHelper;
    }
    
    static /* bridge */ CountDownLatch -$$Nest$fgetshutdownLatch(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        return cardboardViewNativeImpl.shutdownLatch;
    }
    
    static /* bridge */ boolean -$$Nest$fgetstereoMode(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        return cardboardViewNativeImpl.stereoMode;
    }
    
    static /* bridge */ void -$$Nest$mcheckNativeCardboardView(final CardboardViewNativeImpl cardboardViewNativeImpl) {
        cardboardViewNativeImpl.checkNativeCardboardView();
    }
    
    static /* bridge */ void -$$Nest$mnativeOnDrawFrame(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n) {
        cardboardViewNativeImpl.nativeOnDrawFrame(n);
    }
    
    static /* bridge */ void -$$Nest$mnativeOnSurfaceChanged(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n, final int n2, final int n3) {
        cardboardViewNativeImpl.nativeOnSurfaceChanged(n, n2, n3);
    }
    
    static /* bridge */ void -$$Nest$mnativeOnSurfaceCreated(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n) {
        cardboardViewNativeImpl.nativeOnSurfaceCreated(n);
    }
    
    static /* bridge */ void -$$Nest$mnativeSetGvrViewerParams(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n, final byte[] array) {
        cardboardViewNativeImpl.nativeSetGvrViewerParams(n, array);
    }
    
    static /* bridge */ void -$$Nest$mnativeSetScreenParams(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n, final int n2, final int n3, final float n4, final float n5, final float n6) {
        cardboardViewNativeImpl.nativeSetScreenParams(n, n2, n3, n4, n5, n6);
    }
    
    static /* bridge */ void -$$Nest$mnativeSetStereoModeEnabled(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n, final boolean b) {
        cardboardViewNativeImpl.nativeSetStereoModeEnabled(n, b);
    }
    
    static /* bridge */ void -$$Nest$mnativeSetStereoRenderer(final CardboardViewNativeImpl cardboardViewNativeImpl, final long n, final GvrView$StereoRenderer gvrView$StereoRenderer) {
        cardboardViewNativeImpl.nativeSetStereoRenderer(n, gvrView$StereoRenderer);
    }
    
    static /* bridge */ void -$$Nest$mqueueEvent(final CardboardViewNativeImpl cardboardViewNativeImpl, final Runnable runnable) {
        cardboardViewNativeImpl.queueEvent(runnable);
    }
    
    static /* bridge */ String -$$Nest$sfgetTAG() {
        return CardboardViewNativeImpl.TAG;
    }
    
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
        final arbw arbw = new arbw(context, this);
        this.glSurfaceView = arbw;
        final GvrLayout gvrLayout = new GvrLayout(context);
        (this.gvrLayout = gvrLayout).setPresentationView((View)arbw);
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
            arcq.a(cardboardTriggerListener);
        }
    }
    
    private void queueEvent(final Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }
    
    private void runOnCardboardBackListener() {
        final Runnable cardboardBackListener = this.cardboardBackListener;
        if (cardboardBackListener != null) {
            arcq.a(cardboardBackListener);
        }
    }
    
    private void setGvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.uiLayout.setViewerName(new GvrViewerParams(gvrViewerParams).getModel());
        this.queueEvent((Runnable)new CardboardViewNativeImpl$6(this, gvrViewerParams));
    }
    
    private void setScreenParams(final ScreenParams screenParams) {
        this.queueEvent((Runnable)new CardboardViewNativeImpl$7(this, new ScreenParams(screenParams)));
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
    
    public GvrSurfaceView getGvrSurfaceView() {
        return this.glSurfaceView;
    }
    
    public GvrViewerParams getGvrViewerParams() {
        return this.hmdManager.getHeadMountedDisplay().getGvrViewerParams();
    }
    
    public View getRootView() {
        return (View)this.gvrLayout;
    }
    
    public ScreenParams getScreenParams() {
        return this.hmdManager.getHeadMountedDisplay().getScreenParams();
    }
    
    public void onPause() {
        this.checkNativeCardboardView();
        this.gvrApi.pauseTracking();
        this.hmdManager.onPause();
        this.glSurfaceView.onPause();
        this.gvrLayout.onPause();
    }
    
    public void onResume() {
        this.checkNativeCardboardView();
        this.gvrLayout.onResume();
        this.glSurfaceView.onResume();
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
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.cardboardTriggerListener != null) {
            this.onCardboardTrigger();
            return true;
        }
        return false;
    }
    
    public void setOnCardboardTriggerListener(final Runnable cardboardTriggerListener) {
        this.cardboardTriggerListener = cardboardTriggerListener;
    }
    
    public void setOnCloseButtonListener(final Runnable closeButtonListener) {
        this.uiLayout.setCloseButtonListener(closeButtonListener);
    }
    
    public void setRenderer(final GvrView$StereoRenderer renderer) {
        this.rendererHelper.setRenderer(renderer);
        this.glSurfaceView.setRenderer((GLSurfaceView$Renderer)this.rendererHelper);
    }
    
    public void setStereoModeEnabled(final boolean b) {
        this.stereoMode = b;
        this.rendererHelper.setStereoModeEnabled(b);
    }
    
    public void shutdown() {
        if (this.nativeCardboardView != 0L) {
            this.hmdManager.close();
            this.gvrLayout.shutdown();
            this.nativeDestroy(this.nativeCardboardView);
            this.nativeCardboardView = 0L;
        }
    }
}
