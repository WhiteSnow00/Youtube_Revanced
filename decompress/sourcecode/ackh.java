import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ackh extends AnimatorListenerAdapter
{
    final /* synthetic */ acjl a;
    final /* synthetic */ acki b;
    
    public ackh(final acki b, final acjl a) {
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
