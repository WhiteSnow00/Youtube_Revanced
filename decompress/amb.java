import android.content.res.Resources;
import android.content.Context;
import android.view.PointerIcon;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amb
{
    static PointerIcon a(final Bitmap bitmap, final float n, final float n2) {
        return PointerIcon.create(bitmap, n, n2);
    }
    
    public static PointerIcon b(final Context context, final int n) {
        return PointerIcon.getSystemIcon(context, n);
    }
    
    static PointerIcon c(final Resources resources, final int n) {
        return PointerIcon.load(resources, n);
    }
}
