import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class haf extends AnimatorListenerAdapter
{
    final hag a;
    
    public haf(final hag a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b.setVisibility(8);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.b.setVisibility(0);
    }
}
