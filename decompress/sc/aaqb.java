import com.google.vr.sdk.base.GvrView$StereoRenderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import com.google.vr.sdk.base.GvrViewerParams;
import android.view.ViewGroup;
import android.content.Context;
import com.google.vr.sdk.base.GvrView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqb implements aaqc
{
    private final GvrView a;
    
    public aaqb(final Context context) {
        context.getClass();
        this.a = new GvrView(context);
    }
    
    @Override
    public final ViewGroup a() {
        return (ViewGroup)this.a;
    }
    
    @Override
    public final void b(final Runnable runnable) {
        this.a.queueEvent(runnable);
    }
    
    @Override
    public final GvrViewerParams c() {
        return this.a.getGvrViewerParams();
    }
    
    @Override
    public final void d() {
        this.a.onPause();
    }
    
    @Override
    public final void e() {
        this.a.onResume();
    }
    
    @Override
    public final void f(final GLSurfaceView$EGLWindowSurfaceFactory eglWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eglWindowSurfaceFactory);
    }
    
    @Override
    public final void g(final Runnable onCardboardTriggerListener) {
        this.a.setOnCardboardTriggerListener(onCardboardTriggerListener);
    }
    
    @Override
    public final void h(final Runnable onCloseButtonListener) {
        this.a.setOnCloseButtonListener(onCloseButtonListener);
    }
    
    @Override
    public final void i(final GvrView$StereoRenderer renderer) {
        this.a.setRenderer(renderer);
    }
    
    @Override
    public final void j(final boolean stereoModeEnabled) {
        this.a.setStereoModeEnabled(stereoModeEnabled);
    }
    
    @Override
    public final void k() {
        this.a.shutdown();
    }
    
    @Override
    public final void l(final int n, final int n2, final int n3, final int n4) {
        this.a.setEGLConfigChooser(n, n2, n3, n4, 16, 0);
    }
}
