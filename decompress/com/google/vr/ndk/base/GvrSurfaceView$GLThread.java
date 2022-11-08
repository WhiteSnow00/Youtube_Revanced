// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import javax.microedition.khronos.opengles.GL10;
import com.google.vr.cardboard.EglReadyListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class GvrSurfaceView$GLThread extends Thread implements aqzm
{
    private GvrSurfaceView$EglHelper mEglHelper;
    private ArrayList mEventQueue;
    private boolean mExited;
    private boolean mFinishedCreatingEglSurface;
    private final GvrSurfaceView$GLThread$GLThreadManager mGLThreadManager;
    private WeakReference mGvrSurfaceViewWeakRef;
    private boolean mHasSurface;
    private boolean mHaveEglContext;
    private boolean mHaveEglSurface;
    private int mHeight;
    private boolean mPaused;
    private boolean mRenderComplete;
    private int mRenderMode;
    private boolean mRequestPaused;
    private boolean mRequestRender;
    private int mRequestedSwapMode;
    private boolean mShouldExit;
    private boolean mShouldReleaseEglContext;
    private boolean mSizeChanged;
    private boolean mSurfaceIsBad;
    private boolean mWaitingForSurface;
    private boolean mWantRenderNotification;
    private int mWidth;
    
    public GvrSurfaceView$GLThread(final WeakReference mGvrSurfaceViewWeakRef) {
        this.mEventQueue = new ArrayList();
        this.mSizeChanged = true;
        this.mGLThreadManager = new GvrSurfaceView$GLThread$GLThreadManager(null);
        this.mWidth = 0;
        this.mHeight = 0;
        this.mRequestRender = true;
        this.mRenderMode = 1;
        this.mRequestedSwapMode = 0;
        this.mWantRenderNotification = false;
        this.mGvrSurfaceViewWeakRef = mGvrSurfaceViewWeakRef;
        final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)mGvrSurfaceViewWeakRef.get();
        if (gvrSurfaceView != null && GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView) != null) {
            final EglReadyListener -$$Nest$fgetmAppContextListener = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView);
            synchronized (-$$Nest$fgetmAppContextListener.f) {
                -$$Nest$fgetmAppContextListener.e = (aqzm)this;
            }
        }
    }
    
    private void guardedRun() {
        this.mEglHelper = new GvrSurfaceView$EglHelper(this.mGvrSurfaceViewWeakRef);
        this.mHaveEglContext = false;
        this.mHaveEglSurface = false;
        this.mWantRenderNotification = false;
        int swap = 0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int mWidth = 0;
        int mHeight = 0;
        int mRequestedSwapMode = 0;
        Runnable runnable = null;
        GL10 gl10 = null;
        try {
        Label_0981_Outer:
            while (true) {
                Object o = this.mGLThreadManager;
                monitorenter(o);
                int n9 = swap;
                try {
                    while (true) {
                        if (this.mShouldExit) {
                            monitorexit(o);
                            synchronized (this.mGLThreadManager) {
                                this.stopEglSurfaceLocked();
                                this.stopEglContextLocked();
                                return;
                            }
                        }
                        if (!this.mEventQueue.isEmpty()) {
                            runnable = this.mEventQueue.remove(0);
                            swap = n9;
                            break;
                        }
                        final boolean mPaused = this.mPaused;
                        boolean mRequestPaused = this.mRequestPaused;
                        if (mPaused != mRequestPaused) {
                            this.mPaused = mRequestPaused;
                            this.mGLThreadManager.notifyAll();
                        }
                        else {
                            mRequestPaused = false;
                        }
                        if (this.mShouldReleaseEglContext) {
                            this.stopEglSurfaceLocked();
                            this.stopEglContextLocked();
                            this.mShouldReleaseEglContext = false;
                            n5 = 1;
                        }
                        if (n2 != 0) {
                            this.stopEglSurfaceLocked();
                            this.stopEglContextLocked();
                        }
                        Label_0277: {
                            if (mRequestPaused) {
                                if (this.mHaveEglSurface) {
                                    this.stopEglSurfaceLocked();
                                }
                                if (this.mHaveEglContext) {
                                    final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
                                    if (gvrSurfaceView != null) {
                                        if (GvrSurfaceView.-$$Nest$fgetmPreserveEGLContextOnPause(gvrSurfaceView)) {
                                            break Label_0277;
                                        }
                                    }
                                    this.stopEglContextLocked();
                                }
                            }
                        }
                        if (!this.mHasSurface && !this.mWaitingForSurface) {
                            if (this.mHaveEglSurface) {
                                this.stopEglSurfaceLocked();
                            }
                            this.mWaitingForSurface = true;
                            this.mSurfaceIsBad = false;
                            this.mGLThreadManager.notifyAll();
                        }
                        if (this.mHasSurface && this.mWaitingForSurface) {
                            this.mWaitingForSurface = false;
                            this.mGLThreadManager.notifyAll();
                        }
                        if (n4 != 0) {
                            this.mWantRenderNotification = false;
                            this.mRenderComplete = true;
                            this.mGLThreadManager.notifyAll();
                        }
                        int n11;
                        int n12;
                        if (this.readyToDraw()) {
                            final boolean mHaveEglContext = this.mHaveEglContext;
                            n4 = n5;
                            n2 = mRequestedSwapMode;
                            Label_0456: {
                                if (!mHaveEglContext) {
                                    Label_0397: {
                                        if (n5 == 0) {
                                            try {
                                                this.mEglHelper.start();
                                                if (this.mEglHelper.mEglContext == null) {
                                                    break Label_0397;
                                                }
                                                this.mHaveEglContext = true;
                                                this.mGLThreadManager.notifyAll();
                                                n4 = 0;
                                                n2 = 1;
                                            }
                                            catch (final RuntimeException ex) {
                                                this.mGLThreadManager.releaseEglContextLocked(this);
                                                throw ex;
                                            }
                                            break Label_0456;
                                        }
                                    }
                                    n4 = 0;
                                    n2 = mRequestedSwapMode;
                                }
                            }
                            int n10;
                            if (this.mHaveEglContext && !this.mHaveEglSurface) {
                                this.mHaveEglSurface = true;
                                mRequestedSwapMode = 1;
                                n10 = 1;
                                n3 = 1;
                            }
                            else {
                                mRequestedSwapMode = n9;
                                n10 = n;
                            }
                            swap = mRequestedSwapMode;
                            n = n10;
                            n11 = n3;
                            n5 = n4;
                            n12 = n2;
                            if (this.mHaveEglSurface) {
                                if (this.mSizeChanged) {
                                    mWidth = this.mWidth;
                                    mHeight = this.mHeight;
                                    this.mWantRenderNotification = true;
                                    this.mSizeChanged = false;
                                    swap = 1;
                                    n3 = 1;
                                }
                                else {
                                    swap = mRequestedSwapMode;
                                }
                                this.mRequestRender = false;
                                this.mGLThreadManager.notifyAll();
                                n6 |= (this.mWantRenderNotification ? 1 : 0);
                                mRequestedSwapMode = this.mRequestedSwapMode;
                                if (mRequestedSwapMode != n8) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                n8 = mRequestedSwapMode;
                                final int n13 = 0;
                                final int n14 = 0;
                                mRequestedSwapMode = n2;
                                n7 = n;
                                n5 = n4;
                                n4 = n14;
                                n2 = n13;
                                n = n10;
                                break;
                            }
                        }
                        else {
                            n12 = mRequestedSwapMode;
                            n11 = n3;
                            swap = n9;
                        }
                        this.mGLThreadManager.wait();
                        n2 = 0;
                        n4 = 0;
                        n9 = swap;
                        n3 = n11;
                        mRequestedSwapMode = n12;
                    }
                    monitorexit(o);
                    if (runnable != null) {
                        runnable.run();
                        runnable = null;
                        continue Label_0981_Outer;
                    }
                    int n15 = n8;
                    Label_0746: {
                        if (swap != 0) {
                            if (this.mEglHelper.createSurface()) {
                                synchronized (this.mGLThreadManager) {
                                    this.mFinishedCreatingEglSurface = true;
                                    this.mGLThreadManager.notifyAll();
                                    monitorexit(this.mGLThreadManager);
                                    n15 = 0;
                                    break Label_0746;
                                }
                            }
                            synchronized (this.mGLThreadManager) {
                                this.mFinishedCreatingEglSurface = true;
                                this.mSurfaceIsBad = true;
                                this.mGLThreadManager.notifyAll();
                                continue Label_0981_Outer;
                            }
                        }
                    }
                    if (n != 0) {
                        gl10 = (GL10)this.mEglHelper.createGL();
                    }
                    if (mRequestedSwapMode != 0) {
                        o = this.mGvrSurfaceViewWeakRef.get();
                        if (o != null) {
                            try {
                                GvrSurfaceView.-$$Nest$fgetmRenderer((GvrSurfaceView)o).onSurfaceCreated(gl10, this.mEglHelper.mEglConfig);
                            }
                            finally {}
                        }
                    }
                    if (n3 != 0) {
                        o = this.mGvrSurfaceViewWeakRef.get();
                        if (o != null) {
                            try {
                                GvrSurfaceView.-$$Nest$fgetmRenderer((GvrSurfaceView)o).onSurfaceChanged(gl10, mWidth, mHeight);
                            }
                            finally {}
                        }
                    }
                    if (n7 != 0) {
                        o = this.mEglHelper;
                        if (n15 == 1) {
                            mRequestedSwapMode = 12421;
                        }
                        else {
                            mRequestedSwapMode = 12420;
                        }
                        ((GvrSurfaceView$EglHelper)o).setEglSurfaceAttrib(12422, mRequestedSwapMode);
                        o = this.mEglHelper;
                        if (n15 == 1) {
                            mRequestedSwapMode = 1;
                        }
                        else {
                            mRequestedSwapMode = 0;
                        }
                        ((GvrSurfaceView$EglHelper)o).setEglSurfaceAttrib(12620, mRequestedSwapMode);
                    }
                    o = this.mGvrSurfaceViewWeakRef.get();
                    if (o != null) {
                        try {
                            GvrSurfaceView.-$$Nest$fgetmRenderer((GvrSurfaceView)o).onDrawFrame(gl10);
                        }
                        finally {}
                    }
                Label_1060:
                    while (true) {
                        Label_0988: {
                            if (n7 != 0) {
                                mRequestedSwapMode = n15;
                                break Label_0988;
                            }
                            if (n15 == 0) {
                                mRequestedSwapMode = 0;
                                break Label_0988;
                            }
                            break Label_1060;
                        }
                        swap = this.mEglHelper.swap();
                        if (swap != 12288) {
                            if (swap != 12302) {
                                GvrSurfaceView$EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", swap);
                                if (mRequestedSwapMode != 0) {
                                    continue;
                                }
                                synchronized (this.mGLThreadManager) {
                                    this.mSurfaceIsBad = true;
                                    this.mGLThreadManager.notifyAll();
                                    break Label_1060;
                                }
                            }
                            n2 = 1;
                        }
                        break;
                    }
                    swap = 0;
                    n = 0;
                    n3 = 0;
                    mRequestedSwapMode = n6;
                    if (n6 != 0) {
                        n4 = 1;
                        mRequestedSwapMode = 0;
                    }
                    final int n16 = 0;
                    n6 = mRequestedSwapMode;
                    n8 = n15;
                    mRequestedSwapMode = n16;
                    continue Label_0981_Outer;
                }
                finally {
                    monitorexit(o);
                }
            }
        }
        finally {
            final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
            monitorenter(mglThreadManager);
            try {
                this.stopEglSurfaceLocked();
                this.stopEglContextLocked();
                monitorexit(mglThreadManager);
            }
            finally {
                monitorexit(mglThreadManager);
                while (true) {}
            }
        }
    }
    
    private boolean readyToDraw() {
        final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
        EglReadyListener -$$Nest$fgetmAppContextListener;
        if (gvrSurfaceView == null) {
            -$$Nest$fgetmAppContextListener = null;
        }
        else {
            -$$Nest$fgetmAppContextListener = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView);
        }
        boolean b = true;
        final boolean b2 = -$$Nest$fgetmAppContextListener == null || -$$Nest$fgetmAppContextListener.a != null;
        if (!this.mPaused && b2 && this.mHasSurface && !this.mSurfaceIsBad && this.mWidth > 0 && this.mHeight > 0) {
            if (this.mRequestRender) {
                return b;
            }
            if (this.mRenderMode == 1) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    private void stopEglContextLocked() {
        if (this.mHaveEglContext) {
            this.mEglHelper.finish();
            this.mHaveEglContext = false;
            this.mGLThreadManager.releaseEglContextLocked(this);
        }
    }
    
    private void stopEglSurfaceLocked() {
        if (this.mHaveEglSurface) {
            this.mHaveEglSurface = false;
            this.mEglHelper.destroySurface();
        }
    }
    
    public boolean ableToDraw() {
        return this.mHaveEglContext && this.mHaveEglSurface && this.readyToDraw();
    }
    
    public int getRenderMode() {
        synchronized (this.mGLThreadManager) {
            return this.mRenderMode;
        }
    }
    
    public int getSwapMode() {
        synchronized (this.mGLThreadManager) {
            return this.mRequestedSwapMode;
        }
    }
    
    public void onEglReady() {
        synchronized (this.mGLThreadManager) {
            this.mEglHelper.renewPendingEglContext();
            this.mGLThreadManager.notifyAll();
        }
    }
    
    public void onPause(final Runnable runnable) {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mRequestPaused = true;
            if (runnable != null) {
                this.mEventQueue.add(runnable);
            }
            this.mGLThreadManager.notifyAll();
            while (!this.mExited && !this.mPaused) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    public void onResume() {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mRequestPaused = false;
            this.mRequestRender = true;
            this.mRenderComplete = false;
            this.mGLThreadManager.notifyAll();
            while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    public void onWindowResize(final int mWidth, final int mHeight) {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mWidth = mWidth;
            this.mHeight = mHeight;
            this.mSizeChanged = true;
            this.mRequestRender = true;
            this.mRenderComplete = false;
            if (Thread.currentThread() == this) {
                monitorexit(mglThreadManager);
                return;
            }
            this.mGLThreadManager.notifyAll();
            while (!this.mExited && !this.mPaused && !this.mRenderComplete && this.ableToDraw()) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    public void queueEvent(final Runnable runnable) {
        if (runnable != null) {
            synchronized (this.mGLThreadManager) {
                this.mEventQueue.add(runnable);
                this.mGLThreadManager.notifyAll();
                return;
            }
        }
        throw new IllegalArgumentException("r must not be null");
    }
    
    public void requestExitAndWait() {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mShouldExit = true;
            this.mGLThreadManager.notifyAll();
            while (!this.mExited) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
            if (gvrSurfaceView != null && GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView) != null) {
                final EglReadyListener -$$Nest$fgetmAppContextListener = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView);
                synchronized (-$$Nest$fgetmAppContextListener.f) {
                    -$$Nest$fgetmAppContextListener.e = null;
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    public void requestRenderAndWait() {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            if (Thread.currentThread() == this) {
                monitorexit(mglThreadManager);
                return;
            }
            this.mWantRenderNotification = true;
            this.mRequestRender = true;
            this.mRenderComplete = false;
            this.mGLThreadManager.notifyAll();
            while (!this.mExited && !this.mPaused && !this.mRenderComplete && this.ableToDraw()) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    @Override
    public void run() {
        final long id = this.getId();
        final StringBuilder sb = new StringBuilder("GLThread ");
        sb.append(id);
        this.setName(sb.toString());
        while (true) {
            try {
                this.guardedRun();
                final GvrSurfaceView$GLThread$GLThreadManager gvrSurfaceView$GLThread$GLThreadManager = this.mGLThreadManager;
                gvrSurfaceView$GLThread$GLThreadManager.threadExiting(this);
            }
            catch (final InterruptedException ex) {
                final GvrSurfaceView$GLThread$GLThreadManager gvrSurfaceView$GLThread$GLThreadManager = this.mGLThreadManager;
                continue;
            }
            finally {
                this.mGLThreadManager.threadExiting(this);
            }
            break;
        }
    }
    
    public void setRenderMode(final int mRenderMode) {
        if (mRenderMode >= 0 && mRenderMode <= 1) {
            synchronized (this.mGLThreadManager) {
                this.mRenderMode = mRenderMode;
                this.mGLThreadManager.notifyAll();
                return;
            }
        }
        throw new IllegalArgumentException("renderMode");
    }
    
    public void setSwapMode(final int mRequestedSwapMode) {
        if (mRequestedSwapMode >= 0 && mRequestedSwapMode <= 2) {
            synchronized (this.mGLThreadManager) {
                this.mRequestedSwapMode = mRequestedSwapMode;
                this.mGLThreadManager.notifyAll();
                return;
            }
        }
        throw new IllegalArgumentException("swapMode");
    }
    
    public void surfaceCreated() {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mHasSurface = true;
            this.mFinishedCreatingEglSurface = false;
            this.mGLThreadManager.notifyAll();
            while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
    
    public void surfaceDestroyed(final Runnable runnable) {
        final GvrSurfaceView$GLThread$GLThreadManager mglThreadManager = this.mGLThreadManager;
        monitorenter(mglThreadManager);
        try {
            this.mHasSurface = false;
            if (runnable != null) {
                this.mEventQueue.add(runnable);
            }
            this.mGLThreadManager.notifyAll();
            while (!this.mWaitingForSurface && !this.mExited) {
                try {
                    this.mGLThreadManager.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(mglThreadManager);
        }
        finally {
            monitorexit(mglThreadManager);
            while (true) {}
        }
    }
}
