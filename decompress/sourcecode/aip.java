import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aip
{
    public static ColorFilter a(final Drawable drawable) {
        return drawable.getColorFilter();
    }
    
    public static void b(final Drawable drawable, final Resources$Theme resources$Theme) {
        drawable.applyTheme(resources$Theme);
    }
    
    public static void c(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        drawable.inflate(resources, xmlPullParser, set, resources$Theme);
    }
    
    public static void d(final Drawable drawable, final float n, final float n2) {
        drawable.setHotspot(n, n2);
    }
    
    public static void e(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        drawable.setHotspotBounds(n, n2, n3, n4);
    }
    
    public static void f(final Drawable drawable, final int tint) {
        drawable.setTint(tint);
    }
    
    public static void g(final Drawable drawable, final ColorStateList tintList) {
        drawable.setTintList(tintList);
    }
    
    public static void h(final Drawable drawable, final PorterDuff$Mode tintMode) {
        drawable.setTintMode(tintMode);
    }
    
    public static boolean i(final Drawable drawable) {
        return drawable.canApplyTheme();
    }
}
