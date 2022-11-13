import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqn implements tpj
{
    private final ColorDrawable a;
    
    public hqn(final ColorDrawable a) {
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        imageView.setImageDrawable((Drawable)this.a);
    }
}
