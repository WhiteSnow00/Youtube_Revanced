import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baj implements SurfaceTexture$OnFrameAvailableListener, Runnable
{
    public static final int[] a;
    public final Handler b;
    public final int[] c;
    public EGLDisplay d;
    public EGLContext e;
    public EGLSurface f;
    public SurfaceTexture g;
    
    static {
        a = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
    }
    
    public baj(final Handler b) {
        this.b = b;
        this.c = new int[1];
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.b.post((Runnable)this);
    }
    
    public final void run() {
        final SurfaceTexture g = this.g;
        if (g == null) {
            return;
        }
        try {
            g.updateTexImage();
        }
        catch (final RuntimeException ex) {}
    }
}
