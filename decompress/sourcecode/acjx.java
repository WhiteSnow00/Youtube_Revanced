import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acjx extends AnimatorListenerAdapter
{
    final /* synthetic */ acjn a;
    final /* synthetic */ acjy b;
    
    public acjx(final acjy b, final acjn a) {
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
