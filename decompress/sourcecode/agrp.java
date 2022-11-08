import android.graphics.SurfaceTexture;
import android.util.Log;
import javax.microedition.khronos.egl.EGLContext;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrp implements agrs
{
    public agro a;
    public Throwable b;
    
    public agrp(final EGLContext eglContext, final int n) {
        this.b = null;
        (this.a = new agro(eglContext, n)).setName("ExternalTextureConverter");
        final Object o = new Object();
        this.a.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new wvn(this, o, 2));
        this.a.start();
        try {
            final agro a = this.a;
            synchronized (a.r) {
                while (!a.p) {
                    a.r.wait();
                }
                monitorexit(a.r);
                if (!a.q) {
                    synchronized (o) {
                        while (this.b == null) {
                            o.wait();
                        }
                    }
                }
                this.a.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)null);
                if (this.b == null) {
                    return;
                }
                this.a.j();
                throw new RuntimeException(this.b);
            }
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(ex.getMessage())));
            throw new RuntimeException(ex);
        }
    }
    
    public final SurfaceTexture a() {
        final agro a = this.a;
        SurfaceTexture surfaceTexture;
        if (a.a != null) {
            surfaceTexture = a.a;
        }
        else {
            surfaceTexture = a.b;
        }
        return surfaceTexture;
    }
    
    public final void b(final agrr agrr) {
        final agro a = this.a;
        synchronized (a.c) {
            a.c.add(agrr);
        }
    }
    
    public final void c(final agrr agrr) {
        final agro a = this.a;
        synchronized (a.c) {
            a.c.clear();
            a.c.add(agrr);
        }
    }
    
    public final void d() {
        final agro a = this.a;
        if (a == null) {
            return;
        }
        a.j();
        try {
            this.a.join();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(ex.getMessage())));
            throw new RuntimeException(ex);
        }
    }
    
    public final void e(final agrr agrr) {
        final agro a = this.a;
        synchronized (a.c) {
            a.c.remove(agrr);
        }
    }
    
    public final void f(final int j) {
        this.a.i.j = j;
    }
    
    public final void g(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        if (surfaceTexture != null && (n == 0 || n2 == 0)) {
            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
        }
        this.a.u.post((Runnable)new agrm(this, surfaceTexture, n, n2, 0));
    }
}
