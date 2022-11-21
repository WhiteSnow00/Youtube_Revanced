import android.animation.Animator;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduu extends AnimatorListenerAdapter
{
    final HideBottomViewOnScrollBehavior a;
    
    public aduu(final HideBottomViewOnScrollBehavior a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a = null;
    }
}
