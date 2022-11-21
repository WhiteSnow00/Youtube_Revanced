import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acnn extends AnimatorListenerAdapter
{
    final acnd a;
    final acno b;
    
    public acnn(final acno b, final acnd a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.f();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final Runnable c = this.a.c;
    }
}
