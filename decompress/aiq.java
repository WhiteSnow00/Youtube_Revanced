import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiq
{
    public static int a(final Drawable drawable) {
        return drawable.getAlpha();
    }
    
    static Drawable b(final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState, final int n) {
        return drawableContainer$DrawableContainerState.getChild(n);
    }
    
    static Drawable c(final InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }
    
    public static void d(final Drawable drawable, final boolean autoMirrored) {
        drawable.setAutoMirrored(autoMirrored);
    }
    
    public static boolean e(final Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}
