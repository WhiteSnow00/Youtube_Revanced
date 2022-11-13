import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acme extends AnimatorListenerAdapter
{
    final aclt a;
    final acmg b;
    
    public acme(final acmg b, final aclt a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b.setListener((Animator$AnimatorListener)null);
        this.b.f();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable d = this.a.d;
    }
}
