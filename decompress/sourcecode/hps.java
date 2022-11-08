import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hps implements tnd
{
    private final ColorDrawable a;
    
    public hps(final ColorDrawable a) {
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        imageView.setImageDrawable((Drawable)this.a);
    }
}
