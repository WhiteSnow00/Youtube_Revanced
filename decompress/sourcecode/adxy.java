import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxy extends AnimatorListenerAdapter
{
    final /* synthetic */ adya a;
    
    public adxy(final adya a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.f.m(true);
    }
}
