import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ais
{
    public static int a(final Drawable drawable) {
        return drawable.getLayoutDirection();
    }
    
    public static boolean b(final Drawable drawable, final int layoutDirection) {
        return drawable.setLayoutDirection(layoutDirection);
    }
}
