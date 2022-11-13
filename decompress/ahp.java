import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahp
{
    static int a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return resources.getColor(n, resources$Theme);
    }
    
    static ColorStateList b(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return resources.getColorStateList(n, resources$Theme);
    }
}
