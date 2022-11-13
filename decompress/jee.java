import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jee extends AnimatorListenerAdapter
{
    final jeh a;
    
    public jee(final jeh a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.f.setVisibility(8);
    }
}
