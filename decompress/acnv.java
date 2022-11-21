import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acnv extends AnimatorListenerAdapter
{
    final acnd a;
    final acnw b;
    
    public acnv(final acnw b, final acnd a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b.setListener((Animator$AnimatorListener)null);
        this.b.f();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable c = this.a.c;
    }
}
