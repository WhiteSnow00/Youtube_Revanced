import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abfk extends AnimatorListenerAdapter
{
    final /* synthetic */ abfl a;
    
    public abfk(final abfl a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.a.setVisibility(8);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a.setVisibility(8);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.a.setVisibility(0);
    }
}
