import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.GLU;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Message;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import android.os.Handler;
import android.os.Handler$Callback;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsg extends HandlerThread implements Handler$Callback
{
    public baj a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;
    
    public bsg() {
        super("ExoPlayer:PlaceholderSurface");
    }
    
    public final boolean handleMessage(Message a) {
        final int what = a.what;
        final boolean b = false;
        if (what != 1) {
            if (what != 2) {
                return true;
            }
            final Throwable t2;
            try {
                bad.b(this.a);
                a = (Message)this.a;
                ((baj)a).b.removeCallbacks((Runnable)a);
                try {
                    final SurfaceTexture g = ((baj)a).g;
                    if (g != null) {
                        g.release();
                        GLES20.glDeleteTextures(1, ((baj)a).c, 0);
                    }
                }
                finally {
                    final EGLDisplay d = ((baj)a).d;
                    if (d != null && !d.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglMakeCurrent(((baj)a).d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    }
                    final EGLSurface f = ((baj)a).f;
                    if (f != null && !f.equals((Object)EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(((baj)a).d, ((baj)a).f);
                    }
                    final EGLContext e = ((baj)a).e;
                    if (e != null) {
                        EGL14.eglDestroyContext(((baj)a).d, e);
                    }
                    final int a2 = baz.a;
                    EGL14.eglReleaseThread();
                    final EGLDisplay d2 = ((baj)a).d;
                    if (d2 != null && !d2.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(((baj)a).d);
                    }
                    ((baj)a).d = null;
                    ((baj)a).e = null;
                    ((baj)a).f = null;
                    ((baj)a).g = null;
                }
            }
            finally {
                final String s = "PlaceholderSurface";
                final String s2 = "Failed to release placeholder surface";
                final Throwable t = t2;
                baq.b(s, s2, t);
            }
            try {
                final String s = "PlaceholderSurface";
                final String s2 = "Failed to release placeholder surface";
                final Throwable t = t2;
                baq.b(s, s2, t);
                return true;
            }
            finally {
                this.quit();
            }
        }
        try {
            final int arg1 = a.arg1;
            bad.b(this.a);
            final baj a3 = this.a;
            final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            dk.f(eglGetDisplay != null, "eglGetDisplay failed");
            final int[] array = new int[2];
            dk.f(EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1), "eglInitialize failed");
            a3.d = eglGetDisplay;
            final EGLDisplay d3 = a3.d;
            final EGLConfig[] array2 = { null };
            final int[] array3 = { 0 };
            final boolean eglChooseConfig = EGL14.eglChooseConfig(d3, baj.a, 0, array2, 0, 1, array3, 0);
            dk.f(eglChooseConfig && array3[0] > 0 && array2[0] != null, baz.M("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", eglChooseConfig, array3[0], array2[0]));
            final EGLConfig eglConfig = array2[0];
            final EGLDisplay d4 = a3.d;
            int[] array4;
            if (arg1 == 0) {
                array4 = new int[] { 12440, 2, 12344 };
            }
            else {
                array4 = new int[] { 12440, 2, 12992, 1, 12344 };
            }
            final EGLContext eglCreateContext = EGL14.eglCreateContext(d4, eglConfig, EGL14.EGL_NO_CONTEXT, array4, 0);
            dk.f(eglCreateContext != null, "eglCreateContext failed");
            a3.e = eglCreateContext;
            final EGLDisplay d5 = a3.d;
            final EGLContext e2 = a3.e;
            EGLSurface f2;
            if (arg1 == 1) {
                f2 = EGL14.EGL_NO_SURFACE;
            }
            else {
                int[] array5;
                if (arg1 == 2) {
                    array5 = new int[] { 12375, 1, 12374, 1, 12992, 1, 12344 };
                }
                else {
                    array5 = new int[] { 12375, 1, 12374, 1, 12344 };
                }
                f2 = EGL14.eglCreatePbufferSurface(d5, eglConfig, array5, 0);
                dk.f(f2 != null, "eglCreatePbufferSurface failed");
            }
            dk.f(EGL14.eglMakeCurrent(d5, f2, f2, e2), "eglMakeCurrent failed");
            a3.f = f2;
            GLES20.glGenTextures(1, a3.c, 0);
            final StringBuilder sb = new StringBuilder();
            int n = 0;
            while (true) {
                final int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                if (n != 0) {
                    sb.append('\n');
                }
                sb.append("glError: ");
                sb.append(GLU.gluErrorString(glGetError));
                n = 1;
            }
            if (n == 0) {
                (a3.g = new SurfaceTexture(a3.c[0])).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)a3);
                final SurfaceTexture g2 = this.a.g;
                bad.b(g2);
                boolean b2 = b;
                if (arg1 != 0) {
                    b2 = true;
                }
                this.e = new PlaceholderSurface(this, g2, b2);
                synchronized (this) {
                    this.notify();
                    return true;
                }
            }
            throw new bak(sb.toString());
        }
        catch (final Error error) {}
        catch (final bak bak) {}
        catch (final RuntimeException ex) {}
        finally {
            monitorenter(this);
            try {
                this.notify();
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
            try {
                this.notify();
                return true;
            }
            finally {
                monitorexit(this);
            }
            final bak bak;
            final bak bak2 = bak;
            baq.b("PlaceholderSurface", "Failed to initialize placeholder surface", bak2);
            this.d = new IllegalStateException(bak2);
            synchronized (this) {
                this.notify();
                return true;
            }
            final RuntimeException ex;
            final RuntimeException d6 = ex;
            baq.b("PlaceholderSurface", "Failed to initialize placeholder surface", d6);
            this.d = d6;
            synchronized (this) {
                this.notify();
                return true;
            }
        }
    }
}
