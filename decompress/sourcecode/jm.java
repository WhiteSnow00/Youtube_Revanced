import android.animation.Animator;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jm extends AnimatorListenerAdapter
{
    final /* synthetic */ ActionBarOverlayLayout a;
    
    public jm(final ActionBarOverlayLayout a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final ActionBarOverlayLayout a = this.a;
        a.i = null;
        a.f = false;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ActionBarOverlayLayout a = this.a;
        a.i = null;
        a.f = false;
    }
}
