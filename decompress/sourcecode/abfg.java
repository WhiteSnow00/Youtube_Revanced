import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class abfg extends AnimatorListenerAdapter
{
    final /* synthetic */ abfi a;
    
    public abfg(final abfi a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b();
    }
}
