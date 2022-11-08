import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcp implements gcq
{
    private final Drawable a;
    private final BitmapDrawable b;
    private final BitmapDrawable c;
    private BitmapDrawable d;
    
    public gcp(final Activity activity, final Drawable a) {
        final BitmapDrawable b = b(activity);
        this.b = b;
        this.c = b(activity);
        this.a = a;
        this.d = b;
    }
    
    private static BitmapDrawable b(final Activity activity) {
        return new BitmapDrawable(activity.getResources(), Bitmap.createBitmap(400, 400, Bitmap$Config.ARGB_8888));
    }
}
