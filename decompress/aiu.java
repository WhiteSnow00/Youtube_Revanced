import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aiu
{
    static Drawable a(final Drawable drawable, final Drawable drawable2) {
        return (Drawable)new AdaptiveIconDrawable(drawable, drawable2);
    }
    
    static Icon b(final Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
