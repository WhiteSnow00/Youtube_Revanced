import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class ckm extends Drawable$ConstantState
{
    private final Drawable$ConstantState a;
    
    public ckm(final Drawable$ConstantState a) {
        this.a = a;
    }
    
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable() {
        final ckn ckn = new ckn();
        ckn.e = this.a.newDrawable();
        return ckn;
    }
    
    public final Drawable newDrawable(final Resources resources) {
        final ckn ckn = new ckn();
        ckn.e = this.a.newDrawable(resources);
        return ckn;
    }
    
    public final Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
        final ckn ckn = new ckn();
        ckn.e = this.a.newDrawable(resources, resources$Theme);
        return ckn;
    }
}
