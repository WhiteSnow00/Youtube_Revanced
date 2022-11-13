import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import com.google.cardboard.sdk.CardboardView$Renderer;
import com.google.vr.sdk.base.GvrView$StereoRenderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import com.google.vr.sdk.base.GvrViewerParams;
import android.view.ViewGroup;
import android.content.Context;
import com.google.cardboard.sdk.CardboardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapw implements aaqc
{
    private static final String c = "aapw";
    public final CardboardView a;
    public final aapv b;
    private boolean d;
    
    public aapw(final Context context) {
        CardboardView.setUseGvrGlSurfaceView(true);
        final CardboardView a = new CardboardView(context);
        (this.a = a).setOnSettingsButtonClick((Runnable)new aaog(a, 4));
        a.setOnViewDetachedRunnable((Runnable)new aaog(this, 5));
        this.b = new aapv();
    }
    
    @Override
    public final ViewGroup a() {
        return (ViewGroup)this.a;
    }
    
    @Override
    public final void b(final Runnable runnable) {
        this.a.queueEvent(runnable);
        ttr.m(aapw.c, "QE");
    }
    
    @Override
    public final GvrViewerParams c() {
        return new GvrViewerParams();
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
    public final void g(final Runnable onTriggerEvent) {
        this.a.setOnTriggerEvent(onTriggerEvent);
    }
    
    @Override
    public final void h(final Runnable onBackButtonClick) {
        this.a.setOnBackButtonClick(onBackButtonClick);
    }
    
    @Override
    public final void i(final GvrView$StereoRenderer a) {
        this.a.setRenderer((CardboardView$Renderer)this.b);
        final aapv b = this.b;
        b.a = a;
        b.b = true;
    }
    
    @Override
    public final void j(final boolean stereoRenderMode) {
        this.a.setStereoRenderMode(stereoRenderMode);
    }
    
    @Override
    public final void k() {
        final String c = aapw.c;
        final boolean glViewAttached = this.a.isGlViewAttached();
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder("S | ");
        sb.append(glViewAttached);
        sb.append(" | ");
        sb.append(d);
        ttr.m(c, sb.toString());
        tbi.f();
        if (this.a.isGlViewAttached()) {
            if (!this.d) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.a.shutdownCalled();
                this.b((Runnable)new aagj(this, countDownLatch, 8));
                try {
                    countDownLatch.await(100L, TimeUnit.MILLISECONDS);
                }
                catch (final InterruptedException ex) {
                    ttr.d("Interrupted during shutdown", (Throwable)ex);
                }
                this.d = true;
            }
        }
    }
    
    @Override
    public final void l(final int n, final int n2, final int n3, final int n4) {
        this.a.setEGLConfigChooser(n, n2, n3, n4, 16, 0);
    }
}
