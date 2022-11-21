import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adba extends AnimatorListenerAdapter
{
    final View a;
    
    public adba(final View a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
    }
}
