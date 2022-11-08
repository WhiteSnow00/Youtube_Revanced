import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adus extends AnimatorListenerAdapter
{
    final /* synthetic */ aduw a;
    
    public adus(final aduw a) {
        this.a = a;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        super.onAnimationRepeat(animator);
        final aduw a = this.a;
        a.f = (a.f + 4) % a.e.c.length;
    }
}
