import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acnx extends AnimatorListenerAdapter
{
    final acnb a;
    final acny b;
    
    public acnx(final acny b, final acnb a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b.setListener((Animator$AnimatorListener)null);
        this.b.h();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable c = this.a.c;
    }
}
