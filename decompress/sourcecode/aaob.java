import javax.microedition.khronos.egl.EGLConfig;
import com.google.vr.sdk.base.Eye;
import com.google.cardboard.sdk.CardboardView$Eye;
import com.google.vr.sdk.base.Viewport;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.GvrView$StereoRenderer;
import com.google.cardboard.sdk.CardboardView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaob implements CardboardView$Renderer
{
    public GvrView$StereoRenderer a;
    public boolean b;
    private final HeadTransform c;
    private final Viewport d;
    
    public aaob() {
        this.a = null;
        this.b = false;
        this.c = new HeadTransform();
        this.d = new Viewport();
    }
    
    public final void onDrawEye(final CardboardView$Eye cardboardView$Eye) {
        if (this.b && this.a != null) {
            if (cardboardView$Eye.getEyeType() == 0) {
                this.a.onDrawEye(new aaoa(cardboardView$Eye, 1, this.c.getHeadView()));
                return;
            }
            this.a.onDrawEye(new aaoa(cardboardView$Eye, 2, this.c.getHeadView()));
        }
    }
    
    public final void onFinishFrame(final int n, final int n2, final int n3, final int n4) {
        this.d.setViewport(n, n2, n3, n4);
        if (this.b) {
            final GvrView$StereoRenderer a = this.a;
            if (a != null) {
                a.onFinishFrame(this.d);
            }
        }
    }
    
    public final void onNewFrame(final float[] array) {
        System.arraycopy(array, 0, this.c.getHeadView(), 0, 16);
        if (this.b) {
            final GvrView$StereoRenderer a = this.a;
            if (a != null) {
                a.onNewFrame(this.c);
            }
        }
    }
    
    public final void onRendererShutdown() {
        if (this.b) {
            final GvrView$StereoRenderer a = this.a;
            if (a != null) {
                a.onRendererShutdown();
            }
        }
    }
    
    public final void onSurfaceChanged(final int n, final int n2) {
        this.d.setViewport(0, 0, n, n2);
        if (this.b) {
            final GvrView$StereoRenderer a = this.a;
            if (a != null) {
                a.onSurfaceChanged(n, n2);
            }
        }
    }
    
    public final void onSurfaceCreated(final EGLConfig eglConfig) {
        if (this.b) {
            final GvrView$StereoRenderer a = this.a;
            if (a != null) {
                a.onSurfaceCreated(eglConfig);
            }
        }
    }
}
