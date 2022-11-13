import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class aho
{
    static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return resources.getDrawable(n, resources$Theme);
    }
    
    static Drawable b(final Resources resources, final int n, final int n2, final Resources$Theme resources$Theme) {
        return resources.getDrawableForDensity(n, n2, resources$Theme);
    }
}
