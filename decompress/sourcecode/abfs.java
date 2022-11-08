import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abfs extends AnimatorListenerAdapter
{
    final /* synthetic */ abft a;
    
    public abfs(final abft a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.k();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.d.setVisibility(0);
    }
}
