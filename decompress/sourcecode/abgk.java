import android.graphics.Bitmap;
import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abgk extends AnimatorListenerAdapter
{
    final /* synthetic */ abgl a;
    
    public abgk(final abgl a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            tmy.v((View)this.a, false);
            this.a.a.setImageBitmap((Bitmap)null);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        tmy.v((View)this.a, true);
    }
}
