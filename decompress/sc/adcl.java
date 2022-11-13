import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adcl extends AnimatorListenerAdapter
{
    final adcp a;
    
    public adcl(final adcp a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.am.a(adcn.b);
    }
}
