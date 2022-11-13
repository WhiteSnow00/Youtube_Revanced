import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class arc extends arg
{
    public arc() {
    }
    
    public final float a(final Object o) {
        return ((View)o).getRotationY();
    }
    
    public final void b(final Object o, final float rotationY) {
        ((View)o).setRotationY(rotationY);
    }
}
