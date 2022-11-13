import android.graphics.Bitmap;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnv extends dnz
{
    public dnv(final ImageView imageView) {
        super(imageView);
    }
    
    @Override
    protected final /* bridge */ void i(final Object o) {
        ((ImageView)this.a).setImageBitmap((Bitmap)o);
    }
}
