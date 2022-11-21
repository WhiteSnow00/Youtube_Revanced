import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abiu extends AnimatorListenerAdapter
{
    final abiv a;
    
    public abiu(final abiv a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.k();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.d.setVisibility(0);
    }
}
