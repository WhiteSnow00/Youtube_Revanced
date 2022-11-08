import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv extends AnimatorListenerAdapter
{
    final /* synthetic */ lw a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lx d;
    
    public lv(final lx d, final lw a, final ViewPropertyAnimator b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setListener((Animator$AnimatorListener)null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        ((nt)this.d).l(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.a();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final on b = this.a.b;
    }
}
