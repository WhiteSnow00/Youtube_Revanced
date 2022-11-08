import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class advi extends AnimatorListenerAdapter
{
    final /* synthetic */ advk a;
    
    public advi(final advk a) {
        this.a = a;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        super.onAnimationRepeat(animator);
        final advk a = this.a;
        a.c = (a.c + 1) % a.b.c.length;
        a.d = true;
    }
}
