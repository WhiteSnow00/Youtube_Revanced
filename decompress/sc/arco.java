import android.os.Process;
import javax.microedition.khronos.egl.EGLConfig;
import android.graphics.Point;
import javax.microedition.khronos.opengles.GL10;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrSurfaceView;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arco implements GLSurfaceView$Renderer
{
    public GvrSurfaceView a;
    private final GvrApi b;
    
    public arco(final GvrApi b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("GvrApi must be supplied for proper scanline rendering");
    }
    
    public final void a() {
        this.b.onPauseReprojectionThread();
    }
    
    public final void onDrawFrame(final GL10 gl10) {
        final Point renderReprojectionThread = this.b.renderReprojectionThread();
        if (renderReprojectionThread != null) {
            arcq.a((Runnable)new aulw(this, renderReprojectionThread.x, renderReprojectionThread.y, 1));
        }
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        this.b.onSurfaceChangedReprojectionThread();
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        Thread.currentThread().setPriority(10);
        arbs.a(Process.myTid());
        this.b.onSurfaceCreatedReprojectionThread();
    }
}
