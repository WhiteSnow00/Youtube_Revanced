import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class ckc extends Drawable$ConstantState
{
    private final Drawable$ConstantState a;
    
    public ckc(final Drawable$ConstantState a) {
        this.a = a;
    }
    
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }
    
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable() {
        final cke cke = new cke();
        (cke.e = this.a.newDrawable()).setCallback(cke.d);
        return cke;
    }
    
    public final Drawable newDrawable(final Resources resources) {
        final cke cke = new cke();
        (cke.e = this.a.newDrawable(resources)).setCallback(cke.d);
        return cke;
    }
    
    public final Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
        final cke cke = new cke();
        (cke.e = this.a.newDrawable(resources, resources$Theme)).setCallback(cke.d);
        return cke;
    }
}
