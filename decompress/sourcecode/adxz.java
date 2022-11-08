import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxz extends AnimatorListenerAdapter
{
    final /* synthetic */ adya a;
    
    public adxz(final adya a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.f.m(false);
    }
}
