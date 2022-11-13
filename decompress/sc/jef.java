import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jef extends AnimatorListenerAdapter
{
    final jeh a;
    
    public jef(final jeh a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.d.setVisibility(8);
    }
}
