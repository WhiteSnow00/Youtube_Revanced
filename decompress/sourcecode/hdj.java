import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdj implements Animator$AnimatorListener
{
    private final /* synthetic */ int a;
    
    public hdj(final int a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (this.a != 0) {
            animator.end();
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a != 0) {
            return;
        }
        animator.pause();
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
