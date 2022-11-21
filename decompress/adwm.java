import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwm extends AnimatorListenerAdapter
{
    final adww a;
    private boolean b;
    
    public adwm(final adww a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final adww a = this.a;
        a.A = 0;
        a.v = null;
        if (!this.b) {
            ((adyd)a.B).g(4, false);
        }
    }
    
    public final void onAnimationStart(final Animator v) {
        ((adyd)this.a.B).g(0, false);
        final adww a = this.a;
        a.A = 1;
        a.v = v;
        this.b = false;
    }
}
