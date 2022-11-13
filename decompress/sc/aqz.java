import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqz extends arg
{
    public aqz() {
    }
    
    public final float a(final Object o) {
        return ((View)o).getScaleY();
    }
    
    public final void b(final Object o, final float scaleY) {
        ((View)o).setScaleY(scaleY);
    }
}
