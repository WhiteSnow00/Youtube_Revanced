import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jeg extends AnimatorListenerAdapter
{
    final jeh a;
    
    public jeg(final jeh a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.e.setVisibility(8);
    }
}
