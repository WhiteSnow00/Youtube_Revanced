import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class adwv extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
{
    private boolean a;
    final adww b;
    private float c;
    private float d;
    
    public adwv(final adww b) {
        this.b = b;
    }
    
    protected abstract float a();
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.k((float)(int)this.d);
        this.a = false;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (!this.a) {
            final adzz m = this.b.m;
            float a;
            if (m == null) {
                a = 0.0f;
            }
            else {
                a = m.a();
            }
            this.c = a;
            this.d = this.a();
            this.a = true;
        }
        final adww b = this.b;
        final float c = this.c;
        b.k((float)(int)(c + (this.d - c) * valueAnimator.getAnimatedFraction()));
    }
}
