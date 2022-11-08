import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ls extends AnimatorListenerAdapter
{
    final /* synthetic */ on a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ lx d;
    
    public ls(final lx d, final on a, final View b, final ViewPropertyAnimator c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b.setAlpha(1.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.setListener((Animator$AnimatorListener)null);
        ((nt)this.d).l(this.a);
        this.d.d.remove(this.a);
        this.d.a();
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
