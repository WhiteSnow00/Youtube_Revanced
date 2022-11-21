import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cja
{
    static Bitmap a(final Picture picture) {
        return Bitmap.createBitmap(picture);
    }
    
    public static Interpolator b(final Context context, final int n) {
        final Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, n);
        afb.d(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }
    
    public static Paint$Join c(int n) {
        if (--n == 0) {
            return Paint$Join.MITER;
        }
        if (n != 2) {
            return Paint$Join.ROUND;
        }
        return Paint$Join.BEVEL;
    }
    
    public static int[] d() {
        return new int[] { 1, 2, 3 };
    }
    
    public static Paint$Cap e(int n) {
        if (--n == 0) {
            return Paint$Cap.BUTT;
        }
        if (n != 1) {
            return Paint$Cap.SQUARE;
        }
        return Paint$Cap.ROUND;
    }
    
    public static int[] f() {
        return new int[] { 1, 2, 3 };
    }
}
