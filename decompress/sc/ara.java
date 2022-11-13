import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ara extends arg
{
    public ara() {
    }
    
    public final float a(final Object o) {
        return ((View)o).getRotation();
    }
    
    public final void b(final Object o, final float rotation) {
        ((View)o).setRotation(rotation);
    }
}
