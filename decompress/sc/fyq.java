import android.animation.ValueAnimator;
import android.animation.Animator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class fyq extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
{
    private final View a;
    private final float b;
    private final float c;
    
    public fyq(final View a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setRotation(this.c);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setRotation(this.b);
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            this.a.setRotation((float)animatedValue);
        }
    }
}
