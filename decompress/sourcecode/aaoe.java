import javax.microedition.khronos.egl.EGLConfig;
import com.google.vr.sdk.base.Viewport;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.GvrView$StereoRenderer;
import com.google.vr.sdk.base.GvrView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaoe implements GvrView$Renderer
{
    final /* synthetic */ GvrView$StereoRenderer a;
    
    public aaoe(final GvrView$StereoRenderer a) {
        this.a = a;
    }
    
    @Override
    public final void onDrawFrame(final HeadTransform headTransform, final Eye eye, final Eye eye2) {
        this.a.onNewFrame(headTransform);
        this.a.onDrawEye(eye);
    }
    
    @Override
    public final void onFinishFrame(final Viewport viewport) {
        this.a.onFinishFrame(viewport);
    }
    
    @Override
    public final void onRendererShutdown() {
        this.a.onRendererShutdown();
    }
    
    @Override
    public final void onSurfaceChanged(final int n, final int n2) {
        this.a.onSurfaceChanged(n, n2);
    }
    
    @Override
    public final void onSurfaceCreated(final EGLConfig eglConfig) {
        this.a.onSurfaceCreated(eglConfig);
    }
}
