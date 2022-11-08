import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gap extends AnimatorListenerAdapter
{
    final /* synthetic */ View a;
    
    public gap(final View a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final View a = this.a;
        if (a instanceof gar) {
            ((gar)a).a();
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
    }
}
