import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeif extends AnimatorListenerAdapter
{
    final aeih a;
    
    public aeif(final aeih a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final aeih a = this.a;
        final ViewGroup$LayoutParams layoutParams = a.b.getLayoutParams();
        final int height = a.b.getHeight();
        final ValueAnimator setDuration = ValueAnimator.ofInt(new int[] { height, 1 }).setDuration(a.a);
        setDuration.addListener((Animator$AnimatorListener)new aeig(a, layoutParams, height));
        setDuration.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new lez(a, layoutParams, 9));
        setDuration.start();
    }
}
