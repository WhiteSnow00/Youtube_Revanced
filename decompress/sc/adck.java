import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adck extends AnimatorListenerAdapter
{
    final adcp a;
    
    public adck(final adcp a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        adcp.aN(this.a);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        adcp.aM(this.a);
    }
}
