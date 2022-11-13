import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dlc implements dfy, dfv
{
    protected final Drawable a;
    
    public dlc(final Drawable a) {
        clm.h((Object)a);
        this.a = a;
    }
    
    @Override
    public final /* bridge */ Object c() {
        return this.f();
    }
    
    @Override
    public void d() {
        final Drawable a = this.a;
        if (a instanceof BitmapDrawable) {
            ((BitmapDrawable)a).getBitmap().prepareToDraw();
            return;
        }
        if (a instanceof dlj) {
            ((dlj)a).a().prepareToDraw();
        }
    }
    
    public final Drawable f() {
        final Drawable$ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
