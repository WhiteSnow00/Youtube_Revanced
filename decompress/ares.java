import android.opengl.GLSurfaceView$Renderer;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView$EGLContextFactory;
import android.content.Context;
import java.util.ArrayList;
import com.google.vr.ndk.base.GvrSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ares extends GvrSurfaceView
{
    private final arer a;
    private boolean b;
    private boolean c;
    private ArrayList d;
    private final arev e;
    
    public ares(final Context context, final arer a) {
        super(context);
        this.a = a;
        final arev arev = new arev();
        this.setEGLContextFactory((GLSurfaceView$EGLContextFactory)(this.e = arev));
        this.setEGLWindowSurfaceFactory((GLSurfaceView$EGLWindowSurfaceFactory)arev);
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
            final arer a = this.a;
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
