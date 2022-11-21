import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjx extends Animatable2$AnimationCallback
{
    final cjy a;
    
    public cjx(final cjy a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Drawable drawable) {
        this.a.b(drawable);
    }
    
    public final void onAnimationStart(final Drawable drawable) {
        this.a.c(drawable);
    }
}
