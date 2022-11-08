import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abfd extends AnimatorListenerAdapter
{
    final /* synthetic */ abfe a;
    
    public abfd(final abfe a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final abfe a = this.a;
        if (a.g.isAttachedToWindow()) {
            if (a.f) {
                a.g.postDelayed((Runnable)new abdq(a, 3), abfe.a.toMillis());
            }
        }
    }
}
