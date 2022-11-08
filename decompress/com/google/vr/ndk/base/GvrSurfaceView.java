// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.view.SurfaceHolder;
import android.util.Log;
import android.view.SurfaceHolder$Callback;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.opengl.GLSurfaceView$Renderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView$EGLContextFactory;
import android.opengl.GLSurfaceView$EGLConfigChooser;
import com.google.vr.cardboard.EglReadyListener;
import android.view.SurfaceHolder$Callback2;
import android.view.SurfaceView;

public class GvrSurfaceView extends SurfaceView implements SurfaceHolder$Callback2
{
    private EglReadyListener mAppContextListener;
    private int mDebugFlags;
    private boolean mDetached;
    private GLSurfaceView$EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private GLSurfaceView$EGLContextFactory mEGLContextFactory;
    private GLSurfaceView$EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GvrSurfaceView$GLThread mGLThread;
    private GvrSurfaceView$GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private boolean mPreserveGlThreadOnDetachedFromWindow;
    private GLSurfaceView$Renderer mRenderer;
    private final WeakReference mThisWeakRef;
    
    public GvrSurfaceView(final Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference((T)this);
        this.init();
    }
    
    private void checkRenderThreadState() {
        if (this.mGLThread == null) {
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }
    
    private void init() {
        this.getHolder().addCallback((SurfaceHolder$Callback)this);
    }
    
    protected void finalize() {
        try {
            final GvrSurfaceView$GLThread mglThread = this.mGLThread;
            if (mglThread != null) {
                mglThread.requestExitAndWait();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    protected boolean isDetachedFromWindow() {
        return this.mDetached;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null && !this.mPreserveGlThreadOnDetachedFromWindow) {
            final GvrSurfaceView$GLThread mglThread = this.mGLThread;
            int renderMode;
            int swapMode;
            if (mglThread != null) {
                renderMode = mglThread.getRenderMode();
                swapMode = this.mGLThread.getSwapMode();
            }
            else {
                renderMode = 1;
                swapMode = 0;
            }
            final GvrSurfaceView$GLThread mglThread2 = new GvrSurfaceView$GLThread(this.mThisWeakRef);
            this.mGLThread = mglThread2;
            if (renderMode != 1) {
                mglThread2.setRenderMode(renderMode);
            }
            if (swapMode != 0) {
                this.mGLThread.setSwapMode(swapMode);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }
    
    protected void onDetachedFromWindow() {
        if (this.mGLThread != null && !this.mPreserveGlThreadOnDetachedFromWindow) {
            this.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }
    
    public void onPause() {
        this.mGLThread.onPause(null);
    }
    
    public void onPause(final Runnable runnable) {
        this.mGLThread.onPause(runnable);
    }
    
    public void onResume() {
        this.mGLThread.onResume();
    }
    
    public void onSurfaceDestroyed(final Runnable runnable) {
        this.mGLThread.surfaceDestroyed(runnable);
    }
    
    public void queueEvent(final Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }
    
    public void requestExitAndWait() {
        this.mGLThread.requestExitAndWait();
    }
    
    public void setEGLConfigChooser(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.setEGLConfigChooser((GLSurfaceView$EGLConfigChooser)new GvrSurfaceView$ComponentSizeChooser(this, n, n2, n3, n4, 16, 0));
    }
    
    public void setEGLConfigChooser(final GLSurfaceView$EGLConfigChooser meglConfigChooser) {
        this.checkRenderThreadState();
        this.mEGLConfigChooser = meglConfigChooser;
    }
    
    public void setEGLContextClientVersion(final int n) {
        this.checkRenderThreadState();
        this.mEGLContextClientVersion = 2;
    }
    
    public void setEGLContextFactory(final GLSurfaceView$EGLContextFactory meglContextFactory) {
        this.checkRenderThreadState();
        this.mEGLContextFactory = meglContextFactory;
    }
    
    public void setEGLWindowSurfaceFactory(final GLSurfaceView$EGLWindowSurfaceFactory meglWindowSurfaceFactory) {
        this.checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = meglWindowSurfaceFactory;
    }
    
    public void setEglReadyListener(final EglReadyListener mAppContextListener) {
        this.mAppContextListener = mAppContextListener;
    }
    
    public void setPreserveEGLContextOnPause(final boolean b) {
        this.mPreserveEGLContextOnPause = true;
    }
    
    public void setRenderer(final GLSurfaceView$Renderer mRenderer) {
        this.checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = (GLSurfaceView$EGLConfigChooser)new GvrSurfaceView$SimpleEGLConfigChooser(this, true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = (GLSurfaceView$EGLContextFactory)new GvrSurfaceView$DefaultContextFactory(this, null);
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = (GLSurfaceView$EGLWindowSurfaceFactory)new GvrSurfaceView$DefaultWindowSurfaceFactory(null);
        }
        this.mRenderer = mRenderer;
        (this.mGLThread = new GvrSurfaceView$GLThread(this.mThisWeakRef)).start();
    }
    
    public void setSwapMode(final int n) {
        if (aqzg.m()) {
            Log.e("GvrSurfaceView", "setSwapMode(SWAPMODE_SINGLE) requires Jellybean MR1 (EGL14 dependency) and is not supported on emulators.");
            return;
        }
        this.mGLThread.setSwapMode(1);
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        this.mGLThread.onWindowResize(n2, n3);
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.onSurfaceDestroyed(null);
    }
    
    public void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
        this.mGLThread.requestRenderAndWait();
    }
}
