import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class dlh extends Drawable$ConstantState
{
    final dlo a;
    
    public dlh(final dlo a) {
        this.a = a;
    }
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        return (Drawable)new dli(this);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return this.newDrawable();
    }
}
