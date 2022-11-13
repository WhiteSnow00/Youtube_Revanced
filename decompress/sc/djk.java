import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public class djk implements dfy, dfv
{
    private final Bitmap a;
    private final dgg b;
    
    public djk(final Bitmap a, final dgg b) {
        clm.l((Object)a, "Bitmap must not be null");
        this.a = a;
        clm.l((Object)b, "BitmapPool must not be null");
        this.b = b;
    }
    
    public static djk f(final Bitmap bitmap, final dgg dgg) {
        if (bitmap == null) {
            return null;
        }
        return new djk(bitmap, dgg);
    }
    
    @Override
    public final int a() {
        return dph.a(this.a);
    }
    
    @Override
    public final Class b() {
        return Bitmap.class;
    }
    
    @Override
    public final Object c() {
        return this.a;
    }
    
    @Override
    public final void d() {
        this.a.prepareToDraw();
    }
    
    @Override
    public final void e() {
        this.b.d(this.a);
    }
}
