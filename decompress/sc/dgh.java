import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public class dgh implements dgg
{
    public final Bitmap a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    public final void c() {
    }
    
    public void d(final Bitmap bitmap) {
        bitmap.recycle();
    }
    
    public final void e(final int n) {
    }
}
