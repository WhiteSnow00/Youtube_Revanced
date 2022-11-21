import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.LayerDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeid extends LayerDrawable
{
    public ColorStateList a;
    
    public aeid(final Drawable drawable) {
        super(new Drawable[] { drawable });
        this.a = null;
    }
    
    public static aeid a(final Drawable drawable) {
        if (drawable instanceof aeid) {
            return (aeid)drawable;
        }
        return new aeid(drawable.mutate());
    }
    
    public final boolean b() {
        final ColorStateList a = this.a;
        if (a != null) {
            this.setColorFilter(a.getColorForState(this.getState(), 0), PorterDuff$Mode.SRC_IN);
            return true;
        }
        return false;
    }
    
    public final boolean isStateful() {
        return true;
    }
    
    public final boolean setState(final int[] state) {
        final boolean setState = super.setState(state);
        final boolean b = this.b();
        return setState || b;
    }
}
