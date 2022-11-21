import android.text.Spanned;
import android.graphics.Bitmap;
import android.view.View;
import android.app.ActivityOptions;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aex
{
    public static ActivityOptions a(final Context context, final int n, final int n2) {
        return ActivityOptions.makeCustomAnimation(context, n, n2);
    }
    
    static ActivityOptions b(final View view, final int n, final int n2, final int n3, final int n4) {
        return ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4);
    }
    
    static ActivityOptions c(final View view, final Bitmap bitmap, final int n, final int n2) {
        return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, n, n2);
    }
    
    public static Spanned d(final String s) {
        return ake.a(s, 63);
    }
    
    public static String e(final Spanned spanned) {
        return ake.c(spanned, 1);
    }
}
