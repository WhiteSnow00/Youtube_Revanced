import android.graphics.SurfaceTexture;
import android.util.Log;
import javax.microedition.khronos.egl.EGLContext;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agto implements agtr
{
    public agtn a;
    public Throwable b;
    
    public agto(EGLContext eglContext, final int n) {
        this.b = null;
        (this.a = new agtn(eglContext, n)).setName("ExternalTextureConverter");
        eglContext = (EGLContext)new Object();
        this.a.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new wxr(this, (Object)eglContext, 2));
        this.a.start();
        try {
            final agtn a = this.a;
            synchronized (a.r) {
                while (!a.p) {
                    a.r.wait();
                }
                monitorexit(a.r);
                if (!a.q) {
                    synchronized (eglContext) {
                        while (this.b == null) {
                            eglContext.wait();
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
        final agtn a = this.a;
        SurfaceTexture surfaceTexture;
        if (a.a != null) {
            surfaceTexture = a.a;
        }
        else {
            surfaceTexture = a.b;
        }
        return surfaceTexture;
    }
    
    public final void b(final agtq agtq) {
        final agtn a = this.a;
        synchronized (a.c) {
            a.c.add(agtq);
        }
    }
    
    @Override
    public final void c(final agtq agtq) {
        final agtn a = this.a;
        synchronized (a.c) {
            a.c.clear();
            a.c.add(agtq);
        }
    }
    
    public final void d() {
        final agtn a = this.a;
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
    
    public final void e(final agtq agtq) {
        final agtn a = this.a;
        synchronized (a.c) {
            a.c.remove(agtq);
        }
    }
    
    public final void f(final int j) {
        this.a.i.j = j;
    }
    
    public final void g(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        if (surfaceTexture != null && (n == 0 || n2 == 0)) {
            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
        }
        this.a.u.post((Runnable)new agtl(this, surfaceTexture, n, n2, 0));
    }
}
