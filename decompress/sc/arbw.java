import android.opengl.GLSurfaceView$Renderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView$EGLContextFactory;
import android.content.Context;
import java.util.ArrayList;
import com.google.vr.ndk.base.GvrSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbw extends GvrSurfaceView
{
    private final arbv a;
    private boolean b;
    private boolean c;
    private ArrayList d;
    private final arbz e;
    
    public arbw(final Context context, final arbv a) {
        super(context);
        this.a = a;
        final arbz arbz = new arbz();
        this.setEGLContextFactory((GLSurfaceView$EGLContextFactory)(this.e = arbz));
        this.setEGLWindowSurfaceFactory((GLSurfaceView$EGLWindowSurfaceFactory)arbz);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        this.c = false;
        final ArrayList d = this.d;
        if (d != null) {
            while (i < d.size()) {
                super.queueEvent((Runnable)d.get(i));
                ++i;
            }
            this.d.clear();
        }
    }
    
    protected final void onDetachedFromWindow() {
        if (this.b) {
            final arbv a = this.a;
            if (a != null) {
                a.onSurfaceViewDetachedFromWindow();
            }
        }
        super.onDetachedFromWindow();
        this.c = true;
    }
    
    public final void onPause() {
        if (this.b) {
            super.onPause();
        }
    }
    
    public final void onResume() {
        if (this.b) {
            super.onResume();
        }
    }
    
    public final void queueEvent(final Runnable runnable) {
        if (!this.b) {
            runnable.run();
            return;
        }
        if (this.c) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(runnable);
            return;
        }
        super.queueEvent(runnable);
    }
    
    public final void setEGLContextClientVersion(final int n) {
        super.setEGLContextClientVersion(2);
        this.e.e = 2;
    }
    
    public final void setRenderer(final GLSurfaceView$Renderer renderer) {
        super.setRenderer(renderer);
        this.b = true;
    }
}
