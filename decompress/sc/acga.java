import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class acga implements zjp
{
    private final acfz a;
    private final Context b;
    
    public acga(final Context b) {
        b.getClass();
        this.b = b;
        this.a = new acfz(tpe.bd(b), Bitmap$Config.ARGB_8888);
    }
    
    public Drawable a(final byte[] array) {
        return this.b(array);
    }
    
    protected final Drawable b(final byte[] array) {
        return (Drawable)new BitmapDrawable(this.b.getResources(), this.a.a(array));
    }
    
    public /* bridge */ Object d(final Object o) {
        return this.a((byte[])o);
    }
}
