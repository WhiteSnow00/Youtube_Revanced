import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class arb extends arg
{
    public arb() {
    }
    
    public final float a(final Object o) {
        return ((View)o).getRotationX();
    }
    
    public final void b(final Object o, final float rotationX) {
        ((View)o).setRotationX(rotationX);
    }
}
