import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxb extends AnimatorListenerAdapter
{
    final /* synthetic */ adxd a;
    
    public adxb(final adxd a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.g();
    }
}
