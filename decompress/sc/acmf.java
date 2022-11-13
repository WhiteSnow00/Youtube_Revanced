import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acmf extends AnimatorListenerAdapter
{
    final aclt a;
    final acmg b;
    
    public acmf(final acmg b, final aclt a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.c.setListener((Animator$AnimatorListener)null);
        this.b.e();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable f = this.a.f;
    }
}
