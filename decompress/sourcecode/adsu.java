import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsu extends AnimatorListenerAdapter
{
    final /* synthetic */ adtd a;
    
    public adsu(final adtd a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final adtd a = this.a;
        a.A = 0;
        a.v = null;
    }
    
    public final void onAnimationStart(final Animator v) {
        ((aduk)this.a.B).g(0, false);
        final adtd a = this.a;
        a.A = 2;
        a.v = v;
    }
}
