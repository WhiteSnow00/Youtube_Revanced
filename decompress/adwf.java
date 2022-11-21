import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwf extends Drawable$ConstantState
{
    final adwg a;
    
    public adwf(final adwg a) {
        this.a = a;
    }
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        return this.a;
    }
}
