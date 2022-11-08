// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import android.view.Surface;
import android.opengl.GLException;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;

public class EglBase10Impl implements aukc
{
    private final EGL10 e;
    private EGLContext f;
    private EGLConfig g;
    private EGLDisplay h;
    private EGLSurface i;
    
    public EglBase10Impl(final EGLContext eglContext, final int[] array) {
        this.i = EGL10.EGL_NO_SURFACE;
        final EGL10 e = (EGL10)EGLContext.getEGL();
        this.e = e;
        final EGLDisplay eglGetDisplay = e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new GLException(e.eglGetError(), "Unable to get EGL10 display: 0x".concat(String.valueOf(Integer.toHexString(e.eglGetError()))));
        }
        if (!e.eglInitialize(eglGetDisplay, new int[2])) {
            throw new GLException(e.eglGetError(), "Unable to initialize EGL10: 0x".concat(String.valueOf(Integer.toHexString(e.eglGetError()))));
        }
        this.h = eglGetDisplay;
        final EGLConfig[] array2 = { null };
        final int[] array3 = { 0 };
        if (!e.eglChooseConfig(eglGetDisplay, array, array2, 1, array3)) {
            throw new GLException(e.eglGetError(), "eglChooseConfig failed: 0x".concat(String.valueOf(Integer.toHexString(e.eglGetError()))));
        }
        if (array3[0] > 0) {
            final EGLConfig g = array2[0];
            if (g != null) {
                this.g = g;
                final int a = auju.a(array);
                final StringBuilder sb = new StringBuilder("Using OpenGL ES version ");
                sb.append(a);
                Logging.a("EglBase10Impl", sb.toString());
                final EGLDisplay h = this.h;
                final EGLConfig g2 = this.g;
                if (eglContext != null && eglContext == EGL10.EGL_NO_CONTEXT) {
                    throw new RuntimeException("Invalid sharedContext");
                }
                EGLContext egl_NO_CONTEXT;
                if ((egl_NO_CONTEXT = eglContext) == null) {
                    egl_NO_CONTEXT = EGL10.EGL_NO_CONTEXT;
                }
                synchronized (aukc.a) {
                    final EGLContext eglCreateContext = e.eglCreateContext(h, g2, egl_NO_CONTEXT, new int[] { 12440, a, 12344 });
                    monitorexit(aukc.a);
                    if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                        this.f = eglCreateContext;
                        return;
                    }
                    throw new GLException(e.eglGetError(), "Failed to create EGL context: 0x".concat(String.valueOf(Integer.toHexString(e.eglGetError()))));
                }
            }
            throw new RuntimeException("eglChooseConfig returned null");
        }
        throw new RuntimeException("Unable to find any matching EGL config");
    }
    
    private final void l() {
        if (this.h != EGL10.EGL_NO_DISPLAY && this.f != EGL10.EGL_NO_CONTEXT && this.g != null) {
            return;
        }
        throw new RuntimeException("This object has been released");
    }
    
    private static native long nativeGetCurrentNativeEGLContext();
    
    public final int a() {
        final int[] array = { 0 };
        this.e.eglQuerySurface(this.h, this.i, 12374, array);
        return array[0];
    }
    
    public final int b() {
        final int[] array = { 0 };
        this.e.eglQuerySurface(this.h, this.i, 12375, array);
        return array[0];
    }
    
    public final void c() {
        this.l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        if ((this.i = this.e.eglCreatePbufferSurface(this.h, this.g, new int[] { 12375, 1, 12374, 1, 12344 })) != EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(this.e.eglGetError(), "Failed to create pixel buffer surface with size 1x1: 0x".concat(String.valueOf(Integer.toHexString(this.e.eglGetError()))));
    }
    
    public final void d(final Surface surface) {
        final aujy aujy = new aujy(surface);
        this.l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        if ((this.i = this.e.eglCreateWindowSurface(this.h, this.g, (Object)aujy, new int[] { 12344 })) != EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(this.e.eglGetError(), "Failed to create window surface: 0x".concat(String.valueOf(Integer.toHexString(this.e.eglGetError()))));
    }
    
    public final void e() {
        synchronized (aukc.a) {
            if (this.e.eglMakeCurrent(this.h, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
                return;
            }
            final int eglGetError = this.e.eglGetError();
            final String hexString = Integer.toHexString(this.e.eglGetError());
            final StringBuilder sb = new StringBuilder("eglDetachCurrent failed: 0x");
            sb.append(hexString);
            throw new GLException(eglGetError, sb.toString());
        }
    }
    
    public final void f() {
        this.l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            synchronized (aukc.a) {
                final EGL10 e = this.e;
                final EGLDisplay h = this.h;
                final EGLSurface i = this.i;
                if (e.eglMakeCurrent(h, i, i, this.f)) {
                    return;
                }
                final int eglGetError = this.e.eglGetError();
                final String hexString = Integer.toHexString(this.e.eglGetError());
                final StringBuilder sb = new StringBuilder("eglMakeCurrent failed: 0x");
                sb.append(hexString);
                throw new GLException(eglGetError, sb.toString());
            }
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }
    
    public final void g() {
        this.l();
        this.h();
        this.e();
        this.e.eglDestroyContext(this.h, this.f);
        this.e.eglTerminate(this.h);
        this.f = EGL10.EGL_NO_CONTEXT;
        this.h = EGL10.EGL_NO_DISPLAY;
        this.g = null;
    }
    
    public final void h() {
        if (this.i != EGL10.EGL_NO_SURFACE) {
            this.e.eglDestroySurface(this.h, this.i);
            this.i = EGL10.EGL_NO_SURFACE;
        }
    }
    
    public final void i() {
        this.l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            synchronized (aukc.a) {
                this.e.eglSwapBuffers(this.h, this.i);
                return;
            }
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
    
    public final void j(final long n) {
        this.i();
    }
    
    public final boolean k() {
        return this.i != EGL10.EGL_NO_SURFACE;
    }
}
