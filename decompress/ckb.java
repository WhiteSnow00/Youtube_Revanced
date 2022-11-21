import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckb extends Drawable$ConstantState
{
    int a;
    ckn b;
    public AnimatorSet c;
    ArrayList d;
    abi e;
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public final Drawable newDrawable(final Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
