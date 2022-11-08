import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public class djj implements dfx, dfu
{
    private final Bitmap a;
    private final dgf b;
    
    public djj(final Bitmap a, final dgf b) {
        cll.l((Object)a, "Bitmap must not be null");
        this.a = a;
        cll.l((Object)b, "BitmapPool must not be null");
        this.b = b;
    }
    
    public static djj f(final Bitmap bitmap, final dgf dgf) {
        if (bitmap == null) {
            return null;
        }
        return new djj(bitmap, dgf);
    }
    
    public final int a() {
        return dpg.a(this.a);
    }
    
    public final Class b() {
        return Bitmap.class;
    }
    
    public final void d() {
        this.a.prepareToDraw();
    }
    
    public final void e() {
        this.b.d(this.a);
    }
}
