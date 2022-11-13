import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import android.opengl.GLSurfaceView$Renderer;
import com.google.vr.sdk.base.GvrView$StereoRenderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import com.google.vr.sdk.base.GvrViewerParams;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.opengl.GLSurfaceView;
import com.google.vr.sdk.base.GvrView$Renderer;
import com.google.vr.sdk.base.Viewport;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.HeadTransform;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqa implements aaqc
{
    public final HeadTransform a;
    public final Eye b;
    public final Viewport c;
    public GvrView$Renderer d;
    public boolean e;
    private final GLSurfaceView f;
    private final ViewGroup g;
    
    public aaqa(final Context context) {
        final FrameLayout g = new FrameLayout(context);
        this.g = (ViewGroup)g;
        final aapz f = new aapz(this, context);
        (this.f = f).setEGLContextClientVersion(2);
        f.setPreserveEGLContextOnPause(true);
        ((ViewGroup)g).addView((View)f);
        this.a = new HeadTransform();
        this.b = new Eye(0);
        this.c = new Viewport();
    }
    
    @Override
    public final ViewGroup a() {
        return this.g;
    }
    
    @Override
    public final void b(final Runnable runnable) {
        this.f.queueEvent(runnable);
    }
    
    @Override
    public final GvrViewerParams c() {
        return new GvrViewerParams();
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final void f(final GLSurfaceView$EGLWindowSurfaceFactory eglWindowSurfaceFactory) {
        this.f.setEGLWindowSurfaceFactory(eglWindowSurfaceFactory);
    }
    
    @Override
    public final void g(final Runnable runnable) {
    }
    
    @Override
    public final void h(final Runnable runnable) {
    }
    
    @Override
    public final void i(final GvrView$StereoRenderer gvrView$StereoRenderer) {
        final aapy d = new aapy(gvrView$StereoRenderer);
        this.d = (GvrView$Renderer)d;
        this.f.setRenderer((GLSurfaceView$Renderer)new aapx(this, (GvrView$Renderer)d));
    }
    
    @Override
    public final void j(final boolean b) {
        ttr.b("Stereo mode (VR mode) not supported without GvrView support");
    }
    
    @Override
    public final void k() {
        tbi.f();
        if (!this.e) {
            ttr.b("The GlSurfaceViewWrapper cannot be shutdown if it's not attached.");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b((Runnable)new aagj(this, countDownLatch, 9));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        }
        catch (final InterruptedException ex) {
            ttr.d("Interrupted during shutdown", (Throwable)ex);
        }
    }
    
    @Override
    public final void l(final int n, final int n2, final int n3, final int n4) {
        this.f.setEGLConfigChooser(n, n2, n3, n4, 16, 0);
    }
}
