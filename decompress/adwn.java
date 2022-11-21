import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwn extends AnimatorListenerAdapter
{
    final adww a;
    
    public adwn(final adww a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final adww a = this.a;
        a.A = 0;
        a.v = null;
    }
    
    public final void onAnimationStart(final Animator v) {
        ((adyd)this.a.B).g(0, false);
        final adww a = this.a;
        a.A = 2;
        a.v = v;
    }
}
