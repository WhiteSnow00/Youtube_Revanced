import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adag extends AnimatorListenerAdapter
{
    final /* synthetic */ adam a;
    
    public adag(final adam a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        adam.aN(this.a);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        adam.aM(this.a);
    }
}
