import android.graphics.Bitmap;
import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abjm extends AnimatorListenerAdapter
{
    final abjn a;
    
    public abjm(final abjn a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            tqf.v((View)this.a, false);
            this.a.a.setImageBitmap((Bitmap)null);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        tqf.v((View)this.a, true);
    }
}
