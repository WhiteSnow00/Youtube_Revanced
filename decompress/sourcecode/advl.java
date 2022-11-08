import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class advl extends AnimatorListenerAdapter
{
    final /* synthetic */ advo a;
    
    public advl(final advo a) {
        this.a = a;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        super.onAnimationRepeat(animator);
        final advo a = this.a;
        a.e = (a.e + 1) % a.d.c.length;
        a.f = true;
    }
}
