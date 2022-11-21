import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class advv extends cjy
{
    final advx b;
    
    public advv(final advx b) {
        this.b = b;
    }
    
    @Override
    public final void b(final Drawable drawable) {
        final ColorStateList b = this.b.b;
        if (b != null) {
            air.g(drawable, b);
        }
    }
    
    @Override
    public final void c(final Drawable drawable) {
        final advx b = this.b;
        final ColorStateList b2 = b.b;
        if (b2 != null) {
            air.f(drawable, b2.getColorForState(b.d, b2.getDefaultColor()));
        }
    }
}
