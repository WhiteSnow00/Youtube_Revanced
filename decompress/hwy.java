import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class hwy extends AnimatorListenerAdapter
{
    final hxa a;
    
    public hwy(final hxa a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        hxa.aL(this.a);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        hxa.aK(this.a);
    }
}
