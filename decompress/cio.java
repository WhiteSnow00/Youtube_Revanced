import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cio extends AnimatorListenerAdapter
{
    final ciq a;
    
    public cio(final ciq a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.o();
        animator.removeListener((Animator$AnimatorListener)this);
    }
}
