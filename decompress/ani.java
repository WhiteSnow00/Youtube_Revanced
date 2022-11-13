import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ani extends AnimatorListenerAdapter
{
    final anl a;
    final View b;
    
    public ani(final anl a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.c();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a(this.b);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.b();
    }
}
