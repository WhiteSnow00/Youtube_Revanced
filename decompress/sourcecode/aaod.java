import javax.microedition.khronos.egl.EGLConfig;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.HeadTransform;
import javax.microedition.khronos.opengles.GL10;
import com.google.vr.sdk.base.GvrView$Renderer;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaod implements GLSurfaceView$Renderer
{
    final /* synthetic */ GvrView$Renderer a;
    final /* synthetic */ aaog b;
    
    public aaod(final aaog b, final GvrView$Renderer a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onDrawFrame(final GL10 gl10) {
        this.b.c.setGLViewport();
        final GvrView$Renderer a = this.a;
        final aaog b = this.b;
        final HeadTransform a2 = b.a;
        final Eye b2 = b.b;
        final aaoe aaoe = (aaoe)a;
        aaoe.a.onNewFrame(a2);
        aaoe.a.onDrawEye(b2);
        ((aaoe)this.a).a.onFinishFrame(this.b.c);
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        this.b.c.setViewport(0, 0, n, n2);
        this.a.onSurfaceChanged(n, n2);
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        this.a.onSurfaceCreated(eglConfig);
    }
}
