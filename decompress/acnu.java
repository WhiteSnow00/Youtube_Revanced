import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnu extends AnimatorListenerAdapter
{
    final acmv a;
    final acnj b;
    
    public acnu(final acnj b, final acmv a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b.setListener((Animator$AnimatorListener)null);
        this.b.c();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable c = this.a.c;
    }
}
