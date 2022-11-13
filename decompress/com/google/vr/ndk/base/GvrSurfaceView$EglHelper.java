// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.opengl.EGL14;
import java.io.Writer;
import android.opengl.GLDebugHelper;
import javax.microedition.khronos.opengles.GL;
import com.google.vr.cardboard.EglReadyListener;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGL10;

class GvrSurfaceView$EglHelper
{
    EGL10 mEgl;
    EGLConfig mEglConfig;
    EGLContext mEglContext;
    EGLDisplay mEglDisplay;
    EGLSurface mEglSurface;
    private WeakReference mGvrSurfaceViewWeakRef;
    EGLContext mPendingEglContext;
    EGLDisplay mPendingEglDisplay;
    
    public GvrSurfaceView$EglHelper(final WeakReference mGvrSurfaceViewWeakRef) {
        this.mGvrSurfaceViewWeakRef = mGvrSurfaceViewWeakRef;
    }
    
    private void createPendingEglContext() {
        final EGLDisplay eglGetDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mPendingEglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (this.mEgl.eglInitialize(this.mPendingEglDisplay, new int[2])) {
            final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
            final EGLContext eglContext = null;
            EGLContext context;
            if (gvrSurfaceView == null) {
                this.mEglConfig = null;
                context = null;
            }
            else {
                if (GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView) != null) {
                    final EGLContext a = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView).a;
                    if (a != null && a != EGL10.EGL_NO_CONTEXT) {
                        final arbz arbz = (arbz)GvrSurfaceView.-$$Nest$fgetmEGLContextFactory(gvrSurfaceView);
                        final int b = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView).b;
                        arbz.f = a;
                        arbz.d = ((b & 0x8) == 0x0);
                        arbz.e = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView).c;
                    }
                    else {
                        this.throwEglException("Unable to obtain application's OpenGL context.");
                    }
                }
                this.mEglConfig = GvrSurfaceView.-$$Nest$fgetmEGLConfigChooser(gvrSurfaceView).chooseConfig(this.mEgl, this.mPendingEglDisplay);
                context = GvrSurfaceView.-$$Nest$fgetmEGLContextFactory(gvrSurfaceView).createContext(this.mEgl, this.mPendingEglDisplay, this.mEglConfig);
            }
            if (context == null || context == EGL10.EGL_NO_CONTEXT) {
                final int eglGetError = this.mEgl.eglGetError();
                if (eglGetError == 12294) {
                    Log.e("EglHelper", "Stashed EGL context has become invalid and can no longer be used for sharing.");
                    this.mPendingEglContext = null;
                    this.mPendingEglDisplay = null;
                    this.mEglConfig = null;
                    if (GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView) != null) {
                        final EglReadyListener -$$Nest$fgetmAppContextListener = GvrSurfaceView.-$$Nest$fgetmAppContextListener(gvrSurfaceView);
                        synchronized (-$$Nest$fgetmAppContextListener.d) {
                            -$$Nest$fgetmAppContextListener.a = null;
                            -$$Nest$fgetmAppContextListener.c = 2;
                            -$$Nest$fgetmAppContextListener.b = 0;
                        }
                    }
                    return;
                }
                throwEglException("createPendingEglContext", eglGetError);
                context = eglContext;
            }
            this.mPendingEglContext = context;
            return;
        }
        throw new RuntimeException("eglInitialize failed");
    }
    
    private void destroySurfaceImp() {
        final EGLSurface mEglSurface = this.mEglSurface;
        if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE) {
            this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
            if (gvrSurfaceView != null) {
                GvrSurfaceView.-$$Nest$fgetmEGLWindowSurfaceFactory(gvrSurfaceView).destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }
    }
    
    public static String formatEglError(final String s, final int n) {
        final String errorString = getErrorString(n);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" failed: ");
        sb.append(errorString);
        return sb.toString();
    }
    
    private static String getErrorString(final int n) {
        switch (n) {
            default: {
                return getHex(n);
            }
            case 12302: {
                return "EGL_CONTEXT_LOST";
            }
            case 12301: {
                return "EGL_BAD_SURFACE";
            }
            case 12300: {
                return "EGL_BAD_PARAMETER";
            }
            case 12299: {
                return "EGL_BAD_NATIVE_WINDOW";
            }
            case 12298: {
                return "EGL_BAD_NATIVE_PIXMAP";
            }
            case 12297: {
                return "EGL_BAD_MATCH";
            }
            case 12296: {
                return "EGL_BAD_DISPLAY";
            }
            case 12295: {
                return "EGL_BAD_CURRENT_SURFACE";
            }
            case 12294: {
                return "EGL_BAD_CONTEXT";
            }
            case 12293: {
                return "EGL_BAD_CONFIG";
            }
            case 12292: {
                return "EGL_BAD_ATTRIBUTE";
            }
            case 12291: {
                return "EGL_BAD_ALLOC";
            }
            case 12290: {
                return "EGL_BAD_ACCESS";
            }
            case 12289: {
                return "EGL_NOT_INITIALIZED";
            }
            case 12288: {
                return "EGL_SUCCESS";
            }
        }
    }
    
    private static String getHex(final int n) {
        return "0x".concat(String.valueOf(Integer.toHexString(n)));
    }
    
    private void initialize() {
        final EGL10 mEgl = (EGL10)EGLContext.getEGL();
        this.mEgl = mEgl;
        final EGLDisplay eglGetDisplay = mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
            this.mEglSurface = null;
            return;
        }
        throw new RuntimeException("eglInitialize failed");
    }
    
    public static void logEglErrorAsWarning(final String s, final String s2, final int n) {
        Log.w(s, formatEglError(s2, n));
    }
    
    private void throwEglException(final String s) {
        throwEglException("Unable to obtain application's OpenGL context.", this.mEgl.eglGetError());
    }
    
    public static void throwEglException(final String s, final int n) {
        throw new RuntimeException(formatEglError(s, n));
    }
    
    public GL createGL() {
        final GL gl = this.mEglContext.getGL();
        final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
        GL wrap = gl;
        if (gvrSurfaceView != null) {
            GL wrap2 = gl;
            if (GvrSurfaceView.-$$Nest$fgetmGLWrapper(gvrSurfaceView) != null) {
                wrap2 = GvrSurfaceView.-$$Nest$fgetmGLWrapper(gvrSurfaceView).wrap(gl);
            }
            wrap = wrap2;
            if ((GvrSurfaceView.-$$Nest$fgetmDebugFlags(gvrSurfaceView) & 0x3) != 0x0) {
                final int -$$Nest$fgetmDebugFlags = GvrSurfaceView.-$$Nest$fgetmDebugFlags(gvrSurfaceView);
                Writer writer;
                if ((GvrSurfaceView.-$$Nest$fgetmDebugFlags(gvrSurfaceView) & 0x2) != 0x0) {
                    writer = new GvrSurfaceView$LogWriter();
                }
                else {
                    writer = null;
                }
                wrap = GLDebugHelper.wrap(wrap2, -$$Nest$fgetmDebugFlags & 0x1, writer);
            }
        }
        return wrap;
    }
    
    public boolean createSurface() {
        if (this.mEgl == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (this.mEglDisplay == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (this.mEglConfig == null) {
            throw new RuntimeException("mEglConfig not initialized");
        }
        this.destroySurfaceImp();
        final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
        if (gvrSurfaceView != null) {
            this.mEglSurface = GvrSurfaceView.-$$Nest$fgetmEGLWindowSurfaceFactory(gvrSurfaceView).createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, (Object)gvrSurfaceView.getHolder());
        }
        else {
            this.mEglSurface = null;
        }
        final EGLSurface mEglSurface = this.mEglSurface;
        if (mEglSurface == null || mEglSurface == EGL10.EGL_NO_SURFACE) {
            if (this.mEgl.eglGetError() == 12299) {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        final EGL10 mEgl = this.mEgl;
        final EGLDisplay mEglDisplay = this.mEglDisplay;
        final EGLSurface mEglSurface2 = this.mEglSurface;
        if (!mEgl.eglMakeCurrent(mEglDisplay, mEglSurface2, mEglSurface2, this.mEglContext)) {
            logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
            return false;
        }
        return true;
    }
    
    public void destroySurface() {
        this.destroySurfaceImp();
    }
    
    public void finish() {
        if (this.mEglContext != null) {
            final GvrSurfaceView gvrSurfaceView = (GvrSurfaceView)this.mGvrSurfaceViewWeakRef.get();
            if (gvrSurfaceView != null) {
                GvrSurfaceView.-$$Nest$fgetmEGLContextFactory(gvrSurfaceView).destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
            }
            this.mEglContext = null;
        }
        final EGLDisplay mEglDisplay = this.mEglDisplay;
        if (mEglDisplay != null) {
            this.mEgl.eglTerminate(mEglDisplay);
            this.mEglDisplay = null;
        }
    }
    
    public void renewPendingEglContext() {
        if (this.mEgl == null) {
            this.initialize();
        }
        final EGLContext mPendingEglContext = this.mPendingEglContext;
        if (mPendingEglContext != null) {
            this.mEgl.eglDestroyContext(this.mEglDisplay, mPendingEglContext);
        }
        this.createPendingEglContext();
    }
    
    public void setEglSurfaceAttrib(final int n, final int n2) {
        if (!EGL14.eglSurfaceAttrib(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), n, n2)) {
            final StringBuilder sb = new StringBuilder("eglSurfaceAttrib() failed. attribute=");
            sb.append(n);
            sb.append(" value=");
            sb.append(n2);
            Log.e("EglHelper", sb.toString());
        }
    }
    
    public void start() {
        if (this.mEgl == null) {
            this.initialize();
        }
        final EGLContext mEglContext = this.mEglContext;
        if (mEglContext != null) {
            this.mEgl.eglDestroyContext(this.mEglDisplay, mEglContext);
            this.mEglContext = null;
        }
        if (this.mPendingEglContext == null) {
            this.createPendingEglContext();
        }
        this.mEglContext = this.mPendingEglContext;
        this.mEglDisplay = this.mPendingEglDisplay;
        this.mPendingEglContext = null;
        this.mPendingEglDisplay = null;
    }
    
    public int swap() {
        if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            return this.mEgl.eglGetError();
        }
        return 12288;
    }
}
