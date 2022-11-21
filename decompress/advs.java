import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class advs extends InsetDrawable
{
    public advs(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        super(drawable, n, n2, n3, n4);
    }
    
    public final int getMinimumHeight() {
        return -1;
    }
    
    public final int getMinimumWidth() {
        return -1;
    }
    
    public final boolean getPadding(final Rect rect) {
        return false;
    }
}
