import javax.microedition.khronos.egl.EGLSurface;
import android.util.Log;
import android.os.Build;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView$EGLContextFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arev implements GLSurfaceView$EGLContextFactory, GLSurfaceView$EGLWindowSurfaceFactory
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public EGLContext f;
    
    public arev() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = 2;
        this.f = EGL10.EGL_NO_CONTEXT;
    }
    
    private static final boolean a(final EGL10 egl10, final EGLDisplay eglDisplay) {
        return egl10.eglQueryString(eglDisplay, 12373).contains("EGL_EXT_protected_content");
    }
    
    public final EGLContext createContext(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig) {
        final IntBuffer allocate = IntBuffer.allocate(10);
        allocate.put(12440);
        allocate.put(this.e);
        if (this.c) {
            allocate.put(12540);
            allocate.put(1);
        }
        if (this.a) {
            if (Build.FINGERPRINT.contains("generic_x86")) {
                Log.w("GvrEglFactory", "EGL_CONTEXT_PRIORITY_LEVEL not supported on emulators.");
            }
            else {
                allocate.put(12544);
                allocate.put(12545);
            }
        }
        if (this.b && a(egl10, eglDisplay)) {
            allocate.put(12992);
            allocate.put(1);
        }
        if (!this.d) {
            if (egl10.eglQueryString(eglDisplay, 12373).contains("EGL_KHR_create_context_no_error")) {
                allocate.put(12723);
                allocate.put(1);
            }
        }
        while (allocate.hasRemaining()) {
            allocate.put(12344);
        }
        final EGLContext eglCreateContext = egl10.eglCreateContext(eglDisplay, eglConfig, this.f, allocate.array());
        if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            final int e = this.e;
            if (e > 2) {
                final StringBuilder sb = new StringBuilder("Failed to create EGL context with version ");
                sb.append(e);
                sb.append(", will try 2");
                Log.w("GvrEglFactory", sb.toString());
                allocate.array()[1] = 2;
                return egl10.eglCreateContext(eglDisplay, eglConfig, this.f, allocate.array());
            }
        }
        return eglCreateContext;
    }
    
    public final EGLSurface createWindowSurface(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final Object o) {
        final boolean b = this.b;
        final EGLSurface eglSurface = null;
        int[] array;
        if (b && a(egl10, eglDisplay)) {
            final int[] array2;
            array = (array2 = new int[3]);
            array2[0] = 12992;
            array2[1] = 1;
            array2[2] = 12344;
        }
        else {
            array = null;
        }
        EGLSurface eglCreateWindowSurface;
        try {
            eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglDisplay, eglConfig, o, array);
        }
        catch (final IllegalArgumentException ex) {
            Log.e("GvrEglFactory", "eglCreateWindowSurface", (Throwable)ex);
            eglCreateWindowSurface = eglSurface;
        }
        return eglCreateWindowSurface;
    }
    
    public final void destroyContext(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLContext eglContext) {
        egl10.eglDestroyContext(eglDisplay, eglContext);
    }
    
    public final void destroySurface(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLSurface eglSurface) {
        egl10.eglDestroySurface(eglDisplay, eglSurface);
    }
}
