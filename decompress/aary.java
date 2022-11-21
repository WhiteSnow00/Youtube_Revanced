import android.content.Context;
import android.opengl.GLSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

final class aary extends GLSurfaceView
{
    final aarz a;
    
    public aary(final aarz a, final Context context) {
        this.a = a;
        super(context);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e = true;
    }
    
    protected final void onDetachedFromWindow() {
        this.a.k();
        this.a.e = false;
        super.onDetachedFromWindow();
    }
}
