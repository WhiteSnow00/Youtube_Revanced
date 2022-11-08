import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adyg extends AnimatorListenerAdapter
{
    final /* synthetic */ adyh a;
    
    public adyg(final adyh a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((adyl)this.a).x();
        this.a.d.start();
    }
}
