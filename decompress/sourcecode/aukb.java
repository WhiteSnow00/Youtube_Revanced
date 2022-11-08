import android.opengl.EGLExt;
import android.view.Surface;
import org.webrtc.Logging;
import android.opengl.GLException;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aukb implements aujz
{
    private EGLContext e;
    private EGLConfig f;
    private EGLDisplay g;
    private EGLSurface h;
    
    public aukb(final EGLContext eglContext, final int[] array) {
        this.h = EGL14.EGL_NO_SURFACE;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new GLException(EGL14.eglGetError(), "Unable to get EGL14 display: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
        }
        final int[] array2 = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array2, 0, array2, 1)) {
            throw new GLException(EGL14.eglGetError(), "Unable to initialize EGL14: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
        }
        this.g = eglGetDisplay;
        final EGLConfig[] array3 = { null };
        final int[] array4 = { 0 };
        if (!EGL14.eglChooseConfig(eglGetDisplay, array, 0, array3, 0, 1, array4, 0)) {
            throw new GLException(EGL14.eglGetError(), "eglChooseConfig failed: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
        }
        if (array4[0] > 0) {
            final EGLConfig f = array3[0];
            if (f != null) {
                this.f = f;
                final int a = auju.a(array);
                final StringBuilder sb = new StringBuilder("Using OpenGL ES version ");
                sb.append(a);
                Logging.a("EglBase14Impl", sb.toString());
                final EGLDisplay g = this.g;
                final EGLConfig f2 = this.f;
                if (eglContext != null && eglContext == EGL14.EGL_NO_CONTEXT) {
                    throw new RuntimeException("Invalid sharedContext");
                }
                EGLContext egl_NO_CONTEXT;
                if ((egl_NO_CONTEXT = eglContext) == null) {
                    egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
                }
                synchronized (aukc.a) {
                    final EGLContext eglCreateContext = EGL14.eglCreateContext(g, f2, egl_NO_CONTEXT, new int[] { 12440, a, 12344 }, 0);
                    monitorexit(aukc.a);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.e = eglCreateContext;
                        return;
                    }
                    throw new GLException(EGL14.eglGetError(), "Failed to create EGL context: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
                }
            }
            throw new RuntimeException("eglChooseConfig returned null");
        }
        throw new RuntimeException("Unable to find any matching EGL config");
    }
    
    private final void m() {
        if (this.g != EGL14.EGL_NO_DISPLAY && this.e != EGL14.EGL_NO_CONTEXT && this.f != null) {
            return;
        }
        throw new RuntimeException("This object has been released");
    }
    
    public final int a() {
        final int[] array = { 0 };
        EGL14.eglQuerySurface(this.g, this.h, 12374, array, 0);
        return array[0];
    }
    
    public final int b() {
        final int[] array = { 0 };
        EGL14.eglQuerySurface(this.g, this.h, 12375, array, 0);
        return array[0];
    }
    
    public final void c() {
        this.m();
        if (this.h != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        if ((this.h = EGL14.eglCreatePbufferSurface(this.g, this.f, new int[] { 12375, 1, 12374, 1, 12344 }, 0)) != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(EGL14.eglGetError(), "Failed to create pixel buffer surface with size 1x1: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
    }
    
    public final void d(final Surface surface) {
        if (!(surface instanceof Surface)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        this.m();
        if (this.h != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        if ((this.h = EGL14.eglCreateWindowSurface(this.g, this.f, (Object)surface, new int[] { 12344 }, 0)) != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(EGL14.eglGetError(), "Failed to create window surface: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
    }
    
    public final void e() {
        synchronized (aukc.a) {
            if (EGL14.eglMakeCurrent(this.g, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
                return;
            }
            final int eglGetError = EGL14.eglGetError();
            final String hexString = Integer.toHexString(EGL14.eglGetError());
            final StringBuilder sb = new StringBuilder("eglDetachCurrent failed: 0x");
            sb.append(hexString);
            throw new GLException(eglGetError, sb.toString());
        }
    }
    
    public final void f() {
        this.m();
        if (this.h != EGL14.EGL_NO_SURFACE) {
            synchronized (aukc.a) {
                final EGLDisplay g = this.g;
                final EGLSurface h = this.h;
                if (EGL14.eglMakeCurrent(g, h, h, this.e)) {
                    return;
                }
                final int eglGetError = EGL14.eglGetError();
                final String hexString = Integer.toHexString(EGL14.eglGetError());
                final StringBuilder sb = new StringBuilder("eglMakeCurrent failed: 0x");
                sb.append(hexString);
                throw new GLException(eglGetError, sb.toString());
            }
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }
    
    public final void g() {
        this.m();
        this.h();
        this.e();
        synchronized (aukc.a) {
            EGL14.eglDestroyContext(this.g, this.e);
            monitorexit(aukc.a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.g);
            this.e = EGL14.EGL_NO_CONTEXT;
            this.g = EGL14.EGL_NO_DISPLAY;
            this.f = null;
        }
    }
    
    public final void h() {
        if (this.h != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.g, this.h);
            this.h = EGL14.EGL_NO_SURFACE;
        }
    }
    
    public final void i() {
        this.m();
        if (this.h != EGL14.EGL_NO_SURFACE) {
            synchronized (aukc.a) {
                EGL14.eglSwapBuffers(this.g, this.h);
                return;
            }
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
    
    public final void j(final long n) {
        this.m();
        if (this.h != EGL14.EGL_NO_SURFACE) {
            synchronized (aukc.a) {
                EGLExt.eglPresentationTimeANDROID(this.g, this.h, n);
                EGL14.eglSwapBuffers(this.g, this.h);
                return;
            }
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
    
    public final boolean k() {
        return this.h != EGL14.EGL_NO_SURFACE;
    }
    
    public final auka l() {
        return new auka(this.e);
    }
}
