import com.google.vr.sdk.base.GvrView$StereoRenderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import com.google.vr.sdk.base.GvrViewerParams;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public interface aaqc extends aats
{
    ViewGroup a();
    
    GvrViewerParams c();
    
    void d();
    
    void e();
    
    void f(final GLSurfaceView$EGLWindowSurfaceFactory p0);
    
    void g(final Runnable p0);
    
    void h(final Runnable p0);
    
    void i(final GvrView$StereoRenderer p0);
    
    void j(final boolean p0);
    
    void k();
    
    void l(final int p0, final int p1, final int p2, final int p3);
}
