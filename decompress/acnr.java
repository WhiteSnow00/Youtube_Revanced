import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acnr extends AnimatorListenerAdapter
{
    final acng a;
    final acnt b;
    
    public acnr(final acnt b, final acng a) {
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
