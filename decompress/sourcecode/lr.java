import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class lr extends AnimatorListenerAdapter
{
    final /* synthetic */ on a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lx d;
    
    public lr(final lx d, final on a, final ViewPropertyAnimator b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setListener((Animator$AnimatorListener)null);
        this.c.setAlpha(1.0f);
        ((nt)this.d).l(this.a);
        this.d.f.remove(this.a);
        this.d.a();
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
