import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcj
{
    public static final ColorDrawable a;
    public final LayerDrawable b;
    
    static {
        a = new ColorDrawable(0);
    }
    
    public gcj() {
        final ColorDrawable a = gcj.a;
        this.b = new LayerDrawable(new Drawable[] { (Drawable)a, (Drawable)a });
    }
}
