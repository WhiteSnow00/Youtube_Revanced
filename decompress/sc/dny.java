import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dny extends dnz
{
    public dny(final ImageView imageView) {
        super(imageView);
    }
    
    @Override
    protected final /* bridge */ void i(final Object o) {
        ((ImageView)this.a).setImageDrawable((Drawable)o);
    }
}
