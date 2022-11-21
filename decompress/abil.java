import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abil extends AnimatorListenerAdapter
{
    final abim a;
    
    public abil(final abim a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.a.setVisibility(8);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a.setVisibility(8);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.a.setVisibility(0);
    }
}
