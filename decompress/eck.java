import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class eck extends AnimatorListenerAdapter
{
    final ecl a;
    final float b;
    final boolean c;
    final int d;
    
    public eck(final ecl a, final float b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.c) {
            this.a.setScrollX(this.d);
            return;
        }
        this.a.setScrollX(0);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        animator.pause();
        final ecl a = this.a;
        animator.getClass();
        a.postDelayed((Runnable)new dmc(animator, 5), (long)(this.b * 1000.0f));
    }
}
